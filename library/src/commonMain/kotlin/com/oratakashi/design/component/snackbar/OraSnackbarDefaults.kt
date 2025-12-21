package com.oratakashi.design.component.snackbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.oratakashi.design.foundation.OrataTheme

/**
 * OraSnackbarDefaults is an object that contains default values for the OraSnackbar component.
 * @author oratakashi
 * @since 16 Nov 2025
 */
object OraSnackbarDefaults {
    /**
     * colors is a function that returns the default colors for the OraSnackbar component.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    fun colors(
        containerColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.surfaceContainer,
        iconColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
        titleColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
        descriptionColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurfaceVariant,
        closeIconColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
        actionColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.primary,
    ): com.oratakashi.design.component.snackbar.OraSnackbarColor =
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarColor(
            containerColor = containerColor,
            iconColor = iconColor,
            titleColor = titleColor,
            descriptionColor = descriptionColor,
            closeIconColor = closeIconColor,
            actionColor = actionColor,
        )

    /**
     * themeColors is a function that returns the theme colors for the OraSnackbar component.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    internal fun themeColors(
        containerColor: Color,
        contentColor: Color
    ): com.oratakashi.design.component.snackbar.OraSnackbarColor =
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarColor(
            containerColor = containerColor,
            iconColor = contentColor,
            titleColor = contentColor,
            descriptionColor = contentColor,
            closeIconColor = contentColor,
            actionColor = contentColor,
        )

    const val SnackbarInBetweenDelayMillis = 0
    const val SnackbarSlideInMillis = 150
    const val SnackbarSlideOutMillis = 75
}