package com.oratakashi.design.app.navigation.contract

import androidx.compose.runtime.Composable

/**
 * BaseNavigation provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
interface BaseNavigation {
    val route: String?
        get() = this::class.qualifiedName
//    val title: String?
//        @Composable
//        get() = this::class.simpleName?.replace("Navigation", "")
    @Composable
    /**
     * title function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun title(): String = this::class.simpleName?.replace("Navigation", "") ?: "No Name"
}