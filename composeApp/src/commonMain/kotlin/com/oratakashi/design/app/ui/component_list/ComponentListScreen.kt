package com.oratakashi.design.app.ui.component_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.models.ComponentData
import com.oratakashi.design.app.models.Constant
import com.oratakashi.design.foundation.OrataTheme
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_button_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
fun ComponentListScreen(
    modifier: Modifier = Modifier
) {
    val componentList = Constant.componentList()
    LazyVerticalGrid(
        columns = GridCells.Adaptive(160.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(
            items = componentList, key = { it.title }
        ) { component ->
            CardComponent(component = component)
        }
    }
}

@Preview
@Composable
private fun CardComponent(
    component: ComponentData = ComponentData(
        title = "Card Title",
        image = Res.drawable.ic_button_icon
    )
) {
    Card (
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(component.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .defaultMinSize(
                        minHeight = 80.dp
                    )
                    .fillMaxWidth()
            )
            Text(
                text = component.title, // Replace with actual content
                style = OrataTheme.typography.bodyLarge(),
                color = OrataTheme.colors.onSurface,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )
        }
    }
}