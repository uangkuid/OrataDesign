package com.oratakashi.design.app.ui.components.component_list

//import oratadesign.composeapp.generated.resources.ic_button_icon
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
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
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LargeFlexibleTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.oratakashi.design.app.icons.ButtonIcon
import com.oratakashi.design.app.models.ComponentData
import com.oratakashi.design.app.models.Constant
import com.oratakashi.design.app.navigation.contract.BaseNavigation
import com.oratakashi.design.foundation.OrataTheme
import compose.icons.FeatherIcons
import compose.icons.feathericons.ArrowLeft
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Preview(
    showBackground = true
)
@Composable
/**
 * ComponentListScreen function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun ComponentListScreen(
    isTopAppBarVisible: Boolean = true,
    scrollBehavior: TopAppBarScrollBehavior? = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(),
    onClick: (BaseNavigation?) -> Unit = { _ -> },
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            AnimatedVisibility(
                visible = isTopAppBarVisible,
                enter = slideInVertically() + fadeIn(),
                exit = slideOutVertically() + fadeOut()
            ) {
                LargeFlexibleTopAppBar(
                    title = {
                        Text(
                            text = "Components",
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            style = OrataTheme.typography.displaySmall(),
                            color = OrataTheme.colors.onSurface
                        )
                    },
                    scrollBehavior = scrollBehavior,
                )
            }
        },
        modifier = modifier
    ) { paddingValues ->
        ComponentList(
            modifier = Modifier
                .padding(paddingValues = paddingValues),
            onClick = onClick
        )
    }
}

@Composable
internal fun ComponentList(
    modifier: Modifier,
    onClick: (BaseNavigation?) -> Unit = { _ -> },
) {
    val componentList = Constant.componentList()

    LazyVerticalGrid(
        columns = GridCells.Adaptive(150.dp),
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
                    onClick.invoke(it.navigation)
                },
                modifier = Modifier.testTag("Component_${component.title}")
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
    onClick: (ComponentData) -> Unit = { _ -> },
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier
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