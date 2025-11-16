package com.oratakashi.design.component.alert

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
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
import com.oratakashi.design.component.anchortext.OraAnchorTextDefaults
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
                    startOffset = 8.dp,
                    outlineWidth = 1.dp,
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

/**
 * OraSuccessAlert displays a success-themed alert with animation support.
 * @author oratakashi
 * @since 16 Nov 2025
 * @param title The title text of the alert
 * @param modifier The modifier to be applied to this alert
 * @param description The description text of the alert
 * @param visible Controls the visibility of the alert with fade animation
 * @param showCloseIcon Whether to show the close icon
 * @param onClose The callback to be invoked when the close icon is clicked
 * @param action The optional action composable to be displayed
 * @param icon The optional icon to be displayed, defaults to success icon
 */
@Composable
fun OraSuccessAlert(
    title: String,
    modifier: Modifier = Modifier,
    description: String = "",
    visible: Boolean = true,
    showCloseIcon: Boolean = true,
    onClose: (() -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    icon: (@Composable () -> Unit)? = OraAlertDefaults.IconSuccess
) {
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        OraAlert(
            title = { Text(title) },
            icon = icon,
            modifier = modifier,
            description = { Text(description) },
            showCloseIcon = showCloseIcon,
            onClose = onClose,
            action = action,
            colors = OraAlertDefaults.successColors()
        )
    }
}

/**
 * OraInfoAlert displays an info-themed alert with animation support.
 * @author oratakashi
 * @since 16 Nov 2025
 * @param title The title text of the alert
 * @param modifier The modifier to be applied to this alert
 * @param description The description text of the alert
 * @param visible Controls the visibility of the alert with fade animation
 * @param showCloseIcon Whether to show the close icon
 * @param onClose The callback to be invoked when the close icon is clicked
 * @param action The optional action composable to be displayed
 * @param icon The optional icon to be displayed, defaults to info icon
 */
@Composable
fun OraInfoAlert(
    title: String,
    modifier: Modifier = Modifier,
    description: String = "",
    visible: Boolean = true,
    showCloseIcon: Boolean = true,
    onClose: (() -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    icon: (@Composable () -> Unit)? = OraAlertDefaults.IconInfo
) {
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        OraAlert(
            title = { Text(title) },
            icon = icon,
            modifier = modifier,
            description = { Text(description) },
            showCloseIcon = showCloseIcon,
            onClose = onClose,
            action = action,
            colors = OraAlertDefaults.infoColors()
        )
    }
}

/**
 * OraWarningAlert displays a warning-themed alert with animation support.
 * @author oratakashi
 * @since 16 Nov 2025
 * @param title The title text of the alert
 * @param modifier The modifier to be applied to this alert
 * @param description The description text of the alert
 * @param visible Controls the visibility of the alert with fade animation
 * @param showCloseIcon Whether to show the close icon
 * @param onClose The callback to be invoked when the close icon is clicked
 * @param action The optional action composable to be displayed
 * @param icon The optional icon to be displayed, defaults to warning icon
 */
@Composable
fun OraWarningAlert(
    title: String,
    modifier: Modifier = Modifier,
    description: String = "",
    visible: Boolean = true,
    showCloseIcon: Boolean = true,
    onClose: (() -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    icon: (@Composable () -> Unit)? = OraAlertDefaults.IconWarning
) {
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        OraAlert(
            title = { Text(title) },
            icon = icon,
            modifier = modifier,
            description = { Text(description) },
            showCloseIcon = showCloseIcon,
            onClose = onClose,
            action = action,
            colors = OraAlertDefaults.warningColors()
        )
    }
}

/**
 * OraErrorAlert displays an error-themed alert with animation support.
 * @author oratakashi
 * @since 16 Nov 2025
 * @param title The title text of the alert
 * @param modifier The modifier to be applied to this alert
 * @param description The description text of the alert
 * @param visible Controls the visibility of the alert with fade animation
 * @param showCloseIcon Whether to show the close icon
 * @param onClose The callback to be invoked when the close icon is clicked
 * @param action The optional action composable to be displayed
 * @param icon The optional icon to be displayed, defaults to error icon
 */
@Composable
fun OraErrorAlert(
    title: String,
    modifier: Modifier = Modifier,
    description: String = "",
    visible: Boolean = true,
    showCloseIcon: Boolean = true,
    onClose: (() -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    icon: (@Composable () -> Unit)? = OraAlertDefaults.IconError
) {
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        OraAlert(
            title = { Text(title) },
            icon = icon,
            modifier = modifier,
            description = { Text(description) },
            showCloseIcon = showCloseIcon,
            onClose = onClose,
            action = action,
            colors = OraAlertDefaults.errorColors()
        )
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
/**
 * PreviewAlert function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
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

@Preview
@Composable
/**
 * PreviewAlertDark function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun PreviewAlertDark() {
    OrataAppTheme(darkTheme = true) {
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

@Preview( name = "Success", group = "Success")
@Composable
private fun PreviewSuccessAlert() {
    OrataAppTheme {
        OraSuccessAlert(
            title = "Success Alert",
            description = "This is a success alert.",
            visible = true,
            showCloseIcon = true,
            onClose = {},
            action = {
                OraAnchorText(
                    text = "Action",
                    onClick = {},
                    colors = OraAnchorTextDefaults.colors(contentColor = OrataTheme.colors.success)
                )
            }
        )
    }
}

@Preview( name = "Success Dark", group = "Success")
@Composable
private fun PreviewSuccessAlertDark() {
    OrataAppTheme(darkTheme = true) {
        OraSuccessAlert(
            title = "Success Alert",
            description = "This is a success alert.",
            visible = true,
            showCloseIcon = true,
            onClose = {},
            action = {
                OraAnchorText(
                    text = "Action",
                    onClick = {},
                    colors = OraAnchorTextDefaults.colors(contentColor = OrataTheme.colors.success)
                )
            }
        )
    }
}

@Preview( name = "Info", group = "Info")
@Composable
private fun PreviewInfoAlert() {
    OrataAppTheme {
        OraInfoAlert(
            title = "Info Alert",
            description = "This is an info alert.",
            visible = true,
            showCloseIcon = true,
            onClose = {},
            action = {
                OraAnchorText(
                    text = "Action",
                    onClick = {},
                    colors = OraAnchorTextDefaults.colors(contentColor = OrataTheme.colors.info)
                )
            }
        )
    }
}

@Preview( name = "Info Dark", group = "Info")
@Composable
private fun PreviewInfoAlertDark() {
    OrataAppTheme(darkTheme = true) {
        OraInfoAlert(
            title = "Info Alert",
            description = "This is an info alert.",
            visible = true,
            showCloseIcon = true,
            onClose = {},
            action = {
                OraAnchorText(
                    text = "Action",
                    onClick = {},
                    colors = OraAnchorTextDefaults.colors(contentColor = OrataTheme.colors.info)
                )
            }
        )
    }
}

@Preview( name = "Warning", group = "Warning")
@Composable
private fun PreviewWarningAlert() {
    OrataAppTheme {
        OraWarningAlert(
            title = "Warning Alert",
            description = "This is a warning alert.",
            visible = true,
            showCloseIcon = true,
            onClose = {},
            action = {
                OraAnchorText(
                    text = "Action",
                    onClick = {},
                    colors = OraAnchorTextDefaults.colors(contentColor = OrataTheme.colors.warning)
                )
            }
        )
    }
}

@Preview( name = "Warning Dark", group = "Warning")
@Composable
private fun PreviewWarningAlertDark() {
    OrataAppTheme(darkTheme = true) {
        OraWarningAlert(
            title = "Warning Alert",
            description = "This is a warning alert.",
            visible = true,
            showCloseIcon = true,
            onClose = {},
            action = {
                OraAnchorText(
                    text = "Action",
                    onClick = {},
                    colors = OraAnchorTextDefaults.colors(contentColor = OrataTheme.colors.warning)
                )
            }
        )
    }
}

@Preview( name = "Error", group = "Error")
@Composable
private fun PreviewErrorAlert() {
    OrataAppTheme {
        OraErrorAlert(
            title = "Error Alert",
            description = "This is an error alert.",
            visible = true,
            showCloseIcon = true,
            onClose = {},
            action = {
                OraAnchorText(
                    text = "Action",
                    onClick = {},
                    colors = OraAnchorTextDefaults.colors(contentColor = OrataTheme.colors.error)
                )
            }
        )
    }
}

@Preview( name = "Error Dark", group = "Error")
@Composable
private fun PreviewErrorAlertDark() {
    OrataAppTheme(darkTheme = true) {
        OraErrorAlert(
            title = "Error Alert",
            description = "This is an error alert.",
            visible = true,
            showCloseIcon = true,
            onClose = {},
            action = {
                OraAnchorText(
                    text = "Action",
                    onClick = {},
                    colors = OraAnchorTextDefaults.colors(contentColor = OrataTheme.colors.error)
                )
            }
        )
    }
}
