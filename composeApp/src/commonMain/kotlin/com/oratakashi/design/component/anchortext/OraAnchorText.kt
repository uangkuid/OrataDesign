package com.oratakashi.design.component.anchortext

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.oratakashi.design.foundation.OrataAppTheme
import com.oratakashi.design.component.anchortext.OraAnchorTextSize
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons
import compose.icons.feathericons.ArrowLeft
import compose.icons.feathericons.ArrowRight
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun OraAnchorText(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: OraAnchorTextColor = OraAnchorTextDefaults.colors(),
    size: OraAnchorTextSize = OraAnchorTextSize.Large,
    iconLeft: @Composable (() -> Unit)? = null,
    iconRight: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isPressed by interactionSource.collectIsPressedAsState()
}

@Preview(showBackground = true, name = "Enabled", group = "Large")
@Composable
private fun LargeEnabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Large,
                iconLeft = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                    contentDescription = null
                ) },
                iconRight = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                    contentDescription = null
                ) }
            )
        }
    }
}

@Preview(showBackground = true, name = "Disabled", group = "Large")
@Composable
private fun LargeDisabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Large,
                enabled = false,
                iconLeft = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                    contentDescription = null
                ) },
                iconRight = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                    contentDescription = null
                ) }
            )
        }
    }
}

@Preview(showBackground = true, name = "Enabled", group = "Medium")
@Composable
private fun MediumEnabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Medium,
                iconLeft = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                    contentDescription = null
                ) },
                iconRight = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                    contentDescription = null
                ) }
            )
        }
    }
}

@Preview(showBackground = true, name = "Disabled", group = "Medium")
@Composable
private fun MediumDisabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Medium,
                enabled = false,
                iconLeft = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                    contentDescription = null
                ) },
                iconRight = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                    contentDescription = null
                ) }
            )
        }
    }
}

@Preview(showBackground = true, name = "Enabled", group = "Small")
@Composable
private fun SmallEnabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Small,
                iconLeft = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                    contentDescription = null
                ) },
                iconRight = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                    contentDescription = null
                ) }
            )
        }
    }
}

@Preview(showBackground = true, name = "Disabled", group = "Small")
@Composable
private fun SmallDisabledPreview() {
    OrataAppTheme {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            OraAnchorText(
                text = "Anchor Text",
                onClick = {},
                size = OraAnchorTextSize.Small,
                enabled = false,
                iconLeft = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                    contentDescription = null
                ) },
                iconRight = { Icon(
                    painter = rememberVectorPainter(FeatherIcons.ArrowRight),
                    contentDescription = null
                ) }
            )
        }
    }
}
