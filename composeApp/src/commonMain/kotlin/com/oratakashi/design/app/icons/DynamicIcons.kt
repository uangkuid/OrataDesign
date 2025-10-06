package com.oratakashi.design.app.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

interface DynamicIcons {
    @Composable
    fun icons(): ImageVector
}