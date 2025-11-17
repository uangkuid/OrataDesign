package com.oratakashi.design.component.snackbar.animation

import androidx.compose.runtime.RecomposeScope

internal class SlideInSlideOutState<T> {
    var current: Any? = Any()
    var items = mutableListOf<SlideInSlideOutAnimationItem<T>>()
    var scope: RecomposeScope? = null
}