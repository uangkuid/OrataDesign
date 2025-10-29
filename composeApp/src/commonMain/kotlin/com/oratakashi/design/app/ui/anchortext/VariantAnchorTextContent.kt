package com.oratakashi.design.app.ui.anchortext

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentSection
import com.oratakashi.design.component.anchortext.OraAnchorText
import compose.icons.FeatherIcons
import compose.icons.feathericons.ArrowLeft
import compose.icons.feathericons.ArrowRight
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun VariantAnchorTextContent() {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(
            key = "default_anchor_text"
        ) {
            ComponentSection(
                "Default Variant"
            ) {
                OraAnchorText(
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
        }

        item(
            key = "underline_anchor_text"
        ) {
            ComponentSection(
                "Underline Variant"
            ) {
                OraAnchorText(
                    text = "Label",
                    underline = true,
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