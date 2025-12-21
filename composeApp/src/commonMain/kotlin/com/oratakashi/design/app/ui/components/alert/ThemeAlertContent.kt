package com.oratakashi.design.app.ui.components.alert

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.alert.OraErrorAlert
import com.oratakashi.design.component.alert.OraInfoAlert
import com.oratakashi.design.component.alert.OraSuccessAlert
import com.oratakashi.design.component.alert.OraWarningAlert
import com.oratakashi.design.component.anchortext.OraAnchorText
import com.oratakashi.design.component.anchortext.OraAnchorTextDefaults
import com.oratakashi.design.component.button.OraButton
import com.oratakashi.design.foundation.OrataTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
/**
 * ThemeAlertContent function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun ThemeAlertContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 16.dp,
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "alert_info"
        ) {
            ComponentSection(
                "Alert Info"
            ) {

                var isVisible by remember { mutableStateOf(true) }

                com.oratakashi.design.component.alert.OraInfoAlert(
                    title = "Info Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    showCloseIcon = true,
                    visible = isVisible,
                    onClose = {
                        isVisible = !isVisible
                    },
                    action = {
                        com.oratakashi.design.component.anchortext.OraAnchorText(
                            text = "Call to Action",
                            onClick = {
                                // Action here
                            },
                            colors = com.oratakashi.design.component.anchortext.OraAnchorTextDefaults.colors(
                                contentColor = com.oratakashi.design.foundation.OrataTheme.colors.info
                            ),
                        )
                    }
                )
            }
        }

        item(
            key = "alert_warning"
        ) {
            ComponentSection(
                "Alert Warning"
            ) {

                var isVisible by remember { mutableStateOf(true) }

                com.oratakashi.design.component.alert.OraWarningAlert(
                    title = "Warning Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    showCloseIcon = true,
                    visible = isVisible,
                    onClose = {
                        isVisible = !isVisible
                    },
                    action = {
                        com.oratakashi.design.component.anchortext.OraAnchorText(
                            text = "Call to Action",
                            onClick = {
                                // Action here
                            },
                            colors = com.oratakashi.design.component.anchortext.OraAnchorTextDefaults.colors(
                                contentColor = com.oratakashi.design.foundation.OrataTheme.colors.warning
                            ),
                        )
                    }
                )
            }
        }

        item(
            key = "alert_success"
        ) {
            ComponentSection(
                "Alert Success"
            ) {

                var isVisible by remember { mutableStateOf(true) }

                com.oratakashi.design.component.alert.OraSuccessAlert(
                    title = "Success Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    showCloseIcon = true,
                    visible = isVisible,
                    onClose = {
                        isVisible = !isVisible
                    },
                    action = {
                        com.oratakashi.design.component.anchortext.OraAnchorText(
                            text = "Call to Action",
                            onClick = {
                                // Action here
                            },
                            colors = com.oratakashi.design.component.anchortext.OraAnchorTextDefaults.colors(
                                contentColor = com.oratakashi.design.foundation.OrataTheme.colors.success
                            ),
                        )
                    }
                )
            }
        }

        item(
            key = "alert_error"
        ) {
            ComponentSection(
                "Alert Error"
            ) {

                var isVisible by remember { mutableStateOf(true) }

                com.oratakashi.design.component.alert.OraErrorAlert(
                    title = "Success Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    showCloseIcon = true,
                    visible = isVisible,
                    onClose = {
                        isVisible = !isVisible
                    },
                    action = {
                        com.oratakashi.design.component.anchortext.OraAnchorText(
                            text = "Call to Action",
                            onClick = {
                                // Action here
                            },
                            colors = com.oratakashi.design.component.anchortext.OraAnchorTextDefaults.colors(
                                contentColor = com.oratakashi.design.foundation.OrataTheme.colors.error
                            ),
                        )
                    }
                )
            }
        }
    }
}