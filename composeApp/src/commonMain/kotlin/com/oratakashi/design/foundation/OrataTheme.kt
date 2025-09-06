package com.oratakashi.design.foundation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.oratakashi.design.foundation.color.OrataDesignColorScheme
import com.oratakashi.design.foundation.color.lightOraColorScheme
import com.oratakashi.design.foundation.typography.DefaultOraTypography
import com.oratakashi.design.foundation.typography.OrataDesignTypography

/**
 * OrataDesignColorScheme is a class that contains all the colors used in the Orata Design System.
 */
internal val LocalOrataDesignColorScheme = staticCompositionLocalOf<OrataDesignColorScheme> {
    lightOraColorScheme()
}

/**
 * OrataDesignTypography is a class that contains all the typography used in the Orata Design System.
 */
internal val LocalOrataTypography = staticCompositionLocalOf<OrataDesignTypography> {
    DefaultOraTypography
}

/**
 * Orata Theming refers to the customization of your app to using orata design system.
 *
 * All values may be set by providing this component with the [colorScheme][OrataDesignColorScheme],
 * [typography][OrataDesignTypography] attributes. Use this to configure the overall
 * theme of elements within this Orata Theme.
 *
 * Any values that are not set will inherit the current value from the theme, falling back to the
 * defaults if there is no parent Orata Theme. This allows using a Orata Theme at the top
 * of your application, and will override Material Theme,
 * overriding only the parts of the theme definition that need to change.
 */
@Composable
fun OrataAppTheme(
    colorScheme: OrataDesignColorScheme = OrataTheme.colors,
    typography: OrataDesignTypography = OrataTheme.typography,
    content: @Composable () -> Unit
) {

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

    val typography: OrataDesignTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalOrataTypography.current
}