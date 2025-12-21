package com.oratakashi.design.foundation.color

import androidx.compose.ui.graphics.Color

/**
 * OrataDesignColorScheme is a interface that contains all the color used in the Orata Design System.
 * @author oratakashi
 * @since 30 Aug 2025
 */
interface OrataDesignColorScheme {
    val primary: Color
    val onPrimary: Color
    val primaryContainer: Color
    val onPrimaryContainer: Color
    val secondary: Color
    val onSecondary: Color
    val secondaryContainer: Color
    val onSecondaryContainer: Color
    val tertiary: Color
    val onTertiary: Color
    val tertiaryContainer: Color
    val onTertiaryContainer: Color
    val error: Color
    val onError: Color
    val errorContainer: Color
    val onErrorContainer: Color
    val surface: Color
    val surfaceDim: Color
    val onSurface: Color
    val surfaceBright: Color
    val surfaceVariant: Color
    val onSurfaceVariant: Color
    val surfaceContainer: Color
    val surfaceContainerLowest: Color
    val surfaceContainerLow: Color
    val surfaceContainerHigh: Color
    val surfaceContainerHighest: Color
    val inverseSurface: Color
    val inverseOnSurface: Color
    val inversePrimary: Color
    val outline: Color
    val outlineVariant: Color
    val scrim: Color
    val background: Color
    val onBackground: Color
    val warning: Color
    val onWarning: Color
    val warningContainer: Color
    val onWarningContainer: Color
    val success: Color
    val onSuccess: Color
    val successContainer: Color
    val onSuccessContainer: Color
    val info: Color
    val onInfo: Color
    val infoContainer: Color
    val onInfoContainer: Color

}

/**
 * Returns the color from the current OrataDesignColorScheme based on the given OraColorSchemeKeyTokens.
 */
internal fun OrataDesignColorScheme.fromToken(token: OraColorSchemeKeyTokens): Color = when (token) {
    OraColorSchemeKeyTokens.Primary -> primary
    OraColorSchemeKeyTokens.OnPrimary -> onPrimary
    OraColorSchemeKeyTokens.PrimaryContainer -> primaryContainer
    OraColorSchemeKeyTokens.OnPrimaryContainer -> onPrimaryContainer
    OraColorSchemeKeyTokens.Secondary -> secondary
    OraColorSchemeKeyTokens.OnSecondary -> onSecondary
    OraColorSchemeKeyTokens.SecondaryContainer -> secondaryContainer
    OraColorSchemeKeyTokens.OnSecondaryContainer -> onSecondaryContainer
    OraColorSchemeKeyTokens.Tertiary -> tertiary
    OraColorSchemeKeyTokens.OnTertiary -> onTertiary
    OraColorSchemeKeyTokens.TertiaryContainer -> tertiaryContainer
    OraColorSchemeKeyTokens.OnTertiaryContainer -> onTertiaryContainer
    OraColorSchemeKeyTokens.Error -> error
    OraColorSchemeKeyTokens.OnError -> onError
    OraColorSchemeKeyTokens.ErrorContainer -> errorContainer
    OraColorSchemeKeyTokens.OnErrorContainer -> onErrorContainer
    OraColorSchemeKeyTokens.Surface -> surface
    OraColorSchemeKeyTokens.SurfaceDim -> surfaceDim
    OraColorSchemeKeyTokens.OnSurface -> onSurface
    OraColorSchemeKeyTokens.SurfaceBright -> surfaceBright
    OraColorSchemeKeyTokens.SurfaceVariant -> surfaceVariant
    OraColorSchemeKeyTokens.OnSurfaceVariant -> onSurfaceVariant
    OraColorSchemeKeyTokens.SurfaceContainer -> surfaceContainer
    OraColorSchemeKeyTokens.SurfaceContainerLowest -> surfaceContainerLowest
    OraColorSchemeKeyTokens.SurfaceContainerLow -> surfaceContainerLow
    OraColorSchemeKeyTokens.SurfaceContainerHigh -> surfaceContainerHigh
    OraColorSchemeKeyTokens.SurfaceContainerHighest -> surfaceContainerHighest
    OraColorSchemeKeyTokens.InverseSurface -> inverseSurface
    OraColorSchemeKeyTokens.InverseOnSurface -> inverseOnSurface
    OraColorSchemeKeyTokens.InversePrimary -> inversePrimary
    OraColorSchemeKeyTokens.Outline -> outline
    OraColorSchemeKeyTokens.OutlineVariant -> outlineVariant
    OraColorSchemeKeyTokens.Scrim -> scrim
    OraColorSchemeKeyTokens.Background -> background
    OraColorSchemeKeyTokens.OnBackground -> onBackground
    OraColorSchemeKeyTokens.Warning -> warning
    OraColorSchemeKeyTokens.OnWarning -> onWarning
    OraColorSchemeKeyTokens.WarningContainer -> warningContainer
    OraColorSchemeKeyTokens.OnWarningContainer -> onWarningContainer
    OraColorSchemeKeyTokens.Success -> success
    OraColorSchemeKeyTokens.OnSuccess -> onSuccess
    OraColorSchemeKeyTokens.SuccessContainer -> successContainer
    OraColorSchemeKeyTokens.OnSuccessContainer -> onSuccessContainer
    OraColorSchemeKeyTokens.Info -> info
    OraColorSchemeKeyTokens.OnInfo -> onInfo
    OraColorSchemeKeyTokens.InfoContainer -> infoContainer
    OraColorSchemeKeyTokens.OnInfoContainer -> onInfoContainer
}
