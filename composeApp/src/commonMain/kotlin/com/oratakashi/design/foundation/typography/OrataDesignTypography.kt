package com.oratakashi.design.foundation.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle

/**
 * OrataDesignTypography is a interface that contains all the typography used in the Orata Design System.
 * @author oratakashi
 * @since 04 Sep 2025
 */
interface OrataDesignTypography {
    @Composable
    fun displayLarge(): TextStyle

    @Composable
    fun displayMedium(): TextStyle

    @Composable
    fun displaySmall(): TextStyle

    @Composable
    fun headlineLarge(): TextStyle

    @Composable
    fun headlineMedium(): TextStyle

    @Composable
    fun headlineSmall(): TextStyle

    @Composable
    fun titleLarge(): TextStyle

    @Composable
    fun titleMedium(): TextStyle

    @Composable
    fun titleSmall(): TextStyle

    @Composable
    fun labelLarge(): TextStyle

    @Composable
    fun labelMedium(): TextStyle

    @Composable
    fun labelSmall(): TextStyle

    @Composable
    fun bodyLarge(): TextStyle

    @Composable
    fun bodyMedium(): TextStyle

    @Composable
    fun bodySmall(): TextStyle
}

/**
 * Extension function to map OraTypographyKeyToken to OrataDesignTypography's TextStyle.
 */
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
