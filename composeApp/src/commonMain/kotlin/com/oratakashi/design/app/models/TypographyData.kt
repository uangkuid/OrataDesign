package com.oratakashi.design.app.models

import com.oratakashi.design.foundation.typography.OraTypographyKeyToken

internal data class TypographyData(
    val title: String,
    val style: com.oratakashi.design.foundation.typography.OraTypographyKeyToken,
    val name: String,
    val size: String,
    val font: String,
    val lineHeight: String,
    val letterSpacing: String,
)