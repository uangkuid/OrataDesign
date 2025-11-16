package com.oratakashi.design.component.anchortext

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.typography.OraTypographyKeyToken

/**
 * OraAnchorTextSize provides functionality for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
enum class OraAnchorTextSize(
    val labelTextFont: OraTypographyKeyToken,
    val iconSize: Dp
) {
    Large(
        labelTextFont = OraTypographyKeyToken.BodyLarge,
        iconSize = 24.dp
    ),
    Medium(
        labelTextFont = OraTypographyKeyToken.BodyMedium,
        iconSize = 20.dp
    ),
    Small(
        labelTextFont = OraTypographyKeyToken.BodySmall,
        iconSize = 16.dp
    )
}