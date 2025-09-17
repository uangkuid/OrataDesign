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
    ),

    Medium(
        contentPadding = PaddingValues(
            horizontal = 24.dp,
            vertical = 16.dp
        ),
        minWidth = 120.dp,
        minHeight = 56.dp,
        iconSize = 24.dp,
        iconSpacing = 8.dp,
        labelTextStyle = OraTypographyKeyToken.TitleMedium
    ),

    Large(
        contentPadding = PaddingValues(
            horizontal = 48.dp,
            vertical = 32.dp
        ),
        minWidth = 199.dp,
        minHeight = 96.dp,
        iconSize = 32.dp,
        iconSpacing = 12.dp,
        labelTextStyle = OraTypographyKeyToken.HeadlineSmall
    ),

    XLarge(
        contentPadding = PaddingValues(
            horizontal = 64.dp,
            vertical = 48.dp
        ),
        minWidth = 262.dp,
        minHeight = 136.dp,
        iconSize = 40.dp,
        iconSpacing = 16.dp,
        labelTextStyle = OraTypographyKeyToken.HeadlineLarge
    )
}