package com.oratakashi.design.component.snackbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.typography.OraTypographyKeyToken

/**
 * OraSnackbarSize is an enum class that is used to define the size of the snackbar.
 * @author oratakashi
 * @since 15 Nov 2025
 */
enum class OraSnackbarSize(
    val contentPadding: PaddingValues,
    val iconSize: Dp,
    val titleTextStyle: OraTypographyKeyToken,
    val descriptionTextStyle: OraTypographyKeyToken,
    val actionTextStyle: OraTypographyKeyToken,
) {
    Large(
        contentPadding = PaddingValues(
            horizontal = 20.dp,
            vertical = 16.dp
        ),
        iconSize = 24.dp,
        titleTextStyle = OraTypographyKeyToken.BodyLarge,
        descriptionTextStyle = OraTypographyKeyToken.BodyMedium,
        actionTextStyle = OraTypographyKeyToken.BodyLarge
    ),
    Small(
        contentPadding = PaddingValues(
            horizontal = 12.dp,
            vertical = 8.dp
        ),
        iconSize = 20.dp,
        titleTextStyle = OraTypographyKeyToken.BodyMedium,
        descriptionTextStyle = OraTypographyKeyToken.BodySmall,
        actionTextStyle = OraTypographyKeyToken.BodyMedium
    )
}