package com.oratakashi.design.component.anchortext

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataAppTheme
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.foundation.typography.OraProvideTextStyle
import com.oratakashi.design.foundation.typography.toTextStyle
import compose.icons.FeatherIcons
import compose.icons.feathericons.ArrowLeft
import compose.icons.feathericons.ArrowRight
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * OraAnchorText is a text component that follows the design system guidelines.
 * @author oratakashi
 * @since 01 Nov 2025
 * @param text The text to be displayed
 * @param onClick The callback to be invoked when this anchor text is clicked
 * @param modifier The modifier to be applied to this anchor text
 * @param enabled Controls the enabled state of the anchor text
 * @param underline Controls whether the anchor text is underlined
 * @param colors The colors to be used for this anchor text
 * @param size The size to be used for this anchor text
 * @param iconLeft The icon to be displayed on the left side of the text
 * @param iconRight The icon to be displayed on the right side of the text
 * @param interactionSource The [MutableInteractionSource] representing the stream of
 */
@Composable
fun OraAnchorText(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    underline: Boolean = false,
    colors: OraAnchorTextColor = OraAnchorTextDefaults.colors(),
    size: OraAnchorTextSize = OraAnchorTextSize.Large,
    iconLeft: @Composable (() -> Unit)? = null,
    iconRight: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val contentColors = colors.contentColor(enabled).value
    Row(
        horizontalArrangement = Arrangement.spacedBy(OraAnchorTextDefaults.ICON_SPACER),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
//            .padding(all = 8.dp)
            .then(
                if (underline) {
                    Modifier.drawBehind {
                        val strokeWidth = 1.3.dp.toPx()
                        val y = this.size.height - strokeWidth / 2
                        drawLine(
                            color = contentColors,
                            start = Offset(0f, y),
                            end = Offset(this.size.width, y),
                            strokeWidth = strokeWidth
                        )
                    }
                } else Modifier
            )
            .padding(bottom = 4.dp)
    ) {
        if (iconLeft != null) {
            CompositionLocalProvider(LocalContentColor provides colors.contentColor(enabled).value) {
                Box(
                    modifier = Modifier
                        .heightIn(0.dp, size.iconSize)
                        .widthIn(0.dp, size.iconSize),
                ) {
                    iconLeft()
                }
            }
        }

        OraProvideTextStyle(
            color = colors.contentColor(enabled).value,
            textStyle = size.labelTextFont.toTextStyle()
        ) {
            Text(text)
        }


        if (iconRight != null) {
            CompositionLocalProvider(LocalContentColor provides colors.contentColor(enabled).value) {
                Box(
                    modifier = Modifier
                        .heightIn(0.dp, size.iconSize)
                        .widthIn(0.dp, size.iconSize),
                ) {
                    iconRight()
                }
            }
        }
    }
//    Surface(
//        onClick = onClick,
//        modifier = modifier.semantics { role = Role.Button },
//        enabled = enabled,
//        contentColor = colors.contentColor(enabled = enabled).value,,
//        interactionSource = interactionSource,
//        shape = MaterialTheme.shapes.large
//    ) {
//
//    }
}

@Preview(showBackground = true, name = "Enabled", group = "Large")
@Composable
private fun LargeEnabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Large,
                iconLeft = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                        contentDescription = null
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Disabled", group = "Large")
@Composable
private fun LargeDisabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Large,
                enabled = false,
                iconLeft = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                        contentDescription = null
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Enabled", group = "Medium")
@Composable
private fun MediumEnabledPreview() {
    OrataAppTheme(
        darkTheme = true
    ) {
        Surface {
            Column(
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                OraAnchorText(
                    text = "Anchor Text",
                    onClick = {},
                    size = OraAnchorTextSize.Medium,
                    iconLeft = {
                        Icon(
                            painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                            contentDescription = null
                        )
                    },
                    iconRight = {
                        Icon(
                            painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                            contentDescription = null
                        )
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "Disabled", group = "Medium")
@Composable
private fun MediumDisabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Medium,
                enabled = false,
                iconLeft = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                        contentDescription = null
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Enabled", group = "Small")
@Composable
private fun SmallEnabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Small,
                iconLeft = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                        contentDescription = null
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "Disabled", group = "Small")
@Composable
private fun SmallDisabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Small,
                enabled = false,
                iconLeft = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                        contentDescription = null
                    )
                },
                iconRight = {
                    Icon(
                        painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                        contentDescription = null
                    )
                }
            )
        }
    }
}
