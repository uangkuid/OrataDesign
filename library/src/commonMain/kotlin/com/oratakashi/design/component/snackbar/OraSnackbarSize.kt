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
    val titleTextStyle: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
    val descriptionTextStyle: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
    val actionTextStyle: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
) {
    Large(
        contentPadding = PaddingValues(
            horizontal = 20.dp,
            vertical = 16.dp
        ),
        iconSize = 24.dp,
        titleTextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge,
        descriptionTextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium,
        actionTextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge
    ),
    Small(
        contentPadding = PaddingValues(
            horizontal = 12.dp,
            vertical = 8.dp
        ),
        iconSize = 20.dp,
        titleTextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium,
        descriptionTextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodySmall,
        actionTextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium
    )
}