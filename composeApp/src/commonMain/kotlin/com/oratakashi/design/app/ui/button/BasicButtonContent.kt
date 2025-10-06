package com.oratakashi.design.app.ui.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oratakashi.design.component.button.OraButton
import com.oratakashi.design.component.button.OraButtonDefaults
import com.oratakashi.design.component.button.OraOutlineButton
import com.oratakashi.design.component.button.OraTonalButton
import com.oratakashi.design.component.button.OraTransparentButton
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun BasicButtonContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "primary_button"
        ) {
            ButtonSection(
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
            ButtonSection(
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
            ButtonSection(
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
            ButtonSection(
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


@Composable
private fun ButtonSection(
    title: String,
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.spacedBy(13.dp)
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth()
        )

        content.invoke()
    }
}