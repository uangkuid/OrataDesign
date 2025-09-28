package com.oratakashi.design.config

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable

/**
 * PlatformConfig is an object that contains platform-specific configurations.
 * @author oratakashi
 * @since 06 Sep 2025
 */
expect object PlatformConfig {
    fun isDynamicColorAvailable(): Boolean
    @Composable
    fun getDynamicColor(isDark: Boolean): ColorScheme?
}