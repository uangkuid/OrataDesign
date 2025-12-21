package com.oratakashi.design.app.ui.components.snackbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.snackbar.OraSnackbar
import com.oratakashi.design.component.snackbar.OraSnackbarTheme
import com.oratakashi.design.component.snackbar.toColor
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun ThemeSnackbarContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 16.dp,
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(key = "normal_default") {
            ComponentSection(title = "Normal") {
                OraSnackbar(
                    title = {
                        Text("This is title")
                    },
                    showCloseIcon = true,
                    colors = OraSnackbarTheme.Default.toColor(),
                )
            }
        }

        item(key = "tertiary_default") {
            ComponentSection(title = "Tertiary") {
                OraSnackbar(
                    title = {
                        Text("This is title")
                    },
                    showCloseIcon = true,
                    colors = OraSnackbarTheme.Tertiary.toColor(),
                )
            }
        }

        item(key = "error_default") {
            ComponentSection(title = "Error") {
                OraSnackbar(
                    title = {
                        Text("This is title")
                    },
                    showCloseIcon = true,
                    colors = OraSnackbarTheme.Error.toColor(),
                )
            }
        }

        item(key = "warning_default") {
            ComponentSection(title = "Warning") {
                OraSnackbar(
                    title = {
                        Text("This is title")
                    },
                    showCloseIcon = true,
                    colors = OraSnackbarTheme.Warning.toColor(),
                )
            }
        }

        item(key = "success_default") {
            ComponentSection(title = "Success") {
                OraSnackbar(
                    title = {
                        Text("This is title")
                    },
                    showCloseIcon = true,
                    colors = OraSnackbarTheme.Success.toColor(),
                )
            }
        }

        item(key = "information_default") {
            ComponentSection(title = "Information") {
                OraSnackbar(
                    title = {
                        Text("This is title")
                    },
                    showCloseIcon = true,
                    colors = OraSnackbarTheme.Information.toColor(),
                )
            }
        }
    }
}