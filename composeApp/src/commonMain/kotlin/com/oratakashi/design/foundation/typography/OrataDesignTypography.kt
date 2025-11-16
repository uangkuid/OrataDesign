package com.oratakashi.design.foundation.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle

/**
 * OrataDesignTypography is a interface that contains all the typography used in the Orata Design System.
 * @author oratakashi
 * @since 04 Sep 2025
 */
interface OrataDesignTypography {
    @ReadOnlyComposable
    @Composable
    /**
     * displayLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun displayLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * displayMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun displayMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * displaySmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun displaySmall(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * headlineLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun headlineLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * headlineMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun headlineMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * headlineSmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun headlineSmall(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * titleLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun titleLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * titleMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun titleMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * titleSmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun titleSmall(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * labelLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun labelLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * labelMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun labelMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * labelSmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun labelSmall(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * bodyLarge function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun bodyLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * bodyMedium function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun bodyMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
    /**
     * bodySmall function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun bodySmall(): TextStyle
}

/**
 * Extension function to map OraTypographyKeyToken to OrataDesignTypography's TextStyle.
 */
@ReadOnlyComposable
@Composable
fun OrataDesignTypography.fromToken(token: OraTypographyKeyToken): TextStyle = when (token) {
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
