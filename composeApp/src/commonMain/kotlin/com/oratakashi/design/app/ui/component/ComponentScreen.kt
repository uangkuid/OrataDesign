package com.oratakashi.design.app.ui.component

import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.FloatingToolbarDefaults
import androidx.compose.material3.HorizontalFloatingToolbar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.oratakashi.design.app.navigation.AnchorTextNavigation
import com.oratakashi.design.app.navigation.ButtonNavigation
import com.oratakashi.design.app.navigation.ComponentListNavigation
import com.oratakashi.design.app.navigation.ComponentNavigation
import com.oratakashi.design.app.navigation.TextFieldNavigation
import com.oratakashi.design.app.ui.anchortext.AnchorTextScreen
import com.oratakashi.design.app.ui.button.ButtonScreen
import com.oratakashi.design.app.ui.component_list.ComponentListScreen
import com.oratakashi.design.app.ui.textfield.TextFieldScreen
import com.oratakashi.design.foundation.OrataTheme
import compose.icons.AllIcons
import compose.icons.FeatherIcons
import compose.icons.feathericons.ArrowLeft
import compose.icons.feathericons.ArrowRight
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Preview
@Composable
internal fun ComponentScreen(
    scrollBehavior: TopAppBarScrollBehavior? = null,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    Scaffold(
        modifier = modifier.apply {
            if (scrollBehavior != null) nestedScroll(scrollBehavior.nestedScrollConnection)
        },
        topBar = {
            LargeTopAppBar(
                title = {
                    Text(
                        navBackStackEntry?.destination?.route
                            ?.replace("com.oratakashi.design.app.navigation.", "")
                            ?.replace("Navigation", "")
                            ?.replace("List", "").orEmpty(),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        style = OrataTheme.typography.displaySmall(),
                        color = OrataTheme.colors.onSurface
                    )
                },
                navigationIcon = {
                    if (navBackStackEntry?.destination?.route != ComponentListNavigation.route) {
                        IconButton(
                            onClick = {
                                navController.navigateUp()
                            },
                            colors = IconButtonDefaults.iconButtonColors(
                                contentColor = OrataTheme.colors.onSurfaceVariant
                            ),
                            modifier = Modifier
                                .padding(end = 8.dp)
                        ) {
                            Icon(
                                painter = rememberVectorPainter(FeatherIcons.ArrowLeft),
                                contentDescription = null
                            )
                        }
                    }
                },
                scrollBehavior = scrollBehavior,
            )
        },
        content = { innerPadding ->
            Box() {
                NavHost(
                    navController = navController,
                    startDestination = ComponentListNavigation,
                    enterTransition = { fadeIn() },
                    exitTransition = { fadeOut() },
                ) {
                    composable<ComponentListNavigation> {
                        ComponentListScreen(
                            modifier = Modifier.padding(top = innerPadding.calculateTopPadding())
                                .fillMaxSize(),
                            navController = navController
                        )
                    }

                    composable<ButtonNavigation> {
                        ButtonScreen(
                            modifier = Modifier.padding(top = innerPadding.calculateTopPadding())
                                .fillMaxSize()
                        )
                    }

                    composable<TextFieldNavigation> {
                        TextFieldScreen(
                            modifier = Modifier.padding(top = innerPadding.calculateTopPadding())
                                .fillMaxSize()
                        )
                    }

                    composable<AnchorTextNavigation> {
                        AnchorTextScreen(
                            modifier = Modifier.padding(top = innerPadding.calculateTopPadding())
                                .fillMaxSize()
                        )
                    }
                }
            }
        },
    )
}

