package com.oratakashi.design.app.ui.components.alert

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.alert.OraInfoAlert
import com.oratakashi.design.component.anchortext.OraAnchorText
import com.oratakashi.design.component.anchortext.OraAnchorTextDefaults
import com.oratakashi.design.foundation.OrataTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
/**
 * VariantAlertContent function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun VariantAlertContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 16.dp,
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "alert_text_dismissable"
        ) {
            ComponentSection(
                title = "Alert Text Dismissable",
            ) {

                var isVisible by remember { mutableStateOf(true) }

                com.oratakashi.design.component.alert.OraInfoAlert(
                    title = "Info Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    showCloseIcon = true,
                    visible = isVisible,
                    onClose = {
                        isVisible = !isVisible
                    }
                )
            }
        }

        item(
            key = "alert_not_dismissable"
        ) {
            ComponentSection(
                title = "Alert Not Dismissable",
            ) {

                com.oratakashi.design.component.alert.OraInfoAlert(
                    title = "Info Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    visible = true,
                )
            }
        }

        item(
            key = "alert_cta_dismissable"
        ) {
            ComponentSection(
                title = "Alert CTA Dismissable",
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
            key = "alert_cta_not_dismissable"
        ) {
            ComponentSection(
                title = "Alert CTA Not Dismissable",
            ) {

                com.oratakashi.design.component.alert.OraInfoAlert(
                    title = "Info Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
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
            key = "alert_text_and_cta"
        ) {
            ComponentSection(
                "Alert Text and CTA",
            ) {
                com.oratakashi.design.component.alert.OraInfoAlert(
                    title = "Info Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    icon = null,
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
    }
}