package com.oratakashi.design.app.navigation

import com.oratakashi.design.app.navigation.contract.BaseNavigation
import kotlinx.serialization.Serializable

@Serializable
object SnackbarNavigation: BaseNavigation {
    override fun getSerializer() = serializer()
}
