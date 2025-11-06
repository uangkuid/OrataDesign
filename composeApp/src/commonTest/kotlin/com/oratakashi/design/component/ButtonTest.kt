package com.oratakashi.design.component

import androidx.compose.ui.test.ExperimentalTestApi
import kotlin.test.Test
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import com.oratakashi.design.app.App

class ButtonTest {
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonBasic() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_Button").performClick()
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonState() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_Button").performClick()
        onNodeWithTag("ButtonTab_State").performClick()
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonSize() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_Button").performClick()
        onNodeWithTag("ButtonTab_Size").performClick()
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonAllTab() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_Button").performClick()
        onNodeWithTag("ButtonTab_Basic").performClick()
        onNodeWithTag("ButtonTab_State").performClick()
        onNodeWithTag("ButtonTab_Size").performClick()
        onNodeWithTag("ButtonTab_State").performClick()
        onNodeWithTag("ButtonTab_Basic").performClick()
    }
}