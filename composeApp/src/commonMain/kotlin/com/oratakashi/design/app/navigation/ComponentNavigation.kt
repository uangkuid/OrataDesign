package com.oratakashi.design.app.navigation

import androidx.compose.runtime.Composable
import com.oratakashi.design.app.navigation.contract.MenuNavigation
import com.oratakashi.design.resources.Res
import com.oratakashi.design.resources.ic_component
import com.oratakashi.design.resources.label_component
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.stringResource

@Serializable
/**
 * ComponentNavigation provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
object ComponentNavigation: MenuNavigation {
    override fun getSerializer() = serializer()
    override val icon: DrawableResource
        get() = Res.drawable.ic_component

    @Composable
    /**
     * title function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun title(): String = stringResource(Res.string.label_component)
}