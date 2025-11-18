package com.oratakashi.design.app.ui.components.anchortext

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.oratakashi.design.app.component.ComponentContent
import com.oratakashi.design.app.navigation.AnchorTextNavigation
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
internal fun AnchorTextScreen(
    scrollBehavior: TopAppBarScrollBehavior? = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(),
    onBackPress: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val tabs = listOf("Size", "Variant")

    ComponentContent(
        navigation = AnchorTextNavigation,
        onBackClick = onBackPress,
        scrollBehavior = scrollBehavior,
        tabs = tabs,
        modifier = modifier
    ) {
        when(it) {
            0 -> SizeAnchorTextContent()
            else -> VariantAnchorTextContent()
        }
    }
}