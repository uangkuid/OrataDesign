package com.oratakashi.design.app

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
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.oratakashi.design.app.navigation.ComponentNavigation
import com.oratakashi.design.app.navigation.FoundationNavigation
import com.oratakashi.design.app.ui.home.HomeScreen
import com.oratakashi.design.foundation.OrataAppTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

sealed class Screen(val route: String, val title: String) {
    object Foundation : Screen("foundation", "Foundation")
    object Component : Screen("component", "Component")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App() {
    OrataAppTheme {
        val navController = rememberNavController()
        val items = listOf(FoundationNavigation, ComponentNavigation)

        Scaffold(
            bottomBar = {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                println("Current Route: $currentRoute") // Debugging line to check current route
                println("items: $items") // Debugging line to check items

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
                            label = { Text(screen.title.orEmpty()) }
                        )
                    }
                }
            }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = FoundationNavigation,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable<FoundationNavigation>{ HomeScreen() }
                composable<ComponentNavigation> {
                    // Placeholder component screen
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Component screen will be implemented here")
                    }
                }
            }
        }
    }
}