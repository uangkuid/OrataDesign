package com.oratakashi.design.app.ui.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.textfield.OraTextField
import com.oratakashi.design.component.textfield.OraTextFieldState
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun StateTextFieldContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "default_state"
        ) {
            val textState = remember { mutableStateOf("") }

            ComponentSection(
                "Default State"
            ) {
                OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = OraTextFieldState.Default("Information")
                )
            }
        }

        item(
            key = "error_state"
        ) {
            val textState = remember { mutableStateOf("") }

            ComponentSection(
                "Error State"
            ) {
                OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = OraTextFieldState.Error("Information")
                )
            }
        }

        item(
            key = "success_state"
        ) {
            val textState = remember { mutableStateOf("") }

            ComponentSection(
                "Success State"
            ) {
                OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = OraTextFieldState.Success("Information")
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
                OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = OraTextFieldState.Default("Information"),
                    enabled = false
                )
            }
        }

        item(
            key = "locked_state"
        ) {
            val textState = remember { mutableStateOf("Locked Value") }
            var isLocked by remember { mutableStateOf(true) }

            ComponentSection(
                "Locked State"
            ) {
                OraTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    label = "Label",
                    placeholder = "Placeholder",
                    state = if (isLocked) {
                        OraTextFieldState.Locked(
                            caption = "Information",
                            lockedActionText = "Change",
                            onClickLockedAction = {
                                isLocked = !isLocked
                            }
                        )
                    } else {
                        OraTextFieldState.Default("Information")
                    },
                )
            }
        }
    }
}