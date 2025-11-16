package com.oratakashi.design

/**
 * Greeting class provides a greeting message based on the current platform.
 * @author oratakashi
 * @since 16 Nov 2025
 */
class Greeting {
    private val platform = getPlatform()

    /**
     * greet returns a greeting message with the platform name.
     * @author oratakashi
     * @since 16 Nov 2025
     * @return A greeting string containing the platform name
     */
    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}