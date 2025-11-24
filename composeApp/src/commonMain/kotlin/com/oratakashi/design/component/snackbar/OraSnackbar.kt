package com.oratakashi.design.component.snackbar

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.oratakashi.design.foundation.OrataAppTheme
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.foundation.typography.OraProvideTextStyle
import com.oratakashi.design.foundation.typography.toTextStyle
import compose.icons.FeatherIcons
import compose.icons.feathericons.Info
import compose.icons.feathericons.X
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun OraSnackbar(
    modifier: Modifier = Modifier,
    colors: OraSnackbarColor = OraSnackbarDefaults.colors(),
    size: OraSnackbarSize = OraSnackbarSize.Large,
    title: @Composable () -> Unit,
    description: @Composable (() -> Unit)? = null,
    icon: @Composable (() -> Unit)? = null,
    action: @Composable (() -> Unit)? = null,
    showCloseIcon: Boolean = false,
    onClose: (() -> Unit)? = null,
) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(
                width = 1.dp,
                color = OrataTheme.colors.outlineVariant,
                shape = MaterialTheme.shapes.large
            )
            .shadow(
                elevation = 3.dp,
                shape = MaterialTheme.shapes.large
            )
            .clip(MaterialTheme.shapes.large)
            .background(colors.containerColor)
            .padding(
                paddingValues = size.contentPadding
            )
    ) {
        val (ivIcon, tvTitle, tvDescription, tvAction, ivClose, vDivider) = createRefs()


        val decoratedTitleContent: @Composable () -> Unit = {
            OraProvideTextStyle(
                color = colors.titleColor,
                textStyle = size.titleTextStyle.toTextStyle()
            ) {
                title()
            }
        }

        val decoratedDescriptionContent: @Composable (() -> Unit)? = description?.let {
            @Composable {
                OraProvideTextStyle(
                    color = colors.descriptionColor,
                    textStyle = size.descriptionTextStyle.toTextStyle()
                ) {
                    it()
                }
            }
        }

        val decoratedIconContent: @Composable (() -> Unit)? = icon?.let { iconContent ->
            @Composable {
                CompositionLocalProvider(
                    LocalContentColor provides colors.iconColor
                ) {
                    Box(modifier = Modifier.sizeIn(0.dp, size.iconSize)) {
                        iconContent()
                    }
                }
            }
        }

        val decoratedActionContent: @Composable (() -> Unit)? = action?.let { actionContent ->
            @Composable {
                OraProvideTextStyle(
                    color = colors.actionColor,
                    textStyle = size.actionTextStyle.toTextStyle().copy(
                        fontWeight = FontWeight.Medium
                    )
                ) {
                    actionContent()
                }
            }
        }

        if (decoratedIconContent != null) {
            Box(
                modifier = Modifier
                    .constrainAs(ivIcon) {
                        top.linkTo(tvTitle.top)
                        start.linkTo(parent.start)

                        if (decoratedDescriptionContent != null) {
                            bottom.linkTo(tvDescription.bottom, margin = 4.dp)
                        } else {
                            bottom.linkTo(tvTitle.bottom)
                        }

                        width = Dimension.preferredWrapContent
                        height = Dimension.preferredWrapContent
                    }
            ) {
                decoratedIconContent()
            }
        }

        Box(
            modifier = Modifier
                .constrainAs(tvTitle) {
                    top.linkTo(parent.top)

                    if (decoratedIconContent != null) {
                        start.linkTo(ivIcon.end, margin = 12.dp)
                    } else {
                        start.linkTo(parent.start)
                    }

                    if (showCloseIcon || decoratedActionContent != null) {
                        end.linkTo(vDivider.start, margin = 12.dp)
                    } else {
                        end.linkTo(parent.end)
                    }

                    if (description == null) {
                        bottom.linkTo(parent.bottom)
                    }

                    width = Dimension.fillToConstraints
                }
        ) {
            decoratedTitleContent()
        }

        if (decoratedDescriptionContent != null) {
            Box(
                modifier = Modifier.constrainAs(tvDescription) {
                    top.linkTo(tvTitle.bottom, margin = 4.dp)
                    bottom.linkTo(parent.bottom)
                    if (decoratedIconContent != null) {
                        start.linkTo(ivIcon.end, margin = 12.dp)
                    } else {
                        start.linkTo(parent.start)
                    }

                    if (showCloseIcon || decoratedActionContent != null) {
                        end.linkTo(vDivider.start, margin = 12.dp)
                    } else {
                        end.linkTo(parent.end)
                    }

                    width = Dimension.fillToConstraints
                }
            ) {
                decoratedDescriptionContent()
            }
        }

        if (!showCloseIcon && decoratedActionContent == null) return@ConstraintLayout

        VerticalDivider(
            modifier = Modifier
                .constrainAs(vDivider) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    if (showCloseIcon) {
                        end.linkTo(ivClose.start, margin = 8.dp)
                    } else {
                        end.linkTo(tvAction.start, margin = 12.dp)
                    }

                    height = Dimension.fillToConstraints
                },
            color = colors.actionColor,
        )

        if (showCloseIcon) {
            IconButton(
                modifier = Modifier
                    .constrainAs(ivClose) {
                        end.linkTo(parent.end)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        height = Dimension.preferredValue(size.iconSize)
                        width = Dimension.preferredWrapContent
                    },
                onClick = {
                    onClose?.invoke()
                }
            ) {
                Icon(
                    modifier = Modifier.requiredSize(size.iconSize),
                    imageVector = FeatherIcons.X,
                    contentDescription = "close-snackbar",
                    tint = colors.iconColor
                )
            }

            return@ConstraintLayout
        }

        else if (decoratedActionContent != null) {
            Box(
                modifier = Modifier.constrainAs(tvAction) {
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
            ) {
                decoratedActionContent()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SnackbarPreview() {
    OrataAppTheme {
        OraSnackbar(
            title = {
                Text(
                    "This is title",
                    modifier = Modifier.fillMaxWidth()
                )
            },
//            description = {
//                Text("This is description")
//            },
            icon = {
                Icon(FeatherIcons.Info, null)
            },
            colors = OraSnackbarTheme.Default.toColor(),
            onClose = {
            },
            showCloseIcon = true,
//            action = {
//                Text("Refresh")
//            }
        )
    }
}