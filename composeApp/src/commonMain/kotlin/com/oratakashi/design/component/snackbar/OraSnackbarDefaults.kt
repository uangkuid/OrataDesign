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
    @Composable
    fun colors(
        containerColor: Color = OrataTheme.colors.surface,
        iconColor: Color = OrataTheme.colors.onSurface,
        titleColor: Color = OrataTheme.colors.onSurface,
        descriptionColor: Color = OrataTheme.colors.onSurfaceVariant,
        closeIconColor: Color = OrataTheme.colors.onSurface,
        actionColor: Color = OrataTheme.colors.primary,
    ): OraSnackbarColor = OraSnackbarColor(
        containerColor = containerColor,
        iconColor = iconColor,
        titleColor = titleColor,
        descriptionColor = descriptionColor,
        closeIconColor = closeIconColor,
        actionColor = actionColor,
    )

    @Composable
    internal fun themeColors(
        containerColor: Color,
        contentColor: Color
    ): OraSnackbarColor = OraSnackbarColor(
        containerColor = containerColor,
        iconColor = contentColor,
        titleColor = contentColor,
        descriptionColor = contentColor,
        closeIconColor = contentColor,
        actionColor = contentColor,
    )
}