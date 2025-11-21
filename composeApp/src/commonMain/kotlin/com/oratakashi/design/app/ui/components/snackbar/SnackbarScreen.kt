package com.oratakashi.design.app.ui.components.snackbar

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.component.ComponentContent
import com.oratakashi.design.app.navigation.SnackbarNavigation



@OptIn(ExperimentalMaterial3Api::class)
@Suppress("DEPRECATION")
@Preview
@Composable
/**
 * SnackbarScreen function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
fun SnackbarScreen(
    scrollBehavior: TopAppBarScrollBehavior? = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(),
    onBackPress: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val tabs = listOf("Theme", "Variant")

    ComponentContent(
        onBackClick = onBackPress,
        navigation = SnackbarNavigation,
        scrollBehavior = scrollBehavior,
        tabs = tabs,
        modifier = modifier
    ) {


    }
}
