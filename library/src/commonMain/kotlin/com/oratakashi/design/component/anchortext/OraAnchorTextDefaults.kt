package com.oratakashi.design.component.anchortext

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataTheme

/**
 * OraAnchorTextDefaults provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
object OraAnchorTextDefaults {
    val ICON_SPACER = 4.dp

    @Composable
    /**
     * colors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun colors(
        contentColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.primary,
        disabledContentColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurfaceVariant,
    ): com.oratakashi.design.component.anchortext.OraAnchorTextColor {
        return _root_ide_package_.com.oratakashi.design.component.anchortext.OraAnchorTextColor(
            contentColor = contentColor,
            disabledContentColor = disabledContentColor
        )
    }
}