package com.oratakashi.design.component.snackbar.animation

import androidx.compose.runtime.Composable

/**
 * SlideInSlideOutTransition is a typealias for a composable function that takes a content composable and applies
 * slide in and slide out animations to it.
 * @author oratakashi
 * @since 16 Nov 2025
 */
internal typealias SlideInSlideOutTransition = @Composable (content: @Composable () -> Unit) -> Unit