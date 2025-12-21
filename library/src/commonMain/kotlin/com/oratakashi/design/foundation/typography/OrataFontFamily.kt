package com.oratakashi.design.foundation.typography

import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.oratakashi.design.resources.Res
import com.oratakashi.design.resources.montserrat_medium
import com.oratakashi.design.resources.montserrat_regular
import com.oratakashi.design.resources.montserrat_semibold
import com.oratakashi.design.resources.poppins_medium
import com.oratakashi.design.resources.poppins_regular
import com.oratakashi.design.resources.poppins_semibold
import org.jetbrains.compose.resources.ExperimentalResourceApi

/**
 * OrataFontFamily is a object that contains all the font family used in the Orata Design System.
 * @author oratakashi
 * @since 04 Sep 2025
 */
object OrataFontFamily {
    @OptIn(ExperimentalResourceApi::class)
    @Composable
    /**
     * poppins function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun poppins() = FontFamily(
        Font(Res.font.poppins_regular, FontWeight.Normal),
        Font(Res.font.poppins_medium, FontWeight.Medium),
        Font(Res.font.poppins_semibold, FontWeight.SemiBold),
    )

    @OptIn(ExperimentalResourceApi::class)
    @Composable
    /**
     * montserrat function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    fun montserrat() = FontFamily(
        Font(Res.font.montserrat_regular, FontWeight.Normal),
        Font(Res.font.montserrat_medium, FontWeight.Medium),
        Font(Res.font.montserrat_semibold, FontWeight.SemiBold)
    )
}