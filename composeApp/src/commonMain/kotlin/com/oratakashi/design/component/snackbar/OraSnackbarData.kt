package com.oratakashi.design.component.snackbar

import androidx.compose.material3.SnackbarResult
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.vector.ImageVector
import kotlin.coroutines.resume
import kotlin.hashCode

/**
 * OraSnackbarVisuals is an interface that defines the visuals of a snackbar.
 * @author oratakashi
 * @since 16 Nov 2025
 */
@Stable
interface OraSnackbarVisuals {
    val title: String
    val message: String?
    val icon: ImageVector?
    val actionLabel: String?
    val withDismissAction: Boolean
    val duration: OraSnackbarDuration
    val theme: OraSnackbarTheme?
}

interface OraSnackbarData {
    val visuals: OraSnackbarVisuals

    /**
     * Function to be called when Snackbar action has been performed to notify the listeners.
     */
    fun performAction()

    /**SnackbarVisualsImpl
     * Function to be called when Snackbar is dismissed either by timeout or by the user.
     */
    fun dismiss()
}

internal class SnackbarVisualsImpl(
    override val title: String,
    override val message: String?,
    override val icon: ImageVector?,
    override val actionLabel: String?,
    override val withDismissAction: Boolean,
    override val duration: OraSnackbarDuration,
    override val theme: OraSnackbarTheme?
): OraSnackbarVisuals {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SnackbarVisualsImpl

        if (message != other.message) return false
        if (title != other.title) return false
        if (actionLabel != other.actionLabel) return false
        if (withDismissAction != other.withDismissAction) return false
        if (duration != other.duration) return false

        return true
    }

    override fun hashCode(): Int {
        var result = message.hashCode()
        result = 31 * result + actionLabel.hashCode()
        result = 31 * result + withDismissAction.hashCode()
        result = 31 * result + duration.hashCode()
        return result
    }
}

internal class SnackbarDataImpl(
    override val visuals: OraSnackbarVisuals,
    private val continuation: kotlinx.coroutines.CancellableContinuation<SnackbarResult>
) : OraSnackbarData {

    override fun performAction() {
        if (continuation.isActive) continuation.resume(SnackbarResult.ActionPerformed)
    }

    override fun dismiss() {
        if (continuation.isActive) continuation.resume(SnackbarResult.Dismissed)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SnackbarDataImpl

        if (visuals != other.visuals) return false
        if (continuation != other.continuation) return false

        return true
    }

    override fun hashCode(): Int {
        var result = visuals.hashCode()
        result = 31 * result + continuation.hashCode()
        return result
    }
}