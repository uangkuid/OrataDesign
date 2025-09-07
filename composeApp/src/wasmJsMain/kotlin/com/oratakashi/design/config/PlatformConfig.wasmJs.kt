package com.oratakashi.design.config

/**
 * PlatformConfig is an object that contains platform-specific configurations.
 * @author oratakashi
 * @since 06 Sep 2025
 */
actual object PlatformConfig {
    actual fun isDynamicColorAvailable(): Boolean {
        return false
    }
}