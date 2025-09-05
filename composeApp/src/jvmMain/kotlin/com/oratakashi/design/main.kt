package com.oratakashi.design

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "OrataDesign",
    ) {
        _root_ide_package_.com.oratakashi.design.app.App()
    }
}