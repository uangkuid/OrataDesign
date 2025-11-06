package com.oratakashi.design.component

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performScrollToKey
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.requestFocus
import androidx.compose.ui.test.runComposeUiTest
import com.oratakashi.design.app.App
import kotlin.test.Test

class TextFieldTest {
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextBasic() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_TextField").performClick()
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldState() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_TextField").performClick()
        onNodeWithTag("TextFieldTab_State").performClick()
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldSize() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_TextField").performClick()
        onNodeWithTag("TextFieldTab_Size").performClick()
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldAllTab() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_TextField").performClick()
        onNodeWithTag("TextFieldTab_Basic").performClick()
        onNodeWithTag("TextFieldTab_Size").performClick()
        onNodeWithTag("TextFieldTab_State").performClick()
        onNodeWithTag("TextFieldTab_Size").performClick()
        onNodeWithTag("TextFieldTab_Basic").performClick()
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldBasicFill() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_TextField").performClick()
        onNodeWithTag("TextFieldTab_Basic").performClick()

        onNodeWithTag("TextField_Basic").requestFocus()
        onNodeWithTag("TextField_Basic").performTextInput("Lorem Ipsum")
        onNodeWithTag("TextField_Label").requestFocus()
        onNodeWithTag("TextField_Label").performTextInput("Lorem Ipsum")
        onNodeWithTag("TextField_Required").performScrollTo()
        onNodeWithTag("TextField_Caption").requestFocus()
        onNodeWithTag("TextField_Caption").performTextInput("Lorem Ipsum")
        onNodeWithTag("TextField_Required").requestFocus()
        onNodeWithTag("TextField_Required").performTextInput("Lorem Ipsum")
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldSizeFill() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_TextField").performClick()
        onNodeWithTag("TextFieldTab_Size").performClick()

        onNodeWithTag("TextField_Size_Small").requestFocus()
        onNodeWithTag("TextField_Size_Small").performTextInput("Lorem Ipsum")
        onNodeWithTag("TextField_Size_Medium").requestFocus()
        onNodeWithTag("TextField_Size_Medium").performTextInput("Lorem Ipsum")
        onNodeWithTag("TextField_Size_Large").performScrollTo()
        onNodeWithTag("TextField_Size_Large").requestFocus()
        onNodeWithTag("TextField_Size_Large").performTextInput("Lorem Ipsum")
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldStateFill() = runComposeUiTest {
        setContent {
            App()
        }

        onNodeWithTag("NavigationBarItem_Component").performClick()
        onNodeWithTag("Component_TextField").performClick()
        onNodeWithTag("TextFieldTab_State").performClick()

        onNodeWithTag("TextField_State_Default").requestFocus()
        onNodeWithTag("TextField_State_Default").performTextInput("Lorem Ipsum")
        onNodeWithTag("TextField_State_Error").requestFocus()
        onNodeWithTag("TextField_State_Error").performTextInput("Lorem Ipsum")
        onNodeWithTag("TextField_State_Success").performScrollTo()
        waitForIdle()
        onNodeWithTag("TextField_State_Success").requestFocus()
        onNodeWithTag("TextField_State_Success").performTextInput("Lorem Ipsum")

        // Setelah scroll ke Success, item Locked seharusnya sudah ter-render
        onNodeWithTag("TextFieldContent_State").performScrollToKey("locked_state")
        waitForIdle()

        onNodeWithTag("TextField_State_Locked_LockedAction").performClick()
        onNodeWithTag("TextField_State_Locked").requestFocus()
        onNodeWithTag("TextField_State_Locked").performTextInput("Lorem Ipsum")
        onNodeWithTag("TextFieldContent_State").performScrollToKey("default_state")
        onNodeWithTag("TextFieldContent_State").performScrollToKey("locked_state")
    }
}