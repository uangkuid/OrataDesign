package com.oratakashi.design.component.anchortext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color


class OraAnchorTextColor(
    private val contentColor: Color,
    private val disabledContentColor: Color,
) {
    @Composable
    internal fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }
}