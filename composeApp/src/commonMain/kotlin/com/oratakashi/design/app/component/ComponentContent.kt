package com.oratakashi.design.app.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LargeFlexibleTopAppBar
import androidx.compose.material3.PrimaryScrollableTabRow
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oratakashi.design.app.navigation.contract.BaseNavigation
import com.oratakashi.design.foundation.OrataTheme
import compose.icons.FeatherIcons
import compose.icons.feathericons.ArrowLeft
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
private fun TabRowContent(
    tabs: List<String>,
    selectedTabIndex: Int,
    onTabClick: (Int) -> Unit
) {
    tabs.forEachIndexed { index, title ->
        Tab(
            selected = selectedTabIndex == index,
            onClick = { onTabClick(index) },
            text = {
                Text(
                    text = title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = if (selectedTabIndex == index)
                        OrataTheme.colors.primary
                    else
                        OrataTheme.colors.onSurfaceVariant
                )
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
internal fun <T : BaseNavigation> ComponentContent(
    navigation: T? = null,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    modifier: Modifier = Modifier,
    tabs: List<String> = emptyList(),
    isScrollableTab: Boolean = false,
    onBackClick: () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    content: @Composable (Int) -> Unit = { _ -> }
) {
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { tabs.size }
    )
    val coroutineScope = rememberCoroutineScope()
    val selectedTabIndex by remember { derivedStateOf { pagerState.currentPage } }


    Scaffold(
        snackbarHost = snackbarHost,
        modifier = modifier.then(
            if (scrollBehavior != null) {
                Modifier.nestedScroll(scrollBehavior.nestedScrollConnection)
            } else {
                Modifier
            }
        ),
        topBar = {
            LargeFlexibleTopAppBar(
                title = {
                    Text(
                        navigation?.title
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
                    IconButton(
                        onClick = onBackClick,
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
                },
                scrollBehavior = scrollBehavior
            )
        },
        content =  { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                if (isScrollableTab) {
                    PrimaryScrollableTabRow(
                        selectedTabIndex = selectedTabIndex,
                        modifier = Modifier.background(Color.Blue),
                        indicator = {
                            TabRowDefaults.PrimaryIndicator(
                                modifier = Modifier.tabIndicatorOffset(selectedTabIndex),
                            )
                        },
                        divider = {
                            HorizontalDivider(color = Color(0xFFC1C7CE))
                        }
                    ) {
                        TabRowContent(
                            tabs = tabs,
                            selectedTabIndex = selectedTabIndex,
                            onTabClick = { index ->
                                coroutineScope.launch {
                                    pagerState.animateScrollToPage(index)
                                }
                            }
                        )
                    }
                } else {
                    PrimaryTabRow(
                        selectedTabIndex = selectedTabIndex,
                        modifier = Modifier.background(Color.Blue),
                        indicator = {
                            TabRowDefaults.PrimaryIndicator(
                                modifier = Modifier.tabIndicatorOffset(selectedTabIndex),
                            )
                        },
                        divider = {
                            HorizontalDivider(color = Color(0xFFC1C7CE))
                        }
                    ) {
                        TabRowContent(
                            tabs = tabs,
                            selectedTabIndex = selectedTabIndex,
                            onTabClick = { index ->
                                coroutineScope.launch {
                                    pagerState.animateScrollToPage(index)
                                }
                            }
                        )
                    }
                }

                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier.weight(1f),
                    verticalAlignment = Alignment.Top
                ) {
                    content.invoke(it)
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, name = "Scrollable Tab Preview")
@Composable
@Suppress("UnusedPrivateMember")
private fun ComponentContentScrollableTabPreview() {
    ComponentContent<BaseNavigation>(
        tabs = listOf("Tab 1", "Tab 2", "Tab 3", "Tab 4", "Tab 5", "Tab 6"),
        isScrollableTab = true,
        content = { index ->
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Scrollable Tab Content: Tab ${index + 1}")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, name = "Static Tab Preview")
@Composable
@Suppress("UnusedPrivateMember")
private fun ComponentContentStaticTabPreview() {
    ComponentContent<BaseNavigation>(
        tabs = listOf("Tab 1", "Tab 2", "Tab 3"),
        isScrollableTab = false,
        content = { index ->
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Static Tab Content: Tab ${index + 1}")
            }
        }
    )
}
