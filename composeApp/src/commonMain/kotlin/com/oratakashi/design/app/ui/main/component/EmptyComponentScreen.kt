package com.oratakashi.design.app.ui.main.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.icons.IlustrationComponentIcon
import com.oratakashi.design.foundation.OrataTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun EmptyComponentScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                IlustrationComponentIcon.icons(),
                null,
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .aspectRatio(16/9f)
                    .align(Alignment.CenterHorizontally)
            )

            Text(
                "Orata Design Component",
                style = com.oratakashi.design.foundation.OrataTheme.typography.headlineSmall(),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(
                        top = 32.dp
                    )
            )
        }
    }
}