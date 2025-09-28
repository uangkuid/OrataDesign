package com.oratakashi.design.app.ui.component_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
fun ComponentListScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .width(361.dp)
            .padding(0.dp),
        verticalArrangement = Arrangement.spacedBy(22.dp)
    ) {

    }
}

@Preview
@Composable
fun CardComponent() {
    Column(
        modifier = Modifier
            .width(172.dp)
            .background(
                color = Color(0xFFEBEEF3),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Text(
            text = "Card Title", // Replace with actual content
            style = OrataTheme.typography.bodyLarge(),
            color = OrataTheme.colors.onSurface
        )
    }
}