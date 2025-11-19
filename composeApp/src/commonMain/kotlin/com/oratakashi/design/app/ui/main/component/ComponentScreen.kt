package com.oratakashi.design.app.ui.main.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.layout.AnimatedPane
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldDefaults
import androidx.compose.material3.adaptive.layout.PaneAdaptedValue
import androidx.compose.material3.adaptive.layout.ThreePaneScaffoldRole
import androidx.compose.material3.adaptive.layout.calculatePaneScaffoldDirective
import androidx.compose.material3.adaptive.navigation.BackNavigationBehavior
import androidx.compose.material3.adaptive.navigation.ThreePaneScaffoldNavigator
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.backhandler.BackHandler
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.oratakashi.design.app.navigation.AlertNavigation
import com.oratakashi.design.app.navigation.AnchorTextNavigation
import com.oratakashi.design.app.navigation.ButtonNavigation
import com.oratakashi.design.app.navigation.ComponentListNavigation
import com.oratakashi.design.app.navigation.TextFieldNavigation
import com.oratakashi.design.app.navigation.contract.BaseNavigation
import com.oratakashi.design.app.ui.components.alert.AlertScreen
import com.oratakashi.design.app.ui.components.anchortext.AnchorTextScreen
import com.oratakashi.design.app.ui.components.button.ButtonScreen
import com.oratakashi.design.app.ui.components.component_list.ComponentListScreen
import com.oratakashi.design.app.ui.components.textfield.TextFieldScreen
import com.oratakashi.design.foundation.OrataTheme
import compose.icons.FeatherIcons
import compose.icons.feathericons.ArrowLeft
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(
    ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class,
    ExperimentalMaterial3AdaptiveApi::class, ExperimentalComposeUiApi::class
)
@Preview(showBackground = true)
@Composable
internal fun ComponentScreen(
    scrollBehavior: TopAppBarScrollBehavior? = null,
    modifier: Modifier = Modifier
) {
    val navigator = rememberListDetailPaneScaffoldNavigator<String?>()
    val coroutineScope = rememberCoroutineScope()

    BackHandler(
        enabled = navigator.canNavigateBack(BackNavigationBehavior.PopUntilContentChange)
    ) {
        navigateBack(
            coroutineScope = coroutineScope,
            navigator = navigator
        )
    }

    LaunchedEffect(navigator.scaffoldValue) {
        println("Current Destination: ${navigator.currentDestination}")
        println("Current scaffoldValue: ${navigator.scaffoldValue}")
        println("Current scaffoldValue.secondary: ${navigator.scaffoldValue.secondary}")
    }

    ListDetailPaneScaffold(
        directive = navigator.scaffoldDirective,
        value = navigator.scaffoldValue,
        listPane = {
            AnimatedPane {
                ComponentListScreen(
                    onClick = {
                        coroutineScope.launch {
                            navigator.navigateTo(ThreePaneScaffoldRole.Primary, it?.route)
                        }
                    }
                )
            }
        },
        detailPane = {
            val content = navigator.currentDestination?.contentKey

            AnimatedPane {
                AnimatedVisibility(
                    visible = content == ButtonNavigation.route,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    ButtonScreen(
                        onBackPress = {
                            navigateBack(
                                coroutineScope = coroutineScope,
                                navigator = navigator
                            )
                        }
                    )
                }

                AnimatedVisibility(
                    visible = content == TextFieldNavigation.route,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    TextFieldScreen(
                        onBackPress = {
                            navigateBack(
                                coroutineScope = coroutineScope,
                                navigator = navigator
                            )
                        }
                    )
                }

                AnimatedVisibility(
                    visible = content == AnchorTextNavigation.route,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    AnchorTextScreen(
                        onBackPress = {
                            navigateBack(
                                coroutineScope = coroutineScope,
                                navigator = navigator
                            )
                        }
                    )
                }

                AnimatedVisibility(
                    visible = content == AlertNavigation.route,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    AlertScreen(
                        onBackPress = {
                            navigateBack(
                                coroutineScope = coroutineScope,
                                navigator = navigator
                            )
                        }
                    )
                }

                AnimatedVisibility(
                    visible = content == null,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    EmptyComponentScreen()
                }
            }
        },
    )
}

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
internal fun navigateBack(
    navigator: ThreePaneScaffoldNavigator<String?>,
    coroutineScope: CoroutineScope
) {
    coroutineScope.launch {
        navigator.navigateBack(BackNavigationBehavior.PopUntilCurrentDestinationChange)
    }
}