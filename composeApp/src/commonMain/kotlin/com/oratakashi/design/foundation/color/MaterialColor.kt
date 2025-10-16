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
internal fun OrataDesignColorScheme.toMaterialLightColorScheme(): ColorScheme {
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
internal fun OrataDesignColorScheme.toMaterialDarkColorScheme(): ColorScheme {
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

internal fun ColorScheme.toOrataDesignColorScheme(): OrataDesignColorScheme {
    return object: OrataDesignColorScheme {
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
        override val warning: Color = OraPaletteTokens.warningLight
        override val onWarning: Color = OraPaletteTokens.onWarningLight
        override val warningContainer: Color = OraPaletteTokens.warningContainerLight
        override val onWarningContainer: Color = OraPaletteTokens.onWarningContainerLight
        override val success: Color = OraPaletteTokens.successLight
        override val onSuccess: Color = OraPaletteTokens.onSuccessLight
        override val successContainer: Color = OraPaletteTokens.successContainerLight
        override val onSuccessContainer: Color = OraPaletteTokens.onSuccessContainerLight
        override val info: Color = OraPaletteTokens.infoLight
        override val onInfo: Color = OraPaletteTokens.onInfoLight
        override val infoContainer: Color = OraPaletteTokens.infoContainerLight
        override val onInfoContainer: Color = OraPaletteTokens.onInfoContainerLight
    }
}