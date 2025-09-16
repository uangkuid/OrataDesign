package com.oratakashi.design.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataTheme

/**
 * OraButtonSize is an enum class that is used to define the size of the button.
 * @author oratakashi
 * @since 16 Sep 2025
 */
sealed class OraButtonSize(
    val contentPadding: PaddingValues,
    val minWidth: Dp,
    val minHeight: Dp,
    val iconSize: Dp,
    val iconSpacing: Dp,
    val labelTextStyle: TextStyle
) {
}