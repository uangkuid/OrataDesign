package com.oratakashi.design.app.navigation

import kotlinx.serialization.Serializable
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_foundation
import org.jetbrains.compose.resources.DrawableResource

@Serializable
object FoundationNavigation : MenuNavigation {
    override val icon: DrawableResource
        get() = Res.drawable.ic_foundation
}