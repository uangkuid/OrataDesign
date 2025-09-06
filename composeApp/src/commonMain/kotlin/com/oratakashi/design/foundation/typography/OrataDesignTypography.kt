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