package com.oratakashi.design.app.ui.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.button.OraButton
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
internal fun StateButtonContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "default_state"
        ) {
            ComponentSection(
                "Default State"
            ) {
                OraButton(
                    label = "Label",
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        item(
            key = "loading_state"
        ) {
            ComponentSection(
                "Loading State"
            ) {
                OraButton(
                    label = "Label",
                    loading = true,
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        item(
            key = "disabled_state"
        ) {
            ComponentSection(
                "Disabled State"
            ) {
                OraButton(
                    label = "Label",
                    enabled = false,
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

    }
}