package com.oratakashi.design.app.ui.components.anchortext

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.anchortext.OraAnchorText
import com.oratakashi.design.component.anchortext.OraAnchorTextSize
import compose.icons.FeatherIcons
import compose.icons.feathericons.ArrowLeft
import compose.icons.feathericons.ArrowRight
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
/**
 * SizeAnchorTextContent function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun SizeAnchorTextContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "large_anchor_text"
        ) {
            ComponentSection(
                "Large"
            ) {
                com.oratakashi.design.component.anchortext.OraAnchorText(
                    text = "Label",
                    onClick = {

                    },
                    iconLeft = {
                        Icon(
                            painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                            contentDescription = null
                        )
                    },
                    iconRight = {
                        Icon(
                            painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                            contentDescription = null
                        )
                    }
                )
            }

            ComponentSection(
                "Medium"
            ) {
                com.oratakashi.design.component.anchortext.OraAnchorText(
                    text = "Label",
                    size = com.oratakashi.design.component.anchortext.OraAnchorTextSize.Medium,
                    onClick = {

                    },
                    iconLeft = {
                        Icon(
                            painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                            contentDescription = null
                        )
                    },
                    iconRight = {
                        Icon(
                            painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                            contentDescription = null
                        )
                    }
                )
            }

            ComponentSection(
                "Small"
            ) {
                com.oratakashi.design.component.anchortext.OraAnchorText(
                    text = "Label",
                    size = com.oratakashi.design.component.anchortext.OraAnchorTextSize.Small,
                    onClick = {

                    },
                    iconLeft = {
                        Icon(
                            painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                            contentDescription = null
                        )
                    },
                    iconRight = {
                        Icon(
                            painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                            contentDescription = null
                        )
                    }
                )
            }
        }
    }
}