package com.oratakashi.design.foundation.typography

import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

/**
 * OraProvideTextStyle is a composable function that provides a text style and color to its content.
 * @author oratakashi
 * @since 06 Sep 2025
 */
@Composable
/**
 * OraProvideTextStyle function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun OraProvideTextStyle(
    color: Color,
    textStyle: TextStyle,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalContentColor provides color) {
        ProvideTextStyle(textStyle, content)
    }
}