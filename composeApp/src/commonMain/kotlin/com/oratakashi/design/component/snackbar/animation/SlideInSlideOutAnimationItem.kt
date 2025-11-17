package com.oratakashi.design.component.snackbar.animation

/**
 * SlideInSlideOutAnimationItem represents an item with a key and its associated slide in/out transition.
 * @author oratakashi
 * @since 16 Nov 2025
 */
data class SlideInSlideOutAnimationItem<T>(
    val key: T,
    val transition: SlideInSlideOutTransition
)
