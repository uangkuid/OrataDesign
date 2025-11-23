package com.oratakashi.design.app.navigation

import com.oratakashi.design.app.navigation.contract.BaseNavigation
import kotlinx.serialization.Serializable

@Serializable
/**
 * ComponentListNavigation provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
object ComponentListNavigation: BaseNavigation {
    override fun getSerializer() = serializer()
}
