package com.oratakashi.design.app.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataTheme

internal object SnackbarIcon : DynamicIcons {
    @Composable
    /**
     * icons function for the Orata Design System.
     * @author oratakashi
     * @since 21 Nov 2025
     */
    override fun icons(): ImageVector {
        return ImageVector.Builder(
            name = "SnackbarIcon",
            defaultWidth = 280.dp,
            defaultHeight = 149.dp,
            viewportWidth = 280f,
            viewportHeight = 149f
        ).apply {
            group {
                // Background rectangle
                path(
                    fill = SolidColor(com.oratakashi.design.foundation.OrataTheme.colors.surface),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(279.5f)
                    verticalLineToRelative(149f)
                    horizontalLineToRelative(-279.5f)
                    close()
                }

                // Snackbar container with border
                path(
                    fill = SolidColor(com.oratakashi.design.foundation.OrataTheme.colors.surfaceContainer),
                    fillAlpha = 1.0f,
                    stroke = SolidColor(com.oratakashi.design.foundation.OrataTheme.colors.outlineVariant),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(58.79f, 51.5f)
                    horizontalLineTo(225.21f)
                    curveTo(229.23f, 51.5f, 232.84f, 52.38f, 235.43f, 53.77f)
                    curveTo(238.04f, 55.17f, 239.5f, 57.03f, 239.5f, 58.95f)
                    verticalLineTo(90.74f)
                    curveTo(239.5f, 92.66f, 238.04f, 94.51f, 235.43f, 95.91f)
                    curveTo(232.84f, 97.31f, 229.23f, 98.18f, 225.21f, 98.18f)
                    horizontalLineTo(58.79f)
                    curveTo(54.77f, 98.18f, 51.16f, 97.31f, 48.57f, 95.91f)
                    curveTo(45.96f, 94.51f, 44.5f, 92.66f, 44.5f, 90.74f)
                    verticalLineTo(58.95f)
                    curveTo(44.5f, 57.03f, 45.96f, 55.17f, 48.57f, 53.77f)
                    curveTo(51f, 52.46f, 54.33f, 51.61f, 58.04f, 51.51f)
                    lineTo(58.79f, 51.5f)
                    close()
                }

                // First text line placeholder
                path(
                    fill = SolidColor(com.oratakashi.design.foundation.OrataTheme.colors.outlineVariant),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(114.65f, 63f)
                    horizontalLineTo(59.35f)
                    curveTo(57.5f, 63f, 56f, 64.34f, 56f, 66f)
                    verticalLineTo(69f)
                    curveTo(56f, 70.66f, 57.5f, 72f, 59.35f, 72f)
                    horizontalLineTo(114.65f)
                    curveTo(116.5f, 72f, 118f, 70.66f, 118f, 69f)
                    verticalLineTo(66f)
                    curveTo(118f, 64.34f, 116.5f, 63f, 114.65f, 63f)
                    close()
                }

                // Second text line placeholder
                path(
                    fill = SolidColor(com.oratakashi.design.foundation.OrataTheme.colors.outlineVariant),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(140.19f, 75f)
                    horizontalLineTo(60.81f)
                    curveTo(58.15f, 75f, 56f, 76.64f, 56f, 78.67f)
                    verticalLineTo(82.33f)
                    curveTo(56f, 84.36f, 58.15f, 86f, 60.81f, 86f)
                    horizontalLineTo(140.19f)
                    curveTo(142.85f, 86f, 145f, 84.36f, 145f, 82.33f)
                    verticalLineTo(78.67f)
                    curveTo(145f, 76.64f, 142.85f, 75f, 140.19f, 75f)
                    close()
                }

                // Action button
                path(
                    fill = SolidColor(com.oratakashi.design.foundation.OrataTheme.colors.primary),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(181.5f, 66f)
                    lineTo(214.5f, 66f)
                    arcTo(8.5f, 8.5f, 0f, false, true, 223f, 74.5f)
                    lineTo(223f, 74.5f)
                    arcTo(8.5f, 8.5f, 0f, false, true, 214.5f, 83f)
                    lineTo(181.5f, 83f)
                    arcTo(8.5f, 8.5f, 0f, false, true, 173f, 74.5f)
                    lineTo(173f, 74.5f)
                    arcTo(8.5f, 8.5f, 0f, false, true, 181.5f, 66f)
                    close()
                }

                // Border frame
                path(
                    fill = SolidColor(Color.Transparent),
                    fillAlpha = 1.0f,
                    stroke = SolidColor(com.oratakashi.design.foundation.OrataTheme.colors.outlineVariant),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(274f, 0f)
                    horizontalLineTo(5.5f)
                    curveTo(2.46f, 0f, 0f, 2.46f, 0f, 5.5f)
                    verticalLineTo(143.5f)
                    curveTo(0f, 146.54f, 2.46f, 149f, 5.5f, 149f)
                    horizontalLineTo(274f)
                    curveTo(277.04f, 149f, 279.5f, 146.54f, 279.5f, 143.5f)
                    verticalLineTo(5.5f)
                    curveTo(279.5f, 2.46f, 277.04f, 0f, 274f, 0f)
                    close()
                }

                // Cursor/pointer icon
                path(
                    fill = SolidColor(com.oratakashi.design.foundation.OrataTheme.colors.primary),
                    fillAlpha = 1.0f,
                    stroke = SolidColor(com.oratakashi.design.foundation.OrataTheme.colors.onPrimary),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 4.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(214.24f, 115.19f)
                    curveTo(214.36f, 116.4f, 215.19f, 117.41f, 216.34f, 117.78f)
                    curveTo(216.41f, 117.8f, 216.46f, 117.81f, 216.47f, 117.82f)
                    curveTo(217.6f, 118.12f, 218.82f, 117.74f, 219.58f, 116.82f)
                    lineTo(227.24f, 107.63f)
                    curveTo(227.96f, 106.76f, 228.96f, 106.16f, 230.07f, 105.93f)
                    lineTo(240.88f, 103.72f)
                    curveTo(242.08f, 103.48f, 243.01f, 102.54f, 243.25f, 101.34f)
                    curveTo(243.49f, 100.14f, 242.99f, 98.92f, 241.97f, 98.24f)
                    horizontalLineTo(241.97f)
                    lineTo(241f, 97.5f)
                    lineTo(215.73f, 80.52f)
                    lineTo(215.73f, 80.52f)
                    curveTo(214.76f, 79.86f, 213.49f, 79.83f, 212.48f, 80.43f)
                    curveTo(211.46f, 81.03f, 210.9f, 82.17f, 211.02f, 83.34f)
                    verticalLineTo(83.34f)
                    lineTo(214.24f, 115.19f)
                    verticalLineTo(115.19f)
                    close()
                }
            }
        }.build()
    }
}

