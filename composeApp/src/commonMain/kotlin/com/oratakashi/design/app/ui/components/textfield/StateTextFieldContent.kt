package com.oratakashi.design.app.ui.components.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.textfield.OraTextField
import com.oratakashi.design.component.textfield.OraTextFieldState
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
/**
 * StateTextFieldContent function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun StateTextFieldContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .testTag("TextFieldContent_State")
    ) {
        item(
            key = "default_state"
        ) {
            val textState = remember { mutableStateOf("") }
            val focusRequester = remember { FocusRequester() }

            ComponentSection(
                "Default State"
            ) {
                com.oratakashi.design.component.textfield.OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = com.oratakashi.design.component.textfield.OraTextFieldState.Default("Information"),
                    focusRequester = focusRequester,
                    testTag = "TextField_State_Default"
                )
            }
        }

        item(
            key = "error_state"
        ) {
            val textState = remember { mutableStateOf("") }
            val focusRequester = remember { FocusRequester() }

            ComponentSection(
                "Error State"
            ) {
                com.oratakashi.design.component.textfield.OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = com.oratakashi.design.component.textfield.OraTextFieldState.Error("Information"),
                    focusRequester = focusRequester,
                    testTag = "TextField_State_Error"
                )
            }
        }

        item(
            key = "success_state"
        ) {
            val textState = remember { mutableStateOf("") }
            val focusRequester = remember { FocusRequester() }

            ComponentSection(
                "Success State"
            ) {
                com.oratakashi.design.component.textfield.OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = com.oratakashi.design.component.textfield.OraTextFieldState.Success("Information"),
                    focusRequester = focusRequester,
                    testTag = "TextField_State_Success"
                )
            }
        }

        item(
            key = "disabled_state"
        ) {
            val textState = remember { mutableStateOf("") }

            ComponentSection(
                "Disabled State"
            ) {
                com.oratakashi.design.component.textfield.OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = com.oratakashi.design.component.textfield.OraTextFieldState.Default("Information"),
                    enabled = false,
                    testTag = "TextField_State_Disabled"
                )
            }
        }

        item(
            key = "locked_state"
        ) {
            val textState = remember { mutableStateOf("Locked Value") }
            var isLocked by remember { mutableStateOf(true) }
            val focusRequester = remember { FocusRequester() }

            ComponentSection(
                "Locked State"
            ) {
                com.oratakashi.design.component.textfield.OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = if (isLocked) {
                        com.oratakashi.design.component.textfield.OraTextFieldState.Locked(
                            caption = "Information",
                            lockedActionText = "Change",
                            onClickLockedAction = {
                                isLocked = !isLocked
                            }
                        )
                    } else {
                        com.oratakashi.design.component.textfield.OraTextFieldState.Default("Information")
                    },
                    focusRequester = focusRequester,
                    testTag = "TextField_State_Locked"
                )
            }
        }
    }
}