package com.oratakashi.design.app.ui.components.snackbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.oratakashi.design.component.button.OraButton
import com.oratakashi.design.component.snackbar.OraSnackbar
import com.oratakashi.design.component.snackbar.OraSnackbarTheme
import com.oratakashi.design.component.snackbar.OraSnackbarVisuals
import com.oratakashi.design.component.snackbar.SnackbarVisualsImpl
import com.oratakashi.design.component.snackbar.toColor
import com.oratakashi.design.foundation.OrataTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun PlaygroundSnackbarContent(
    openSnackbar: () -> Unit = {}
) {
    val scrollState = rememberScrollState()
    val snackbarData: OraSnackbarVisuals = remember { SnackbarVisualsImpl(
        title = "This is title",
        message = "This is description",
        icon = null,
        actionLabel = null,
        withDismissAction = false,
        duration = com.oratakashi.design.component.snackbar.OraSnackbarDuration.Short,
        theme = OraSnackbarTheme.Default,
        size = null
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

        Scaffold(
            containerColor = OrataTheme.colors.surfaceContainer,
            bottomBar = {
                OraButton(
                    label = "Show Snackbar",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    onClick = {

                    }
                )
            },
            modifier = Modifier.constrainAs(formPlayground) {
                top.linkTo(snackbarPreview.bottom, 8.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)

                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
        ) {

        }
    }
}