package com.oratakashi.design.app.models

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.oratakashi.design.app.ui.colors.ColorData
import com.oratakashi.design.foundation.OrataTheme

internal object Constant {
    @Composable
    fun primaryColors(): List<ColorData> = listOf(
        ColorData(
            name = "Primary",
            code = "P-40",
            color = OrataTheme.colors.onPrimary,
            background = OrataTheme.colors.primary
        ),
        ColorData(
            name = "On Primary",
            code = "P-100",
            color = OrataTheme.colors.primary,
            background = OrataTheme.colors.onPrimary
        ),
        ColorData(
            name = "Primary Container",
            code = "P-90",
            color = OrataTheme.colors.onPrimaryContainer,
            background = OrataTheme.colors.primaryContainer
        ),
        ColorData(
            name = "On Primary Container",
            code = "P-30",
            color = OrataTheme.colors.primaryContainer,
            background = OrataTheme.colors.onPrimaryContainer
        )
    )

    @Composable
    fun secondaryColors(): List<ColorData> = listOf(
        ColorData(
            name = "Secondary",
            code = "S-40",
            color = OrataTheme.colors.onSecondary,
            background = OrataTheme.colors.secondary
        ),
        ColorData(
            name = "On Secondary",
            code = "S-100",
            color = OrataTheme.colors.secondary,
            background = OrataTheme.colors.onSecondary
        ),
        ColorData(
            name = "Secondary Container",
            code = "S-90",
            color = OrataTheme.colors.onSecondaryContainer,
            background = OrataTheme.colors.secondaryContainer
        ),
        ColorData(
            name = "On Secondary Container",
            code = "S-30",
            color = OrataTheme.colors.secondaryContainer,
            background = OrataTheme.colors.onSecondaryContainer
        )
    )

    @Composable
    fun tertiaryColors(): List<ColorData> = listOf(
        ColorData(
            name = "Tertiary",
            code = "T-40",
            color = OrataTheme.colors.onTertiary,
            background = OrataTheme.colors.tertiary
        ),
        ColorData(
            name = "On Tertiary",
            code = "T-100",
            color = OrataTheme.colors.tertiary,
            background = OrataTheme.colors.onTertiary
        ),
        ColorData(
            name = "Tertiary Container",
            code = "T-90",
            color = OrataTheme.colors.onTertiaryContainer,
            background = OrataTheme.colors.tertiaryContainer
        ),
        ColorData(
            name = "On Tertiary Container",
            code = "T-30",
            color = OrataTheme.colors.tertiaryContainer,
            background = OrataTheme.colors.onTertiaryContainer
        )
    )

    @Composable
    fun errorColors(): List<ColorData> = listOf(
        ColorData(
            name = "Error",
            code = "E-40",
            color = OrataTheme.colors.onError,
            background = OrataTheme.colors.error
        ),
        ColorData(
            name = "On Error",
            code = "E-100",
            color = OrataTheme.colors.error,
            background = OrataTheme.colors.onError
        ),
        ColorData(
            name = "Error Container",
            code = "E-90",
            color = OrataTheme.colors.onErrorContainer,
            background = OrataTheme.colors.errorContainer
        ),
        ColorData(
            name = "On Error Container",
            code = "T-30",
            color = OrataTheme.colors.errorContainer,
            background = OrataTheme.colors.onErrorContainer
        )
    )

    @Composable
    fun surfaceColors(): List<ColorData> = listOf(
        ColorData(
            name = "Surface Dim",
            code = "N-87",
            color = OrataTheme.colors.onSurface,
            background = OrataTheme.colors.surfaceDim
        ),
        ColorData(
            name = "Surface",
            code = "N-98",
            color = OrataTheme.colors.onSurface,
            background = OrataTheme.colors.surface
        ),
        ColorData(
            name = "Surface Bright",
            code = "N-98",
            color = OrataTheme.colors.onSurface,
            background = OrataTheme.colors.surfaceBright
        )
    )

    @Composable
    fun surfaceContainerColors(): List<ColorData> = listOf(
        ColorData(
            name = "Surf. Container Lowest",
            code = "N-100",
            color = OrataTheme.colors.onSurface,
            background = OrataTheme.colors.surfaceContainerLowest
        ),
        ColorData(
            name = "Surf. Container Low",
            code = "N-96",
            color = OrataTheme.colors.onSurface,
            background = OrataTheme.colors.surfaceContainerLow
        ),
        ColorData(
            name = "Surf. Container",
            code = "N-94",
            color = OrataTheme.colors.onSurface,
            background = OrataTheme.colors.surfaceContainer
        ),
        ColorData(
            name = "Surf. Container High",
            code = "N-92",
            color = OrataTheme.colors.onSurface,
            background = OrataTheme.colors.surfaceContainerHigh
        ),
        ColorData(
            name = "Surf. Container Highest",
            code = "N-90",
            color = OrataTheme.colors.onSurface,
            background = OrataTheme.colors.surfaceContainerHighest
        )
    )

    @Composable
    fun outlineColors(): List<ColorData> = listOf(
        ColorData(
            name = "On Surface",
            code = "N-10",
            color = OrataTheme.colors.surface,
            background = OrataTheme.colors.onSurface
        ),
        ColorData(
            name = "On Surface Var.",
            code = "NV-30",
            color = OrataTheme.colors.surface,
            background = OrataTheme.colors.onSurfaceVariant
        ),
        ColorData(
            name = "Outline",
            code = "NV-50",
            color = OrataTheme.colors.surface,
            background = OrataTheme.colors.outline
        ),
        ColorData(
            name = "Outline Variant",
            code = "NV-80",
            color = OrataTheme.colors.onSurfaceVariant,
            background = OrataTheme.colors.outlineVariant
        )
    )
}