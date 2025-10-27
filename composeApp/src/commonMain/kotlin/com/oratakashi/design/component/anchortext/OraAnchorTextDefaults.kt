package com.oratakashi.design.component.anchortext

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataTheme

object OraAnchorTextDefaults {
    val ICON_SPACER = 4.dp

    @Composable
    fun colors(
        contentColor: Color = OrataTheme.colors.primary,
        disabledContentColor: Color = OrataTheme.colors.onSurfaceVariant,
    ): OraAnchorTextColor {
        return OraAnchorTextColor(
            contentColor = contentColor,
            disabledContentColor = disabledContentColor
        )
    }
}