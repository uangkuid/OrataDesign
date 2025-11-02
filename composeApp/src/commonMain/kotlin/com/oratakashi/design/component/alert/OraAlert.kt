package com.oratakashi.design.component.alert

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.oratakashi.design.component.anchortext.OraAnchorText
import com.oratakashi.design.foundation.OrataAppTheme
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.foundation.typography.OraProvideTextStyle
import compose.icons.FeatherIcons
import compose.icons.feathericons.X
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_alert_triangle_filled
import org.jetbrains.compose.resources.vectorResource
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * OraAlert is a composable function that displays an alert component with customizable title, icon, description, close icon, action, and colors.
 * @author oratakashi
 * @since 02 Nov 2025
 * @param title A composable lambda that defines the title content of the alert.
 * @param icon An optional composable lambda that defines the icon content of the alert.
 * @param modifier A Modifier for styling the alert component.
 * @param description An optional composable lambda that defines the description content of the alert.
 * @param showCloseIcon A Boolean indicating whether to show the close icon. Default is true
 * @param onClose An optional lambda that is invoked when the close icon is clicked.
 * @param action An optional composable lambda that defines the action content of the alert.
 * @param colors An OraAlertColors object that defines the container and content colors of the alert component.
 */
@Composable
fun OraAlert(
    title: @Composable () -> Unit,
    icon: @Composable (() -> Unit)? = null,
    modifier: Modifier = Modifier,
    description: (@Composable () -> Unit)? = null,
    showCloseIcon: Boolean = true,
    onClose: (() -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    colors: OraAlertColors = OraAlertDefaults.colors()
) {
    val decoratedTitleContent: @Composable () -> Unit = {
        OraProvideTextStyle(
            color = colors.contentColor,
            textStyle = OrataTheme.typography.titleMedium()
        ) {
            title()
        }
    }

    val decoratedDescriptionContent: (@Composable () -> Unit)? = description?.let {
        {
            OraProvideTextStyle(
                color = colors.contentColor,
                textStyle = OrataTheme.typography.bodyMedium()
            ) {
                description()
            }
        }
    }

    val decoratedIconContent: (@Composable () -> Unit)? = icon?.let {
        {
            Box(
                modifier = Modifier
                    .background(colors.containerIconColor, MaterialTheme.shapes.medium)
                    .padding(4.dp)
            ) {
                CompositionLocalProvider(LocalContentColor provides colors.contentIconColor) {
                    Box(
                        modifier = Modifier
                            .heightIn(0.dp, 24.dp)
                            .widthIn(0.dp, 24.dp)
                    ) {
                        icon()
                    }
                }
            }
        }
    }

    Surface(
        color = colors.containerColor,
        contentColor = colors.contentColor
    ) {
        Row(
            modifier = modifier
                .alertOutline(
                    outlineColor = colors.borderColor,
                    surfaceColor = colors.containerColor,
                    startOffset = 5.dp,
                    outlineWidth = 2.dp,
                    radius = 4.dp
                )
                .padding(16.dp)
        ) {

            if (icon != null) {
                decoratedIconContent?.invoke()
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 12.dp)
            ) {
                decoratedTitleContent()

                if (decoratedDescriptionContent != null) {
                    Spacer(modifier = Modifier.padding(top = 4.dp))
                    decoratedDescriptionContent()
                }

                if (action != null) {
                    Spacer(modifier = Modifier.padding(top = 8.dp))
                    CompositionLocalProvider(LocalContentColor provides colors.contentColor) {
                        action()
                    }
                }
            }

            if (showCloseIcon && onClose != null) {
                CompositionLocalProvider(LocalContentColor provides colors.contentColor) {
                    IconButton(modifier = Modifier.size(20.dp), onClick = onClose) {
                        Icon(imageVector = FeatherIcons.X, contentDescription = "close")
                    }
                }
            }
        }
    }
}

@Composable
private fun Modifier.alertOutline(
    outlineColor: Color,
    surfaceColor: Color,
    startOffset: Dp,
    outlineWidth: Dp,
    radius: Dp = 1.dp
) = drawBehind {
    val startOffsetPx = startOffset.toPx()
    val outlineWidthPx = outlineWidth.toPx()
    val radiusPx = radius.toPx()
    drawRoundRect(
        color = outlineColor,
        topLeft = Offset(0f, 0f),
        size = size,
        cornerRadius = CornerRadius(radiusPx, radiusPx),
        style = Fill
    )
    drawRoundRect(
        color = surfaceColor,
        topLeft = Offset(startOffsetPx, outlineWidthPx),
        size = Size(size.width - startOffsetPx - outlineWidthPx, size.height - outlineWidthPx * 2),
        cornerRadius = CornerRadius(radiusPx - outlineWidthPx, radiusPx - outlineWidthPx),
        style = Fill
    )
}

@Preview
@Composable
fun PreviewAlert() {
    OrataAppTheme {
        OraAlert(
            title = { Text("Title") },
            description = { Text("Description") },
            icon = {
                Icon(vectorResource(Res.drawable.ic_alert_triangle_filled), null)
            },
            showCloseIcon = true,
            onClose = {

            },
            action = {
                OraAnchorText(
                    text = "Action",
                    onClick = { },
                )
            },
        )
    }
}