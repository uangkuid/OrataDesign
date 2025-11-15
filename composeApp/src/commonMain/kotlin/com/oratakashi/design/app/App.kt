package com.oratakashi.design.app

import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.testTag
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.oratakashi.design.app.navigation.ComponentNavigation
import com.oratakashi.design.app.navigation.FoundationNavigation
import com.oratakashi.design.app.ui.component.ComponentScreen
import com.oratakashi.design.app.ui.foundation.FoundationScreen
import com.oratakashi.design.component.button.OraButton
import com.oratakashi.design.foundation.OrataAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_colors
import oratadesign.composeapp.generated.resources.ic_component
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App() {
    OrataAppTheme {
        val navController = rememberNavController()
        val items = listOf(FoundationNavigation, ComponentNavigation)
        val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()

        Scaffold(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
            bottomBar = {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                NavigationBar {
                    items.forEach { screen ->
                        NavigationBarItem(
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
                                .testTag("NavigationBarItem_${screen.title()}")
                        )
                    }
                }
            }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = FoundationNavigation,
                enterTransition = { fadeIn() },
                exitTransition = { fadeOut() },
                modifier = Modifier
            ) {
                composable<FoundationNavigation>{
                    FoundationScreen(
                        scrollBehavior = scrollBehavior,
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
                composable<ComponentNavigation> {
                    ComponentScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        scrollBehavior = scrollBehavior
                    )
                }
            }
        }
    }
}