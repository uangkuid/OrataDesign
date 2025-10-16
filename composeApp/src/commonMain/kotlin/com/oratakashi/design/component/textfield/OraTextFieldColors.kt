package com.oratakashi.design.component.textfield

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color

/**
 * OraTextFieldColors is a data class that holds the colors used in the OraTextField component.
 * @author oratakashi
 * @since 16 Oct 2025
 */
data class OraTextFieldColors(
    val containerColor: Color,
    val disabledContainerColor: Color,
    val contentColor: Color,
    val disabledContentColor: Color,
    val borderColor: Color,
    val disabledBorderColor: Color,
    val errorColor: Color,
    val successColor: Color,
    val focusColor: Color,
    val placeholderColor: Color,
) {
    @Composable
    internal fun borderColor(
        state: OraTextFieldState,
        enabled: Boolean,
    ): State<Color> {
        val target = when {
            !enabled -> disabledBorderColor
            state == OraTextFieldState.Focus -> focusColor
            state == OraTextFieldState.Success -> successColor
            state == OraTextFieldState.Error -> errorColor
            state == OraTextFieldState.Locked -> disabledBorderColor
            else -> borderColor
        }

        return if (enabled) {
            animateColorAsState(target, tween(durationMillis = 300), label = "borderColor")
        } else {
            rememberUpdatedState(target)
        }
    }

    @Composable
    internal fun containerColor(
        enabled: Boolean,
    ): State<Color> {
        val target = when {
            !enabled -> disabledContainerColor
            else -> containerColor
        }

        return rememberUpdatedState(target)
    }
}