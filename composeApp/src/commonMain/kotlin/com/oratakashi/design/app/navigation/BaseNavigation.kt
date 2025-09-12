package com.oratakashi.design.app.navigation

interface BaseNavigation {
    val route: String?
        get() = this::class.qualifiedName
    val title: String?
        get() = this::class.simpleName?.replace("Navigation", "")
}