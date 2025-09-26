package com.oratakashi.design.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.CircularWavyProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.typography.OraTypography
import com.oratakashi.design.foundation.typography.toTextStyle
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
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

    Surface(
        onClick = if (!loading) onClick else {
            {
                // Do Nothing
            }
        },
        modifier = modifier.semantics { role = Role.Button },
        enabled = enabled,
        shape = ButtonDefaults.shapes().shape,
        color = containerColor,
        contentColor = contentColor,
        border = borderStroke,
        interactionSource = interactionSource
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            ProvideTextStyle(size.labelTextStyle.toTextStyle()) {
                Row(
                    modifier = Modifier
                        .defaultMinSize(
                            minWidth = size.minWidth,
                            minHeight = size.minHeight
                        )
                        .padding(contentPadding),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (loading) {
                        CircularWavyProgressIndicator(
                            modifier = Modifier.size(size.iconSize),
                            color = contentColor,
                        )
                    } else {
                        CircularWavyProgressIndicator(
                            modifier = Modifier.size(size.iconSize),
                            color = contentColor,
                        )
                    }
                }
            }
        }
    }
}