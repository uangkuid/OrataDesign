package com.oratakashi.design.component.snackbar

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarDuration.Indefinite
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.SnackbarResult.ActionPerformed
import androidx.compose.material3.SnackbarResult.Dismissed
import androidx.compose.material3.SnackbarVisuals
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalAccessibilityManager
import com.oratakashi.design.component.snackbar.animation.SlideInSlideOutSnackbarAnimation
import kotlinx.coroutines.delay
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class OraSnackbarHostState {
    /**
     * Only one [Snackbar] can be shown at a time. Since a suspending Mutex is a fair queue, this
     * manages our message queue and we don't have to maintain one.
     */
    private val mutex = Mutex()

    /**
     * The current [SnackbarData] being shown by the [SnackbarHost], or `null` if none.
     */
    var currentSnackbarData by mutableStateOf<OraSnackbarData?>(null)
        private set

    /**
     * Shows or queues to be shown a [LgnSnackbar] at the bottom of the [Scaffold] to which this state
     * is attached and suspends until the snackbar has disappeared.
     *
     * [LgnSnackbarHostState] guarantees to show at most one snackbar at a time. If this function is
     * called while another snackbar is already visible, it will be suspended until this snackbar is
     * shown and subsequently addressed. If the caller is cancelled, the snackbar will be removed
     * from display and/or the queue to be displayed.
     *
     * All of this allows for granular control over the snackbar queue from within:
     *
     * To change the Snackbar appearance, change it in 'snackbarHost' on the [Scaffold].
     *
     * @param title text to be shown in the Snackbar
     * @param message optional message text to be shown in the Snackbar
     * @param icon optional icon to be shown in the Snackbar
     * @param actionLabel optional action label to show as button in the Snackbar
     * @param withDismissAction a boolean to show a dismiss action in the Snackbar. This is
     * recommended to be set to true for better accessibility when a Snackbar is set with a
     * [SnackbarDuration.Indefinite]
     * @param duration duration to control how long snackbar will be shown in [SnackbarHost], either
     * [LgnSnackbarDuration.Short], [LgnSnackbarDuration.Long] or [LgnSnackbarDuration.Indefinite].
     *
     * @return [SnackbarResult.ActionPerformed] if option action has been clicked or
     * [SnackbarResult.Dismissed] if snackbar has been dismissed via timeout or by the user
     */
    suspend fun showSnackbar(
        title: String,
        message: String? = null,
        icon: ImageVector? = null,
        actionLabel: String? = null,
        withDismissAction: Boolean = false,
        duration: OraSnackbarDuration =
            if (actionLabel == null) OraSnackbarDuration.Short else OraSnackbarDuration.Indefinite,
        theme: OraSnackbarTheme = OraSnackbarTheme.Default,
        size: OraSnackbarSize = OraSnackbarSize.Large
    ): SnackbarResult =
        showSnackbar(
            SnackbarVisualsImpl(
                title,
                message,
                icon,
                actionLabel,
                withDismissAction,
                duration,
                theme,
                size
            )
        )

    /**
     * Shows or queues to be shown a [OraSnackbar] at the bottom of the [Scaffold] to which this state
     * is attached and suspends until the snackbar has disappeared.
     *
     * [OraSnackbarHostState] guarantees to show at most one snackbar at a time. If this function is
     * called while another snackbar is already visible, it will be suspended until this snackbar is
     * shown and subsequently addressed. If the caller is cancelled, the snackbar will be removed
     * from display and/or the queue to be displayed.
     *
     * All of this allows for granular control over the snackbar queue from within:
     *
     * @param visuals [SnackbarVisuals] that are used to create a Snackbar
     *
     * @return [SnackbarResult.ActionPerformed] if option action has been clicked or
     * [SnackbarResult.Dismissed] if snackbar has been dismissed via timeout or by the user
     */
    suspend fun showSnackbar(visuals: OraSnackbarVisuals): SnackbarResult = mutex.withLock {
        try {
            return suspendCancellableCoroutine { continuation ->
                currentSnackbarData = SnackbarDataImpl(visuals, continuation)
            }
        } finally {
            currentSnackbarData = null
        }
    }
}

/**
 * Host for [OraSnackbar]s to be used in [Scaffold] to properly show, hide and dismiss items based
 * on Material specification and the [hostState].
 *
 * This component with default parameters comes build-in with [Scaffold], if you need to show a
 * default [OraSnackbar], use [OraSnackbarHostState.showSnackbar].
 *
 * If you want to customize appearance of the [Snackbar], you can pass your own version as a child
 * of the [SnackbarHost] to the [Scaffold]:
 *
 * @param hostState state of this component to read and show [Snackbar]s accordingly
 * @param modifier the [Modifier] to be applied to this component
 * @param snackbar the instance of the [OraSnackbar] to be shown at the appropriate time with
 * appearance based on the [OraSnackbarData] provided as a param
 */
@Composable
fun OraSnackbarHost(
    hostState: OraSnackbarHostState,
    modifier: Modifier = Modifier,
    snackbar: @Composable (OraSnackbarData) -> Unit = { }
) {
    val currentSnackbarData = hostState.currentSnackbarData
    val accessibilityManager = LocalAccessibilityManager.current
    LaunchedEffect(currentSnackbarData) {
        if (currentSnackbarData != null) {
            val duration = currentSnackbarData.visuals.duration.toMillis(
                currentSnackbarData.visuals.actionLabel != null,
                accessibilityManager
            )
            delay(duration)
            currentSnackbarData.dismiss()
        }
    }

    SlideInSlideOutSnackbarAnimation(
        current = hostState.currentSnackbarData,
        modifier = modifier,
        content = snackbar
    )
}