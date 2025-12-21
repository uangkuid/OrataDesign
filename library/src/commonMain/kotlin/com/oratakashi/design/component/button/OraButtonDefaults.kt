package com.oratakashi.design.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * OraButtonDefaults is an object that provides default values and configurations for OraButton components.
 * It centralizes the default settings for consistent button behavior and appearance across the app.
 * @author oratakashi
 * @since 23 Sep 2025
 */
object OraButtonDefaults {
    /**
     * The default size for OraButton components, defined by the OraButtonSolidToken.
     */
    val size: com.oratakashi.design.component.button.OraButtonSize
        @Composable
        get() = _root_ide_package_.com.oratakashi.design.component.button.OraButtonSolidToken.ButtonSizeVariant

    /**
     * Returns a BorderStroke for an outlined button based on its enabled state.
     * @param isEnable A Boolean indicating whether the button is enabled or disabled.
     * @return A BorderStroke object with appropriate width and color for the button's state.
     */
    @Composable
    fun outlineButtonBorder(isEnable: Boolean): BorderStroke {
        return if (isEnable) {
            BorderStroke(width = _root_ide_package_.com.oratakashi.design.component.button.OraButtonOutlineToken.OutlineWidth, color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonOutlineToken.OutlineColor)
        } else {
            BorderStroke(width = _root_ide_package_.com.oratakashi.design.component.button.OraButtonOutlineToken.OutlineWidth, color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonOutlineToken.DisabledOutlineColor)
        }
    }

    /**
     * Provides the default color scheme for solid buttons, including container and content colors for both enabled and disabled states.
     * @param containerColor The background color of the button when enabled. Default is OraButton
     * @param contentColor The color of the button's content (text/icon) when enabled. Default is OraButtonSolidToken.LabelTextColor.
     * @param disabledContainerColor The background color of the button when disabled. Default is OraButtonSolidToken.DisabledContainerColor.
     * @param disabledContentColor The color of the button's content (text/icon) when disabled. Default is OraButtonSolidToken.DisabledLabelTextColor.
     * @return An OraButtonColors object encapsulating the specified colors for the button's states
     */
    @Composable
    fun buttonSolidColors(
        containerColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonSolidToken.ContainerColor,
        contentColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonSolidToken.LabelTextColor,
        disabledContainerColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonSolidToken.DisabledContainerColor,
        disabledContentColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonSolidToken.DisabledLabelTextColor
    ): com.oratakashi.design.component.button.OraButtonColors =
        _root_ide_package_.com.oratakashi.design.component.button.OraButtonColors(
            containerColor = containerColor,
            contentColor = contentColor,
            disabledContainerColor = disabledContainerColor,
            disabledContentColor = disabledContentColor
        )

    /**
     * Provides the default color scheme for outlined buttons, including container and content colors for both enabled and disabled states.
     * @param containerColor The background color of the button when enabled. Default is OraButtonOutlineToken.ContainerColor.
     * @param contentColor The color of the button's content (text/icon) when enabled. Default is OraButtonOutlineToken.LabelTextColor.
     * @param disabledContainerColor The background color of the button when disabled. Default is OraButtonOutlineToken.DisabledContainerColor.
     * @param disabledContentColor The color of the button's content (text/icon) when disabled. Default is OraButtonOutlineToken.DisabledLabelTextColor.
     * @return An OraButtonColors object encapsulating the specified colors for the button's states.
     */
    @Composable
    fun buttonOutlineColors(
        containerColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonOutlineToken.ContainerColor,
        contentColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonOutlineToken.LabelTextColor,
        disabledContainerColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonOutlineToken.DisabledContainerColor,
        disabledContentColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonOutlineToken.DisabledLabelTextColor
    ): com.oratakashi.design.component.button.OraButtonColors =
        _root_ide_package_.com.oratakashi.design.component.button.OraButtonColors(
            containerColor = containerColor,
            contentColor = contentColor,
            disabledContainerColor = disabledContainerColor,
            disabledContentColor = disabledContentColor
        )

    /**
     * Provides the default color scheme for tonal buttons, including container and content colors for both enabled and disabled states.
     * @param containerColor The background color of the button when enabled. Default is OraButtonTonalToken.ContainerColor.
     * @param contentColor The color of the button's content (text/icon) when enabled. Default is OraButtonTonalToken.LabelTextColor.
     * @param disabledContainerColor The background color of the button when disabled. Default is OraButtonTonalToken.DisabledContainerColor.
     * @param disabledContentColor The color of the button's content (text/icon) when disabled. Default is OraButtonTonalToken.DisabledLabelTextColor.
     * @return An OraButtonColors object encapsulating the specified colors for the button's states.
     */
    @Composable
    fun buttonTonalColors(
        containerColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonTonalToken.ContainerColor,
        contentColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonTonalToken.LabelTextColor,
        disabledContainerColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonTonalToken.DisabledContainerColor,
        disabledContentColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonTonalToken.DisabledLabelTextColor
    ): com.oratakashi.design.component.button.OraButtonColors =
        _root_ide_package_.com.oratakashi.design.component.button.OraButtonColors(
            containerColor = containerColor,
            contentColor = contentColor,
            disabledContainerColor = disabledContainerColor,
            disabledContentColor = disabledContentColor
        )

    /**
     * Provides the default color scheme for transparent buttons, including container and content colors for both enabled and disabled states.
     * @param containerColor The background color of the button when enabled. Default is OraButtonTransparentToken.ContainerColor.
     * @param contentColor The color of the button's content (text/icon) when enabled. Default is OraButtonTransparentToken.LabelTextColor.
     * @param disabledContainerColor The background color of the button when disabled. Default is OraButtonTransparentToken.DisabledContainerColor.
     * @param disabledContentColor The color of the button's content (text/icon) when disabled. Default is OraButtonTransparentToken.DisabledLabelTextColor.
     * @return An OraButtonColors object encapsulating the specified colors for the button's states.
     */
    @Composable
    fun buttonTransparentColors(
        containerColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonTransparentToken.ContainerColor,
        contentColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonTransparentToken.LabelTextColor,
        disabledContainerColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonTransparentToken.DisabledContainerColor,
        disabledContentColor: Color = _root_ide_package_.com.oratakashi.design.component.button.OraButtonTransparentToken.DisabledLabelTextColor
    ): com.oratakashi.design.component.button.OraButtonColors =
        _root_ide_package_.com.oratakashi.design.component.button.OraButtonColors(
            containerColor = containerColor,
            contentColor = contentColor,
            disabledContainerColor = disabledContainerColor,
            disabledContentColor = disabledContentColor
        )
}