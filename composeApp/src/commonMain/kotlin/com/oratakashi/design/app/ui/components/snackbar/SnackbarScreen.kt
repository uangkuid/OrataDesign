package com.oratakashi.design.app.ui.components.snackbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.oratakashi.design.app.component.ComponentContent
import com.oratakashi.design.app.navigation.SnackbarNavigation
import com.oratakashi.design.component.snackbar.OraSnackbar
import com.oratakashi.design.component.snackbar.OraSnackbarHost
import com.oratakashi.design.component.snackbar.OraSnackbarHostState
import com.oratakashi.design.component.snackbar.OraSnackbarTheme
import com.oratakashi.design.component.snackbar.toColor
import compose.icons.FeatherIcons
import compose.icons.feathericons.Info
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
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
    val tabs = listOf("Size", "Theme", "Variant", "Playground")
    val snackbarHostState = remember { com.oratakashi.design.component.snackbar.OraSnackbarHostState() }
    val scope = rememberCoroutineScope()

    ComponentContent(
        onBackClick = onBackPress,
        navigation = SnackbarNavigation,
        scrollBehavior = scrollBehavior,
        tabs = tabs,
        modifier = modifier,
        isScrollableTab = true,
        snackbarHost = {
            com.oratakashi.design.component.snackbar.OraSnackbarHost(
                hostState = snackbarHostState,
                snackbar = {
                    com.oratakashi.design.component.snackbar.OraSnackbar(it)
                }
            )
        }
    ) {
        when (it) {
            0 -> SizeSnackbarContent()
            1 -> ThemeSnackbarContent()
            2 -> VariantSnackbarContent()
            3 -> PlaygroundSnackbarContent(openSnackbar = {
                scope.launch { snackbarHostState.showSnackbar(it) }
            })
            else -> {
                com.oratakashi.design.component.snackbar.OraSnackbar(
                    title = {
                        Text("This is title")
                    },
                    description = {
                        Text("This is description")
                    },
                    icon = {
                        Icon(FeatherIcons.Info, null)
                    },
                    colors = com.oratakashi.design.component.snackbar.OraSnackbarTheme.Default.toColor(),
                    onClose = {
                    },
                    showCloseIcon = false,
                    action = {
                        Text("UNDO")
                    }
                )
            }
        }
    }
}
