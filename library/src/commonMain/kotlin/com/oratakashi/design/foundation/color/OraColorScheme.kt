package com.oratakashi.design.foundation.color

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

/**
 * OraColorScheme is a data class that contains all the color used in the Orata Design System.
 * @author oratakashi
 * @since 30 Aug 2025
 */
@Immutable
data class OraColorScheme(
    override val primary: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.primaryLight,
    override val onPrimary: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onPrimaryLight,
    override val primaryContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.primaryContainerLight,
    override val onPrimaryContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onPrimaryContainerLight,
    override val secondary: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.secondaryLight,
    override val onSecondary: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSecondaryLight,
    override val secondaryContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.secondaryContainerLight,
    override val onSecondaryContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSecondaryContainerLight,
    override val tertiary: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.tertiaryLight,
    override val onTertiary: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onTertiaryLight,
    override val tertiaryContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.tertiaryContainerLight,
    override val onTertiaryContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onTertiaryContainerLight,
    override val error: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.errorLight,
    override val onError: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onErrorLight,
    override val errorContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.errorContainerLight,
    override val onErrorContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onErrorContainerLight,
    override val surface: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceLight,
    override val surfaceDim: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceDimLight,
    override val onSurface: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSurfaceLight,
    override val surfaceBright: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceBrightLight,
    override val surfaceVariant: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceVariantLight,
    override val onSurfaceVariant: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSurfaceVariantLight,
    override val surfaceContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerLight,
    override val surfaceContainerLowest: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerLowestLight,
    override val surfaceContainerLow: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerLowLight,
    override val surfaceContainerHigh: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerHighLight,
    override val surfaceContainerHighest: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerHighestLight,
    override val inverseSurface: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.inverseSurfaceLight,
    override val inverseOnSurface: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.inverseOnSurfaceLight,
    override val inversePrimary: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.inversePrimaryLight,
    override val outline: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.outlineLight,
    override val outlineVariant: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.outlineVariantLight,
    override val scrim: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.scrimLight,
    override val background: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.backgroundLight,
    override val onBackground: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onBackgroundLight,
    override val warning: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.warningLight,
    override val onWarning: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onWarningLight,
    override val warningContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.warningContainerLight,
    override val onWarningContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onWarningContainerLight,
    override val success: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.successLight,
    override val onSuccess: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSuccessLight,
    override val successContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.successContainerLight,
    override val onSuccessContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSuccessContainerLight,
    override val info: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.infoLight,
    override val onInfo: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onInfoLight,
    override val infoContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.infoContainerLight,
    override val onInfoContainer: Color = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onInfoContainerLight,
): com.oratakashi.design.foundation.color.OrataDesignColorScheme

/**
 * lightOraColorScheme function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun lightOraColorScheme() =
    _root_ide_package_.com.oratakashi.design.foundation.color.OraColorScheme()

/**
 * darkOraColorScheme function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun darkOraColorScheme() = _root_ide_package_.com.oratakashi.design.foundation.color.OraColorScheme(
    primary = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.primaryDark,
    onPrimary = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onPrimaryDark,
    primaryContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.primaryContainerDark,
    onPrimaryContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onPrimaryContainerDark,
    secondary = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.secondaryDark,
    onSecondary = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSecondaryDark,
    secondaryContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.secondaryContainerDark,
    onSecondaryContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSecondaryContainerDark,
    tertiary = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.tertiaryDark,
    onTertiary = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onTertiaryDark,
    tertiaryContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.tertiaryContainerDark,
    onTertiaryContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onTertiaryContainerDark,
    error = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.errorDark,
    onError = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onErrorDark,
    errorContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.errorContainerDark,
    onErrorContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onErrorContainerDark,
    surface = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceDark,
    surfaceDim = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceDimDark,
    onSurface = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSurfaceDark,
    surfaceBright = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceBrightDark,
    surfaceVariant = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceVariantDark,
    onSurfaceVariant = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSurfaceVariantDark,
    surfaceContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerDark,
    surfaceContainerLowest = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerLowestDark,
    surfaceContainerLow = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerLowDark,
    surfaceContainerHigh = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerHighDark,
    surfaceContainerHighest = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.surfaceContainerHighestDark,
    inverseSurface = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.inverseSurfaceDark,
    inverseOnSurface = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.inverseOnSurfaceDark,
    inversePrimary = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.inversePrimaryDark,
    outline = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.outlineDark,
    outlineVariant = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.outlineVariantDark,
    scrim = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.scrimDark,
    background = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.backgroundDark,
    onBackground = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onBackgroundDark,
    warning = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.warningDark,
    onWarning = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onWarningDark,
    warningContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.warningContainerDark,
    onWarningContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onWarningContainerDark,
    success = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.successDark,
    onSuccess = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSuccessDark,
    successContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.successContainerDark,
    onSuccessContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onSuccessContainerDark,
    info = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.infoDark,
    onInfo = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onInfoDark,
    infoContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.infoContainerDark,
    onInfoContainer = _root_ide_package_.com.oratakashi.design.foundation.color.OraPaletteTokens.onInfoContainerDark,
)
