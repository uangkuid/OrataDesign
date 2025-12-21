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
import com.oratakashi.design.component.button.OraButtonSize
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
internal fun SizeButtonContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "xsmall_size"
        ) {
            ComponentSection(
                "XSmall"
            ) {
                com.oratakashi.design.component.button.OraButton(
                    label = "Label",
                    size = com.oratakashi.design.component.button.OraButtonSize.XSmall,
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        item(
            key = "small_size"
        ) {
            ComponentSection(
                "Small"
            ) {
                com.oratakashi.design.component.button.OraButton(
                    label = "Label",
                    size = com.oratakashi.design.component.button.OraButtonSize.Small,
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        item(
            key = "medium_size"
        ) {
            ComponentSection(
                "Medium"
            ) {
                com.oratakashi.design.component.button.OraButton(
                    label = "Label",
                    size = com.oratakashi.design.component.button.OraButtonSize.Medium,
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        item(
            key = "large_size"
        ) {
            ComponentSection(
                "Large"
            ) {
                com.oratakashi.design.component.button.OraButton(
                    label = "Label",
                    size = com.oratakashi.design.component.button.OraButtonSize.Large,
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        item(
            key = "xlarge_size"
        ) {
            ComponentSection(
                "XLarge"
            ) {
                com.oratakashi.design.component.button.OraButton(
                    label = "Label",
                    size = com.oratakashi.design.component.button.OraButtonSize.XLarge,
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
    }
}