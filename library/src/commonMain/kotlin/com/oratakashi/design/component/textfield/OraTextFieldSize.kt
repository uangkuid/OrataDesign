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
    val placeholderFont: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
    val textFieldFont: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
    val prefixFont: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
    val suffixFont: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
    val lockedActionFont: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
    val contentPaddingValues: PaddingValues,
    val contentGap: Dp,
    val minHeight: Dp,
    val minHeightTextArea: Dp,
    val iconSize: Dp
) {
    Large(
        placeholderFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge,
        textFieldFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge,
        prefixFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge,
        suffixFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge,
        lockedActionFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge,
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
        placeholderFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium,
        textFieldFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium,
        prefixFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium,
        suffixFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium,
        lockedActionFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium,
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
        placeholderFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodySmall,
        textFieldFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodySmall,
        prefixFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodySmall,
        suffixFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodySmall,
        lockedActionFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodySmall,
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