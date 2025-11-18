package com.oratakashi.design.app.ui.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
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
import com.oratakashi.design.app.component.ComponentContent
import com.oratakashi.design.app.navigation.AlertNavigation
import com.oratakashi.design.app.navigation.ButtonNavigation
import com.oratakashi.design.foundation.OrataTheme
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview(
    showBackground = true
)
@Composable
internal fun ButtonScreen(
    scrollBehavior: TopAppBarScrollBehavior? = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(),
    onBackPress: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val tabs = listOf("Basic", "State", "Size")

    ComponentContent(
        onBackClick = onBackPress,
        navigation = ButtonNavigation,
        scrollBehavior = scrollBehavior,
        tabs = tabs,
        modifier = modifier
    ) {
        when(it) {
            0 -> BasicButtonContent()
            1 -> StateButtonContent()
            else -> SizeButtonContent()
        }
    }
}
