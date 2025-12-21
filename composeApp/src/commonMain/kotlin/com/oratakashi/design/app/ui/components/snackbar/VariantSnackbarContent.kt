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
import compose.icons.FeatherIcons
import compose.icons.feathericons.Info
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
internal fun VariantSnackbarContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 16.dp,
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(key = "title_only") {
            ComponentSection(title = "Title Only") {
                com.oratakashi.design.component.snackbar.OraSnackbar(
                    title = {
                        Text("Title")
                    },
                    showCloseIcon = true
                )
            }
        }

        item(key = "title_description") {
            ComponentSection(title = "Title and Description") {
                com.oratakashi.design.component.snackbar.OraSnackbar(
                    title = {
                        Text("Title")
                    },
                    description = {
                        Text("Description")
                    },
                    showCloseIcon = true
                )
            }
        }

        item(key = "title_description_action") {
            ComponentSection(title = "Title, Description and Action Text") {
                com.oratakashi.design.component.snackbar.OraSnackbar(
                    title = {
                        Text("Title")
                    },
                    description = {
                        Text("Description")
                    },
                    action = {
                        Text("Submit")
                    }
                )
            }
        }

        item(key = "title_description_action_icon") {
            ComponentSection(title = "Title, Description, Icon and Action Text") {
                com.oratakashi.design.component.snackbar.OraSnackbar(
                    title = {
                        Text("Title")
                    },
                    description = {
                        Text("Description")
                    },
                    action = {
                        Text("Submit")
                    },
                    icon = {
                        Icon(FeatherIcons.Info, null)
                    }
                )
            }
        }
    }
}