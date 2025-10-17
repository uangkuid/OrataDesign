package com.oratakashi.design.component.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataAppTheme
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.foundation.typography.OraProvideTextStyle
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_alert_triangle_filled
import oratadesign.composeapp.generated.resources.ic_circle_check_filled
import oratadesign.composeapp.generated.resources.ic_info_circle_filled
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Composable wrapper that accepts optional plain string values for the label,
 * error, success, hint and caption and converts them into small composable
 * Text elements. The converted composables are forwarded to
 * OraTextFieldContainerImpl which handles layout and styling.
 *
 * This function is intended as a convenience API for callers that only need
 * to provide simple text values. For fully custom content, use
 * OraTextFieldContainerImpl directly by providing composable lambdas.
 *
 * @param label optional label string shown above the main content.
 * @param error optional error string shown below content (highest priority).
 * @param success optional success string shown below content when there is no error.
 * @param hint optional hint string shown below other messages.
 * @param caption optional caption string shown below content when there is no error or success.
 * @param content required composable that represents the main text field area.
 */
@Composable
internal fun OraTextFieldContainer(
    label: String? = null,
    error: String? = null,
    success: String? = null,
    hint: String? = null,
    caption: String? = null,
    content: @Composable () -> Unit
) {
    val decoratedLabel: @Composable (() -> Unit)? = label?.let {
        @Composable {
            Text(text = it)
        }
    }

    val decoratedError: @Composable (() -> Unit)? = error?.let {
        @Composable {
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(Res.drawable.ic_alert_triangle_filled),
                    contentDescription = null,
                    modifier = Modifier
                        .width(12.dp)
                        .height(12.dp)
                )
                Text(text = it)
            }
        }
    }

    val decoratedSuccess: @Composable (() -> Unit)? = success?.let {
        @Composable {
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(Res.drawable.ic_circle_check_filled),
                    contentDescription = null,
                    modifier = Modifier
                        .width(12.dp)
                        .height(12.dp)
                )
                Text(text = it)
            }
        }
    }

    val decoratedHint: @Composable (() -> Unit)? = hint?.let {
        @Composable {
            Text(text = it)
        }
    }

    val decoratedCaption: @Composable (() -> Unit)? = caption?.let {
        @Composable {
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter  = painterResource(Res.drawable.ic_info_circle_filled),
                    contentDescription = null,
                    modifier = Modifier
                        .width(12.dp)
                        .height(12.dp)
                )
                Text(text = it)
            }
        }
    }

    OraTextFieldContainerImpl(
        label = decoratedLabel,
        error = decoratedError,
        success = decoratedSuccess,
        hint = decoratedHint,
        caption = decoratedCaption,
        content = content
    )
}

/**
 * Internal implementation that lays out an optional label, the main content,
 * and an ordered message area (error / success / caption) with an optional
 * hint below.
 *
 * Behavior and styling:
 * - The label (if provided) is rendered above the main content.
 * - The main content composable is always rendered.
 * - Below the content one message is shown according to this priority: error,
 *   then success, then caption. Only the first non-null of these will be shown.
 * - The hint (if provided) is rendered below the message area.
 * - Each visible text area is wrapped with OraProvideTextStyle so it receives
 *   the appropriate color and typography from OrataTheme:
 *     * label  -> OrataTheme.colors.onSurface with OrataTheme.typography.bodyLarge()
 *     * error  -> OrataTheme.colors.error with OrataTheme.typography.bodySmall()
 *     * success-> OrataTheme.colors.success with OrataTheme.typography.bodySmall()
 *     * hint    -> OrataTheme.colors.onSurfaceVariant with OrataTheme.typography.bodySmall()
 *     * caption -> OrataTheme.colors.onSurfaceVariant with OrataTheme.typography.bodySmall()
 *
 * Layout specifics:
 * - Vertical spacing between sections is 16.dp.
 *
 * @param label optional composable rendered as the label above content.
 * @param error optional composable rendered as an error message (highest priority).
 * @param success optional composable rendered as a success message (used if error is null).
 * @param hint optional composable rendered below the message area.
 * @param caption optional composable rendered as a caption (used if error and success are null).
 * @param content required composable for the main text field area.
 */
@Composable
private fun OraTextFieldContainerImpl(
    label: @Composable (() -> Unit)?,
    error: @Composable (() -> Unit)?,
    success: @Composable (() -> Unit)?,
    hint: @Composable (() -> Unit)?,
    caption: @Composable (() -> Unit)?,
    content: @Composable () -> Unit
) {
    val decoratedLabel: @Composable (() -> Unit)? = label?.let {
        @Composable {
            OraProvideTextStyle(
                OrataTheme.colors.onSurface,
                OrataTheme.typography.bodyLarge()
            ) {
                it()
            }
        }
    }

    val decoratedError: @Composable (() -> Unit)? = error?.let {
        @Composable {
            OraProvideTextStyle(
                OrataTheme.colors.error,
                OrataTheme.typography.bodySmall()
            ) {
                it()
            }
        }
    }

    val decoratedSuccess: @Composable (() -> Unit)? = success?.let {
        @Composable {
            OraProvideTextStyle(
                OrataTheme.colors.success,
                OrataTheme.typography.bodySmall()
            ) {
                it()
            }
        }
    }

    val decoratedHint: @Composable (() -> Unit)? = hint?.let {
        @Composable {
            OraProvideTextStyle(
                OrataTheme.colors.onSurfaceVariant,
                OrataTheme.typography.bodySmall()
            ) {
                it()
            }
        }
    }

    val decoratedCaption: @Composable (() -> Unit)? = caption?.let {
        @Composable {
            OraProvideTextStyle(
                OrataTheme.colors.onSurfaceVariant,
                OrataTheme.typography.bodySmall()
            ) {
                it()
            }
        }
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        if (decoratedLabel != null) {
            decoratedLabel()
        }

        content()

        when {
            decoratedError != null -> {
                decoratedError()
            }

            decoratedSuccess != null -> {
                decoratedSuccess()
            }

            decoratedCaption != null -> {
                decoratedCaption()
            }
        }

        if (decoratedHint != null) {
            decoratedHint()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OraTextFieldContainerPreview() {
    OrataAppTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            OraTextFieldContainer(
                label = "Label",
                error = "Error message",
                hint = "Hint message",
                caption = "Caption message"
            ) {
                Text(text = "TextField Content")
            }

            OraTextFieldContainer(
                label = "Label",
                success = "Success message",
                hint = "Hint message"
            ) {
                Text(text = "TextField Content")
            }

            OraTextFieldContainer(
                label = "Label",
                caption = "Caption message",
                hint = "Hint message"
            ) {
                Text(text = "TextField Content")
            }
        }
    }
}