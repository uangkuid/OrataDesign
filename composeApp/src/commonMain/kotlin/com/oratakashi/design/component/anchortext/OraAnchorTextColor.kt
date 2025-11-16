package com.oratakashi.design.component.anchortext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color


/**
 * OraAnchorTextColor provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
class OraAnchorTextColor(
    private val contentColor: Color,
    private val disabledContentColor: Color,
) {
    @Composable
    internal fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }
}