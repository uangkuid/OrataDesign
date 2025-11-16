package com.oratakashi.design.foundation.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import com.oratakashi.design.foundation.OrataTheme

/**
 * OraTypography is a class that contains all the typography used in the Orata Design System.
 * @author oratakashi
 * @since 06 Sep 2025
 */
@Immutable
/**
 * OraTypography provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
class OraTypography: OrataDesignTypography {
    @Composable
    /**
     * displayLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun displayLarge(): TextStyle = OraTypographyTokens.DisplayLarge

    @Composable
    /**
     * displayMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun displayMedium(): TextStyle = OraTypographyTokens.DisplayMedium

    @Composable
    /**
     * displaySmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun displaySmall(): TextStyle = OraTypographyTokens.DisplaySmall

    @Composable
    /**
     * headlineLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun headlineLarge(): TextStyle = OraTypographyTokens.HeadlineLarge

    @Composable
    /**
     * headlineMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun headlineMedium(): TextStyle = OraTypographyTokens.HeadlineMedium

    @Composable
    /**
     * headlineSmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun headlineSmall(): TextStyle = OraTypographyTokens.HeadlineSmall

    @Composable
    /**
     * titleLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun titleLarge(): TextStyle = OraTypographyTokens.TitleLarge

    @Composable
    /**
     * titleMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun titleMedium(): TextStyle = OraTypographyTokens.TitleMedium

    @Composable
    /**
     * titleSmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun titleSmall(): TextStyle = OraTypographyTokens.TitleSmall

    @Composable
    /**
     * labelLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun labelLarge(): TextStyle = OraTypographyTokens.LabelLarge

    @Composable
    /**
     * labelMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun labelMedium(): TextStyle = OraTypographyTokens.LabelMedium

    @Composable
    /**
     * labelSmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun labelSmall(): TextStyle = OraTypographyTokens.LabelSmall

    @Composable
    /**
     * bodyLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun bodyLarge(): TextStyle = OraTypographyTokens.BodyLarge

    @Composable
    /**
     * bodyMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun bodyMedium(): TextStyle = OraTypographyTokens.BodyMedium

    @Composable
    /**
     * bodySmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun bodySmall(): TextStyle = OraTypographyTokens.BodySmall

    /**
     * Extension function to map OraTypographyKeyToken to OraTypography's TextStyle.
     */
    @Composable
    internal fun fromToken(token: OraTypographyKeyToken): TextStyle {
        return when (token) {
            OraTypographyKeyToken.DisplayLarge -> displayLarge()
            OraTypographyKeyToken.DisplayMedium -> displayMedium()
            OraTypographyKeyToken.DisplaySmall -> displaySmall()
            OraTypographyKeyToken.HeadlineLarge -> headlineLarge()
            OraTypographyKeyToken.HeadlineMedium -> headlineMedium()
            OraTypographyKeyToken.HeadlineSmall -> headlineSmall()
            OraTypographyKeyToken.TitleLarge -> titleLarge()
            OraTypographyKeyToken.TitleMedium -> titleMedium()
            OraTypographyKeyToken.TitleSmall -> titleSmall()
            OraTypographyKeyToken.LabelLarge -> labelLarge()
            OraTypographyKeyToken.LabelMedium -> labelMedium()
            OraTypographyKeyToken.LabelSmall -> labelSmall()
            OraTypographyKeyToken.BodyLarge -> bodyLarge()
            OraTypographyKeyToken.BodyMedium -> bodyMedium()
            OraTypographyKeyToken.BodySmall -> bodySmall()
        }
    }
}

/**
 * DefaultOraTypography is the default typography used in the Orata Design System.
 * @author oratakashi
 * @since 06 Sep 2025
 */
val DefaultOraTypography = OraTypography()

/**
 * Converts a token key to a [TextStyle] using the [OraTypography] provided by the [DefaultOraTypography].
 */
@ReadOnlyComposable
@Composable
fun OraTypographyKeyToken.toTextStyle(): TextStyle {
    return OrataTheme.typography.fromToken(this)
}
