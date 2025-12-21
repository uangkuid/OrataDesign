package com.oratakashi.design.app.ui.components.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.textfield.OraTextField
import com.oratakashi.design.component.textfield.OraTextFieldState
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
/**
 * BasicTextFieldContent function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
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
            val focusRequester = remember { FocusRequester() }

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
                    placeholder = "Placeholder",
                    focusRequester = focusRequester,
                    testTag = "TextField_Basic"
                )
            }
        }

        item(
            key = "label_textfield"
        ) {
            val textState = remember { mutableStateOf("") }
            val focusRequester = remember { FocusRequester() }

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
                    placeholder = "Placeholder",
                    focusRequester = focusRequester,
                    testTag = "TextField_Label"
                )
            }
        }

        item(
            key = "caption_textfield"
        ) {
            val textState = remember { mutableStateOf("") }
            val focusRequester = remember { FocusRequester() }

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
                    state = OraTextFieldState.Default("Information"),
                    focusRequester = focusRequester,
                    testTag = "TextField_Caption"
                )
            }
        }

        item(
            key = "required_textfield"
        ) {
            val textState = remember { mutableStateOf("") }
            val focusRequester = remember { FocusRequester() }

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
                    required = true,
                    focusRequester = focusRequester,
                    testTag = "TextField_Required"
                )
            }
        }
    }
}