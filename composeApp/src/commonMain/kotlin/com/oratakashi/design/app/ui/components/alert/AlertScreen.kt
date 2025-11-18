package com.oratakashi.design.app.ui.components.alert

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.oratakashi.design.app.component.ComponentContent
import com.oratakashi.design.app.navigation.AlertNavigation
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
internal fun AlertScreen(
    scrollBehavior: TopAppBarScrollBehavior? = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(),
    onBackPress: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val tabs = listOf("Theme", "Variant")

    ComponentContent(
        onBackClick = onBackPress,
        navigation = AlertNavigation,
        scrollBehavior = scrollBehavior,
        tabs = tabs,
        modifier = modifier
    ) {
        when(it) {
            0 -> ThemeAlertContent()
            1 -> VariantAlertContent()
            else -> VariantAlertContent()
        }
    }
}