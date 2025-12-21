package com.oratakashi.design.app.models

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.ThreePaneScaffoldValue
import androidx.compose.runtime.Composable
import com.oratakashi.design.app.icons.AlertIcon
import com.oratakashi.design.app.icons.AnchorTextIcon
import com.oratakashi.design.app.icons.ButtonIcon
import com.oratakashi.design.app.icons.SnackbarIcon
import com.oratakashi.design.app.icons.TextFieldIcon
import com.oratakashi.design.app.models.TypographyData
import com.oratakashi.design.app.navigation.AlertNavigation
import com.oratakashi.design.app.navigation.AnchorTextNavigation
import com.oratakashi.design.app.navigation.ButtonNavigation
import com.oratakashi.design.app.navigation.SnackbarNavigation
import com.oratakashi.design.app.navigation.TextFieldNavigation
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.foundation.typography.OraTypographyKeyToken

internal object Constant {
    @Composable
    /**
     * componentList function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun componentList(): List<ComponentData> = listOf(
        ComponentData(
            title = "Button",
            image = ButtonIcon,
            navigation = ButtonNavigation
        ),
        ComponentData(
            title = "TextField",
            image = TextFieldIcon,
            navigation = TextFieldNavigation
        ),
        ComponentData(
            title = "AnchorText",
            image = AnchorTextIcon,
            navigation = AnchorTextNavigation
        ),
        ComponentData(
            title = "Alert",
            image = AlertIcon,
            navigation = AlertNavigation
        ),
        ComponentData(
            title = "Snackbar",
            image = SnackbarIcon,
            navigation = SnackbarNavigation
        )
    )

    @Composable
    /**
     * primaryColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun primaryColors(): List<ColorData> = listOf(
        ColorData(
            name = "Primary",
            code = "P-40",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onPrimary,
            background = com.oratakashi.design.foundation.OrataTheme.colors.primary
        ),
        ColorData(
            name = "On Primary",
            code = "P-100",
            color = com.oratakashi.design.foundation.OrataTheme.colors.primary,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onPrimary
        ),
        ColorData(
            name = "Primary Container",
            code = "P-90",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onPrimaryContainer,
            background = com.oratakashi.design.foundation.OrataTheme.colors.primaryContainer
        ),
        ColorData(
            name = "On Primary Container",
            code = "P-30",
            color = com.oratakashi.design.foundation.OrataTheme.colors.primaryContainer,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onPrimaryContainer
        )
    )

    @Composable
    /**
     * secondaryColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun secondaryColors(): List<ColorData> = listOf(
        ColorData(
            name = "Secondary",
            code = "S-40",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSecondary,
            background = com.oratakashi.design.foundation.OrataTheme.colors.secondary
        ),
        ColorData(
            name = "On Secondary",
            code = "S-100",
            color = com.oratakashi.design.foundation.OrataTheme.colors.secondary,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onSecondary
        ),
        ColorData(
            name = "Secondary Container",
            code = "S-90",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSecondaryContainer,
            background = com.oratakashi.design.foundation.OrataTheme.colors.secondaryContainer
        ),
        ColorData(
            name = "On Secondary Container",
            code = "S-30",
            color = com.oratakashi.design.foundation.OrataTheme.colors.secondaryContainer,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onSecondaryContainer
        )
    )

    @Composable
    /**
     * tertiaryColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun tertiaryColors(): List<ColorData> = listOf(
        ColorData(
            name = "Tertiary",
            code = "T-40",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onTertiary,
            background = com.oratakashi.design.foundation.OrataTheme.colors.tertiary
        ),
        ColorData(
            name = "On Tertiary",
            code = "T-100",
            color = com.oratakashi.design.foundation.OrataTheme.colors.tertiary,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onTertiary
        ),
        ColorData(
            name = "Tertiary Container",
            code = "T-90",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onTertiaryContainer,
            background = com.oratakashi.design.foundation.OrataTheme.colors.tertiaryContainer
        ),
        ColorData(
            name = "On Tertiary Container",
            code = "T-30",
            color = com.oratakashi.design.foundation.OrataTheme.colors.tertiaryContainer,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onTertiaryContainer
        )
    )

    @Composable
    /**
     * errorColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun errorColors(): List<ColorData> = listOf(
        ColorData(
            name = "Error",
            code = "E-40",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onError,
            background = com.oratakashi.design.foundation.OrataTheme.colors.error
        ),
        ColorData(
            name = "On Error",
            code = "E-100",
            color = com.oratakashi.design.foundation.OrataTheme.colors.error,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onError
        ),
        ColorData(
            name = "Error Container",
            code = "E-90",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onErrorContainer,
            background = com.oratakashi.design.foundation.OrataTheme.colors.errorContainer
        ),
        ColorData(
            name = "On Error Container",
            code = "T-30",
            color = com.oratakashi.design.foundation.OrataTheme.colors.errorContainer,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onErrorContainer
        )
    )

    @Composable
    /**
     * surfaceColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun surfaceColors(): List<ColorData> = listOf(
        ColorData(
            name = "Surface Dim",
            code = "N-87",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.surfaceDim
        ),
        ColorData(
            name = "Surface",
            code = "N-98",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.surface
        ),
        ColorData(
            name = "Surface Bright",
            code = "N-98",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.surfaceBright
        )
    )

    @Composable
    /**
     * surfaceContainerColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun surfaceContainerColors(): List<ColorData> = listOf(
        ColorData(
            name = "Surf. Container Lowest",
            code = "N-100",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.surfaceContainerLowest
        ),
        ColorData(
            name = "Surf. Container Low",
            code = "N-96",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.surfaceContainerLow
        ),
        ColorData(
            name = "Surf. Container",
            code = "N-94",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.surfaceContainer
        ),
        ColorData(
            name = "Surf. Container High",
            code = "N-92",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.surfaceContainerHigh
        ),
        ColorData(
            name = "Surf. Container Highest",
            code = "N-90",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSurface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.surfaceContainerHighest
        )
    )

    @Composable
    /**
     * outlineColors function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun outlineColors(): List<ColorData> = listOf(
        ColorData(
            name = "On Surface",
            code = "N-10",
            color = com.oratakashi.design.foundation.OrataTheme.colors.surface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onSurface
        ),
        ColorData(
            name = "On Surface Var.",
            code = "NV-30",
            color = com.oratakashi.design.foundation.OrataTheme.colors.surface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.onSurfaceVariant
        ),
        ColorData(
            name = "Outline",
            code = "NV-50",
            color = com.oratakashi.design.foundation.OrataTheme.colors.surface,
            background = com.oratakashi.design.foundation.OrataTheme.colors.outline
        ),
        ColorData(
            name = "Outline Variant",
            code = "NV-80",
            color = com.oratakashi.design.foundation.OrataTheme.colors.onSurfaceVariant,
            background = com.oratakashi.design.foundation.OrataTheme.colors.outlineVariant
        )
    )

    /**
     * displayItems function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun displayItems(): List<TypographyData> = listOf(
        TypographyData(
            "Display Large",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.DisplayLarge,
            "Display",
            "Large",
            "Montserrat",
            "57",
            "64"
        ),
        TypographyData(
            "Display Medium",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.DisplayMedium,
            "Display",
            "Medium",
            "Montserrat",
            "45",
            "52"
        ),
        TypographyData(
            "Display Small",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.DisplaySmall,
            "Display",
            "Small",
            "Montserrat",
            "36",
            "44"
        )
    )

    /**
     * headlineItems function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun headlineItems(): List<TypographyData> = listOf(
        TypographyData(
            "Headline Large",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.HeadlineLarge,
            "Headline",
            "Large",
            "Poppins",
            "32",
            "40"
        ),
        TypographyData(
            "Headline Medium",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.HeadlineMedium,
            "Headline",
            "Medium",
            "Poppins",
            "28",
            "36"
        ),
        TypographyData(
            "Headline Small",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.HeadlineSmall,
            "Headline",
            "Small",
            "Poppins",
            "24",
            "32"
        )
    )

    /**
     * titleItems function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun titleItems(): List<TypographyData> = listOf(
        TypographyData(
            "Title Large",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.TitleLarge,
            "Title",
            "Large",
            "Poppins",
            "22",
            "28"
        ),
        TypographyData(
            "Title Medium",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.TitleMedium,
            "Title",
            "Medium",
            "Poppins",
            "16",
            "24"
        ),
        TypographyData(
            "Title Small",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.TitleSmall,
            "Title",
            "Small",
            "Poppins",
            "14",
            "20"
        )
    )

    /**
     * labelItems function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun labelItems(): List<TypographyData> = listOf(
        TypographyData(
            "Label Large",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.LabelLarge,
            "Label",
            "Large",
            "Poppins",
            "14",
            "20"
        ),
        TypographyData(
            "Label Medium",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.LabelMedium,
            "Label",
            "Medium",
            "Poppins",
            "12",
            "16"
        ),
        TypographyData(
            "Label Small",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.LabelSmall,
            "Label",
            "Small",
            "Poppins",
            "11",
            "16"
        )
    )

    /**
     * bodyItems function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun bodyItems(): List<TypographyData> = listOf(
        TypographyData(
            "Body Large",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge,
            "Body",
            "Large",
            "Poppins",
            "14",
            "20"
        ),
        TypographyData(
            "Body Medium",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium,
            "Body",
            "Medium",
            "Poppins",
            "12",
            "16"
        ),
        TypographyData(
            "Body Small",
            com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodySmall,
            "Body",
            "Small",
            "Poppins",
            "11",
            "16"
        )
    )

    @OptIn(ExperimentalMaterial3AdaptiveApi::class)
    fun isListDetailPaneOpened(listPane: ThreePaneScaffoldValue): Boolean {
        return listPane.primary.toString() == "PaneAdaptedValue[Expanded]" && listPane.secondary.toString() == "PaneAdaptedValue[Expanded]"
    }
}