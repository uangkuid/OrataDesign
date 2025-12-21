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
    val labelTextFont: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
    val iconSize: Dp
) {
    Large(
        labelTextFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge,
        iconSize = 24.dp
    ),
    Medium(
        labelTextFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium,
        iconSize = 20.dp
    ),
    Small(
        labelTextFont = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodySmall,
        iconSize = 16.dp
    )
}