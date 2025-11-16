package com.oratakashi.design.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularWavyProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import com.oratakashi.design.foundation.typography.toTextStyle
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * OraButton is a Button component that follows the design system guidelines.
 * @author oratakashi
 * @since 16 Oct 2025
 * @param onClick The callback to be invoked when this button is clicked
 * @param modifier The modifier to be applied to this button
 * @param enabled Controls the enabled state of the button
 * @param loading Controls the loading state showing a progress indicator
 * @param label The text to be displayed inside the button
 * @param iconLeft The optional icon to be displayed on the left side
 * @param iconRight The optional icon to be displayed on the right side
 * @param style The color configuration for this button
 * @param size The size configuration for this button
 * @param borderStroke The optional border stroke for this button
 * @param contentPadding The padding to be applied to the button content
 * @param interactionSource The MutableInteractionSource representing the stream of interactions
 */
@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun OraButton(
    onClick: () -> Unit = {},
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
                        Box(
                            modifier = Modifier
                                .padding(
                                    horizontal = when {
                                        iconLeft != null && iconRight != null -> {
                                            (size.iconSize * 2)
                                        }

                                        iconLeft != null -> size.iconSize + size.iconSpacing
                                        iconRight != null -> size.iconSize + size.iconSpacing
                                        else -> 0.dp
                                    }
                                )
                        ) {
                            CircularWavyProgressIndicator(
                                modifier = Modifier.size(size.iconSize),
                                color = contentColor,
                            )
                        }
                    } else {
                        if (iconLeft != null) {
                            Box(
                                modifier = Modifier
                                    .heightIn(0.dp, size.iconSize)
                                    .widthIn(0.dp, size.iconSize),
                            ) {
                                iconLeft(size.iconSize)
                            }
                            Spacer(modifier = Modifier.size(size.iconSpacing))
                        }

                        Text(text = label)

                        if (iconRight != null) {
                            Spacer(modifier = Modifier.size(size.iconSpacing))
                            Box(
                                modifier = Modifier
                                    .heightIn(0.dp, size.iconSize)
                                    .widthIn(0.dp, size.iconSize),
                            ) {
                                iconRight(size.iconSize)
                            }
                        }
                    }
                }
            }
        }
    }
}

/**
 * OraTonalButton is a tonal variant of OraButton with container colors following the design system guidelines.
 * @author oratakashi
 * @since 16 Nov 2025
 * @param onClick The callback to be invoked when this button is clicked
 * @param modifier The modifier to be applied to this button
 * @param enabled Controls the enabled state of the button
 * @param loading Controls the loading state showing a progress indicator
 * @param label The text to be displayed inside the button
 * @param iconLeft The optional icon to be displayed on the left side
 * @param iconRight The optional icon to be displayed on the right side
 * @param size The size configuration for this button
 * @param borderStroke The optional border stroke for this button
 * @param contentPadding The padding to be applied to the button content
 * @param interactionSource The MutableInteractionSource representing the stream of interactions
 */
@Preview(showBackground = true)
@Composable
fun OraTonalButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    loading: Boolean = false,
    label: String = "Button",
    iconLeft: @Composable ((size: Dp) -> Unit)? = null,
    iconRight: @Composable ((size: Dp) -> Unit)? = null,
    size: OraButtonSize = OraButtonDefaults.size,
    borderStroke: BorderStroke? = null,
    contentPadding: PaddingValues = size.contentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    OraButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        loading = loading,
        label = label,
        iconLeft = iconLeft,
        iconRight = iconRight,
        style = OraButtonDefaults.buttonTonalColors(),
        size = size,
        borderStroke = borderStroke,
        contentPadding = contentPadding,
        interactionSource = interactionSource
    )
}

/**
 * OraOutlineButton is an outlined variant of OraButton with border following the design system guidelines.
 * @author oratakashi
 * @since 16 Nov 2025
 * @param onClick The callback to be invoked when this button is clicked
 * @param modifier The modifier to be applied to this button
 * @param enabled Controls the enabled state of the button
 * @param loading Controls the loading state showing a progress indicator
 * @param label The text to be displayed inside the button
 * @param iconLeft The optional icon to be displayed on the left side
 * @param iconRight The optional icon to be displayed on the right side
 * @param size The size configuration for this button
 * @param contentPadding The padding to be applied to the button content
 * @param interactionSource The MutableInteractionSource representing the stream of interactions
 */
@Preview(showBackground = true)
@Composable
fun OraOutlineButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    loading: Boolean = false,
    label: String = "Button",
    iconLeft: @Composable ((size: Dp) -> Unit)? = null,
    iconRight: @Composable ((size: Dp) -> Unit)? = null,
    size: OraButtonSize = OraButtonDefaults.size,
    contentPadding: PaddingValues = size.contentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    OraButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        loading = loading,
        label = label,
        iconLeft = iconLeft,
        iconRight = iconRight,
        style = OraButtonDefaults.buttonOutlineColors(),
        size = size,
        borderStroke = OraButtonDefaults.outlineButtonBorder(enabled),
        contentPadding = contentPadding,
        interactionSource = interactionSource
    )
}

/**
 * OraTransparentButton is a transparent variant of OraButton with no background following the design system guidelines.
 * @author oratakashi
 * @since 16 Nov 2025
 * @param onClick The callback to be invoked when this button is clicked
 * @param modifier The modifier to be applied to this button
 * @param enabled Controls the enabled state of the button
 * @param loading Controls the loading state showing a progress indicator
 * @param label The text to be displayed inside the button
 * @param iconLeft The optional icon to be displayed on the left side
 * @param iconRight The optional icon to be displayed on the right side
 * @param size The size configuration for this button
 * @param contentPadding The padding to be applied to the button content
 * @param interactionSource The MutableInteractionSource representing the stream of interactions
 */
@Preview(showBackground = true)
@Composable
fun OraTransparentButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    loading: Boolean = false,
    label: String = "Button",
    iconLeft: @Composable ((size: Dp) -> Unit)? = null,
    iconRight: @Composable ((size: Dp) -> Unit)? = null,
    size: OraButtonSize = OraButtonDefaults.size,
    contentPadding: PaddingValues = size.contentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    OraButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        loading = loading,
        label = label,
        iconLeft = iconLeft,
        iconRight = iconRight,
        style = OraButtonDefaults.buttonTransparentColors(),
        size = size,
        borderStroke = null,
        contentPadding = contentPadding,
        interactionSource = interactionSource
    )
}