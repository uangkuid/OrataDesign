package com.oratakashi.design.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.foundation.typography.OraTypographyKeyToken

/**
 * OraButtonSize is an enum class that is used to define the size of the button.
 * @author oratakashi
 * @since 16 Sep 2025
 */
enum class OraButtonSize(
    val contentPadding: PaddingValues,
    val minWidth: Dp,
    val minHeight: Dp,
    val iconSize: Dp,
    val iconSpacing: Dp,
    val labelTextStyle: OraTypographyKeyToken
) {
    XSmall(
        contentPadding = PaddingValues(
            horizontal = 12.dp,
            vertical = 6.dp
        ),
        minWidth = 83.dp,
        minHeight = 32.dp,
        iconSize = 20.dp,
        iconSpacing = 4.dp,
        labelTextStyle = OraTypographyKeyToken.LabelLarge
    ),

    Small(
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 10.dp
        ),
        minWidth = 95.dp,
        minHeight = 40.dp,
        iconSize = 20.dp,
        iconSpacing = 8.dp,
        labelTextStyle = OraTypographyKeyToken.LabelLarge
    )
}