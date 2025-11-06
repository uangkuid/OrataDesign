package com.oratakashi.design.app.ui.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.textfield.OraTextField
import com.oratakashi.design.component.textfield.OraTextFieldSize
import com.oratakashi.design.component.textfield.OraTextFieldState
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun SizeTextFieldContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "size_small"
        ) {
            val textState = remember { mutableStateOf("") }
            val focusRequester = remember { FocusRequester() }

            ComponentSection(
                "Size Small"
            ) {
                OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    size = OraTextFieldSize.Small,
                    state = OraTextFieldState.Default("Information"),
                    focusRequester = focusRequester,
                    testTag = "TextField_Size_Small"
                )
            }
        }

        item(
            key = "size_medium"
        ) {
            val textState = remember { mutableStateOf("") }
            val focusRequester = remember { FocusRequester() }

            ComponentSection(
                "Size Medium"
            ) {
                OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    size = OraTextFieldSize.Medium,
                    state = OraTextFieldState.Default("Information"),
                    focusRequester = focusRequester,
                    testTag = "TextField_Size_Medium"
                )
            }
        }

        item (
            key = "size_large"
        ) {
            val textState = remember { mutableStateOf("") }
            val focusRequester = remember { FocusRequester() }

            ComponentSection(
                "Size Large"
            ) {
                OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    size = OraTextFieldSize.Large,
                    state = OraTextFieldState.Default("Information"),
                    focusRequester = focusRequester,
                    testTag = "TextField_Size_Large"
                )
            }
        }
    }
}