package com.oratakashi.design.foundation.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle

/**
 * OraTypography is a class that contains all the typography used in the Orata Design System.
 * @author oratakashi
 * @since 06 Sep 2025
 */
@Immutable
class OraTypography: OrataDesignTypography {
    @Composable
    override fun displayLarge(): TextStyle = OraTypographyTokens.DisplayLarge

    @Composable
    override fun displayMedium(): TextStyle = OraTypographyTokens.DisplayMedium

    @Composable
    override fun displaySmall(): TextStyle = OraTypographyTokens.DisplaySmall

    @Composable
    override fun headlineLarge(): TextStyle = OraTypographyTokens.HeadlineLarge

    @Composable
    override fun headlineMedium(): TextStyle = OraTypographyTokens.HeadlineMedium

    @Composable
    override fun headlineSmall(): TextStyle = OraTypographyTokens.HeadlineSmall

    @Composable
    override fun titleLarge(): TextStyle = OraTypographyTokens.TitleLarge

    @Composable
    override fun titleMedium(): TextStyle = OraTypographyTokens.TitleMedium

    @Composable
    override fun titleSmall(): TextStyle = OraTypographyTokens.TitleSmall

    @Composable
    override fun labelLarge(): TextStyle = OraTypographyTokens.LabelLarge

    @Composable
    override fun labelMedium(): TextStyle = OraTypographyTokens.LabelMedium

    @Composable
    override fun labelSmall(): TextStyle = OraTypographyTokens.LabelSmall

    @Composable
    override fun bodyLarge(): TextStyle = OraTypographyTokens.BodyLarge

    @Composable
    override fun bodyMedium(): TextStyle = OraTypographyTokens.BodyMedium

    @Composable
    override fun bodySmall(): TextStyle = OraTypographyTokens.BodySmall
}

/**
 * DefaultOraTypography is the default typography used in the Orata Design System.
 * @author oratakashi
 * @since 06 Sep 2025
 */
val DefaultOraTypography = OraTypography()