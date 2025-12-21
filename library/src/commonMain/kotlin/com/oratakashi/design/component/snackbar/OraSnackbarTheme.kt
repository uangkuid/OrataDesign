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
fun com.oratakashi.design.component.snackbar.OraSnackbarTheme.toColor(): com.oratakashi.design.component.snackbar.OraSnackbarColor {
    return when (this) {
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarTheme.Success -> _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarColor(
            containerColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.success,
            iconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSuccess,
            titleColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSuccess,
            descriptionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSuccess,
            closeIconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSuccess,
            actionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSuccess
        )
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarTheme.Warning -> _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarColor(
            containerColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.warning,
            iconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onWarning,
            titleColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onWarning,
            descriptionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onWarning,
            closeIconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onWarning,
            actionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onWarning
        )
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarTheme.Information -> _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarColor(
            containerColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.info,
            iconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onInfo,
            titleColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onInfo,
            descriptionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onInfo,
            closeIconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onInfo,
            actionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onInfo
        )
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarTheme.Error -> _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarColor(
            containerColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.error,
            iconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onError,
            titleColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onError,
            descriptionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onError,
            closeIconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onError,
            actionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onError
        )
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarTheme.Default -> _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarColor(
            containerColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.surfaceContainer,
            iconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            titleColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            descriptionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            closeIconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            actionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.primary
        )

        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarTheme.Tertiary -> _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarColor(
            containerColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.tertiary,
            iconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onTertiary,
            titleColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onTertiary,
            descriptionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onTertiary,
            closeIconColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onTertiary,
            actionColor = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onTertiary
        )
    }
}
