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
                OraButton(
                    label = "Label",
                    size = OraButtonSize.XSmall,
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
                OraButton(
                    label = "Label",
                    size = OraButtonSize.Small,
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
                OraButton(
                    label = "Label",
                    size = OraButtonSize.Medium,
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
                OraButton(
                    label = "Label",
                    size = OraButtonSize.Large,
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
                OraButton(
                    label = "Label",
                    size = OraButtonSize.XLarge,
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
    }
}