package com.oratakashi.design.component.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataTheme

/**
 * OraButtonOutlineToken is an object that provides color and size tokens for outline style OraButton components.
 * It centralizes the color and size definitions for consistent button theming across the app.
 *
 * @author oratakashi
 * @since 17 Sep 2025
 */
object OraButtonOutlineToken {
    val ContainerColor: Color
        @Composable
        get() = OrataTheme.colors.surface
    val OutlineColor: Color
        @Composable
        get() = OrataTheme.colors.primary
    val IconColor: Color
        @Composable
        get() = OrataTheme.colors.primary
    val DisabledIconColor: Color
        @Composable
        get() = OrataTheme.colors.onSurfaceVariant
    val DisabledOutlineColor: Color
        @Composable
        get() = OrataTheme.colors.onSurfaceVariant
    val LabelTextColor: Color
        @Composable
        get() = OrataTheme.colors.primary
    val DisabledContainerColor: Color
        @Composable
        get() = OrataTheme.colors.surfaceContainer
    val DisabledLabelTextColor: Color
        @Composable
        get() = OrataTheme.colors.onSurfaceVariant
    val ButtonSizeVariant = OraButtonSize.Medium
    val OutlineWidth = 1.0.dp
}

