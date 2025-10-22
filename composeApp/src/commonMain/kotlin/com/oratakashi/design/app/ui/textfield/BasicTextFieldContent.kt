package com.oratakashi.design.app.ui.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.textfield.OraTextField
import com.oratakashi.design.component.textfield.OraTextFieldState
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun BasicTextFieldContent(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "basic_textfield"
        ) {
            val textState = remember { mutableStateOf("") }

            ComponentSection(
                "Basic Textfield"
            ) {
                OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    modifier = modifier
                        .fillMaxWidth(),
                    placeholder = "Placeholder"
                )
            }
        }

        item(
            key = "label_textfield"
        ) {
            val textState = remember { mutableStateOf("") }

            ComponentSection(
                "Textfield with Label"
            ) {
                OraTextField(
                    label = "Label",
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    modifier = modifier
                        .fillMaxWidth(),
                    placeholder = "Placeholder"
                )
            }
        }

        item(
            key = "caption_textfield"
        ) {
            val textState = remember { mutableStateOf("") }

            ComponentSection(
                "Textfield with Caption"
            ) {
                OraTextField(
                    label = "Label",
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    modifier = modifier
                        .fillMaxWidth(),
                    placeholder = "Placeholder",
                    state = OraTextFieldState.Default("Information")
                )
            }
        }

        item(
            key = "required_textfield"
        ) {
            val textState = remember { mutableStateOf("") }

            ComponentSection(
                "Required Textfield"
            ) {
                OraTextField(
                    label = "Label",
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    modifier = modifier
                        .fillMaxWidth(),
                    placeholder = "Placeholder",
                    state = OraTextFieldState.Default("Information"),
                    required = true
                )
            }
        }
    }
}