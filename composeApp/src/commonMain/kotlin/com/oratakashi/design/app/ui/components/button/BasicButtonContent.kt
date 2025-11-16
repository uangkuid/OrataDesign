package com.oratakashi.design.app.ui.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.button.OraButton
import com.oratakashi.design.component.button.OraOutlineButton
import com.oratakashi.design.component.button.OraTonalButton
import com.oratakashi.design.component.button.OraTransparentButton
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
internal fun BasicButtonContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "primary_button"
        ) {
            ComponentSection(
                "Primary Button"
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
            key = "tonal_button"
        ) {
            ComponentSection(
                "Tonal Button"
            ) {
                OraTonalButton(
                    label = "Label",
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        item(
            key = "outlined_button"
        ) {
            ComponentSection(
                "Outlined Button"
            ) {
                OraOutlineButton(
                    label = "Label",
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        item(
            key = "transparent_button"
        ) {
            ComponentSection(
                "Transparent Button"
            ) {
                OraTransparentButton(
                    label = "Label",
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
    }
}
