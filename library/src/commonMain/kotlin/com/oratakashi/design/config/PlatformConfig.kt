package com.oratakashi.design.config

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable

/**
 * PlatformConfig is an object that contains platform-specific configurations.
 * @author oratakashi
 * @since 06 Sep 2025
 */
expect object PlatformConfig {
    /**
     * isDynamicColorAvailable function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun isDynamicColorAvailable(): Boolean
    @Composable
    /**
     * getDynamicColor function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun getDynamicColor(isDark: Boolean): ColorScheme?
}