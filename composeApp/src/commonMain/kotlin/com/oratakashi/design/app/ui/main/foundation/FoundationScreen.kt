package com.oratakashi.design.app.ui.main.foundation

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
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.oratakashi.design.app.navigation.ColorNavigation
import com.oratakashi.design.app.navigation.TypographyNavigation
import com.oratakashi.design.app.ui.foundations.colors.ColorsScreen
import com.oratakashi.design.app.ui.foundations.typography.TypographyScreen
import com.oratakashi.design.foundation.OrataTheme
import oratadesign.composeapp.generated.resources.Res
import oratadesign.composeapp.generated.resources.ic_colors
import oratadesign.composeapp.generated.resources.ic_typography
import oratadesign.composeapp.generated.resources.label_colors
import oratadesign.composeapp.generated.resources.label_foundation
import oratadesign.composeapp.generated.resources.label_typography
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Preview
@Composable
internal fun FoundationScreen(modifier: Modifier = Modifier, scrollBehavior: TopAppBarScrollBehavior) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Scaffold(
        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            LargeTopAppBar(
                title = {
                    Text(
                        when (currentRoute) {
                            ColorNavigation.route -> stringResource(Res.string.label_colors)
                            TypographyNavigation.route -> stringResource(Res.string.label_typography)
                            else -> stringResource(Res.string.label_foundation)
                        },
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        style = OrataTheme.typography.displaySmall(),
                        color = OrataTheme.colors.onSurface
                    )
                },
                scrollBehavior = scrollBehavior,
            )
        },
        content = { innerPadding ->
            Box() {
                NavHost(
                    navController = navController,
                    startDestination = ColorNavigation,
                    enterTransition = { fadeIn() },
                    exitTransition = { fadeOut() },
                ) {
                    composable<ColorNavigation> { ColorsScreen(
                        modifier = Modifier.padding(top = innerPadding.calculateTopPadding()).fillMaxSize()
                    ) }
                    composable<TypographyNavigation> { TypographyScreen(
                        modifier = Modifier.padding(top = innerPadding.calculateTopPadding()).fillMaxSize()
                    ) }
                }

                HorizontalFloatingToolbar(
                    expanded = true,
                    modifier = Modifier.align(Alignment.BottomCenter)
                        .padding(bottom = 16.dp),
                    colors = FloatingToolbarDefaults.standardFloatingToolbarColors(),
                    expandedShadowElevation = FloatingToolbarDefaults.ContainerExpandedElevationWithFab,
                    content = {
                        IconButton(
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = if (currentRoute == ColorNavigation.route) OrataTheme.colors.primary else OrataTheme.colors.surfaceContainer,
                                contentColor = if (currentRoute == ColorNavigation.route) OrataTheme.colors.onPrimary else OrataTheme.colors.onSurface,
                            ),
                            onClick = {
                                navController.navigate(ColorNavigation)
                            }
                        ) {
                            Icon(painterResource(Res.drawable.ic_colors), contentDescription = "")
                        }
                        IconButton(
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = if (currentRoute == TypographyNavigation.route) OrataTheme.colors.primary else OrataTheme.colors.surfaceContainer,
                                contentColor = if (currentRoute == TypographyNavigation.route) OrataTheme.colors.onPrimary else OrataTheme.colors.onSurface,
                            ),
                            onClick = {
                                navController.navigate(TypographyNavigation)
                            }
                        ) {
                            Icon(painterResource(Res.drawable.ic_typography), contentDescription = "")
                        }
                    },
                )
            }
        },
    )
}
