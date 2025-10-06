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

object ButtonIcon : DynamicIcons {
    @Composable
    override fun icons(): ImageVector  {
        return ImageVector.Builder(
            name = "ButtonIcon",
            defaultWidth = 281.dp,
            defaultHeight = 151.dp,
            viewportWidth = 281f,
            viewportHeight = 151f
        ).apply {
            // Background rectangle
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
                moveTo(1f, 1f)
                horizontalLineToRelative(279.5f)
                verticalLineToRelative(149f)
                horizontalLineToRelative(-279.5f)
                close()
            }

            // Border
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
                moveTo(275f, 1f)
                horizontalLineTo(6.5f)
                curveTo(3.46f, 1f, 1f, 3.46f, 1f, 6.5f)
                verticalLineTo(144.5f)
                curveTo(1f, 147.54f, 3.46f, 150f, 6.5f, 150f)
                horizontalLineTo(275f)
                curveTo(278.04f, 150f, 280.5f, 147.54f, 280.5f, 144.5f)
                verticalLineTo(6.5f)
                curveTo(280.5f, 3.46f, 278.04f, 1f, 275f, 1f)
                close()
            }

            // Group with button and "Action" text
            group {
                // Clip path for rounded button
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
                    moveTo(105f, 47f)
                    lineTo(177f, 47f)
                    arcTo(28f, 28f, 0f, false, true, 205f, 75f)
                    lineTo(205f, 75f)
                    arcTo(28f, 28f, 0f, false, true, 177f, 103f)
                    lineTo(105f, 103f)
                    arcTo(28f, 28f, 0f, false, true, 77f, 75f)
                    lineTo(77f, 75f)
                    arcTo(28f, 28f, 0f, false, true, 105f, 47f)
                    close()
                }

                // Star icon with circle
                path(
                    fill = SolidColor(OrataTheme.colors.onPrimary),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(109f, 81f)
                    lineTo(113f, 77.95f)
                    lineTo(117f, 81f)
                    lineTo(115.5f, 76.05f)
                    lineTo(119.5f, 73.2f)
                    horizontalLineTo(114.6f)
                    lineTo(113f, 68f)
                    lineTo(111.4f, 73.2f)
                    horizontalLineTo(106.5f)
                    lineTo(110.5f, 76.05f)
                    lineTo(109f, 81f)
                    close()
                    moveTo(113f, 85f)
                    curveTo(111.62f, 85f, 110.32f, 84.74f, 109.1f, 84.21f)
                    curveTo(107.88f, 83.69f, 106.82f, 82.97f, 105.93f, 82.07f)
                    curveTo(105.03f, 81.18f, 104.31f, 80.12f, 103.79f, 78.9f)
                    curveTo(103.26f, 77.68f, 103f, 76.38f, 103f, 75f)
                    curveTo(103f, 73.62f, 103.26f, 72.32f, 103.79f, 71.1f)
                    curveTo(104.31f, 69.88f, 105.03f, 68.82f, 105.93f, 67.93f)
                    curveTo(106.82f, 67.03f, 107.88f, 66.31f, 109.1f, 65.79f)
                    curveTo(110.32f, 65.26f, 111.62f, 65f, 113f, 65f)
                    curveTo(114.38f, 65f, 115.68f, 65.26f, 116.9f, 65.79f)
                    curveTo(118.12f, 66.31f, 119.18f, 67.03f, 120.07f, 67.93f)
                    curveTo(120.97f, 68.82f, 121.69f, 69.88f, 122.21f, 71.1f)
                    curveTo(122.74f, 72.32f, 123f, 73.62f, 123f, 75f)
                    curveTo(123f, 76.38f, 122.74f, 77.68f, 122.21f, 78.9f)
                    curveTo(121.69f, 80.12f, 120.97f, 81.18f, 120.07f, 82.07f)
                    curveTo(119.18f, 82.97f, 118.12f, 83.69f, 116.9f, 84.21f)
                    curveTo(115.68f, 84.74f, 114.38f, 85f, 113f, 85f)
                    close()
                }

                // "Action" text
                path(
                    fill = SolidColor(OrataTheme.colors.onPrimary),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(138.59f, 70.14f)
                    lineTo(135.19f, 80f)
                    horizontalLineTo(133.13f)
                    lineTo(137.41f, 68.63f)
                    horizontalLineTo(138.73f)
                    lineTo(138.59f, 70.14f)
                    close()
                    moveTo(141.43f, 80f)
                    lineTo(138.02f, 70.14f)
                    lineTo(137.88f, 68.63f)
                    horizontalLineTo(139.2f)
                    lineTo(143.49f, 80f)
                    horizontalLineTo(141.43f)
                    close()
                    moveTo(141.27f, 75.78f)
                    verticalLineTo(77.34f)
                    horizontalLineTo(135.08f)
                    verticalLineTo(75.78f)
                    horizontalLineTo(141.27f)
                    close()
                    moveTo(148.18f, 78.66f)
                    curveTo(148.49f, 78.66f, 148.76f, 78.6f, 149.01f, 78.48f)
                    curveTo(149.26f, 78.35f, 149.46f, 78.18f, 149.61f, 77.96f)
                    curveTo(149.77f, 77.74f, 149.85f, 77.49f, 149.87f, 77.2f)
                    horizontalLineTo(151.64f)
                    curveTo(151.63f, 77.75f, 151.47f, 78.25f, 151.16f, 78.7f)
                    curveTo(150.85f, 79.14f, 150.43f, 79.5f, 149.92f, 79.77f)
                    curveTo(149.4f, 80.03f, 148.83f, 80.16f, 148.21f, 80.16f)
                    curveTo(147.56f, 80.16f, 147f, 80.05f, 146.52f, 79.83f)
                    curveTo(146.04f, 79.6f, 145.64f, 79.3f, 145.32f, 78.91f)
                    curveTo(145f, 78.52f, 144.76f, 78.07f, 144.6f, 77.55f)
                    curveTo(144.45f, 77.04f, 144.37f, 76.5f, 144.37f, 75.91f)
                    verticalLineTo(75.64f)
                    curveTo(144.37f, 75.06f, 144.45f, 74.51f, 144.6f, 74f)
                    curveTo(144.76f, 73.48f, 145f, 73.03f, 145.32f, 72.64f)
                    curveTo(145.64f, 72.25f, 146.04f, 71.95f, 146.52f, 71.73f)
                    curveTo(147f, 71.5f, 147.56f, 71.39f, 148.2f, 71.39f)
                    curveTo(148.87f, 71.39f, 149.47f, 71.53f, 149.98f, 71.8f)
                    curveTo(150.49f, 72.06f, 150.89f, 72.43f, 151.18f, 72.91f)
                    curveTo(151.48f, 73.39f, 151.63f, 73.94f, 151.64f, 74.57f)
                    horizontalLineTo(149.87f)
                    curveTo(149.85f, 74.26f, 149.77f, 73.98f, 149.63f, 73.73f)
                    curveTo(149.5f, 73.47f, 149.31f, 73.27f, 149.06f, 73.12f)
                    curveTo(148.81f, 72.97f, 148.52f, 72.89f, 148.17f, 72.89f)
                    curveTo(147.79f, 72.89f, 147.48f, 72.97f, 147.23f, 73.13f)
                    curveTo(146.98f, 73.28f, 146.78f, 73.48f, 146.64f, 73.75f)
                    curveTo(146.5f, 74.01f, 146.4f, 74.3f, 146.34f, 74.63f)
                    curveTo(146.28f, 74.96f, 146.25f, 75.29f, 146.25f, 75.64f)
                    verticalLineTo(75.91f)
                    curveTo(146.25f, 76.26f, 146.28f, 76.6f, 146.34f, 76.93f)
                    curveTo(146.4f, 77.26f, 146.49f, 77.55f, 146.63f, 77.81f)
                    curveTo(146.78f, 78.07f, 146.98f, 78.27f, 147.23f, 78.43f)
                    curveTo(147.48f, 78.58f, 147.8f, 78.66f, 148.18f, 78.66f)
                    close()
                    moveTo(157.11f, 71.55f)
                    verticalLineTo(72.92f)
                    horizontalLineTo(152.35f)
                    verticalLineTo(71.55f)
                    horizontalLineTo(157.11f)
                    close()
                    moveTo(153.72f, 69.48f)
                    horizontalLineTo(155.6f)
                    verticalLineTo(77.66f)
                    curveTo(155.6f, 77.92f, 155.64f, 78.13f, 155.71f, 78.27f)
                    curveTo(155.79f, 78.4f, 155.9f, 78.49f, 156.03f, 78.54f)
                    curveTo(156.17f, 78.59f, 156.33f, 78.61f, 156.51f, 78.61f)
                    curveTo(156.64f, 78.61f, 156.77f, 78.6f, 156.89f, 78.59f)
                    curveTo(157.01f, 78.57f, 157.1f, 78.55f, 157.18f, 78.54f)
                    lineTo(157.18f, 79.98f)
                    curveTo(157.03f, 80.02f, 156.84f, 80.07f, 156.64f, 80.1f)
                    curveTo(156.43f, 80.14f, 156.2f, 80.16f, 155.93f, 80.16f)
                    curveTo(155.5f, 80.16f, 155.12f, 80.08f, 154.78f, 79.93f)
                    curveTo(154.45f, 79.77f, 154.19f, 79.52f, 154f, 79.17f)
                    curveTo(153.82f, 78.82f, 153.72f, 78.36f, 153.72f, 77.78f)
                    verticalLineTo(69.48f)
                    close()
                    moveTo(160.73f, 71.55f)
                    verticalLineTo(80f)
                    horizontalLineTo(158.84f)
                    verticalLineTo(71.55f)
                    horizontalLineTo(160.73f)
                    close()
                    moveTo(158.72f, 69.33f)
                    curveTo(158.72f, 69.04f, 158.81f, 68.8f, 159f, 68.62f)
                    curveTo(159.19f, 68.42f, 159.46f, 68.33f, 159.79f, 68.33f)
                    curveTo(160.13f, 68.33f, 160.39f, 68.42f, 160.58f, 68.62f)
                    curveTo(160.78f, 68.8f, 160.87f, 69.04f, 160.87f, 69.33f)
                    curveTo(160.87f, 69.61f, 160.78f, 69.84f, 160.58f, 70.03f)
                    curveTo(160.39f, 70.22f, 160.13f, 70.31f, 159.79f, 70.31f)
                    curveTo(159.46f, 70.31f, 159.19f, 70.22f, 159f, 70.03f)
                    curveTo(158.81f, 69.84f, 158.72f, 69.61f, 158.72f, 69.33f)
                    close()
                    moveTo(162.58f, 75.87f)
                    verticalLineTo(75.69f)
                    curveTo(162.58f, 75.08f, 162.67f, 74.51f, 162.85f, 73.99f)
                    curveTo(163.03f, 73.47f, 163.28f, 73.01f, 163.62f, 72.63f)
                    curveTo(163.95f, 72.23f, 164.37f, 71.93f, 164.85f, 71.72f)
                    curveTo(165.34f, 71.5f, 165.89f, 71.39f, 166.51f, 71.39f)
                    curveTo(167.13f, 71.39f, 167.68f, 71.5f, 168.16f, 71.72f)
                    curveTo(168.65f, 71.93f, 169.07f, 72.23f, 169.4f, 72.63f)
                    curveTo(169.74f, 73.01f, 170f, 73.47f, 170.18f, 73.99f)
                    curveTo(170.35f, 74.51f, 170.44f, 75.08f, 170.44f, 75.69f)
                    verticalLineTo(75.87f)
                    curveTo(170.44f, 76.48f, 170.35f, 77.04f, 170.18f, 77.56f)
                    curveTo(170f, 78.08f, 169.74f, 78.54f, 169.4f, 78.93f)
                    curveTo(169.07f, 79.32f, 168.65f, 79.62f, 168.17f, 79.84f)
                    curveTo(167.69f, 80.05f, 167.14f, 80.16f, 166.52f, 80.16f)
                    curveTo(165.9f, 80.16f, 165.35f, 80.05f, 164.86f, 79.84f)
                    curveTo(164.37f, 79.62f, 163.96f, 79.32f, 163.62f, 78.93f)
                    curveTo(163.29f, 78.54f, 163.03f, 78.08f, 162.85f, 77.56f)
                    curveTo(162.67f, 77.04f, 162.58f, 76.48f, 162.58f, 75.87f)
                    close()
                    moveTo(164.47f, 75.69f)
                    verticalLineTo(75.87f)
                    curveTo(164.47f, 76.25f, 164.51f, 76.61f, 164.58f, 76.95f)
                    curveTo(164.66f, 77.28f, 164.79f, 77.58f, 164.95f, 77.84f)
                    curveTo(165.12f, 78.09f, 165.33f, 78.29f, 165.59f, 78.44f)
                    curveTo(165.85f, 78.58f, 166.16f, 78.66f, 166.52f, 78.66f)
                    curveTo(166.87f, 78.66f, 167.17f, 78.58f, 167.43f, 78.44f)
                    curveTo(167.69f, 78.29f, 167.9f, 78.09f, 168.07f, 77.84f)
                    curveTo(168.24f, 77.58f, 168.36f, 77.28f, 168.44f, 76.95f)
                    curveTo(168.52f, 76.61f, 168.56f, 76.25f, 168.56f, 75.87f)
                    verticalLineTo(75.69f)
                    curveTo(168.56f, 75.31f, 168.52f, 74.96f, 168.44f, 74.63f)
                    curveTo(168.36f, 74.29f, 168.23f, 73.99f, 168.06f, 73.73f)
                    curveTo(167.89f, 73.47f, 167.68f, 73.26f, 167.42f, 73.12f)
                    curveTo(167.16f, 72.97f, 166.86f, 72.89f, 166.51f, 72.89f)
                    curveTo(166.15f, 72.89f, 165.85f, 72.97f, 165.58f, 73.12f)
                    curveTo(165.33f, 73.26f, 165.12f, 73.47f, 164.95f, 73.73f)
                    curveTo(164.79f, 73.99f, 164.66f, 74.29f, 164.58f, 74.63f)
                    curveTo(164.51f, 74.96f, 164.47f, 75.31f, 164.47f, 75.69f)
                    close()
                    moveTo(174.04f, 73.35f)
                    verticalLineTo(80f)
                    horizontalLineTo(172.16f)
                    verticalLineTo(71.55f)
                    horizontalLineTo(173.93f)
                    lineTo(174.04f, 73.35f)
                    close()
                    moveTo(173.7f, 75.46f)
                    lineTo(173.09f, 75.45f)
                    curveTo(173.1f, 74.85f, 173.18f, 74.3f, 173.34f, 73.8f)
                    curveTo(173.51f, 73.3f, 173.74f, 72.88f, 174.03f, 72.52f)
                    curveTo(174.33f, 72.16f, 174.68f, 71.88f, 175.09f, 71.69f)
                    curveTo(175.51f, 71.49f, 175.96f, 71.39f, 176.47f, 71.39f)
                    curveTo(176.88f, 71.39f, 177.24f, 71.45f, 177.57f, 71.56f)
                    curveTo(177.9f, 71.67f, 178.19f, 71.85f, 178.42f, 72.1f)
                    curveTo(178.66f, 72.35f, 178.84f, 72.68f, 178.97f, 73.08f)
                    curveTo(179.09f, 73.47f, 179.16f, 73.96f, 179.16f, 74.54f)
                    verticalLineTo(80f)
                    horizontalLineTo(177.27f)
                    verticalLineTo(74.53f)
                    curveTo(177.27f, 74.13f, 177.21f, 73.8f, 177.09f, 73.57f)
                    curveTo(176.97f, 73.33f, 176.8f, 73.16f, 176.58f, 73.06f)
                    curveTo(176.36f, 72.96f, 176.09f, 72.91f, 175.76f, 72.91f)
                    curveTo(175.43f, 72.91f, 175.15f, 72.97f, 174.89f, 73.11f)
                    curveTo(174.63f, 73.24f, 174.42f, 73.43f, 174.24f, 73.66f)
                    curveTo(174.07f, 73.9f, 173.94f, 74.17f, 173.84f, 74.48f)
                    curveTo(173.75f, 74.78f, 173.7f, 75.11f, 173.7f, 75.46f)
                    close()
                }
            }

            // Cursor/pointer icon at bottom right
            path(
                fill = SolidColor(OrataTheme.colors.primary),
                fillAlpha = 1.0f,
                stroke = SolidColor(OrataTheme.colors.onPrimary),
                strokeAlpha = 1.0f,
                strokeLineWidth = 4.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(172.24f, 122.19f)
                curveTo(172.36f, 123.4f, 173.19f, 124.41f, 174.34f, 124.78f)
                curveTo(174.41f, 124.8f, 174.46f, 124.81f, 174.47f, 124.82f)
                curveTo(175.6f, 125.12f, 176.82f, 124.74f, 177.58f, 123.82f)
                lineTo(185.24f, 114.63f)
                curveTo(185.96f, 113.76f, 186.96f, 113.16f, 188.07f, 112.93f)
                lineTo(198.88f, 110.72f)
                curveTo(200.08f, 110.48f, 201.01f, 109.54f, 201.25f, 108.34f)
                curveTo(201.49f, 107.14f, 200.99f, 105.92f, 199.97f, 105.24f)
                horizontalLineTo(199.97f)
                curveTo(199.97f, 105.24f, 199.97f, 105.24f, 199.97f, 105.24f)
                lineTo(173.73f, 87.52f)
                curveTo(173.73f, 87.52f, 173.73f, 87.52f, 173.73f, 87.52f)
                curveTo(172.76f, 86.86f, 171.49f, 86.83f, 170.48f, 87.43f)
                curveTo(169.46f, 88.03f, 168.9f, 89.17f, 169.02f, 90.34f)
                curveTo(169.02f, 90.34f, 169.02f, 90.34f, 169.02f, 90.34f)
                lineTo(172.24f, 122.19f)
                curveTo(172.24f, 122.19f, 172.24f, 122.19f, 172.24f, 122.19f)
                close()
            }
        }.build()
    }

}

