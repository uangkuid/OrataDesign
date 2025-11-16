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
    val size: OraButtonSize
        @Composable
        get() = OraButtonSolidToken.ButtonSizeVariant

    /**
     * Returns a BorderStroke for an outlined button based on its enabled state.
     * @param isEnable A Boolean indicating whether the button is enabled or disabled.
     * @return A BorderStroke object with appropriate width and color for the button's state.
     */
    @Composable
    /**
     * outlineButtonBorder function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun outlineButtonBorder(isEnable: Boolean): BorderStroke {
        return if (isEnable) {
            BorderStroke(width = OraButtonOutlineToken.OutlineWidth, color = OraButtonOutlineToken.OutlineColor)
        } else {
            BorderStroke(width = OraButtonOutlineToken.OutlineWidth, color = OraButtonOutlineToken.DisabledOutlineColor)
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
    /**
     * buttonSolidColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun buttonSolidColors(
        containerColor: Color = OraButtonSolidToken.ContainerColor,
        contentColor: Color = OraButtonSolidToken.LabelTextColor,
        disabledContainerColor: Color = OraButtonSolidToken.DisabledContainerColor,
        disabledContentColor: Color = OraButtonSolidToken.DisabledLabelTextColor
    ): OraButtonColors = OraButtonColors(
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
    /**
     * buttonOutlineColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun buttonOutlineColors(
        containerColor: Color = OraButtonOutlineToken.ContainerColor,
        contentColor: Color = OraButtonOutlineToken.LabelTextColor,
        disabledContainerColor: Color = OraButtonOutlineToken.DisabledContainerColor,
        disabledContentColor: Color = OraButtonOutlineToken.DisabledLabelTextColor
    ): OraButtonColors = OraButtonColors(
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
    /**
     * buttonTonalColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun buttonTonalColors(
        containerColor: Color = OraButtonTonalToken.ContainerColor,
        contentColor: Color = OraButtonTonalToken.LabelTextColor,
        disabledContainerColor: Color = OraButtonTonalToken.DisabledContainerColor,
        disabledContentColor: Color = OraButtonTonalToken.DisabledLabelTextColor
    ): OraButtonColors = OraButtonColors(
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
    /**
     * buttonTransparentColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun buttonTransparentColors(
        containerColor: Color = OraButtonTransparentToken.ContainerColor,
        contentColor: Color = OraButtonTransparentToken.LabelTextColor,
        disabledContainerColor: Color = OraButtonTransparentToken.DisabledContainerColor,
        disabledContentColor: Color = OraButtonTransparentToken.DisabledLabelTextColor
    ): OraButtonColors = OraButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )
}