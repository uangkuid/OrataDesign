package com.oratakashi.design.app.navigation.contract

import androidx.compose.runtime.Composable
import kotlinx.serialization.SerializationStrategy

/**
 * BaseNavigation provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
interface BaseNavigation {
    /**
     * Provide the serializer for this navigation object.
     * This is used to automatically generate route and title without reflection.
     */
    fun getSerializer(): SerializationStrategy<*>

    val route: String
        get() = getSerializer().descriptor.serialName

    val title: String
        get() = getSerializer().descriptor.serialName
            .substringAfterLast('.')
            .replace("Navigation", "")

    @Composable
    /**
     * title function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun title(): String = title
}