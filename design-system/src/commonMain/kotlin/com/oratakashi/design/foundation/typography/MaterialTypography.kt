package com.oratakashi.design.foundation.typography

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable

/**
 * MaterialTypography is an extension function that converts OrataDesignTypography to Material Typography.
 * @author oratakashi
 * @since 16 Sep 2025
 */
@Composable
internal fun OrataDesignTypography.toMaterialTypography(): Typography {
    return Typography(
        displayLarge = displayLarge(),
        displayMedium = displayMedium(),
        displaySmall = displaySmall(),
        headlineLarge = headlineLarge(),
        headlineMedium = headlineMedium(),
        headlineSmall = headlineSmall(),
        bodyLarge = bodyLarge(),
        bodyMedium = bodyMedium(),
        bodySmall = bodySmall(),
        labelLarge = labelLarge(),
        labelMedium = labelMedium(),
        labelSmall = labelSmall(),
    )
}