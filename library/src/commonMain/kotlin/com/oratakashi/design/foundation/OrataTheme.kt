package com.oratakashi.design.foundation

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import com.oratakashi.design.config.PlatformConfig
import com.oratakashi.design.foundation.color.toMaterialLightColorScheme
import com.oratakashi.design.foundation.color.toMaterialDarkColorScheme
import com.oratakashi.design.foundation.color.OrataDesignColorScheme
import com.oratakashi.design.foundation.color.darkOraColorScheme
import com.oratakashi.design.foundation.color.lightOraColorScheme
import com.oratakashi.design.foundation.color.toMaterialDarkColorScheme
import com.oratakashi.design.foundation.color.toMaterialLightColorScheme
import com.oratakashi.design.foundation.color.toOrataDesignColorScheme
import com.oratakashi.design.foundation.typography.DefaultOraTypography
import com.oratakashi.design.foundation.typography.OrataDesignTypography
import com.oratakashi.design.foundation.typography.toMaterialTypography

/**
 * OrataDesignColorScheme is a class that contains all the colors used in the Orata Design System.
 */
internal val LocalOrataDesignColorScheme = staticCompositionLocalOf<com.oratakashi.design.foundation.color.OrataDesignColorScheme> {
    _root_ide_package_.com.oratakashi.design.foundation.color.lightOraColorScheme()
}

/**
 * OrataDesignTypography is a class that contains all the typography used in the Orata Design System.
 */
internal val LocalOrataTypography = staticCompositionLocalOf<com.oratakashi.design.foundation.typography.OrataDesignTypography> {
    _root_ide_package_.com.oratakashi.design.foundation.typography.DefaultOraTypography
}

/**
 * Orata Theming refers to the customization of your app to using orata design system.
 *
 * All values may be set by providing this component with the [colorScheme][com.oratakashi.design.foundation.color.OrataDesignColorScheme],
 * [typography][com.oratakashi.design.foundation.typography.OrataDesignTypography] attributes. Use this to configure the overall
 * theme of elements within this Orata Theme.
 *
 * Any values that are not set will inherit the current value from the theme, falling back to the
 * defaults if there is no parent Orata Theme. This allows using a Orata Theme at the top
 * of your application, and will override Material Theme,
 * overriding only the parts of the theme definition that need to change.
 */
@Composable
fun OrataAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    colorScheme: com.oratakashi.design.foundation.color.OrataDesignColorScheme? = null, // Made nullable to defer creation
    typography: com.oratakashi.design.foundation.typography.OrataDesignTypography = _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.typography,
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val dynamicColorScheme = _root_ide_package_.com.oratakashi.design.config.PlatformConfig.getDynamicColor(darkTheme)
    // Remember color scheme to avoid recreation on every recomposition
    val actualColorScheme = remember(darkTheme, colorScheme, dynamicColorScheme) {
        if (dynamicColorScheme != null && dynamicColor) {
            dynamicColorScheme.toOrataDesignColorScheme(isDark = darkTheme)
        } else {
            colorScheme ?: if (darkTheme) _root_ide_package_.com.oratakashi.design.foundation.color.darkOraColorScheme() else _root_ide_package_.com.oratakashi.design.foundation.color.lightOraColorScheme()
        }
    }

    // Remember material color scheme for performance
    val materialColorScheme = remember(actualColorScheme, darkTheme, dynamicColor) {
        when {
            _root_ide_package_.com.oratakashi.design.config.PlatformConfig.isDynamicColorAvailable() && dynamicColor -> {
                 dynamicColorScheme ?: if (darkTheme) {
                    actualColorScheme.toMaterialDarkColorScheme()
                } else {
                    actualColorScheme.toMaterialLightColorScheme()
                }
            }
            darkTheme -> actualColorScheme.toMaterialDarkColorScheme()
            else -> actualColorScheme.toMaterialLightColorScheme()
        }
    }

    CompositionLocalProvider(
        _root_ide_package_.com.oratakashi.design.foundation.LocalOrataDesignColorScheme provides actualColorScheme,
        _root_ide_package_.com.oratakashi.design.foundation.LocalOrataTypography provides typography
    ) {
        MaterialTheme(
            colorScheme = materialColorScheme,
            typography = typography.toMaterialTypography(),
            content = content
        )
    }
}

/**
 * OrataTheme Contains functions to access the current theme values provided at the call site's position in
 * the hierarchy.
 * @author oratakashi
 * @since 03 Sep 2025
 */
object OrataTheme {
    val colors: com.oratakashi.design.foundation.color.OrataDesignColorScheme
        @Composable
        @ReadOnlyComposable
        get() = _root_ide_package_.com.oratakashi.design.foundation.LocalOrataDesignColorScheme.current

    val typography: com.oratakashi.design.foundation.typography.OrataDesignTypography
        @Composable
        @ReadOnlyComposable
        get() = _root_ide_package_.com.oratakashi.design.foundation.LocalOrataTypography.current
}