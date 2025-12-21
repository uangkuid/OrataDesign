package com.oratakashi.design.component.snackbar

import androidx.compose.ui.platform.AccessibilityManager

/**
 * OraSnackbarDuration is an enum class that is used to define the duration of the snackbar.
 * @author oratakashiimport android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityManager
 * @since 16 Nov 2025
 */
enum class OraSnackbarDuration {
    /**
     * Show the Snackbar for a short period of time
     */
    Short,

    /**
     * Show the Snackbar for a long period of time
     */
    Long,

    /**
     * Show the Snackbar indefinitely until explicitly dismissed or action is clicked
     */
    Indefinite
}

internal fun com.oratakashi.design.component.snackbar.OraSnackbarDuration.toMillis(
    hasAction: Boolean,
    accessibilityManager: AccessibilityManager?
): Long {
    val original = when (this) {
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarDuration.Indefinite -> Long.MAX_VALUE
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarDuration.Long -> 10000L
        _root_ide_package_.com.oratakashi.design.component.snackbar.OraSnackbarDuration.Short -> 4000L
    }
    if (accessibilityManager == null) {
        return original
    }
    return accessibilityManager.calculateRecommendedTimeoutMillis(
        original,
        containsIcons = true,
        containsText = true,
        containsControls = hasAction
    )
}
