package com.oratakashi.design.app.navigation

import com.oratakashi.design.app.navigation.contract.BaseNavigation
import kotlinx.serialization.Serializable

@Serializable
/**
 * AlertNavigation provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
object AlertNavigation : BaseNavigation {
    override fun getSerializer() = serializer()
}
