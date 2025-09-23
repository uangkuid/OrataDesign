package com.oratakashi.design.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun OraButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    loading: Boolean = false,
    label: String = "Button",
    iconLeft: @Composable ((size: Dp) -> Unit)? = null,
    iconRight: @Composable ((size: Dp) -> Unit)? = null,
    style: OraButtonColors = OraButtonDefaults.buttonSolidColors(),
    size: OraButtonSize = OraButtonDefaults.size,
    borderStroke: BorderStroke? = null,
    contentPadding: PaddingValues = size.contentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val containerColor = style.containerColor(enabled).value
    val contentColor = style.contentColor(enabled).value
}