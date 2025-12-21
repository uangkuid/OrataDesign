package com.oratakashi.design.component.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.oratakashi.design.foundation.OrataTheme

/**
 * OraTextFieldDefault is a placeholder object for defining default properties and behaviors
 * @author oratakashi
 * @since 16 Oct 2025
 */
object OraTextFieldDefault {
    /**
     * Provides default color values for the OraTextField component.
     * @author oratakashi
     * @since 16 Oct 2025
     */
    @Composable
    fun textFieldColor(
        containerColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.surface,
        disabledContainerColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.surfaceVariant,
        contentColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
        disabledContentColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurfaceVariant,
        borderColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.outline,
        disabledBorderColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.outlineVariant,
        errorColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.error,
        successColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.success,
        focusColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.primary,
        placeholderColor: Color = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.colors.onSurfaceVariant,
    ): com.oratakashi.design.component.textfield.OraTextFieldColors {
        return _root_ide_package_.com.oratakashi.design.component.textfield.OraTextFieldColors(
            containerColor = containerColor,
            disabledContainerColor = disabledContainerColor,
            contentColor = contentColor,
            disabledContentColor = disabledContentColor,
            borderColor = borderColor,
            disabledBorderColor = disabledBorderColor,
            errorColor = errorColor,
            successColor = successColor,
            focusColor = focusColor,
            placeholderColor = placeholderColor
        )
    }
}