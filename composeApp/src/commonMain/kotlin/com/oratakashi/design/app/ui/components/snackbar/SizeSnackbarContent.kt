package com.oratakashi.design.app.ui.components.snackbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.snackbar.OraSnackbar
import com.oratakashi.design.component.snackbar.OraSnackbarSize
import com.oratakashi.design.component.snackbar.OraSnackbarTheme
import com.oratakashi.design.component.snackbar.toColor
import compose.icons.FeatherIcons
import compose.icons.feathericons.Info
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun SizeSnackbarContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 16.dp,
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item("large_size") {
            ComponentSection(title = "Large Snackbar") {
                OraSnackbar(
                    title = {
                        Text("This is title")
                    },
                    description = {
                        Text("This is description")
                    },
                    icon = {
                        Icon(FeatherIcons.Info, null)
                    },
                    colors = OraSnackbarTheme.Default.toColor(),
                    onClose = {
                    },
                    showCloseIcon = false,
                    action = {
                        Text("Submit")
                    }
                )
            }
        }

        item("small_size") {
            ComponentSection(title = "Small Snackbar") {
                OraSnackbar(
                    title = {
                        Text("This is title")
                    },
                    description = {
                        Text("This is description")
                    },
                    icon = {
                        Icon(FeatherIcons.Info, null)
                    },
                    colors = OraSnackbarTheme.Default.toColor(),
                    onClose = {
                    },
                    showCloseIcon = false,
                    size = OraSnackbarSize.Small,
                    action = {
                        Text("Submit")
                    }
                )
            }
        }
    }
}