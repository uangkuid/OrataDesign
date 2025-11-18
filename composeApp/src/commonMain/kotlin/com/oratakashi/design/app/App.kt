package com.oratakashi.design.app

import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.window.core.layout.WindowSizeClass
import com.oratakashi.design.app.navigation.ComponentNavigation
import com.oratakashi.design.app.navigation.FoundationNavigation
import com.oratakashi.design.app.ui.main.component.ComponentScreen
import com.oratakashi.design.app.ui.main.foundation.FoundationScreen
import com.oratakashi.design.foundation.OrataAppTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * App function for the Orata Design System.
 * @author oratakashi
 * @since 16 Nov 2025
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App(
    windowSizeClass: WindowSizeClass = currentWindowAdaptiveInfo().windowSizeClass
) {
    OrataAppTheme {
        val navController = rememberNavController()
        val items = listOf(FoundationNavigation, ComponentNavigation)
        val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val navigationType = NavigationSuiteScaffoldDefaults.calculateFromAdaptiveInfo(currentWindowAdaptiveInfo())
        NavigationSuiteScaffold(
            navigationSuiteItems = {
                val currentRoute = navBackStackEntry?.destination?.route
                items.forEach { screen ->
                    item(
                        selected = currentRoute == screen.route,
                        onClick = {
                            if (currentRoute != screen.route) {
                                navController.navigate(screen) {
                                    // Pop up to the start destination to avoid building a large back stack
                                    popUpTo(navController.graph.startDestinationId) {
                                        saveState = true
                                    }
                                    // Avoid multiple copies of the same destination when reselecting the same item
                                    launchSingleTop = true
                                    // Restore state when reselecting a previously selected item
                                    restoreState = true
                                }
                            }
                        },
                        icon = {
                            Icon(painterResource(screen.icon), contentDescription = null)
                        },
                        label = { Text(screen.title()) },
                        modifier = Modifier
                            .then(
                                if (navigationType == NavigationSuiteType.NavigationRail) {
                                    Modifier.padding(
                                        top = 10.dp,
                                        start = 10.dp,
                                        end = 10.dp,
                                    )
                                } else {
                                    Modifier
                                }
                            )
                            .testTag("NavigationBarItem_${screen.title}")
                    )
                }
            },
            modifier = Modifier
                .nestedScroll(scrollBehavior.nestedScrollConnection)
        ) {
            NavHost(
                navController = navController,
                startDestination = FoundationNavigation,
                enterTransition = { fadeIn() },
                exitTransition = { fadeOut() },
                modifier = Modifier
            ) {
                composable<FoundationNavigation> {
                    FoundationScreen(
                        scrollBehavior = scrollBehavior,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                composable<ComponentNavigation> {
                    ComponentScreen(
                        modifier = Modifier
                            .fillMaxSize(),
                        scrollBehavior = scrollBehavior
                    )
                }
            }
        }
    }
}