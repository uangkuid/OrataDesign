package com.oratakashi.design.component.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.oratakashi.design.foundation.OrataTheme

/**
 * OraButtonSoftToken is an object that provides color and size tokens for soft style OraButton components.
 * It centralizes the color and size definitions for consistent button theming across the app.
 *
 * @author oratakashi
 * @since 17 Sep 2025
 */
object OraButtonSoftToken {
    val ContainerColor: Color
        @Composable
        get() = OrataTheme.colors.secondary
    val IconColor: Color
        @Composable
        get() = OrataTheme.colors.onSecondary
    val DisabledIconColor: Color
        @Composable
        get() = OrataTheme.colors.onSurfaceVariant
    val LabelTextColor: Color
        @Composable
        get() = OrataTheme.colors.onSecondary
    val DisabledContainerColor: Color
        @Composable
        get() = OrataTheme.colors.surfaceContainer
    val DisabledLabelTextColor: Color
        @Composable
        get() = OrataTheme.colors.onSurfaceVariant
    val ButtonSizeVariant = OraButtonSize.Medium
}

