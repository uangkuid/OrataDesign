package com.oratakashi.design.app.ui.typography

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
fun TypographyScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = "Display",
                style = OrataTheme.typography.titleLarge(),
                color = OrataTheme.colors.onSurface,
                modifier = Modifier.padding(start = 20.dp, top = 16.dp, bottom = 8.dp)
            )
        }
    }
}