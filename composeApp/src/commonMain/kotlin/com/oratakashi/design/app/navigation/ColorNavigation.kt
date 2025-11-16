package com.oratakashi.design.app.navigation

import androidx.compose.runtime.Composable
import com.oratakashi.design.app.navigation.contract.MenuNavigation
import kotlinx.serialization.Serializable
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_colors
import oratadesign.composeapp.generated.resources.label_colors
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.stringResource

@Serializable
/**
 * ColorNavigation provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
object ColorNavigation: MenuNavigation {
    override val icon: DrawableResource = Res.drawable.ic_colors
    @Composable
    /**
     * title function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun title(): String = stringResource(Res.string.label_colors)
}