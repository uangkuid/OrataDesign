package com.oratakashi.design.app.ui.component_list

//import oratadesign.composeapp.generated.resources.ic_button_icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.oratakashi.design.app.icons.ButtonIcon
import com.oratakashi.design.app.models.ComponentData
import com.oratakashi.design.app.models.Constant
import com.oratakashi.design.foundation.OrataTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
fun ComponentListScreen(
    navController: NavHostController? = null,
    modifier: Modifier = Modifier
) {
    val componentList = Constant.componentList()
    LazyVerticalGrid(
        columns = GridCells.Adaptive(160.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 16.dp
        ),
        modifier = modifier
    ) {
        items(
            items = componentList, key = { it.title }
        ) { component ->
            CardComponent(
                component = component,
                onClick = {
                    navController?.navigate(it.navigation?.route.orEmpty())
                }
            )
        }
    }
}

@Preview
@Composable
private fun CardComponent(
    component: ComponentData = ComponentData(
        title = "Card Title",
        image = ButtonIcon
    ),
    onClick: (ComponentData) -> Unit = { _ -> }
) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = true) {
                onClick(component)
            },
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = rememberVectorPainter(component.image.icons()),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .defaultMinSize(
                        minHeight = 80.dp
                    )
                    .fillMaxWidth()
                    .aspectRatio(16f / 9f)
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