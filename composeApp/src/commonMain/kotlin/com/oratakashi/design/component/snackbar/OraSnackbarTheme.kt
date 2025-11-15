package com.oratakashi.design.component.snackbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.oratakashi.design.foundation.OrataTheme

/**
 * OraSnackbarTheme is an enum class that is used to define the theme of the snackbar.
 * @author oratakashi
 * @since 15 Nov 2025
 */
enum class OraSnackbarTheme {
    Default,
    Success,
    Warning,
    Information,
    Error,
    Tertiary
}

@Composable
fun OraSnackbarTheme.toColor(): OraSnackbarColor {
    return when (this) {
        OraSnackbarTheme.Success -> OraSnackbarColor(
            containerColor = OrataTheme.colors.success,
            iconColor = OrataTheme.colors.onSuccess,
            titleColor = OrataTheme.colors.onSuccess,
            descriptionColor = OrataTheme.colors.onSuccess,
            closeIconColor = OrataTheme.colors.onSuccess,
            actionColor = OrataTheme.colors.onSuccess
        )
        OraSnackbarTheme.Warning -> OraSnackbarColor(
            containerColor = OrataTheme.colors.warning,
            iconColor = OrataTheme.colors.onWarning,
            titleColor = OrataTheme.colors.onWarning,
            descriptionColor = OrataTheme.colors.onWarning,
            closeIconColor = OrataTheme.colors.onWarning,
            actionColor = OrataTheme.colors.onWarning
        )
        OraSnackbarTheme.Information -> OraSnackbarColor(
            containerColor = OrataTheme.colors.info,
            iconColor = OrataTheme.colors.onInfo,
            titleColor = OrataTheme.colors.onInfo,
            descriptionColor = OrataTheme.colors.onInfo,
            closeIconColor = OrataTheme.colors.onInfo,
            actionColor = OrataTheme.colors.onInfo
        )
        OraSnackbarTheme.Error -> OraSnackbarColor(
            containerColor = OrataTheme.colors.error,
            iconColor = OrataTheme.colors.onError,
            titleColor = OrataTheme.colors.onError,
            descriptionColor = OrataTheme.colors.onError,
            closeIconColor = OrataTheme.colors.onError,
            actionColor = OrataTheme.colors.onError
        )
        OraSnackbarTheme.Default -> OraSnackbarColor(
            containerColor = OrataTheme.colors.surface,
            iconColor = OrataTheme.colors.onSurface,
            titleColor = OrataTheme.colors.onSurface,
            descriptionColor = OrataTheme.colors.onSurface,
            closeIconColor = OrataTheme.colors.onSurface,
            actionColor = OrataTheme.colors.onSurface
        )

        OraSnackbarTheme.Tertiary -> OraSnackbarColor(
            containerColor = OrataTheme.colors.tertiary,
            iconColor = OrataTheme.colors.onTertiary,
            titleColor = OrataTheme.colors.onTertiary,
            descriptionColor = OrataTheme.colors.onTertiary,
            closeIconColor = OrataTheme.colors.onTertiary,
            actionColor = OrataTheme.colors.onTertiary
        )
    }
}
