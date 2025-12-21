package com.oratakashi.design.foundation.color

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

/**
 * MaterialColor is a function to convert OrataDesignColorScheme to Material ColorScheme.
 * @author oratakashi
 * @since 07 Sep 2025
 */
internal fun com.oratakashi.design.foundation.color.OrataDesignColorScheme.toMaterialLightColorScheme(): ColorScheme {
    return lightColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        background = background,
        onBackground = onBackground,
        surface = surface,
        onSurface = onSurface,
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        outline = outline,
        inverseOnSurface = inverseOnSurface,
        inverseSurface = inverseSurface,
        inversePrimary = inversePrimary,
        outlineVariant = outlineVariant,
        scrim = scrim,
        surfaceBright = surfaceBright,
        surfaceDim = surfaceDim,
        surfaceContainer = surfaceContainer,
        surfaceContainerHigh = surfaceContainerHigh,
        surfaceContainerHighest = surfaceContainerHighest,
        surfaceContainerLow = surfaceContainerLow,
        surfaceContainerLowest = surfaceContainerLowest
    )
}

/**
 * MaterialColor is a function to convert OrataDesignColorScheme to Material ColorScheme.
 * @author oratakashi
 * @since 07 Sep 2025
 */
internal fun com.oratakashi.design.foundation.color.OrataDesignColorScheme.toMaterialDarkColorScheme(): ColorScheme {
    return darkColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        background = background,
        onBackground = onBackground,
        surface = surface,
        onSurface = onSurface,
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        outline = outline,
        inverseOnSurface = inverseOnSurface,
        inverseSurface = inverseSurface,
        inversePrimary = inversePrimary,
        outlineVariant = outlineVariant,
        scrim = scrim,
        surfaceBright = surfaceBright,
        surfaceDim = surfaceDim,
        surfaceContainer = surfaceContainer,
        surfaceContainerHigh = surfaceContainerHigh,
        surfaceContainerHighest = surfaceContainerHighest,
        surfaceContainerLow = surfaceContainerLow,
        surfaceContainerLowest = surfaceContainerLowest
    )
}

internal fun ColorScheme.toOrataDesignColorScheme(isDark: Boolean): com.oratakashi.design.foundation.color.OrataDesignColorScheme {
    return object: com.oratakashi.design.foundation.color.OrataDesignColorScheme {
        override val primary: Color = this@toOrataDesignColorScheme.primary
        override val onPrimary: Color = this@toOrataDesignColorScheme.onPrimary
        override val primaryContainer: Color = this@toOrataDesignColorScheme.primaryContainer
        override val onPrimaryContainer: Color = this@toOrataDesignColorScheme.onPrimaryContainer
        override val secondary: Color = this@toOrataDesignColorScheme.secondary
        override val onSecondary: Color = this@toOrataDesignColorScheme.onSecondary
        override val secondaryContainer: Color = this@toOrataDesignColorScheme.secondaryContainer
        override val onSecondaryContainer: Color = this@toOrataDesignColorScheme.onSecondaryContainer
        override val tertiary: Color = this@toOrataDesignColorScheme.tertiary
        override val onTertiary: Color = this@toOrataDesignColorScheme.onTertiary
        override val tertiaryContainer: Color = this@toOrataDesignColorScheme.tertiaryContainer
        override val onTertiaryContainer: Color = this@toOrataDesignColorScheme.onTertiaryContainer
        override val error: Color = this@toOrataDesignColorScheme.error
        override val onError: Color = this@toOrataDesignColorScheme.onError
        override val errorContainer: Color = this@toOrataDesignColorScheme.errorContainer
        override val onErrorContainer: Color = this@toOrataDesignColorScheme.onErrorContainer
        override val surface: Color = this@toOrataDesignColorScheme.surface
        override val surfaceDim: Color = this@toOrataDesignColorScheme.surfaceDim
        override val onSurface: Color = this@toOrataDesignColorScheme.onSurface
        override val surfaceBright: Color = this@toOrataDesignColorScheme.surfaceBright
        override val surfaceVariant: Color = this@toOrataDesignColorScheme.surfaceVariant
        override val onSurfaceVariant: Color = this@toOrataDesignColorScheme.onSurfaceVariant
        override val surfaceContainer: Color = this@toOrataDesignColorScheme.surfaceContainer
        override val surfaceContainerLowest: Color = this@toOrataDesignColorScheme.surfaceContainerLowest
        override val surfaceContainerLow: Color = this@toOrataDesignColorScheme.surfaceContainerLow
        override val surfaceContainerHigh: Color = this@toOrataDesignColorScheme.surfaceContainerHigh
        override val surfaceContainerHighest: Color = this@toOrataDesignColorScheme.surfaceContainerHighest
        override val inverseSurface: Color = this@toOrataDesignColorScheme.inverseSurface
        override val inverseOnSurface: Color = this@toOrataDesignColorScheme.inverseOnSurface
        override val inversePrimary: Color = this@toOrataDesignColorScheme.inversePrimary
        override val outline: Color = this@toOrataDesignColorScheme.outline
        override val outlineVariant: Color = this@toOrataDesignColorScheme.outlineVariant
        override val scrim: Color = this@toOrataDesignColorScheme.scrim
        override val background: Color = this@toOrataDesignColorScheme.background
        override val onBackground: Color = this@toOrataDesignColorScheme.onBackground
        override val warning: Color = if (isDark) OraPaletteTokens.warningDark else OraPaletteTokens.warningLight
        override val onWarning: Color = if (isDark) OraPaletteTokens.onWarningDark else OraPaletteTokens.onWarningLight
        override val warningContainer: Color = if (isDark) OraPaletteTokens.warningContainerDark else OraPaletteTokens.warningContainerLight
        override val onWarningContainer: Color = if (isDark) OraPaletteTokens.onWarningContainerDark else OraPaletteTokens.onWarningContainerLight
        override val success: Color = if (isDark) OraPaletteTokens.successDark else OraPaletteTokens.successLight
        override val onSuccess: Color = if (isDark) OraPaletteTokens.onSuccessDark else OraPaletteTokens.onSuccessLight
        override val successContainer: Color = if (isDark) OraPaletteTokens.successContainerDark else OraPaletteTokens.successContainerLight
        override val onSuccessContainer: Color = if (isDark) OraPaletteTokens.onSuccessContainerDark else OraPaletteTokens.onSuccessContainerLight
        override val info: Color = if (isDark) OraPaletteTokens.infoDark else OraPaletteTokens.infoLight
        override val onInfo: Color = if (isDark) OraPaletteTokens.onInfoDark else OraPaletteTokens.onInfoLight
        override val infoContainer: Color = if (isDark) OraPaletteTokens.infoContainerDark else OraPaletteTokens.infoContainerLight
        override val onInfoContainer: Color = if (isDark) OraPaletteTokens.onInfoContainerDark else OraPaletteTokens.onInfoContainerLight
    }
}