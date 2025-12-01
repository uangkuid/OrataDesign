package com.oratakashi.design.component.snackbar.animation

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.currentRecomposeScope
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.LiveRegionMode
import androidx.compose.ui.semantics.dismiss
import androidx.compose.ui.semantics.liveRegion
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.util.fastFilterNotNull
import androidx.compose.ui.util.fastForEach
import com.oratakashi.design.component.snackbar.OraSnackbarData
import com.oratakashi.design.component.snackbar.OraSnackbarDefaults.SnackbarInBetweenDelayMillis
import com.oratakashi.design.component.snackbar.OraSnackbarDefaults.SnackbarSlideInMillis
import com.oratakashi.design.component.snackbar.OraSnackbarDefaults.SnackbarSlideOutMillis
import kotlinx.coroutines.delay

@Composable
fun SlideInSlideOutSnackbarAnimation(
    current: OraSnackbarData?,
    modifier: Modifier = Modifier,
    content: @Composable (OraSnackbarData) -> Unit
) {
    val state = remember { SlideInSlideOutState<OraSnackbarData?>() }
    if (current != state.current) {
        state.current = current
        val keys = state.items.map { it.key }.toMutableList()
        if (!keys.contains(current)) {
            keys.add(current)
        }
        state.items.clear()
        keys.fastFilterNotNull().forEach { key ->
            state.items.add(
                SlideInSlideOutAnimationItem(key) { children ->
                    val isVisible = key == current
                    val duration = if (isVisible) SnackbarSlideInMillis else SnackbarSlideOutMillis
                    val delay = SnackbarSlideOutMillis + SnackbarInBetweenDelayMillis
                    val animationDelay = if (isVisible && keys.fastFilterNotNull().size != 1) {
                        delay
                    } else {
                        0
                    }

                    val offsetY = animatedSlideInSlideOut(
                        animationDuration = duration,
                        animationDelay = animationDelay,
                        visible = isVisible,
                        onAnimationFinish = {
                            if (key != state.current) {
                                // leave only the current in the list
                                state.items.removeAll { it.key != state.current }
                                state.scope?.invalidate()
                            }
                        }
                    )

                    Box(
                        modifier = Modifier
                            .graphicsLayer {
                                translationY = offsetY.value
                            }
                            .semantics {
                                liveRegion = LiveRegionMode.Polite
                                dismiss { key.dismiss(); true }
                            }
                    ) {
                        children()
                    }
                }
            )
        }
    }

    Box(modifier = modifier) {
        state.scope = currentRecomposeScope
        state.items.fastForEach { (item, transition) ->
            key(item) {
                transition {
                    if (item == null) return@transition
                    content(item)
                }
            }
        }
    }
}

@Composable
private fun animatedSlideInSlideOut(
    animationDuration: Int,
    animationDelay: Int,
    visible: Boolean,
    onAnimationFinish: () -> Unit = {}
): State<Float> {
    val offsetY = remember { Animatable(if (visible) 100f else 0f) }
    LaunchedEffect(visible) {
        delay(animationDelay.toLong())
        offsetY.animateTo(
            if (visible) 0f else 100f,
            animationSpec = tween(durationMillis = animationDuration)
        )
        onAnimationFinish()
    }
    return offsetY.asState()
}
