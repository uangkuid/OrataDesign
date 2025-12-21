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
        get() = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.secondaryContainer
    val IconColor: Color
        @Composable
        get() = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSecondaryContainer
    val DisabledIconColor: Color
        @Composable
        get() = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurfaceVariant
    val LabelTextColor: Color
        @Composable
        get() = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSecondaryContainer
    val DisabledContainerColor: Color
        @Composable
        get() = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.surfaceContainer
    val DisabledLabelTextColor: Color
        @Composable
        get() = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurfaceVariant
    val ButtonSizeVariant = _root_ide_package_.com.oratakashi.design.component.button.OraButtonSize.Medium
}

