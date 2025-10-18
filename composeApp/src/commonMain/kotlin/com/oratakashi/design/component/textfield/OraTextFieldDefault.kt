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
        containerColor: Color = OrataTheme.colors.surface,
        disabledContainerColor: Color = OrataTheme.colors.surfaceVariant,
        contentColor: Color = OrataTheme.colors.onSurface,
        disabledContentColor: Color = OrataTheme.colors.onSurfaceVariant,
        borderColor: Color = OrataTheme.colors.outline,
        disabledBorderColor: Color = OrataTheme.colors.outlineVariant,
        errorColor: Color = OrataTheme.colors.error,
        successColor: Color = OrataTheme.colors.success,
        focusColor: Color = OrataTheme.colors.primary,
        placeholderColor: Color = OrataTheme.colors.onSurfaceVariant,
    ): OraTextFieldColors {
        return OraTextFieldColors(
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