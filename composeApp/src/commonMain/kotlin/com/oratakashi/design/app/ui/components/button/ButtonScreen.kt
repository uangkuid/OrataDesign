package com.oratakashi.design.app.ui.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oratakashi.design.foundation.OrataTheme
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
internal fun ButtonScreen(
    modifier: Modifier = Modifier
) {
    val tabs = listOf("Basic", "State", "Size")
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { tabs.size }
    )
    val coroutineScope = rememberCoroutineScope()
    val selectedTabIndex by remember { derivedStateOf { pagerState.currentPage } }

    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(23.dp)
    ) {
        // Tabs Section
        PrimaryTabRow(
            selectedTabIndex = selectedTabIndex,
            indicator = {
                // Use the integer overload of tabIndicatorOffset to position the indicator by index
                TabRowDefaults.PrimaryIndicator(
                    modifier = Modifier.tabIndicatorOffset(selectedTabIndex),
                )
            },
            divider = {
                HorizontalDivider(color = Color(0xFFC1C7CE))
            }
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    },
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
                    },
                    modifier = Modifier
                        .testTag("ButtonTab_$title")
                )
            }
        }

        // Button Sections

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Top
        ) {
            when(it) {
                0 -> _root_ide_package_.com.oratakashi.design.app.ui.components.button.BasicButtonContent()
                1 -> _root_ide_package_.com.oratakashi.design.app.ui.components.button.StateButtonContent()
                else -> _root_ide_package_.com.oratakashi.design.app.ui.components.button.SizeButtonContent()
            }
        }
    }
}
