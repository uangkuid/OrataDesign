package com.oratakashi.design.foundation.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import com.oratakashi.design.foundation.OrataTheme

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
class OraTypography: OrataDesignTypography {
    /**
     * Returns the large display text style (57sp) using Montserrat font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun displayLarge(): TextStyle = OraTypographyTokens.DisplayLarge

    /**
     * Returns the medium display text style (45sp) using Montserrat font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun displayMedium(): TextStyle = OraTypographyTokens.DisplayMedium

    /**
     * Returns the small display text style (36sp) using Montserrat font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun displaySmall(): TextStyle = OraTypographyTokens.DisplaySmall

    /**
     * Returns the large headline text style (32sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun headlineLarge(): TextStyle = OraTypographyTokens.HeadlineLarge

    /**
     * Returns the medium headline text style (28sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun headlineMedium(): TextStyle = OraTypographyTokens.HeadlineMedium

    /**
     * Returns the small headline text style (24sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun headlineSmall(): TextStyle = OraTypographyTokens.HeadlineSmall

    /**
     * Returns the large title text style (22sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun titleLarge(): TextStyle = OraTypographyTokens.TitleLarge

    /**
     * Returns the medium title text style (16sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun titleMedium(): TextStyle = OraTypographyTokens.TitleMedium

    /**
     * Returns the small title text style (14sp) using Poppins font.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun titleSmall(): TextStyle = OraTypographyTokens.TitleSmall

    /**
     * Returns the large label text style for UI components.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun labelLarge(): TextStyle = OraTypographyTokens.LabelLarge

    /**
     * Returns the medium label text style for UI components.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun labelMedium(): TextStyle = OraTypographyTokens.LabelMedium

    /**
     * Returns the small label text style for UI components.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun labelSmall(): TextStyle = OraTypographyTokens.LabelSmall

    /**
     * Returns the large body text style for content.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun bodyLarge(): TextStyle = OraTypographyTokens.BodyLarge

    /**
     * Returns the medium body text style for content.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun bodyMedium(): TextStyle = OraTypographyTokens.BodyMedium

    /**
     * Returns the small body text style for content.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    @Composable
    override fun bodySmall(): TextStyle = OraTypographyTokens.BodySmall

    /**
     * Extension function to map OraTypographyKeyToken to OraTypography's TextStyle.
     */
    @Composable
    internal fun fromToken(token: OraTypographyKeyToken): TextStyle {
        return when (token) {
            OraTypographyKeyToken.DisplayLarge -> displayLarge()
            OraTypographyKeyToken.DisplayMedium -> displayMedium()
            OraTypographyKeyToken.DisplaySmall -> displaySmall()
            OraTypographyKeyToken.HeadlineLarge -> headlineLarge()
            OraTypographyKeyToken.HeadlineMedium -> headlineMedium()
            OraTypographyKeyToken.HeadlineSmall -> headlineSmall()
            OraTypographyKeyToken.TitleLarge -> titleLarge()
            OraTypographyKeyToken.TitleMedium -> titleMedium()
            OraTypographyKeyToken.TitleSmall -> titleSmall()
            OraTypographyKeyToken.LabelLarge -> labelLarge()
            OraTypographyKeyToken.LabelMedium -> labelMedium()
            OraTypographyKeyToken.LabelSmall -> labelSmall()
            OraTypographyKeyToken.BodyLarge -> bodyLarge()
            OraTypographyKeyToken.BodyMedium -> bodyMedium()
            OraTypographyKeyToken.BodySmall -> bodySmall()
        }
    }
}

/**
 * DefaultOraTypography is the default typography used in the Orata Design System.
 * @author oratakashi
 * @since 06 Sep 2025
 */
val DefaultOraTypography = OraTypography()

/**
 * Converts a token key to a [TextStyle] using the [OraTypography] provided by the [DefaultOraTypography].
 */
@ReadOnlyComposable
@Composable
fun OraTypographyKeyToken.toTextStyle(): TextStyle {
    return OrataTheme.typography.fromToken(this)
}
