package com.oratakashi.design.app.models

import com.oratakashi.design.app.icons.DynamicIcons
import com.oratakashi.design.app.navigation.contract.BaseNavigation
import org.jetbrains.compose.resources.DrawableResource

internal data class ComponentData(
    val title: String,
    val image: DynamicIcons,
    val navigation: BaseNavigation? = null
)