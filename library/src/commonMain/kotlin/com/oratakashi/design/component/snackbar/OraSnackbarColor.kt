package com.oratakashi.design.component.snackbar

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

/**
 * OraSnackbarColor represents the container and content colors used in a snackbar component.
 * @author oratakashi
 * @since 15 Nov 2025
 */
@Immutable
data class OraSnackbarColor(
    val containerColor: Color,
    val iconColor: Color,
    val titleColor: Color,
    val descriptionColor: Color,
    val closeIconColor: Color,
    val actionColor: Color,
)
