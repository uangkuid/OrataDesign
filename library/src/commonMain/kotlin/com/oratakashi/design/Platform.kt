package com.oratakashi.design

/**
 * Platform interface provides platform-specific information.
 * @author oratakashi
 * @since 16 Nov 2025
 */
interface Platform {
    val name: String
}

/**
 * getPlatform returns the platform-specific implementation of the Platform interface.
 * @author oratakashi
 * @since 16 Nov 2025
 * @return Platform instance for the current platform
 */
expect fun getPlatform(): Platform