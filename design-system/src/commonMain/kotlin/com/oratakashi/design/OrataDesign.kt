package com.oratakashi.design

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.oratakashi.design.foundation.OrataTheme

/**
 * Main entry point for Orata Design System
 * @author oratakashi
 * @since 06 Sep 2025
 */
@Composable
fun OrataDesignPreview() {
    OrataTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Orata Design System",
                style = MaterialTheme.typography.headlineLarge
            )
        }
    }
}