package com.oratakashi.design.app.ui.components.snackbar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.oratakashi.design.component.button.OraButton
import com.oratakashi.design.component.snackbar.OraSnackbar
import com.oratakashi.design.component.snackbar.OraSnackbarTheme
import com.oratakashi.design.component.snackbar.OraSnackbarVisuals
import com.oratakashi.design.component.snackbar.SnackbarVisualsImpl
import com.oratakashi.design.component.textfield.OraTextField
import com.oratakashi.design.component.textfield.OraTextFieldState
import com.oratakashi.design.foundation.OrataTheme
import compose.icons.FeatherIcons
import compose.icons.feathericons.Check
import compose.icons.feathericons.Info
import compose.icons.feathericons.X
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun PlaygroundSnackbarContent(
    openSnackbar: (data: OraSnackbarVisuals) -> Unit = {}
) {
    val focusManager = LocalFocusManager.current

    var snackbarData by remember { mutableStateOf<OraSnackbarVisuals>(
        SnackbarVisualsImpl(
            title = "This is title",
            message = "This is description",
            icon = null,
            actionLabel = null,
            withDismissAction = false,
            duration = com.oratakashi.design.component.snackbar.OraSnackbarDuration.Short,
            theme = OraSnackbarTheme.Default,
            size = null
        )
    ) }


    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val (snackbarPreview, tvLabelPreview, formPlayground) = createRefs()

        Text(
            text = "Preview",
            style = OrataTheme.typography.bodyLarge(),
            color = OrataTheme.colors.onSurface,
            modifier = Modifier.constrainAs(tvLabelPreview) {
                top.linkTo(parent.top, 16.dp)
                start.linkTo(parent.start, 16.dp)
                end.linkTo(parent.end, 16.dp)

                width = Dimension.fillToConstraints
            }
        )

        OraSnackbar(
            visuals = snackbarData,
            modifier = Modifier.constrainAs(snackbarPreview) {
                top.linkTo(tvLabelPreview.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)

                width = Dimension.fillToConstraints
            }
        )

        Box(
            modifier = Modifier.constrainAs(formPlayground) {
                top.linkTo(snackbarPreview.bottom, 8.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)

                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(OrataTheme.colors.surfaceContainer)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = PaddingValues(
                    top = 16.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 96.dp // Tambahkan padding bottom untuk memberi ruang untuk button
                ),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item("label_configuration") {
                    Text(
                        text = "Configuration",
                        style = OrataTheme.typography.titleLarge(),
                        color = OrataTheme.colors.onSurface,
                        modifier = Modifier
                    )
                }
                
                item("field_title") {
                    OraTextField(
                        label = "Title",
                        value = snackbarData.title,
                        required = true,
                        state = if (snackbarData.title.isEmpty()) {
                            OraTextFieldState.Error("Title is required")
                        } else {
                            OraTextFieldState.Default()
                        },
                        onValueChange = {
                            snackbarData = SnackbarVisualsImpl(
                                title = it,
                                message = snackbarData.message,
                                icon = snackbarData.icon,
                                actionLabel = snackbarData.actionLabel,
                                withDismissAction = snackbarData.withDismissAction,
                                duration = snackbarData.duration,
                                theme = snackbarData.theme ?: OraSnackbarTheme.Default,
                                size = snackbarData.size
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }

                item("field_description") {
                    OraTextField(
                        label = "Description",
                        value = snackbarData.message.orEmpty(),
                        onValueChange = { newValue ->
                            snackbarData = SnackbarVisualsImpl(
                                title = snackbarData.title,
                                message = newValue.ifBlank { null },
                                icon = snackbarData.icon,
                                actionLabel = snackbarData.actionLabel,
                                withDismissAction = snackbarData.withDismissAction,
                                duration = snackbarData.duration,
                                theme = snackbarData.theme ?: OraSnackbarTheme.Default,
                                size = snackbarData.size
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }

                item("field_action_label") {
                    OraTextField(
                        label = "Action Label",
                        state = OraTextFieldState.Default("Dismiss button will removed when action label is set"),
                        value = snackbarData.actionLabel.orEmpty(),
                        onValueChange = { newValue ->
                            snackbarData = SnackbarVisualsImpl(
                                title = snackbarData.title,
                                message = snackbarData.message,
                                icon = snackbarData.icon,
                                actionLabel = newValue.ifBlank { null },
                                withDismissAction = if (newValue.isNotBlank()) {
                                    false // Selalu false jika ada action label
                                } else {
                                    snackbarData.withDismissAction // Gunakan nilai original
                                },
                                duration = snackbarData.duration,
                                theme = snackbarData.theme ?: OraSnackbarTheme.Default,
                                size = snackbarData.size
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }

                item("field_close_button") {
                    Row(
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Show Close Button",
                            style = OrataTheme.typography.bodyMedium(),
                            color = OrataTheme.colors.onSurface,
                            modifier = Modifier
                                .padding(end = 8.dp)
                                .weight(1f)
                        )
                        Switch(
                            checked = snackbarData.withDismissAction,
                            onCheckedChange = { checked ->
                                snackbarData = SnackbarVisualsImpl(
                                    title = snackbarData.title,
                                    message = snackbarData.message,
                                    icon = snackbarData.icon,
                                    actionLabel = snackbarData.actionLabel,
                                    withDismissAction = checked,
                                    duration = snackbarData.duration,
                                    theme = snackbarData.theme ?: OraSnackbarTheme.Default,
                                    size = snackbarData.size
                                )
                            },
                            thumbContent = {
                                if (snackbarData.withDismissAction) {
                                    // You can use your own icon here, e.g. Icons.Default.Close
                                    Icon(
                                        imageVector = FeatherIcons.X,
                                        contentDescription = "Close Icon"
                                    )
                                } else {
                                    Icon(
                                        imageVector = FeatherIcons.Check,
                                        contentDescription = "Check Icon"
                                    )
                                }
                            }
                        )
                    }
                }

                item("field_show_icon") {
                    Row(
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Show Icon",
                            style = OrataTheme.typography.bodyMedium(),
                            color = OrataTheme.colors.onSurface,
                            modifier = Modifier
                                .padding(end = 8.dp)
                                .weight(1f)
                        )
                        Switch(
                            checked = snackbarData.icon != null,
                            onCheckedChange = { checked ->
                                snackbarData = SnackbarVisualsImpl(
                                    title = snackbarData.title,
                                    message = snackbarData.message,
                                    icon = if (checked) {
                                        FeatherIcons.Info
                                    } else {
                                        null
                                    },
                                    actionLabel = snackbarData.actionLabel,
                                    withDismissAction = snackbarData.withDismissAction,
                                    duration = snackbarData.duration,
                                    theme = snackbarData.theme ?: OraSnackbarTheme.Default,
                                    size = snackbarData.size
                                )
                            },
                            thumbContent = {
                                if (snackbarData.icon != null) {
                                    // You can use your own icon here, e.g. Icons.Default.Close
                                    Icon(
                                        imageVector = FeatherIcons.X,
                                        contentDescription = "Close Icon"
                                    )
                                } else {
                                    Icon(
                                        imageVector = FeatherIcons.Check,
                                        contentDescription = "Check Icon"
                                    )
                                }
                            }
                        )
                    }
                }
            }

            // Sticky button at bottom
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .background(OrataTheme.colors.surfaceContainer)
            ) {
                OraButton(
                    label = "Show Snackbar",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    onClick = {
                        openSnackbar.invoke(snackbarData)
                    }
                )
            }
        }
    }
}