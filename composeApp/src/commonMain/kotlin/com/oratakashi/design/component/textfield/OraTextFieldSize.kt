package com.oratakashi.design.component.textfield

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.typography.OraTypographyKeyToken

/**
 * OraTextFieldSize is an enumeration that defines different sizes for text fields,
 * @author oratakashi
 * @since 16 Oct 2025
 */
enum class OraTextFieldSize(
    val placeholderFont: OraTypographyKeyToken,
    val textFieldFont: OraTypographyKeyToken,
    val prefixFont: OraTypographyKeyToken,
    val suffixFont: OraTypographyKeyToken,
    val contentPaddingValues: PaddingValues,
    val contentGap: Dp,
    val minHeight: Dp,
    val minHeightTextArea: Dp,
    val iconSize: Dp
) {
    Large(
        placeholderFont = OraTypographyKeyToken.BodyLarge,
        textFieldFont = OraTypographyKeyToken.BodyLarge,
        prefixFont = OraTypographyKeyToken.BodyLarge,
        suffixFont = OraTypographyKeyToken.BodyLarge,
        contentPaddingValues = PaddingValues(
            vertical = 8.dp,
            horizontal = 16.dp,
        ),
        contentGap = 16.dp,
        minHeight = 40.dp,
        minHeightTextArea = 80.dp,
        iconSize = 24.dp
    ),
    Medium(
        placeholderFont = OraTypographyKeyToken.BodyMedium,
        textFieldFont = OraTypographyKeyToken.BodyMedium,
        prefixFont = OraTypographyKeyToken.BodyMedium,
        suffixFont = OraTypographyKeyToken.BodyMedium,
        contentPaddingValues = PaddingValues(
            vertical = 8.dp,
            horizontal = 14.dp,
        ),
        contentGap = 14.dp,
        minHeight = 32.dp,
        minHeightTextArea = 72.dp,
        iconSize = 20.dp
    ),
    Small(
        placeholderFont = OraTypographyKeyToken.BodySmall,
        textFieldFont = OraTypographyKeyToken.BodySmall,
        prefixFont = OraTypographyKeyToken.BodySmall,
        suffixFont = OraTypographyKeyToken.BodySmall,
        contentPaddingValues = PaddingValues(
            vertical = 8.dp,
            horizontal = 8.dp,
        ),
        contentGap = 8.dp,
        minHeight = 24.dp,
        minHeightTextArea = 64.dp,
        iconSize = 16.dp
    )
}