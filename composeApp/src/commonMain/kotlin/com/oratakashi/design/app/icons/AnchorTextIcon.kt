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

internal object AnchorTextIcon : DynamicIcons {
    @Composable
    /**
     * icons function for the Orata Design System.
     * @author oratakashi
     * @since 16 Nov 2025
     */
    override fun icons(): ImageVector {
        return ImageVector.Builder(
            name = "AnchorTextIcon",
            defaultWidth = 280.dp,
            defaultHeight = 149.dp,
            viewportWidth = 280f,
            viewportHeight = 149f
        ).apply {
            group {
                // Clip path
                path(
                    fill = SolidColor(Color.Transparent),
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

                // Background
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
                    moveTo(0f, 0f)
                    horizontalLineToRelative(279.5f)
                    verticalLineToRelative(149f)
                    horizontalLineToRelative(-279.5f)
                    close()
                }

                // Input field background
                path(
                    fill = SolidColor(OrataTheme.colors.surfaceContainerLowest),
                    fillAlpha = 1.0f,
                    stroke = SolidColor(OrataTheme.colors.surfaceContainer),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(205.94f, 46.5f)
                    horizontalLineTo(295.31f)
                    curveTo(299.42f, 46.5f, 302.76f, 49.83f, 302.76f, 53.95f)
                    verticalLineTo(85.74f)
                    curveTo(302.76f, 89.85f, 299.42f, 93.18f, 295.31f, 93.18f)
                    horizontalLineTo(205.94f)
                    curveTo(201.83f, 93.18f, 198.5f, 89.85f, 198.5f, 85.74f)
                    verticalLineTo(53.95f)
                    curveTo(198.5f, 49.83f, 201.83f, 46.5f, 205.94f, 46.5f)
                    close()
                }

                // Input field placeholder
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
                    moveTo(283.4f, 63.88f)
                    horizontalLineTo(217.86f)
                    curveTo(215.67f, 63.88f, 213.89f, 65.66f, 213.89f, 67.85f)
                    verticalLineTo(71.83f)
                    curveTo(213.89f, 74.02f, 215.67f, 75.8f, 217.86f, 75.8f)
                    horizontalLineTo(283.4f)
                    curveTo(285.59f, 75.8f, 287.37f, 74.02f, 287.37f, 71.83f)
                    verticalLineTo(67.85f)
                    curveTo(287.37f, 65.66f, 285.59f, 63.88f, 283.4f, 63.88f)
                    close()
                }

                // Main border
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

                // "Label" text
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
                    moveTo(102.49f, 70.63f)
                    horizontalLineTo(110.29f)
                    verticalLineTo(73f)
                    horizontalLineTo(99.57f)
                    verticalLineTo(50.7f)
                    horizontalLineTo(102.49f)
                    verticalLineTo(70.63f)
                    close()
                    moveTo(112.3f, 64.17f)
                    curveTo(112.3f, 62.38f, 112.66f, 60.81f, 113.39f, 59.46f)
                    curveTo(114.11f, 58.1f, 115.1f, 57.04f, 116.36f, 56.3f)
                    curveTo(117.64f, 55.55f, 119.06f, 55.18f, 120.62f, 55.18f)
                    curveTo(122.15f, 55.18f, 123.49f, 55.51f, 124.62f, 56.17f)
                    curveTo(125.75f, 56.83f, 126.59f, 57.66f, 127.15f, 58.66f)
                    verticalLineTo(55.46f)
                    horizontalLineTo(130.09f)
                    verticalLineTo(73f)
                    horizontalLineTo(127.15f)
                    verticalLineTo(69.74f)
                    curveTo(126.57f, 70.76f, 125.71f, 71.61f, 124.55f, 72.3f)
                    curveTo(123.42f, 72.96f, 122.1f, 73.29f, 120.59f, 73.29f)
                    curveTo(119.03f, 73.29f, 117.62f, 72.9f, 116.36f, 72.14f)
                    curveTo(115.1f, 71.37f, 114.11f, 70.29f, 113.39f, 68.9f)
                    curveTo(112.66f, 67.52f, 112.3f, 65.94f, 112.3f, 64.17f)
                    close()
                    moveTo(127.15f, 64.2f)
                    curveTo(127.15f, 62.88f, 126.88f, 61.73f, 126.35f, 60.74f)
                    curveTo(125.81f, 59.76f, 125.09f, 59.02f, 124.17f, 58.5f)
                    curveTo(123.27f, 57.97f, 122.28f, 57.7f, 121.19f, 57.7f)
                    curveTo(120.11f, 57.7f, 119.11f, 57.96f, 118.22f, 58.47f)
                    curveTo(117.32f, 58.98f, 116.61f, 59.73f, 116.07f, 60.71f)
                    curveTo(115.54f, 61.69f, 115.27f, 62.85f, 115.27f, 64.17f)
                    curveTo(115.27f, 65.51f, 115.54f, 66.69f, 116.07f, 67.69f)
                    curveTo(116.61f, 68.67f, 117.32f, 69.43f, 118.22f, 69.96f)
                    curveTo(119.11f, 70.47f, 120.11f, 70.73f, 121.19f, 70.73f)
                    curveTo(122.28f, 70.73f, 123.27f, 70.47f, 124.17f, 69.96f)
                    curveTo(125.09f, 69.43f, 125.81f, 68.67f, 126.35f, 67.69f)
                    curveTo(126.88f, 66.69f, 127.15f, 65.52f, 127.15f, 64.2f)
                    close()
                    moveTo(137.92f, 58.73f)
                    curveTo(138.52f, 57.68f, 139.4f, 56.83f, 140.55f, 56.17f)
                    curveTo(141.7f, 55.51f, 143.01f, 55.18f, 144.48f, 55.18f)
                    curveTo(146.06f, 55.18f, 147.48f, 55.55f, 148.74f, 56.3f)
                    curveTo(150f, 57.04f, 150.99f, 58.1f, 151.71f, 59.46f)
                    curveTo(152.44f, 60.81f, 152.8f, 62.38f, 152.8f, 64.17f)
                    curveTo(152.8f, 65.94f, 152.44f, 67.52f, 151.71f, 68.9f)
                    curveTo(150.99f, 70.29f, 149.99f, 71.37f, 148.71f, 72.14f)
                    curveTo(147.45f, 72.9f, 146.04f, 73.29f, 144.48f, 73.29f)
                    curveTo(142.97f, 73.29f, 141.63f, 72.96f, 140.48f, 72.3f)
                    curveTo(139.35f, 71.63f, 138.5f, 70.79f, 137.92f, 69.77f)
                    verticalLineTo(73f)
                    horizontalLineTo(135.01f)
                    verticalLineTo(49.32f)
                    horizontalLineTo(137.92f)
                    verticalLineTo(58.73f)
                    close()
                    moveTo(149.83f, 64.17f)
                    curveTo(149.83f, 62.85f, 149.56f, 61.69f, 149.03f, 60.71f)
                    curveTo(148.49f, 59.73f, 147.77f, 58.98f, 146.85f, 58.47f)
                    curveTo(145.96f, 57.96f, 144.96f, 57.7f, 143.88f, 57.7f)
                    curveTo(142.81f, 57.7f, 141.82f, 57.97f, 140.9f, 58.5f)
                    curveTo(140f, 59.02f, 139.28f, 59.77f, 138.72f, 60.78f)
                    curveTo(138.19f, 61.76f, 137.92f, 62.9f, 137.92f, 64.2f)
                    curveTo(137.92f, 65.52f, 138.19f, 66.69f, 138.72f, 67.69f)
                    curveTo(139.28f, 68.67f, 140f, 69.43f, 140.9f, 69.96f)
                    curveTo(141.82f, 70.47f, 142.81f, 70.73f, 143.88f, 70.73f)
                    curveTo(144.96f, 70.73f, 145.96f, 70.47f, 146.85f, 69.96f)
                    curveTo(147.77f, 69.43f, 148.49f, 68.67f, 149.03f, 67.69f)
                    curveTo(149.56f, 66.69f, 149.83f, 65.51f, 149.83f, 64.17f)
                    close()
                    moveTo(172.64f, 63.56f)
                    curveTo(172.64f, 64.11f, 172.6f, 64.7f, 172.54f, 65.32f)
                    horizontalLineTo(158.52f)
                    curveTo(158.63f, 67.05f, 159.22f, 68.4f, 160.28f, 69.38f)
                    curveTo(161.37f, 70.34f, 162.68f, 70.82f, 164.22f, 70.82f)
                    curveTo(165.48f, 70.82f, 166.52f, 70.54f, 167.36f, 69.96f)
                    curveTo(168.21f, 69.36f, 168.81f, 68.57f, 169.15f, 67.59f)
                    horizontalLineTo(172.28f)
                    curveTo(171.82f, 69.28f, 170.88f, 70.65f, 169.47f, 71.72f)
                    curveTo(168.06f, 72.77f, 166.31f, 73.29f, 164.22f, 73.29f)
                    curveTo(162.56f, 73.29f, 161.06f, 72.91f, 159.74f, 72.17f)
                    curveTo(158.44f, 71.42f, 157.41f, 70.37f, 156.67f, 69f)
                    curveTo(155.92f, 67.61f, 155.55f, 66.01f, 155.55f, 64.2f)
                    curveTo(155.55f, 62.39f, 155.91f, 60.8f, 156.64f, 59.43f)
                    curveTo(157.36f, 58.07f, 158.38f, 57.02f, 159.68f, 56.3f)
                    curveTo(161f, 55.55f, 162.51f, 55.18f, 164.22f, 55.18f)
                    curveTo(165.88f, 55.18f, 167.36f, 55.54f, 168.64f, 56.26f)
                    curveTo(169.92f, 56.99f, 170.9f, 57.99f, 171.58f, 59.27f)
                    curveTo(172.28f, 60.53f, 172.64f, 61.96f, 172.64f, 63.56f)
                    close()
                    moveTo(169.63f, 62.95f)
                    curveTo(169.63f, 61.84f, 169.38f, 60.89f, 168.89f, 60.1f)
                    curveTo(168.4f, 59.29f, 167.73f, 58.69f, 166.88f, 58.28f)
                    curveTo(166.04f, 57.85f, 165.12f, 57.64f, 164.09f, 57.64f)
                    curveTo(162.62f, 57.64f, 161.36f, 58.11f, 160.32f, 59.05f)
                    curveTo(159.29f, 59.99f, 158.71f, 61.29f, 158.56f, 62.95f)
                    horizontalLineTo(169.63f)
                    close()
                    moveTo(179.39f, 49.32f)
                    verticalLineTo(73f)
                    horizontalLineTo(176.48f)
                    verticalLineTo(49.32f)
                    horizontalLineTo(179.39f)
                    close()
                }

                // Divider line
                path(
                    fill = SolidColor(Color.Transparent),
                    fillAlpha = 1.0f,
                    stroke = SolidColor(OrataTheme.colors.primary),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(97f, 81.5f)
                    lineTo(182f, 81.5f)
                }

                // Anchor/cursor icon
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
                    moveTo(172.24f, 110.19f)
                    curveTo(172.36f, 111.4f, 173.19f, 112.41f, 174.34f, 112.78f)
                    curveTo(174.41f, 112.8f, 174.46f, 112.81f, 174.47f, 112.82f)
                    curveTo(175.6f, 113.12f, 176.82f, 112.74f, 177.58f, 111.82f)
                    lineTo(185.24f, 102.63f)
                    curveTo(185.96f, 101.76f, 186.96f, 101.16f, 188.07f, 100.93f)
                    lineTo(198.88f, 98.72f)
                    curveTo(200.08f, 98.48f, 201.01f, 97.54f, 201.25f, 96.34f)
                    curveTo(201.49f, 95.15f, 200.99f, 93.92f, 199.97f, 93.24f)
                    horizontalLineTo(199.97f)
                    lineTo(199f, 92.5f)
                    lineTo(173.73f, 75.52f)
                    lineTo(173.73f, 75.52f)
                    curveTo(172.76f, 74.86f, 171.49f, 74.83f, 170.48f, 75.43f)
                    curveTo(169.46f, 76.03f, 168.9f, 77.17f, 169.02f, 78.34f)
                    verticalLineTo(78.34f)
                    lineTo(172.24f, 110.19f)
                    verticalLineTo(110.19f)
                    close()
                }
            }
        }.build()
    }
}

