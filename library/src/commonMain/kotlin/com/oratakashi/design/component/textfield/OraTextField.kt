package com.oratakashi.design.component.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataAppTheme
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.foundation.typography.OraProvideTextStyle
import com.oratakashi.design.foundation.typography.toTextStyle
import com.oratakashi.design.resources.Res
import com.oratakashi.design.resources.ic_colors
import com.oratakashi.design.resources.ic_typography
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * OraTextField is a text field component that follows the design system guidelines.
 * @author oratakashi
 * @since 16 Nov 2025
 * @param modifier The modifier to be applied to this text field
 * @param value The input text to be shown in the text field
 * @param onValueChange The callback that is triggered when the input service updates the text
 * @param label The optional label to be displayed above the text field
 * @param hint The optional hint text to be displayed below the text field
 * @param required Whether the field is required
 * @param colors The colors to be used for this text field
 * @param state The current state of the text field (Default, Error, Success, etc.)
 * @param size The size configuration for this text field
 * @param interactionSource The MutableInteractionSource representing the stream of interactions
 * @param enabled Controls the enabled state of the text field
 * @param iconRight The optional icon to be displayed on the right side
 * @param iconLeft The optional icon to be displayed on the left side
 * @param prefix The optional prefix to be displayed before the text
 * @param suffix The optional suffix to be displayed after the text
 * @param placeholder The placeholder text to be displayed when the text field is empty
 * @param keyboardOptions Software keyboard options that contain configuration
 * @param keyboardActions When the input service emits an IME action
 * @param singleLine When set to true, this text field becomes a single line
 * @param maxLines The maximum number of lines allowed in the text field
 * @param minLines The minimum number of lines to show
 * @param visualTransformation The visual transformation filter for changing the visual representation
 * @param focusRequester The optional focus requester to control focus
 * @param testTag The optional test tag for testing purposes
 * @param readOnly Whether the text field is read-only
 */
@Suppress("UNUSED_PARAMETER")
@Composable
/**
 * OraTextField function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun OraTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String? = null,
    hint: String? = null,
    required: Boolean = false,
    colors: OraTextFieldColors = OraTextFieldDefault.textFieldColor(),
    state: OraTextFieldState = OraTextFieldState.Default(),
    size: OraTextFieldSize = OraTextFieldSize.Large,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    enabled: Boolean = true,
    iconRight: @Composable (() -> Unit)? = null,
    iconLeft: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    placeholder: String = "",
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = true,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    focusRequester: FocusRequester? = null,
    testTag: String? = null,
    readOnly: Boolean = false,
) {
    val isFocus by interactionSource.collectIsFocusedAsState()

    val decoratedIconLeft: @Composable (() -> Unit)? = iconLeft?.let { icon ->
        {
            CompositionLocalProvider(LocalContentColor provides colors.contentColor) {
                Box(
                    modifier = Modifier
                        .heightIn(0.dp, size.iconSize)
                        .widthIn(0.dp, size.iconSize),
                ) {
                    icon()
                }
            }
        }
    }

    val decoratedIconRight: @Composable (() -> Unit)? = iconRight?.let { icon ->
        {
            CompositionLocalProvider(LocalContentColor provides colors.contentColor) {
                Box(
                    modifier = Modifier
                        .heightIn(0.dp, size.iconSize)
                        .widthIn(0.dp, size.iconSize),
                ) {
                    icon()
                }
            }
        }
    }

    val decoratedPrefix: @Composable (() -> Unit)? = prefix?.let { prefix ->
        {
            OraProvideTextStyle(
                color = colors.contentColor,
                textStyle = size.prefixFont.toTextStyle()
            ) {
                prefix()
            }
        }
    }

    val decoratedSuffix: @Composable (() -> Unit)? = suffix?.let { suffix ->
        {
            OraProvideTextStyle(
                color = colors.contentColor,
                textStyle = size.suffixFont.toTextStyle()
            ) {
                suffix()
            }
        }
    }

    val decoratedPlaceholder: @Composable (() -> Unit) = placeholder.let { placeholder ->
        {
            OraProvideTextStyle(
                color = colors.placeholderColor,
                textStyle = size.placeholderFont.toTextStyle()
            ) {
                Text(
                    text = placeholder,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }

    val decoratedLockedAction: @Composable (() -> Unit) = {
        OraProvideTextStyle(
            color = OrataTheme.colors.primary,
            textStyle = size.lockedActionFont.toTextStyle().copy(fontWeight = FontWeight.Bold),
        ) {
            Text(
                text = if (state is OraTextFieldState.Locked) state.lockedActionText else "Change",
                modifier = Modifier
                    .let { m ->
                        if (testTag != null) m.testTag("${testTag}_LockedAction") else m
                    }
                    .clickable(enabled = enabled) {
                        if (state is OraTextFieldState.Locked) {
                            state.onClickLockedAction()
                        }
                    }
            )
        }
    }

    val verticalAlignment =
        if (singleLine || maxLines == 1) Alignment.CenterVertically else Alignment.Top
    val heightModifier: Modifier = if (singleLine) {
        Modifier.heightIn(min = size.minHeight)
    } else {
        Modifier.heightIn(min = size.minHeightTextArea)
    }

    OraTextFieldContainer(
        required = required,
        label = label,
        hint = hint,
        state = state
    ) {
        Row(
            modifier = modifier
                .background(
                    color = when {
                        !enabled || state is OraTextFieldState.Locked -> colors.disabledContainerColor
                        else -> colors.containerColor
                    },
                    shape = RoundedCornerShape(16.dp)
                )
                .border(
                    width = if (isFocus) 2.dp else 1.dp,
                    color = colors.borderColor(
                        state = state,
                        enabled = enabled,
                        focus = isFocus
                    ).value,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(paddingValues = size.contentPaddingValues)
                .then(heightModifier),
            verticalAlignment = verticalAlignment
        ) {
            if (decoratedPrefix != null) {
                decoratedPrefix()
                Spacer(
                    modifier = Modifier.Companion.size(
                        size.contentGap
                    )
                )
                VerticalDivider(
                    modifier = Modifier.Companion.height(size.iconSize)
                )
                Spacer(
                    modifier = Modifier.Companion.size(
                        size.contentGap
                    )
                )
            }

            if (decoratedIconLeft != null) {
                decoratedIconLeft()
                Spacer(
                    modifier = Modifier.size(
                        size.contentGap
                    )
                )
            }

            BasicTextField(
                modifier = Modifier
                    .weight(1f)
                    .let { m ->
                        if (testTag != null) m.testTag(testTag) else m
                    }
                    .let { m ->
                        if (focusRequester != null) m.focusRequester(focusRequester) else m
                    },
                value = value,
                onValueChange = onValueChange,
                singleLine = singleLine,
                textStyle = size.textFieldFont.toTextStyle().copy(color = colors.contentColor),
                cursorBrush = SolidColor(colors.focusColor),
                interactionSource = interactionSource,
                enabled = enabled,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                maxLines = maxLines,
                minLines = minLines,
                visualTransformation = visualTransformation,
                readOnly = (readOnly || state is OraTextFieldState.Locked)
            ) { innerTextField ->
                Box {
                    if (value.isBlank()) {
                        decoratedPlaceholder()
                    }
                    innerTextField()
                }
            }

            if (decoratedIconRight != null) {
                Spacer(
                    modifier = Modifier.size(
                        size.contentGap
                    )
                )
                decoratedIconRight()
            }

            if (decoratedSuffix != null) {
                Spacer(
                    modifier = Modifier.size(
                        size.contentGap
                    )
                )
                VerticalDivider(
                    modifier = Modifier.height(size.iconSize)
                )
                Spacer(
                    modifier = Modifier.size(
                        size.contentGap
                    )
                )
                decoratedSuffix()
            }

            if (state is OraTextFieldState.Locked) {
                Spacer(
                    modifier = Modifier.Companion.size(
                        size.contentGap
                    )
                )
                decoratedLockedAction()
            }
        }
    }
}

@Preview(showBackground = true, name = "Enabled", group = "Large")
@Composable
private fun LargeEnabled() {
    OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Large,
                label = "Label Text",
                state = OraTextFieldState.Default(
                    "Caption Text"
                ),
                hint = "Hint Text",
                prefix = {
                    Text("Prefix")
                },
                iconLeft = {
                    Icon(painterResource(Res.drawable.ic_typography), contentDescription = null)
                },
                iconRight = {
                    Icon(painterResource(Res.drawable.ic_colors), contentDescription = null)
                },
                placeholder = "Placeholder Text",
                suffix = {
                    Text("Suffix")
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Disabled", group = "Large")
@Composable
private fun LargeDisabled() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Large,
                enabled = false,
                label = "Label Text",
                state = OraTextFieldState.Default(
                    "Caption Text"
                ),
                hint = "Hint Text",
                prefix = {
                    Text("Prefix")
                },
                iconLeft = {
                    Icon(painterResource(Res.drawable.ic_typography), contentDescription = null)
                },
                iconRight = {
                    Icon(painterResource(Res.drawable.ic_colors), contentDescription = null)
                },
                placeholder = "Placeholder Text",
                suffix = {
                    Text("Suffix")
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Error", group = "Large")
@Composable
private fun LargeError() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Large,
                state = OraTextFieldState.Error(
                    "Caption Text"
                ),
                label = "Label Text",
                hint = "Hint Text",
                prefix = {
                    Text("Prefix")
                },
                iconLeft = {
                    Icon(painterResource(Res.drawable.ic_typography), contentDescription = null)
                },
                iconRight = {
                    Icon(painterResource(Res.drawable.ic_colors), contentDescription = null)
                },
                placeholder = "Placeholder Text",
                suffix = {
                    Text("Suffix")
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Default", group = "Large")
@Composable
private fun LargeDefault() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Large,
                state = OraTextFieldState.Default(
                    "Caption Text"
                ),
                label = "Label Text",
                hint = "Hint Text",
                prefix = { Text("Prefix") },
                iconLeft = {
                    Icon(
                        painterResource(Res.drawable.ic_typography),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painterResource(Res.drawable.ic_colors),
                        contentDescription = null
                    )
                },
                placeholder = "Placeholder Text",
                suffix = { Text("Suffix") }
            )
        }
    }
}

@Preview(showBackground = true, name = "Success", group = "Large")
@Composable
private fun LargeSuccess() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Large,
                state = OraTextFieldState.Success(
                    "Caption Text"
                ),
                label = "Label Text",
                hint = "Hint Text",
                prefix = { Text("Prefix") },
                iconLeft = {
                    Icon(
                        painterResource(Res.drawable.ic_typography),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painterResource(Res.drawable.ic_colors),
                        contentDescription = null
                    )
                },
                placeholder = "Placeholder Text",
                suffix = { Text("Suffix") }
            )
        }
    }
}

@Preview(showBackground = true, name = "Locked", group = "Large")
@Composable
private fun LargeLocked() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Large,
                state = OraTextFieldState.Locked(
                    "Caption Text",
                    onClickLockedAction = {
                        // Do nothing
                    }),
                label = "Label Text",
                hint = "Hint Text",
                prefix = { Text("Prefix") },
                iconLeft = {
                    Icon(
                        painterResource(Res.drawable.ic_typography),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painterResource(Res.drawable.ic_colors),
                        contentDescription = null
                    )
                },
                placeholder = "Placeholder Text",
                suffix = { Text("Suffix") }
            )
        }
    }
}

@Preview(showBackground = true, name = "Enabled", group = "Medium")
@Composable
private fun MediumEnabled() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                label = "Label Text",
                state = OraTextFieldState.Default(
                    "Caption Text"
                ),
                hint = "Hint Text",
                prefix = {
                    Text("Prefix")
                },
                iconLeft = {
                    Icon(painterResource(Res.drawable.ic_typography), contentDescription = null)
                },
                iconRight = {
                    Icon(painterResource(Res.drawable.ic_colors), contentDescription = null)
                },
                placeholder = "Placeholder Text",
                suffix = {
                    Text("Suffix")
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Disabled", group = "Medium")
@Composable
private fun MediumDisabled() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                enabled = false,
                label = "Label Text",
                state = OraTextFieldState.Default(
                    "Caption Text"
                ),
                hint = "Hint Text",
                prefix = {
                    Text("Prefix")
                },
                iconLeft = {
                    Icon(painterResource(Res.drawable.ic_typography), contentDescription = null)
                },
                iconRight = {
                    Icon(painterResource(Res.drawable.ic_colors), contentDescription = null)
                },
                placeholder = "Placeholder Text",
                suffix = {
                    Text("Suffix")
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Error", group = "Medium")
@Composable
private fun MediumError() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                state = OraTextFieldState.Error(
                    "Caption Text"
                ),
                label = "Label Text",
                hint = "Hint Text",
                prefix = {
                    Text("Prefix")
                },
                iconLeft = {
                    Icon(painterResource(Res.drawable.ic_typography), contentDescription = null)
                },
                iconRight = {
                    Icon(painterResource(Res.drawable.ic_colors), contentDescription = null)
                },
                placeholder = "Placeholder Text",
                suffix = {
                    Text("Suffix")
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Default", group = "Medium")
@Composable
private fun MediumDefault() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                state = OraTextFieldState.Default(
                    "Caption Text"
                ),
                label = "Label Text",
                hint = "Hint Text",
                prefix = { Text("Prefix") },
                iconLeft = {
                    Icon(
                        painterResource(Res.drawable.ic_typography),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painterResource(Res.drawable.ic_colors),
                        contentDescription = null
                    )
                },
                placeholder = "Placeholder Text",
                suffix = { Text("Suffix") }
            )
        }
    }
}

@Preview(showBackground = true, name = "Success", group = "Medium")
@Composable
private fun MediumSuccess() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                state = OraTextFieldState.Success(
                    "Caption Text"
                ),
                label = "Label Text",
                hint = "Hint Text",
                prefix = { Text("Prefix") },
                iconLeft = {
                    Icon(
                        painterResource(Res.drawable.ic_typography),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painterResource(Res.drawable.ic_colors),
                        contentDescription = null
                    )
                },
                placeholder = "Placeholder Text",
                suffix = { Text("Suffix") }
            )
        }
    }
}

@Preview(showBackground = true, name = "Locked", group = "Medium")
@Composable
private fun MediumLocked() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                state = OraTextFieldState.Locked(
                    "Caption Text",
                    onClickLockedAction = {
                        // Do nothing
                    }),
                label = "Label Text",
                hint = "Hint Text",
                prefix = { Text("Prefix") },
                iconLeft = {
                    Icon(
                        painterResource(Res.drawable.ic_typography),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painterResource(Res.drawable.ic_colors),
                        contentDescription = null
                    )
                },
                placeholder = "Placeholder Text",
                suffix = { Text("Suffix") }
            )
        }
    }
}

@Preview(showBackground = true, name = "Enabled", group = "Small")
@Composable
private fun SmallEnabled() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                label = "Label Text",
                state = OraTextFieldState.Default(
                    "Caption Text"
                ),
                hint = "Hint Text",
                prefix = {
                    Text("Prefix")
                },
                iconLeft = {
                    Icon(painterResource(Res.drawable.ic_typography), contentDescription = null)
                },
                iconRight = {
                    Icon(painterResource(Res.drawable.ic_colors), contentDescription = null)
                },
                placeholder = "Placeholder Text",
                suffix = {
                    Text("Suffix")
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Disabled", group = "Small")
@Composable
private fun SmallDisabled() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                enabled = false,
                label = "Label Text",
                state = OraTextFieldState.Default(
                    "Caption Text"
                ),
                hint = "Hint Text",
                prefix = {
                    Text("Prefix")
                },
                iconLeft = {
                    Icon(painterResource(Res.drawable.ic_typography), contentDescription = null)
                },
                iconRight = {
                    Icon(painterResource(Res.drawable.ic_colors), contentDescription = null)
                },
                placeholder = "Placeholder Text",
                suffix = {
                    Text("Suffix")
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Error", group = "Small")
@Composable
private fun SmallError() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                state = OraTextFieldState.Error(
                    "Caption Text"
                ),
                label = "Label Text",
                hint = "Hint Text",
                prefix = {
                    Text("Prefix")
                },
                iconLeft = {
                    Icon(painterResource(Res.drawable.ic_typography), contentDescription = null)
                },
                iconRight = {
                    Icon(painterResource(Res.drawable.ic_colors), contentDescription = null)
                },
                placeholder = "Placeholder Text",
                suffix = {
                    Text("Suffix")
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Default", group = "Small")
@Composable
private fun SmallDefault() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                state = OraTextFieldState.Default(
                    "Caption Text"
                ),
                label = "Label Text",
                hint = "Hint Text",
                prefix = { Text("Prefix") },
                iconLeft = {
                    Icon(
                        painterResource(Res.drawable.ic_typography),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painterResource(Res.drawable.ic_colors),
                        contentDescription = null
                    )
                },
                placeholder = "Placeholder Text",
                suffix = { Text("Suffix") }
            )
        }
    }
}

@Preview(showBackground = true, name = "Success", group = "Small")
@Composable
private fun SmallSuccess() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                state = OraTextFieldState.Success(
                    "Caption Text"
                ),
                label = "Label Text",
                hint = "Hint Text",
                prefix = { Text("Prefix") },
                iconLeft = {
                    Icon(
                        painterResource(Res.drawable.ic_typography),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painterResource(Res.drawable.ic_colors),
                        contentDescription = null
                    )
                },
                placeholder = "Placeholder Text",
                suffix = { Text("Suffix") }
            )
        }
    }
}

@Preview(showBackground = true, name = "Locked", group = "Small")
@Composable
private fun SmallLocked() {
    _root_ide_package_.com.oratakashi.design.foundation.OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                state = OraTextFieldState.Locked(
                    "Caption Text",
                    onClickLockedAction = {
                        // Do nothing
                    }),
                label = "Label Text",
                hint = "Hint Text",
                prefix = { Text("Prefix") },
                iconLeft = {
                    Icon(
                        painterResource(Res.drawable.ic_typography),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painterResource(Res.drawable.ic_colors),
                        contentDescription = null
                    )
                },
                placeholder = "Placeholder Text",
                suffix = { Text("Suffix") }
            )
        }
    }
}
