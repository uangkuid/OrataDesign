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

object AlertIcon : DynamicIcons {
    @Composable
    override fun icons(): ImageVector {
        return ImageVector.Builder(
            name = "AlertIcon",
            defaultWidth = 280.dp,
            defaultHeight = 149.dp,
            viewportWidth = 280f,
            viewportHeight = 149f
        ).apply {
            // Background with rounded corners
            path(
                fill = SolidColor(OrataTheme.colors.surface),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 0.5f)
                lineTo(271.5f, 0.5f)
                arcTo(7.5f, 7.5f, 0f, false, true, 279f, 8f)
                lineTo(279f, 141f)
                arcTo(7.5f, 7.5f, 0f, false, true, 271.5f, 148.5f)
                lineTo(8f, 148.5f)
                arcTo(7.5f, 7.5f, 0f, false, true, 0.5f, 141f)
                lineTo(0.5f, 8f)
                arcTo(7.5f, 7.5f, 0f, false, true, 8f, 0.5f)
                close()
            }

            // Border stroke
            path(
                fill = SolidColor(Color.Transparent),
                fillAlpha = 1.0f,
                stroke = SolidColor(OrataTheme.colors.outlineVariant),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 0.5f)
                lineTo(271.5f, 0.5f)
                arcTo(7.5f, 7.5f, 0f, false, true, 279f, 8f)
                lineTo(279f, 141f)
                arcTo(7.5f, 7.5f, 0f, false, true, 271.5f, 148.5f)
                lineTo(8f, 148.5f)
                arcTo(7.5f, 7.5f, 0f, false, true, 0.5f, 141f)
                lineTo(0.5f, 8f)
                arcTo(7.5f, 7.5f, 0f, false, true, 8f, 0.5f)
                close()
            }

            // White rounded rectangle (alert box background)
            path(
                fill = SolidColor(OrataTheme.colors.surfaceContainerLowest),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(36f, 32f)
                curveTo(36f, 28.69f, 38.69f, 26f, 42f, 26f)
                horizontalLineTo(238f)
                curveTo(241.31f, 26f, 244f, 28.69f, 244f, 32f)
                verticalLineTo(116f)
                curveTo(244f, 119.31f, 241.31f, 122f, 238f, 122f)
                horizontalLineTo(42f)
                curveTo(38.69f, 122f, 36f, 119.31f, 36f, 116f)
                verticalLineTo(32f)
                close()
            }

            group {
                // Clip path for border effect
                path(
                    fill = SolidColor(OrataTheme.colors.primary),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(33f, 32f)
                    curveTo(33f, 28.13f, 36.13f, 25f, 40f, 25f)
                    horizontalLineTo(238f)
                    curveTo(241.87f, 25f, 245f, 28.13f, 245f, 32f)
                    horizontalLineTo(243f)
                    curveTo(243f, 29.24f, 240.76f, 27f, 238f, 27f)
                    horizontalLineTo(42f)
                    curveTo(40.34f, 27f, 39f, 29.24f, 39f, 32f)
                    horizontalLineTo(33f)
                    close()
                    moveTo(245f, 116f)
                    curveTo(245f, 119.87f, 241.87f, 123f, 238f, 123f)
                    horizontalLineTo(40f)
                    curveTo(36.13f, 123f, 33f, 119.87f, 33f, 116f)
                    horizontalLineTo(39f)
                    curveTo(39f, 118.76f, 40.34f, 121f, 42f, 121f)
                    horizontalLineTo(238f)
                    curveTo(240.76f, 121f, 243f, 118.76f, 243f, 116f)
                    horizontalLineTo(245f)
                    close()
                    moveTo(40f, 123f)
                    curveTo(36.13f, 123f, 33f, 119.87f, 33f, 116f)
                    verticalLineTo(32f)
                    curveTo(33f, 28.13f, 36.13f, 25f, 40f, 25f)
                    lineTo(42f, 27f)
                    curveTo(40.34f, 27f, 39f, 29.24f, 39f, 32f)
                    verticalLineTo(116f)
                    curveTo(39f, 118.76f, 40.34f, 121f, 42f, 121f)
                    lineTo(40f, 123f)
                    close()
                    moveTo(238f, 25f)
                    curveTo(241.87f, 25f, 245f, 28.13f, 245f, 32f)
                    verticalLineTo(116f)
                    curveTo(245f, 119.87f, 241.87f, 123f, 238f, 123f)
                    verticalLineTo(121f)
                    curveTo(240.76f, 121f, 243f, 118.76f, 243f, 116f)
                    verticalLineTo(32f)
                    curveTo(243f, 29.24f, 240.76f, 27f, 238f, 27f)
                    verticalLineTo(25f)
                    close()
                }
            }

            // Close/X icon
            path(
                fill = SolidColor(OrataTheme.colors.onSurface),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(233.3f, 37.71f)
                curveTo(232.91f, 37.32f, 232.28f, 37.32f, 231.89f, 37.71f)
                lineTo(227f, 42.59f)
                lineTo(222.11f, 37.7f)
                curveTo(221.72f, 37.31f, 221.09f, 37.31f, 220.7f, 37.7f)
                curveTo(220.31f, 38.09f, 220.31f, 38.72f, 220.7f, 39.11f)
                lineTo(225.59f, 44f)
                lineTo(220.7f, 48.89f)
                curveTo(220.31f, 49.28f, 220.31f, 49.91f, 220.7f, 50.3f)
                curveTo(221.09f, 50.69f, 221.72f, 50.69f, 222.11f, 50.3f)
                lineTo(227f, 45.41f)
                lineTo(231.89f, 50.3f)
                curveTo(232.28f, 50.69f, 232.91f, 50.69f, 233.3f, 50.3f)
                curveTo(233.69f, 49.91f, 233.69f, 49.28f, 233.3f, 48.89f)
                lineTo(228.41f, 44f)
                lineTo(233.3f, 39.11f)
                curveTo(233.68f, 38.73f, 233.68f, 38.09f, 233.3f, 37.71f)
                close()
            }

            // Top text placeholder bar
            path(
                fill = SolidColor(OrataTheme.colors.surfaceContainer),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(225.78f, 61f)
                horizontalLineTo(90.22f)
                curveTo(85.68f, 61f, 82f, 62.34f, 82f, 64f)
                verticalLineTo(67f)
                curveTo(82f, 68.66f, 85.68f, 70f, 90.22f, 70f)
                horizontalLineTo(225.78f)
                curveTo(230.32f, 70f, 234f, 68.66f, 234f, 67f)
                verticalLineTo(64f)
                curveTo(234f, 62.34f, 230.32f, 61f, 225.78f, 61f)
                close()
            }

            // Bottom text placeholder bar
            path(
                fill = SolidColor(OrataTheme.colors.surfaceContainer),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(202.13f, 76f)
                horizontalLineTo(88.86f)
                curveTo(85.07f, 76f, 82f, 77.34f, 82f, 79f)
                verticalLineTo(82f)
                curveTo(82f, 83.66f, 85.07f, 85f, 88.86f, 85f)
                horizontalLineTo(202.13f)
                curveTo(205.93f, 85f, 209f, 83.66f, 209f, 82f)
                verticalLineTo(79f)
                curveTo(209f, 77.34f, 205.93f, 76f, 202.13f, 76f)
                close()
            }

            // Title bar
            path(
                fill = SolidColor(OrataTheme.colors.primary),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(87f, 39f)
                lineTo(168f, 39f)
                arcTo(5f, 5f, 0f, false, true, 173f, 44f)
                lineTo(173f, 44f)
                arcTo(5f, 5f, 0f, false, true, 168f, 49f)
                lineTo(87f, 49f)
                arcTo(5f, 5f, 0f, false, true, 82f, 44f)
                lineTo(82f, 44f)
                arcTo(5f, 5f, 0f, false, true, 87f, 39f)
                close()
            }

            // Circular icon
            path(
                fill = SolidColor(OrataTheme.colors.primary),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(58f, 44f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, true, true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, true, true, -24f, 0f)
            }

            // "Call to Action" text path
            path(
                fill = SolidColor(OrataTheme.colors.primary),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(82.48f, 104.81f)
                curveTo(82.48f, 104f, 82.67f, 103.26f, 83.04f, 102.62f)
                curveTo(83.43f, 101.97f, 83.94f, 101.46f, 84.59f, 101.1f)
                curveTo(85.25f, 100.74f, 85.96f, 100.55f, 86.74f, 100.55f)
                curveTo(87.63f, 100.55f, 88.41f, 100.77f, 89.1f, 101.21f)
                curveTo(89.8f, 101.64f, 90.3f, 102.26f, 90.61f, 103.06f)
                horizontalLineTo(88.97f)
                curveTo(88.75f, 102.62f, 88.45f, 102.29f, 88.07f, 102.08f)
                curveTo(87.69f, 101.86f, 87.24f, 101.75f, 86.74f, 101.75f)
                curveTo(86.19f, 101.75f, 85.69f, 101.88f, 85.26f, 102.12f)
                curveTo(84.83f, 102.37f, 84.49f, 102.73f, 84.24f, 103.19f)
                curveTo(84f, 103.66f, 83.88f, 104.2f, 83.88f, 104.81f)
                curveTo(83.88f, 105.43f, 84f, 105.97f, 84.24f, 106.43f)
                curveTo(84.49f, 106.9f, 84.83f, 107.26f, 85.26f, 107.51f)
                curveTo(85.69f, 107.76f, 86.19f, 107.88f, 86.74f, 107.88f)
                curveTo(87.24f, 107.88f, 87.69f, 107.78f, 88.07f, 107.56f)
                curveTo(88.45f, 107.34f, 88.75f, 107.02f, 88.97f, 106.58f)
                horizontalLineTo(90.61f)
                curveTo(90.3f, 107.38f, 89.8f, 107.99f, 89.1f, 108.42f)
                curveTo(88.41f, 108.86f, 87.63f, 109.07f, 86.74f, 109.07f)
                curveTo(85.95f, 109.07f, 85.24f, 108.89f, 84.59f, 108.53f)
                curveTo(83.94f, 108.16f, 83.43f, 107.66f, 83.04f, 107.01f)
                curveTo(82.67f, 106.36f, 82.48f, 105.63f, 82.48f, 104.81f)
                close()
                moveTo(92.16f, 105.66f)
                curveTo(92.16f, 105f, 92.3f, 104.41f, 92.57f, 103.9f)
                curveTo(92.85f, 103.39f, 93.22f, 102.99f, 93.7f, 102.71f)
                curveTo(94.18f, 102.42f, 94.7f, 102.28f, 95.28f, 102.28f)
                curveTo(95.8f, 102.28f, 96.25f, 102.38f, 96.64f, 102.59f)
                curveTo(97.03f, 102.79f, 97.34f, 103.04f, 97.57f, 103.35f)
                verticalLineTo(102.39f)
                horizontalLineTo(98.95f)
                verticalLineTo(109f)
                horizontalLineTo(97.57f)
                verticalLineTo(108.02f)
                curveTo(97.34f, 108.33f, 97.02f, 108.59f, 96.62f, 108.8f)
                curveTo(96.22f, 109f, 95.77f, 109.11f, 95.26f, 109.11f)
                curveTo(94.69f, 109.11f, 94.17f, 108.96f, 93.7f, 108.68f)
                curveTo(93.22f, 108.38f, 92.85f, 107.97f, 92.57f, 107.45f)
                curveTo(92.3f, 106.92f, 92.16f, 106.33f, 92.16f, 105.66f)
                close()
                moveTo(97.57f, 105.69f)
                curveTo(97.57f, 105.23f, 97.48f, 104.84f, 97.28f, 104.5f)
                curveTo(97.1f, 104.16f, 96.86f, 103.91f, 96.55f, 103.73f)
                curveTo(96.25f, 103.56f, 95.92f, 103.47f, 95.57f, 103.47f)
                curveTo(95.22f, 103.47f, 94.89f, 103.56f, 94.58f, 103.73f)
                curveTo(94.28f, 103.9f, 94.03f, 104.15f, 93.84f, 104.49f)
                curveTo(93.66f, 104.82f, 93.56f, 105.21f, 93.56f, 105.66f)
                curveTo(93.56f, 106.12f, 93.66f, 106.52f, 93.84f, 106.86f)
                curveTo(94.03f, 107.21f, 94.28f, 107.47f, 94.58f, 107.66f)
                curveTo(94.9f, 107.83f, 95.22f, 107.92f, 95.57f, 107.92f)
                curveTo(95.92f, 107.92f, 96.25f, 107.83f, 96.55f, 107.66f)
                curveTo(96.86f, 107.48f, 97.1f, 107.22f, 97.28f, 106.89f)
                curveTo(97.48f, 106.54f, 97.57f, 106.14f, 97.57f, 105.69f)
                close()
                moveTo(102.52f, 100.12f)
                verticalLineTo(109f)
                horizontalLineTo(101.15f)
                verticalLineTo(100.12f)
                horizontalLineTo(102.52f)
                close()
                moveTo(106.08f, 100.12f)
                verticalLineTo(109f)
                horizontalLineTo(104.71f)
                verticalLineTo(100.12f)
                horizontalLineTo(106.08f)
                close()
                moveTo(113.39f, 103.5f)
                verticalLineTo(107.16f)
                curveTo(113.39f, 107.41f, 113.45f, 107.59f, 113.56f, 107.7f)
                curveTo(113.68f, 107.81f, 113.88f, 107.86f, 114.16f, 107.86f)
                horizontalLineTo(115f)
                verticalLineTo(109f)
                horizontalLineTo(113.92f)
                curveTo(113.3f, 109f, 112.83f, 108.86f, 112.5f, 108.57f)
                curveTo(112.17f, 108.28f, 112.01f, 107.81f, 112.01f, 107.16f)
                verticalLineTo(103.5f)
                horizontalLineTo(111.23f)
                verticalLineTo(102.39f)
                horizontalLineTo(112.01f)
                verticalLineTo(100.74f)
                horizontalLineTo(113.39f)
                verticalLineTo(102.39f)
                horizontalLineTo(115f)
                verticalLineTo(103.5f)
                horizontalLineTo(113.39f)
                close()
                moveTo(119.53f, 109.11f)
                curveTo(118.9f, 109.11f, 118.34f, 108.97f, 117.83f, 108.69f)
                curveTo(117.33f, 108.4f, 116.93f, 108f, 116.65f, 107.49f)
                curveTo(116.36f, 106.97f, 116.21f, 106.37f, 116.21f, 105.69f)
                curveTo(116.21f, 105.02f, 116.36f, 104.42f, 116.66f, 103.9f)
                curveTo(116.96f, 103.38f, 117.36f, 102.98f, 117.87f, 102.7f)
                curveTo(118.38f, 102.42f, 118.96f, 102.28f, 119.59f, 102.28f)
                curveTo(120.22f, 102.28f, 120.79f, 102.42f, 121.3f, 102.7f)
                curveTo(121.82f, 102.98f, 122.22f, 103.38f, 122.51f, 103.9f)
                curveTo(122.81f, 104.42f, 122.96f, 105.02f, 122.96f, 105.69f)
                curveTo(122.96f, 106.36f, 122.81f, 106.96f, 122.5f, 107.48f)
                curveTo(122.2f, 108f, 121.78f, 108.4f, 121.25f, 108.69f)
                curveTo(120.74f, 108.97f, 120.16f, 109.11f, 119.53f, 109.11f)
                close()
                moveTo(119.53f, 107.92f)
                curveTo(119.88f, 107.92f, 120.21f, 107.84f, 120.51f, 107.67f)
                curveTo(120.82f, 107.5f, 121.07f, 107.25f, 121.27f, 106.91f)
                curveTo(121.46f, 106.58f, 121.56f, 106.17f, 121.56f, 105.69f)
                curveTo(121.56f, 105.21f, 121.46f, 104.8f, 121.28f, 104.48f)
                curveTo(121.1f, 104.14f, 120.85f, 103.89f, 120.55f, 103.72f)
                curveTo(120.24f, 103.55f, 119.92f, 103.47f, 119.56f, 103.47f)
                curveTo(119.21f, 103.47f, 118.88f, 103.55f, 118.58f, 103.72f)
                curveTo(118.28f, 103.89f, 118.05f, 104.14f, 117.87f, 104.48f)
                curveTo(117.69f, 104.8f, 117.61f, 105.21f, 117.61f, 105.69f)
                curveTo(117.61f, 106.4f, 117.79f, 106.95f, 118.15f, 107.34f)
                curveTo(118.51f, 107.73f, 118.97f, 107.92f, 119.53f, 107.92f)
                close()
                moveTo(133.26f, 107.3f)
                horizontalLineTo(129.76f)
                lineTo(129.16f, 109f)
                horizontalLineTo(127.74f)
                lineTo(130.73f, 100.65f)
                horizontalLineTo(132.31f)
                lineTo(135.3f, 109f)
                horizontalLineTo(133.86f)
                lineTo(133.26f, 107.3f)
                close()
                moveTo(132.87f, 106.18f)
                lineTo(131.52f, 102.3f)
                lineTo(130.15f, 106.18f)
                horizontalLineTo(132.87f)
                close()
                moveTo(136.54f, 105.69f)
                curveTo(136.54f, 105.01f, 136.68f, 104.41f, 136.95f, 103.9f)
                curveTo(137.23f, 103.38f, 137.61f, 102.98f, 138.1f, 102.7f)
                curveTo(138.59f, 102.42f, 139.15f, 102.28f, 139.78f, 102.28f)
                curveTo(140.58f, 102.28f, 141.24f, 102.47f, 141.76f, 102.86f)
                curveTo(142.29f, 103.23f, 142.64f, 103.77f, 142.83f, 104.48f)
                horizontalLineTo(141.35f)
                curveTo(141.23f, 104.15f, 141.04f, 103.89f, 140.78f, 103.71f)
                curveTo(140.51f, 103.52f, 140.18f, 103.43f, 139.78f, 103.43f)
                curveTo(139.22f, 103.43f, 138.77f, 103.63f, 138.44f, 104.03f)
                curveTo(138.11f, 104.42f, 137.94f, 104.98f, 137.94f, 105.69f)
                curveTo(137.94f, 106.4f, 138.11f, 106.96f, 138.44f, 107.36f)
                curveTo(138.77f, 107.76f, 139.22f, 107.96f, 139.78f, 107.96f)
                curveTo(140.57f, 107.96f, 141.1f, 107.61f, 141.35f, 106.91f)
                horizontalLineTo(142.83f)
                curveTo(142.64f, 107.58f, 142.28f, 108.12f, 141.75f, 108.52f)
                curveTo(141.22f, 108.91f, 140.56f, 109.11f, 139.78f, 109.11f)
                curveTo(139.15f, 109.11f, 138.59f, 108.97f, 138.1f, 108.69f)
                curveTo(137.61f, 108.4f, 137.23f, 108f, 136.95f, 107.49f)
                curveTo(136.68f, 106.97f, 136.54f, 106.37f, 136.54f, 105.69f)
                close()
                moveTo(146.19f, 103.5f)
                verticalLineTo(107.16f)
                curveTo(146.19f, 107.41f, 146.24f, 107.59f, 146.35f, 107.7f)
                curveTo(146.48f, 107.81f, 146.68f, 107.86f, 146.96f, 107.86f)
                horizontalLineTo(147.79f)
                verticalLineTo(109f)
                horizontalLineTo(146.71f)
                curveTo(146.1f, 109f, 145.63f, 108.86f, 145.3f, 108.57f)
                curveTo(144.97f, 108.28f, 144.81f, 107.81f, 144.81f, 107.16f)
                verticalLineTo(103.5f)
                horizontalLineTo(144.03f)
                verticalLineTo(102.39f)
                horizontalLineTo(144.81f)
                verticalLineTo(100.74f)
                horizontalLineTo(146.19f)
                verticalLineTo(102.39f)
                horizontalLineTo(147.79f)
                verticalLineTo(103.5f)
                horizontalLineTo(146.19f)
                close()
                moveTo(150.15f, 101.51f)
                curveTo(149.9f, 101.51f, 149.7f, 101.43f, 149.53f, 101.26f)
                curveTo(149.36f, 101.09f, 149.28f, 100.88f, 149.28f, 100.64f)
                curveTo(149.28f, 100.39f, 149.36f, 100.18f, 149.53f, 100.01f)
                curveTo(149.7f, 99.84f, 149.9f, 99.76f, 150.15f, 99.76f)
                curveTo(150.39f, 99.76f, 150.6f, 99.84f, 150.76f, 100.01f)
                curveTo(150.93f, 100.18f, 151.02f, 100.39f, 151.02f, 100.64f)
                curveTo(151.02f, 100.88f, 150.93f, 101.09f, 150.76f, 101.26f)
                curveTo(150.6f, 101.43f, 150.39f, 101.51f, 150.15f, 101.51f)
                close()
                moveTo(150.82f, 102.39f)
                verticalLineTo(109f)
                horizontalLineTo(149.46f)
                verticalLineTo(102.39f)
                horizontalLineTo(150.82f)
                close()
                moveTo(155.89f, 109.11f)
                curveTo(155.26f, 109.11f, 154.7f, 108.97f, 154.2f, 108.69f)
                curveTo(153.69f, 108.4f, 153.3f, 108f, 153.01f, 107.49f)
                curveTo(152.72f, 106.97f, 152.58f, 106.37f, 152.58f, 105.69f)
                curveTo(152.58f, 105.02f, 152.72f, 104.42f, 153.02f, 103.9f)
                curveTo(153.32f, 103.38f, 153.72f, 102.98f, 154.23f, 102.7f)
                curveTo(154.74f, 102.42f, 155.32f, 102.28f, 155.95f, 102.28f)
                curveTo(156.58f, 102.28f, 157.15f, 102.42f, 157.66f, 102.7f)
                curveTo(158.18f, 102.98f, 158.58f, 103.38f, 158.88f, 103.9f)
                curveTo(159.17f, 104.42f, 159.32f, 105.02f, 159.32f, 105.69f)
                curveTo(159.32f, 106.36f, 159.17f, 106.96f, 158.86f, 107.48f)
                curveTo(158.56f, 108f, 158.14f, 108.4f, 157.62f, 108.69f)
                curveTo(157.1f, 108.97f, 156.52f, 109.11f, 155.89f, 109.11f)
                close()
                moveTo(155.89f, 107.92f)
                curveTo(156.24f, 107.92f, 156.57f, 107.84f, 156.87f, 107.67f)
                curveTo(157.18f, 107.5f, 157.44f, 107.25f, 157.63f, 106.91f)
                curveTo(157.82f, 106.58f, 157.92f, 106.17f, 157.92f, 105.69f)
                curveTo(157.92f, 105.21f, 157.82f, 104.8f, 157.64f, 104.48f)
                curveTo(157.46f, 104.14f, 157.21f, 103.89f, 156.91f, 103.72f)
                curveTo(156.6f, 103.55f, 156.28f, 103.47f, 155.92f, 103.47f)
                curveTo(155.57f, 103.47f, 155.24f, 103.55f, 154.94f, 103.72f)
                curveTo(154.64f, 103.89f, 154.41f, 104.14f, 154.23f, 104.48f)
                curveTo(154.06f, 104.8f, 153.97f, 105.21f, 153.97f, 105.69f)
                curveTo(153.97f, 106.4f, 154.15f, 106.95f, 154.51f, 107.34f)
                curveTo(154.88f, 107.73f, 155.34f, 107.92f, 155.89f, 107.92f)
                close()
                moveTo(164.41f, 102.28f)
                curveTo(164.93f, 102.28f, 165.39f, 102.39f, 165.8f, 102.6f)
                curveTo(166.22f, 102.82f, 166.54f, 103.14f, 166.77f, 103.56f)
                curveTo(167f, 103.99f, 167.12f, 104.5f, 167.12f, 105.1f)
                verticalLineTo(109f)
                horizontalLineTo(165.76f)
                verticalLineTo(105.3f)
                curveTo(165.76f, 104.71f, 165.62f, 104.26f, 165.32f, 103.95f)
                curveTo(165.02f, 103.63f, 164.62f, 103.47f, 164.11f, 103.47f)
                curveTo(163.6f, 103.47f, 163.19f, 103.63f, 162.88f, 103.95f)
                curveTo(162.59f, 104.26f, 162.44f, 104.71f, 162.44f, 105.3f)
                verticalLineTo(109f)
                horizontalLineTo(161.07f)
                verticalLineTo(102.39f)
                horizontalLineTo(162.44f)
                verticalLineTo(103.14f)
                curveTo(162.66f, 102.87f, 162.95f, 102.66f, 163.29f, 102.51f)
                curveTo(163.64f, 102.36f, 164.02f, 102.28f, 164.41f, 102.28f)
                close()
            }
        }.build()
    }
}

