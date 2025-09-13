package com.oratakashi.design.app.navigation

import androidx.compose.runtime.Composable
import com.oratakashi.design.app.navigation.contract.MenuNavigation
import kotlinx.serialization.Serializable
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_typography
import oratadesign.composeapp.generated.resources.label_colors
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.stringResource

@Serializable
object TypographyNavigation: MenuNavigation {
    override val icon: DrawableResource = Res.drawable.ic_typography

    @Composable
    override fun title(): String = stringResource(Res.string.label_colors)
}