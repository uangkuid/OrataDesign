package com.oratakashi.design.app.navigation.contract

import androidx.compose.runtime.Composable

interface BaseNavigation {
    val route: String?
        get() = this::class.qualifiedName
//    val title: String?
//        @Composable
//        get() = this::class.simpleName?.replace("Navigation", "")
    @Composable
    fun title(): String = this::class.simpleName?.replace("Navigation", "") ?: "No Name"
}