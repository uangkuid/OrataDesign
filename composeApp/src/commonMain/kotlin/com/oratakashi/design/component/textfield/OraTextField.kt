package com.oratakashi.design.component.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataAppTheme
import com.oratakashi.design.foundation.typography.OraProvideTextStyle
import com.oratakashi.design.foundation.typography.toTextStyle
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_colors
import oratadesign.composeapp.generated.resources.ic_typography
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Suppress("UNUSED_PARAMETER")
@Composable
fun OraTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String? = null,
    error: String? = null,
    success: String? = null,
    hint: String? = null,
    caption: String? = null,
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

    val verticalAlignment =
        if (singleLine || maxLines == 1) Alignment.CenterVertically else Alignment.Top
    val heightModifier: Modifier = if (singleLine) {
        Modifier.heightIn(min = size.minHeight)
    } else {
        Modifier.heightIn(min = size.minHeightTextArea)
    }

    Row(
        modifier = modifier
            .background(
                color = when {
                    !enabled || state == OraTextFieldState.Locked() -> colors.disabledContainerColor
                    else -> colors.containerColor
                },
                shape = RoundedCornerShape(16.dp)
            )
            .border(
                width = if (isFocus) 2.dp else 1.dp,
                color = when {
                    state == OraTextFieldState.Error() -> colors.errorColor
                    state == OraTextFieldState.Success() -> colors.successColor
                    isFocus -> colors.focusColor
                    !enabled || state == OraTextFieldState.Locked() -> colors.disabledBorderColor
                    else -> colors.borderColor
                },
                shape = RoundedCornerShape(16.dp)
            )
            .padding(
                paddingValues = size.contentPaddingValues
            )
            .then(heightModifier),
        verticalAlignment = verticalAlignment
    ) {
        if (decoratedPrefix != null) {
            decoratedPrefix()
            Spacer(modifier = Modifier.size(size.contentGap))
            VerticalDivider(
                modifier = Modifier.height(size.iconSize)
            )
            Spacer(modifier = Modifier.size(size.contentGap))
        }

        if (decoratedIconLeft != null) {
            decoratedIconLeft()
            Spacer(modifier = Modifier.size(size.contentGap))
        }

        BasicTextField(
            modifier = Modifier.weight(1f),
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
            visualTransformation = visualTransformation
        ) { innerTextField ->
            Box {
                if (value.isBlank()) {
                    decoratedPlaceholder()
                }
                innerTextField()
            }
        }

        if (decoratedIconRight != null) {
            Spacer(modifier = Modifier.size(size.contentGap))
            decoratedIconRight()
        }

        if (decoratedSuffix != null) {
            Spacer(modifier = Modifier.size(size.contentGap))
            VerticalDivider(
                modifier = Modifier.height(size.iconSize)
            )
            Spacer(modifier = Modifier.size(size.contentGap))
            decoratedSuffix()
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
                enabled = false,
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
                state = OraTextFieldState.Error(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Large,
                state = OraTextFieldState.Default(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Large,
                state = OraTextFieldState.Success(),
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
                state = OraTextFieldState.Locked(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
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
    OrataAppTheme {
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
    OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                state = OraTextFieldState.Error(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                state = OraTextFieldState.Default(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                state = OraTextFieldState.Success(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Medium,
                state = OraTextFieldState.Locked(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
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
    OrataAppTheme {
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
    OrataAppTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                state = OraTextFieldState.Error(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                state = OraTextFieldState.Default(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                state = OraTextFieldState.Success(),
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
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraTextField(
                value = "",
                onValueChange = {},
                size = OraTextFieldSize.Small,
                state = OraTextFieldState.Locked(),
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
