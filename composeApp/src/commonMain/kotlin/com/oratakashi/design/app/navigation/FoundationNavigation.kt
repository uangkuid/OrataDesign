package com.oratakashi.design.app.navigation

import androidx.compose.runtime.Composable
import com.oratakashi.design.app.navigation.contract.MenuNavigation
import kotlinx.serialization.Serializable
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_foundation
import oratadesign.composeapp.generated.resources.label_foundation
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.stringResource

@Serializable
object FoundationNavigation : MenuNavigation {
    override val icon: DrawableResource
        get() = Res.drawable.ic_foundation

    @Composable
    override fun title(): String = stringResource(Res.string.label_foundation)
}