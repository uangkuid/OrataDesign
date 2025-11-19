package com.oratakashi.design.app.ui.main.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.AnimatedPane
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ThreePaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.BackNavigationBehavior
import androidx.compose.material3.adaptive.navigation.ThreePaneScaffoldNavigator
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.backhandler.BackHandler
import com.oratakashi.design.app.models.Constant
import com.oratakashi.design.app.navigation.AlertNavigation
import com.oratakashi.design.app.navigation.AnchorTextNavigation
import com.oratakashi.design.app.navigation.ButtonNavigation
import com.oratakashi.design.app.navigation.TextFieldNavigation
import com.oratakashi.design.app.ui.components.alert.AlertScreen
import com.oratakashi.design.app.ui.components.anchortext.AnchorTextScreen
import com.oratakashi.design.app.ui.components.button.ButtonScreen
import com.oratakashi.design.app.ui.components.component_list.ComponentListScreen
import com.oratakashi.design.app.ui.components.textfield.TextFieldScreen
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
                    isTopAppBarVisible = !Constant.isListDetailPaneOpened(navigator.scaffoldValue),
                    onClick = {
                        coroutineScope.launch {
                            navigator.navigateTo(ThreePaneScaffoldRole.Primary, it?.route)
                        }
                    },
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