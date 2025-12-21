package com.oratakashi.design.foundation.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.foundation.typography.fromToken

/**
 * OraTypography is a class that contains all the typography used in the Orata Design System.
 * @author oratakashi
 * @since 06 Sep 2025
 */
@Immutable
/**
 * OraTypography provides the complete typography system for the Orata Design System.
 * It implements OrataDesignTypography interface with predefined text styles for Display, Headline,
 * Title, Label, and Body variants.
 * @author oratakashi
 * @since 06 Sep 2025
 */
class OraTypography: com.oratakashi.design.foundation.typography.OrataDesignTypography {
    /**
     * Returns the large display text style (57sp) using Montserrat font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun displayLarge(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.DisplayLarge

    /**
     * Returns the medium display text style (45sp) using Montserrat font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun displayMedium(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.DisplayMedium

    /**
     * Returns the small display text style (36sp) using Montserrat font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun displaySmall(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.DisplaySmall

    /**
     * Returns the large headline text style (32sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun headlineLarge(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.HeadlineLarge

    /**
     * Returns the medium headline text style (28sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun headlineMedium(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.HeadlineMedium

    /**
     * Returns the small headline text style (24sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun headlineSmall(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.HeadlineSmall

    /**
     * Returns the large title text style (22sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun titleLarge(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.TitleLarge

    /**
     * Returns the medium title text style (16sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun titleMedium(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.TitleMedium

    /**
     * Returns the small title text style (14sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun titleSmall(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.TitleSmall

    /**
     * Returns the large label text style for UI components.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun labelLarge(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.LabelLarge

    /**
     * Returns the medium label text style for UI components.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun labelMedium(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.LabelMedium

    /**
     * Returns the small label text style for UI components.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun labelSmall(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.LabelSmall

    /**
     * Returns the large body text style for content.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun bodyLarge(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.BodyLarge

    /**
     * Returns the medium body text style for content.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun bodyMedium(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.BodyMedium

    /**
     * Returns the small body text style for content.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun bodySmall(): TextStyle = _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyTokens.BodySmall

    /**
     * Extension function to map OraTypographyKeyToken to OraTypography's TextStyle.
     */
    @Composable
    internal fun fromToken(token: com.oratakashi.design.foundation.typography.OraTypographyKeyToken): TextStyle {
        return when (token) {
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.DisplayLarge -> displayLarge()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.DisplayMedium -> displayMedium()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.DisplaySmall -> displaySmall()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.HeadlineLarge -> headlineLarge()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.HeadlineMedium -> headlineMedium()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.HeadlineSmall -> headlineSmall()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.TitleLarge -> titleLarge()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.TitleMedium -> titleMedium()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.TitleSmall -> titleSmall()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.LabelLarge -> labelLarge()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.LabelMedium -> labelMedium()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.LabelSmall -> labelSmall()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyLarge -> bodyLarge()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodyMedium -> bodyMedium()
            _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypographyKeyToken.BodySmall -> bodySmall()
        }
    }
}

/**
 * DefaultOraTypography is the default typography used in the Orata Design System.
 * @author oratakashi
 * @since 06 Sep 2025
 */
val DefaultOraTypography =
    _root_ide_package_.com.oratakashi.design.foundation.typography.OraTypography()

/**
 * Converts a token key to a [TextStyle] using the [com.oratakashi.design.foundation.typography.OraTypography] provided by the [com.oratakashi.design.foundation.typography.DefaultOraTypography].
 */
@ReadOnlyComposable
@Composable
fun com.oratakashi.design.foundation.typography.OraTypographyKeyToken.toTextStyle(): TextStyle {
    return _root_ide_package_.com.oratakashi.design.foundation.OrataTheme.typography.fromToken(this)
}
