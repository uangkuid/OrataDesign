package com.oratakashi.design.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

/**
 * OraColorScheme is a data class that contains all the color used in the Orata Design System.
 * @author oratakashi
 * @since 30 Aug 2025
 */
@Immutable
data class OraColorScheme(
    override val primary: Color = OraPaletteTokens.primaryLight,
    override val onPrimary: Color = OraPaletteTokens.onPrimaryLight,
    override val primaryContainer: Color = OraPaletteTokens.primaryContainerLight,
    override val onPrimaryContainer: Color = OraPaletteTokens.onPrimaryContainerLight,
    override val secondary: Color = OraPaletteTokens.secondaryLight,
    override val onSecondary: Color = OraPaletteTokens.onSecondaryLight,
    override val secondaryContainer: Color = OraPaletteTokens.secondaryContainerLight,
    override val onSecondaryContainer: Color = OraPaletteTokens.onSecondaryContainerLight,
    override val tertiary: Color = OraPaletteTokens.tertiaryLight,
    override val onTertiary: Color = OraPaletteTokens.onTertiaryLight,
    override val tertiaryContainer: Color = OraPaletteTokens.tertiaryContainerLight,
    override val onTertiaryContainer: Color = OraPaletteTokens.onTertiaryContainerLight,
    override val error: Color = OraPaletteTokens.errorLight,
    override val onError: Color = OraPaletteTokens.onErrorLight,
    override val errorContainer: Color = OraPaletteTokens.errorContainerLight,
    override val onErrorContainer: Color = OraPaletteTokens.onErrorContainerLight,
    override val surface: Color = OraPaletteTokens.surfaceLight,
    override val surfaceDim: Color = OraPaletteTokens.surfaceDimLight,
    override val onSurface: Color = OraPaletteTokens.onSurfaceLight,
    override val surfaceBright: Color = OraPaletteTokens.surfaceBrightLight,
    override val surfaceVariant: Color = OraPaletteTokens.surfaceVariantLight,
    override val onSurfaceVariant: Color = OraPaletteTokens.onSurfaceVariantLight,
    override val surfaceContainer: Color = OraPaletteTokens.surfaceContainerLight,
    override val surfaceContainerLowest: Color = OraPaletteTokens.surfaceContainerLowestLight,
    override val surfaceContainerLow: Color = OraPaletteTokens.surfaceContainerLowLight,
    override val surfaceContainerHigh: Color = OraPaletteTokens.surfaceContainerHighLight,
    override val surfaceContainerHighest: Color = OraPaletteTokens.surfaceContainerHighestLight,
    override val inverseSurface: Color = OraPaletteTokens.inverseSurfaceLight,
    override val inverseOnSurface: Color = OraPaletteTokens.inverseOnSurfaceLight,
    override val inversePrimary: Color = OraPaletteTokens.inversePrimaryLight,
    override val outline: Color = OraPaletteTokens.outlineLight,
    override val outlineVariant: Color = OraPaletteTokens.outlineVariantLight,
    override val scrim: Color = OraPaletteTokens.scrimLight,
    override val background: Color = OraPaletteTokens.backgroundLight,
    override val onBackground: Color = OraPaletteTokens.onBackgroundLight,
): OrataDesignColorScheme