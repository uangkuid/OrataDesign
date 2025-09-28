package com.oratakashi.design.foundation.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * OraTypographyTokens is a object that contains all the typography used in the Orata Design System.
 * @author oratakashi
 * @since 04 Sep 2025
 */
object OraTypographyTokens {

    val DisplayLarge: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 57.sp,
            lineHeight = 64.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.montserrat()
        )

    val DisplayLargeEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 57.sp,
            lineHeight = 64.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.montserrat()
        )

    val DisplayMedium: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 45.sp,
            lineHeight = 52.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.montserrat()
        )

    val DisplayMediumEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 45.sp,
            lineHeight = 52.sp,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.montserrat()
        )

    val DisplaySmall: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 36.sp,
            lineHeight = 44.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.montserrat()
        )

    val DisplaySmallEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 36.sp,
            lineHeight = 44.sp,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.montserrat()
        )

    val HeadlineLarge: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 32.sp,
            lineHeight = 40.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val HeadlineLargeEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 32.sp,
            lineHeight = 40.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val HeadlineMedium: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 28.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val HeadlineMediumEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 28.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val HeadlineSmall: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val HeadlineSmallEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val TitleLarge: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 22.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val TitleLargeEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 22.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val TitleMedium: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val TitleMediumEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val TitleSmall: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )


    val TitleSmallEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val LabelLarge: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val LabelLargeEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val LabelMedium: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val LabelMediumEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val LabelSmall: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 11.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val LabelSmallEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 11.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val BodyLarge: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val BodyLargeEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val BodyMedium: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val BodyMediumEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val BodySmall: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )

    val BodySmallEmphasized: TextStyle
        @Composable
        get() = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            fontFamily = OrataFontFamily.poppins()
        )
}