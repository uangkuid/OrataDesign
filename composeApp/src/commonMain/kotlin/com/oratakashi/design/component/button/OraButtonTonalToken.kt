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
object OraButtonTonalToken {
    val ContainerColor: Color
        @Composable
        get() = OrataTheme.colors.secondaryContainer
    val IconColor: Color
        @Composable
        get() = OrataTheme.colors.onSecondaryContainer
    val DisabledIconColor: Color
        @Composable
        get() = OrataTheme.colors.onSurfaceVariant
    val LabelTextColor: Color
        @Composable
        get() = OrataTheme.colors.onSecondaryContainer
    val DisabledContainerColor: Color
        @Composable
        get() = OrataTheme.colors.surfaceContainer
    val DisabledLabelTextColor: Color
        @Composable
        get() = OrataTheme.colors.onSurfaceVariant
    val ButtonSizeVariant = OraButtonSize.Medium
}

