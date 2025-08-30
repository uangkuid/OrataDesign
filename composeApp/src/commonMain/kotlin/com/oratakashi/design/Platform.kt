package com.oratakashi.design

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform