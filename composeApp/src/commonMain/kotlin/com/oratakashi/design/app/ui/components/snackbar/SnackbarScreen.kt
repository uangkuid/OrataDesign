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
import com.oratakashi.design.component.snackbar.OraSnackbar
import com.oratakashi.design.component.snackbar.OraSnackbarHost
import com.oratakashi.design.component.snackbar.OraSnackbarHostState
import com.oratakashi.design.component.snackbar.OraSnackbarTheme
import com.oratakashi.design.component.snackbar.toColor
import compose.icons.FeatherIcons
import compose.icons.feathericons.Info


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
    val snackbarHostState = remember { OraSnackbarHostState() }

    ComponentContent(
        onBackClick = onBackPress,
        navigation = SnackbarNavigation,
        scrollBehavior = scrollBehavior,
        tabs = tabs,
        modifier = modifier,
        snackbarHost = {
            OraSnackbarHost(
                hostState = snackbarHostState,
                snackbar = {

                }
            )
        }
    ) {
        OraSnackbar(
            title = {
                Text("This is title")
            },
            description = {
                Text("This is description")
            },
            icon = {
                Icon(FeatherIcons.Info, null)
            },
            colors = OraSnackbarTheme.Default.toColor(),
            onClose = {
            },
            showCloseIcon = false,
            action = {
                Text("UNDO")
            }
        )
    }
}
