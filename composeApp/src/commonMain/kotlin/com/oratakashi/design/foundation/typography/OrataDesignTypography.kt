package com.oratakashi.design.foundation.typography

import androidx.compose.ui.text.TextStyle

/**
 * OrataDesignTypography is a interface that contains all the typography used in the Orata Design System.
 * @author oratakashi
 * @since 04 Sep 2025
 */
interface OrataDesignTypography {
    val displayLarge: TextStyle
    val displayMedium: TextStyle
    val displaySmall: TextStyle
    val headlineLarge: TextStyle
    val headlineMedium: TextStyle
    val headlineSmall: TextStyle
    val titleLarge: TextStyle
    val titleMedium: TextStyle
    val titleSmall: TextStyle
    val labelLarge: TextStyle
    val labelMedium: TextStyle
    val labelSmall: TextStyle
    val bodyLarge: TextStyle
    val bodyMedium: TextStyle
    val bodySmall: TextStyle
}