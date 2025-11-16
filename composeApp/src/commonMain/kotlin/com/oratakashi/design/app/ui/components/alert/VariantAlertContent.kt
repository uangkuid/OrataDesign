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

                OraInfoAlert(
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

                OraInfoAlert(
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

                OraInfoAlert(
                    title = "Info Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    showCloseIcon = true,
                    visible = isVisible,
                    onClose = {
                        isVisible = !isVisible
                    },
                    action = {
                        OraAnchorText(
                            text = "Call to Action",
                            onClick = {
                                // Action here
                            },
                            colors = OraAnchorTextDefaults.colors(
                                contentColor = OrataTheme.colors.info
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

                OraInfoAlert(
                    title = "Info Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    action = {
                        OraAnchorText(
                            text = "Call to Action",
                            onClick = {
                                // Action here
                            },
                            colors = OraAnchorTextDefaults.colors(
                                contentColor = OrataTheme.colors.info
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
                OraInfoAlert(
                    title = "Info Title",
                    description = "Interactively monetize corporate alignments and fully tested niche markets. ",
                    icon = null,
                    action = {
                        OraAnchorText(
                            text = "Call to Action",
                            onClick = {
                                // Action here
                            },
                            colors = OraAnchorTextDefaults.colors(
                                contentColor = OrataTheme.colors.info
                            ),
                        )
                    }
                )
            }
        }
    }
}