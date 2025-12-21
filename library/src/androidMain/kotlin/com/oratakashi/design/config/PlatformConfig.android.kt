package com.oratakashi.design.config

import android.os.Build
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

/**
 * PlatformConfig is an object that contains platform-specific configurations.
 * @author oratakashi
 * @since 06 Sep 2025
 */
actual object PlatformConfig {
    actual fun isDynamicColorAvailable(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
    }

    @Composable
    actual fun getDynamicColor(isDark: Boolean): ColorScheme? {
        val context = LocalContext.current
        return when {
            isDynamicColorAvailable() && isDark -> {
                dynamicDarkColorScheme(context)
            }

            isDynamicColorAvailable() && !isDark -> {
                dynamicLightColorScheme(context)
            }

            else -> null
        }
    }
}