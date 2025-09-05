package com.oratakashi.design.foundation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.oratakashi.design.foundation.color.OrataDesignColorScheme
import com.oratakashi.design.foundation.color.lightOraColorScheme

/**
 * OrataDesignColorScheme is a class that contains all the colors used in the Orata Design System.
 */
internal val LocalOrataDesignColorScheme = staticCompositionLocalOf<OrataDesignColorScheme> {
    lightOraColorScheme()
}

/**
 * OrataTheme Contains functions to access the current theme values provided at the call site's position in
 * the hierarchy.
 * @author oratakashi
 * @since 03 Sep 2025
 */
object OrataTheme {
    val colors: OrataDesignColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalOrataDesignColorScheme.current
}