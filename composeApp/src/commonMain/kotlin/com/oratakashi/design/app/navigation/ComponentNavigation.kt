package com.oratakashi.design.app.navigation

import kotlinx.serialization.Serializable
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_component
import org.jetbrains.compose.resources.DrawableResource

@Serializable
object ComponentNavigation: MenuNavigation {
    override val icon: DrawableResource
        get() = Res.drawable.ic_component
}