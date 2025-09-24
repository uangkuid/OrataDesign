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
    fun displayLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun displayMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun displaySmall(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun headlineLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun headlineMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun headlineSmall(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun titleLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun titleMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun titleSmall(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun labelLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun labelMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun labelSmall(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun bodyLarge(): TextStyle

    @ReadOnlyComposable
    @Composable
    fun bodyMedium(): TextStyle

    @ReadOnlyComposable
    @Composable
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
