package com.oratakashi.design.app.navigation

import androidx.compose.runtime.Composable
import com.oratakashi.design.app.navigation.contract.MenuNavigation
import com.oratakashi.design.resources.Res
import com.oratakashi.design.resources.ic_colors
import com.oratakashi.design.resources.label_colors
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.stringResource

@Serializable
/**
 * ColorNavigation provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
object ColorNavigation: MenuNavigation {
    override fun getSerializer() = serializer()
    override val icon: DrawableResource = Res.drawable.ic_colors
    @Composable
    /**
     * title function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun title(): String = stringResource(Res.string.label_colors)
}