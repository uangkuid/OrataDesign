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

internal object IlustrationComponentIcon : DynamicIcons {
    @Composable
    /**
     * icons function for the Orata Design System.
     * @author oratakashi
     * @since 19 Nov 2025
     */
    override fun icons(): ImageVector {
        return ImageVector.Builder(
            name = "IlustrationComponentIcon",
            defaultWidth = 752.dp,
            defaultHeight = 527.dp,
            viewportWidth = 752f,
            viewportHeight = 527f
        ).apply {
            group {
                // Background shape with shadow effect
                path(
                    fill = SolidColor(Color(0xFFD3E5F5)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(579.89f, 525.25f)
                    lineTo(579.9f, 524.55f)
                    curveTo(580.22f, 512.86f, 583.07f, 501.38f, 588.27f, 490.91f)
                    curveTo(593.47f, 480.44f, 600.89f, 471.22f, 610.01f, 463.91f)
                    curveTo(615.16f, 459.84f, 620.8f, 456.45f, 626.8f, 453.79f)
                    lineTo(627.37f, 453.54f)
                    lineTo(627.47f, 454.15f)
                    curveTo(628.63f, 461.54f, 630.47f, 469.07f, 631.33f, 472.41f)
                    lineTo(637.07f, 450f)
                    lineTo(637.71f, 449.81f)
                    curveTo(640.64f, 448.95f, 643.75f, 448.99f, 646.66f, 449.92f)
                    curveTo(649.56f, 450.85f, 652.13f, 452.62f, 654.01f, 455.02f)
                    curveTo(655.98f, 457.42f, 657.19f, 460.35f, 657.47f, 463.44f)
                    curveTo(657.76f, 466.53f, 657.12f, 469.63f, 655.62f, 472.35f)
                    curveTo(654.28f, 474.85f, 652.97f, 477.45f, 651.7f, 479.97f)
                    curveTo(647.32f, 488.62f, 642.8f, 497.56f, 636.21f, 504.51f)
                    curveTo(631.17f, 509.72f, 625.03f, 513.74f, 618.23f, 516.27f)
                    curveTo(611.44f, 518.81f, 604.17f, 519.79f, 596.95f, 519.15f)
                    lineTo(579.89f, 525.25f)
                    close()
                }

                // Main phone/card container
                path(
                    fill = SolidColor(Color(0xFFD3E5F5)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(405.25f, 320.57f)
                    horizontalLineTo(256.97f)
                    curveTo(251.63f, 320.56f, 246.52f, 318.44f, 242.75f, 314.67f)
                    curveTo(238.98f, 310.9f, 236.86f, 305.78f, 236.85f, 300.45f)
                    verticalLineTo(91.85f)
                    curveTo(236.88f, 67.5f, 246.57f, 44.15f, 263.79f, 26.93f)
                    curveTo(281f, 9.71f, 304.35f, 0.03f, 328.7f, 0f)
                    horizontalLineTo(405.25f)
                    curveTo(410.58f, 0.01f, 415.69f, 2.13f, 419.46f, 5.9f)
                    curveTo(423.24f, 9.67f, 425.36f, 14.78f, 425.36f, 20.11f)
                    verticalLineTo(300.45f)
                    curveTo(425.36f, 305.78f, 423.24f, 310.9f, 419.46f, 314.67f)
                    curveTo(415.69f, 318.44f, 410.58f, 320.56f, 405.25f, 320.57f)
                    close()
                }

                // White card section 1
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
                    moveTo(262.15f, 181.28f)
                    curveTo(259.9f, 181.29f, 257.75f, 182.18f, 256.16f, 183.77f)
                    curveTo(254.57f, 185.36f, 253.68f, 187.51f, 253.68f, 189.76f)
                    verticalLineTo(237.37f)
                    curveTo(253.68f, 239.62f, 254.57f, 241.77f, 256.16f, 243.36f)
                    curveTo(257.75f, 244.95f, 259.9f, 245.84f, 262.15f, 245.84f)
                    horizontalLineTo(406.25f)
                    curveTo(408.5f, 245.84f, 410.65f, 244.95f, 412.24f, 243.36f)
                    curveTo(413.83f, 241.77f, 414.72f, 239.62f, 414.73f, 237.37f)
                    verticalLineTo(189.76f)
                    curveTo(414.72f, 187.51f, 413.83f, 185.36f, 412.24f, 183.77f)
                    curveTo(410.65f, 182.18f, 408.5f, 181.29f, 406.25f, 181.28f)
                    lineTo(262.15f, 181.28f)
                    close()
                }

                // White card section 2
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
                    moveTo(406.6f, 150.39f)
                    horizontalLineTo(262.5f)
                    curveTo(260.07f, 150.39f, 257.74f, 149.42f, 256.02f, 147.71f)
                    curveTo(254.3f, 145.99f, 253.34f, 143.66f, 253.33f, 141.23f)
                    curveTo(253.35f, 126.17f, 259.34f, 111.74f, 269.98f, 101.1f)
                    curveTo(280.63f, 90.45f, 295.06f, 84.47f, 310.11f, 84.45f)
                    horizontalLineTo(406.6f)
                    curveTo(409.03f, 84.45f, 411.36f, 85.42f, 413.08f, 87.14f)
                    curveTo(414.8f, 88.85f, 415.76f, 91.18f, 415.77f, 93.61f)
                    verticalLineTo(141.23f)
                    curveTo(415.76f, 143.66f, 414.8f, 145.99f, 413.08f, 147.71f)
                    curveTo(411.36f, 149.42f, 409.03f, 150.39f, 406.6f, 150.39f)
                    close()
                }

                // Content card with border
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
                    moveTo(468.64f, 238.54f)
                    horizontalLineTo(302.76f)
                    curveTo(301.78f, 238.54f, 300.85f, 238.15f, 300.16f, 237.46f)
                    curveTo(299.47f, 236.77f, 299.08f, 235.83f, 299.08f, 234.86f)
                    verticalLineTo(191.15f)
                    curveTo(299.08f, 190.18f, 299.47f, 189.24f, 300.16f, 188.55f)
                    curveTo(300.85f, 187.86f, 301.78f, 187.47f, 302.76f, 187.47f)
                    horizontalLineTo(468.64f)
                    curveTo(469.62f, 187.47f, 470.55f, 187.86f, 471.24f, 188.55f)
                    curveTo(471.93f, 189.24f, 472.32f, 190.18f, 472.32f, 191.15f)
                    verticalLineTo(234.86f)
                    curveTo(472.32f, 235.83f, 471.93f, 236.77f, 471.24f, 237.46f)
                    curveTo(470.55f, 238.15f, 469.62f, 238.54f, 468.64f, 238.54f)
                    close()
                }

                // Border stroke for content card
                path(
                    fill = SolidColor(Color.Transparent),
                    fillAlpha = 1.0f,
                    stroke = SolidColor(OrataTheme.colors.outlineVariant),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.4f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(302.76f, 188.17f)
                    curveTo(301.97f, 188.17f, 301.21f, 188.48f, 300.65f, 189.04f)
                    curveTo(300.09f, 189.6f, 299.77f, 190.36f, 299.77f, 191.15f)
                    verticalLineTo(234.86f)
                    curveTo(299.77f, 235.65f, 300.09f, 236.41f, 300.65f, 236.97f)
                    curveTo(301.21f, 237.53f, 301.97f, 237.84f, 302.76f, 237.84f)
                    horizontalLineTo(468.64f)
                    curveTo(469.43f, 237.84f, 470.19f, 237.53f, 470.75f, 236.97f)
                    curveTo(471.31f, 236.41f, 471.63f, 235.65f, 471.63f, 234.86f)
                    verticalLineTo(191.15f)
                    curveTo(471.63f, 190.36f, 471.31f, 189.6f, 470.75f, 189.04f)
                    curveTo(470.19f, 188.48f, 469.43f, 188.17f, 468.64f, 188.17f)
                    horizontalLineTo(302.76f)
                    close()
                }

                // Icon circle
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
                    moveTo(316.86f, 208.19f)
                    curveTo(320.16f, 208.19f, 322.83f, 205.52f, 322.83f, 202.22f)
                    curveTo(322.83f, 198.93f, 320.16f, 196.26f, 316.86f, 196.26f)
                    curveTo(313.57f, 196.26f, 310.9f, 198.93f, 310.9f, 202.22f)
                    curveTo(310.9f, 205.52f, 313.57f, 208.19f, 316.86f, 208.19f)
                    close()
                }

                // Text line 1
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
                    moveTo(458.73f, 217.26f)
                    horizontalLineTo(312.67f)
                    curveTo(312.2f, 217.26f, 311.75f, 217.08f, 311.42f, 216.74f)
                    curveTo(311.08f, 216.41f, 310.89f, 215.95f, 310.89f, 215.48f)
                    curveTo(310.89f, 215.02f, 311.08f, 214.56f, 311.42f, 214.23f)
                    curveTo(311.75f, 213.9f, 312.2f, 213.71f, 312.67f, 213.71f)
                    horizontalLineTo(458.73f)
                    curveTo(459.19f, 213.71f, 459.65f, 213.9f, 459.99f, 214.23f)
                    curveTo(460.32f, 214.56f, 460.51f, 215.02f, 460.51f, 215.48f)
                    curveTo(460.51f, 215.95f, 460.32f, 216.41f, 459.99f, 216.74f)
                    curveTo(459.65f, 217.08f, 459.19f, 217.26f, 458.73f, 217.26f)
                    close()
                }

                // Text line 2
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
                    moveTo(444.21f, 224.28f)
                    horizontalLineTo(312.67f)
                    curveTo(312.2f, 224.28f, 311.75f, 224.1f, 311.42f, 223.76f)
                    curveTo(311.08f, 223.43f, 310.9f, 222.98f, 310.9f, 222.51f)
                    curveTo(310.9f, 222.04f, 311.08f, 221.58f, 311.42f, 221.25f)
                    curveTo(311.75f, 220.92f, 312.2f, 220.73f, 312.67f, 220.73f)
                    horizontalLineTo(444.21f)
                    curveTo(444.68f, 220.73f, 445.14f, 220.92f, 445.47f, 221.25f)
                    curveTo(445.8f, 221.58f, 445.99f, 222.04f, 445.99f, 222.51f)
                    curveTo(445.99f, 222.98f, 445.8f, 223.43f, 445.47f, 223.76f)
                    curveTo(445.14f, 224.1f, 444.68f, 224.28f, 444.21f, 224.28f)
                    close()
                }

                // Note/card section - white background
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
                    moveTo(296.31f, 523.61f)
                    lineTo(255.71f, 507.43f)
                    curveTo(254.8f, 507.07f, 254.07f, 506.36f, 253.69f, 505.46f)
                    curveTo(253.3f, 504.57f, 253.29f, 503.56f, 253.65f, 502.65f)
                    lineTo(315.07f, 348.55f)
                    curveTo(315.43f, 347.65f, 316.14f, 346.92f, 317.04f, 346.54f)
                    curveTo(317.93f, 346.15f, 318.94f, 346.14f, 319.85f, 346.5f)
                    lineTo(360.45f, 362.68f)
                    curveTo(361.36f, 363.05f, 362.08f, 363.75f, 362.46f, 364.65f)
                    curveTo(362.85f, 365.54f, 362.86f, 366.55f, 362.51f, 367.46f)
                    lineTo(301.08f, 521.56f)
                    curveTo(300.72f, 522.46f, 300.02f, 523.19f, 299.12f, 523.57f)
                    curveTo(298.23f, 523.96f, 297.21f, 523.97f, 296.31f, 523.61f)
                    close()
                }

                // Note border
                path(
                    fill = SolidColor(Color.Transparent),
                    fillAlpha = 1.0f,
                    stroke = SolidColor(OrataTheme.colors.outlineVariant),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.3f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(254.29f, 502.91f)
                    curveTo(254f, 503.64f, 254.01f, 504.46f, 254.33f, 505.19f)
                    curveTo(254.64f, 505.92f, 255.23f, 506.49f, 255.96f, 506.78f)
                    lineTo(296.56f, 522.97f)
                    curveTo(297.3f, 523.26f, 298.12f, 523.25f, 298.85f, 522.93f)
                    curveTo(299.57f, 522.62f, 300.15f, 522.03f, 300.44f, 521.3f)
                    lineTo(361.86f, 367.2f)
                    curveTo(362.15f, 366.47f, 362.14f, 365.65f, 361.83f, 364.92f)
                    curveTo(361.52f, 364.2f, 360.93f, 363.62f, 360.19f, 363.33f)
                    lineTo(319.59f, 347.14f)
                    curveTo(318.86f, 346.85f, 318.04f, 346.86f, 317.31f, 347.18f)
                    curveTo(316.58f, 347.49f, 316.01f, 348.08f, 315.71f, 348.81f)
                    lineTo(254.29f, 502.91f)
                    close()
                }

                // Note icon circle
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
                    moveTo(323.55f, 373.09f)
                    curveTo(326.85f, 373.09f, 329.52f, 370.42f, 329.52f, 367.12f)
                    curveTo(329.52f, 363.82f, 326.85f, 361.15f, 323.55f, 361.15f)
                    curveTo(320.25f, 361.15f, 317.58f, 363.82f, 317.58f, 367.12f)
                    curveTo(317.58f, 370.42f, 320.25f, 373.09f, 323.55f, 373.09f)
                    close()
                }

                // Note text lines
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
                    moveTo(282.68f, 505.46f)
                    curveTo(282.25f, 505.29f, 281.9f, 504.94f, 281.71f, 504.51f)
                    curveTo(281.52f, 504.08f, 281.52f, 503.59f, 281.69f, 503.15f)
                    lineTo(335.77f, 367.48f)
                    curveTo(336.15f, 366.6f, 337.04f, 366.08f, 338.08f, 366.49f)
                    curveTo(338.29f, 366.57f, 338.49f, 366.7f, 338.66f, 366.86f)
                    curveTo(339.2f, 367.43f, 339.2f, 368.35f, 339.07f, 368.79f)
                    lineTo(284.99f, 504.47f)
                    curveTo(284.82f, 504.9f, 284.48f, 505.26f, 284.04f, 505.44f)
                    curveTo(283.61f, 505.63f, 283.12f, 505.63f, 282.68f, 505.46f)
                    close()
                }

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
                    moveTo(294.58f, 494.58f)
                    curveTo(294.14f, 494.4f, 293.79f, 494.06f, 293.61f, 493.63f)
                    curveTo(293.42f, 493.2f, 293.41f, 492.71f, 293.59f, 492.27f)
                    lineTo(342.29f, 370.08f)
                    curveTo(342.67f, 369.19f, 343.58f, 368.68f, 344.6f, 369.08f)
                    curveTo(345.72f, 369.48f, 345.72f, 370.95f, 345.59f, 371.39f)
                    lineTo(296.89f, 493.59f)
                    curveTo(296.71f, 494.02f, 296.37f, 494.37f, 295.94f, 494.56f)
                    curveTo(295.51f, 494.75f, 295.02f, 494.75f, 294.58f, 494.58f)
                    close()
                }

                // Plus icon circle (top)
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
                    moveTo(396.24f, 41.24f)
                    curveTo(404.92f, 41.24f, 411.95f, 34.2f, 411.95f, 25.53f)
                    curveTo(411.95f, 16.85f, 404.92f, 9.82f, 396.24f, 9.82f)
                    curveTo(387.56f, 9.82f, 380.53f, 16.85f, 380.53f, 25.53f)
                    curveTo(380.53f, 34.2f, 387.56f, 41.24f, 396.24f, 41.24f)
                    close()
                }

                // Plus icon symbol
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
                    moveTo(403.98f, 24.91f)
                    horizontalLineTo(396.91f)
                    verticalLineTo(17.84f)
                    curveTo(396.91f, 17.67f, 396.84f, 17.5f, 396.71f, 17.37f)
                    curveTo(396.58f, 17.24f, 396.42f, 17.17f, 396.24f, 17.17f)
                    curveTo(396.07f, 17.17f, 395.9f, 17.24f, 395.77f, 17.37f)
                    curveTo(395.65f, 17.5f, 395.57f, 17.67f, 395.57f, 17.84f)
                    verticalLineTo(24.91f)
                    horizontalLineTo(388.51f)
                    curveTo(388.33f, 24.91f, 388.16f, 24.98f, 388.03f, 25.1f)
                    curveTo(387.91f, 25.23f, 387.84f, 25.4f, 387.84f, 25.58f)
                    curveTo(387.84f, 25.75f, 387.91f, 25.92f, 388.03f, 26.05f)
                    curveTo(388.16f, 26.17f, 388.33f, 26.24f, 388.51f, 26.24f)
                    horizontalLineTo(395.57f)
                    verticalLineTo(33.31f)
                    curveTo(395.57f, 33.49f, 395.65f, 33.65f, 395.77f, 33.79f)
                    curveTo(395.9f, 33.91f, 396.07f, 33.98f, 396.24f, 33.98f)
                    curveTo(396.42f, 33.98f, 396.58f, 33.91f, 396.71f, 33.79f)
                    curveTo(396.84f, 33.65f, 396.91f, 33.49f, 396.91f, 33.31f)
                    verticalLineTo(26.24f)
                    horizontalLineTo(403.98f)
                    curveTo(404.15f, 26.24f, 404.32f, 26.17f, 404.45f, 26.05f)
                    curveTo(404.57f, 25.92f, 404.64f, 25.75f, 404.64f, 25.58f)
                    curveTo(404.64f, 25.4f, 404.57f, 25.23f, 404.45f, 25.1f)
                    curveTo(404.32f, 24.98f, 404.15f, 24.91f, 403.98f, 24.91f)
                    close()
                }

                // Horizontal badges/pills - top right
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
                    moveTo(589.82f, 38.47f)
                    horizontalLineTo(536.82f)
                    curveTo(533.37f, 38.47f, 530.06f, 37.1f, 527.63f, 34.67f)
                    curveTo(525.19f, 32.23f, 523.82f, 28.92f, 523.82f, 25.47f)
                    curveTo(523.82f, 22.02f, 525.19f, 18.72f, 527.63f, 16.28f)
                    curveTo(530.06f, 13.84f, 533.37f, 12.47f, 536.82f, 12.47f)
                    horizontalLineTo(589.82f)
                    curveTo(593.27f, 12.47f, 596.57f, 13.84f, 599.01f, 16.28f)
                    curveTo(601.45f, 18.72f, 602.82f, 22.02f, 602.82f, 25.47f)
                    curveTo(602.82f, 28.92f, 601.45f, 32.23f, 599.01f, 34.67f)
                    curveTo(596.57f, 37.1f, 593.27f, 38.47f, 589.82f, 38.47f)
                    close()
                }

                // Connector line (top right)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(408.73f, 20.12f)
                    lineTo(408.7f, 22.12f)
                    lineTo(511.12f, 23.6f)
                    lineTo(511.15f, 21.6f)
                    lineTo(408.73f, 20.12f)
                    close()
                }

                // Circle connector (top right)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(404.43f, 26.54f)
                    curveTo(403.2f, 26.55f, 402.01f, 26.1f, 401.09f, 25.28f)
                    curveTo(400.17f, 24.46f, 399.58f, 23.33f, 399.44f, 22.11f)
                    curveTo(399.3f, 20.89f, 399.61f, 19.66f, 400.32f, 18.65f)
                    curveTo(401.03f, 17.65f, 402.08f, 16.93f, 403.28f, 16.66f)
                    curveTo(404.48f, 16.38f, 405.74f, 16.55f, 406.82f, 17.14f)
                    curveTo(407.9f, 17.73f, 408.72f, 18.7f, 409.14f, 19.86f)
                    curveTo(409.55f, 21.02f, 409.52f, 22.29f, 409.05f, 23.43f)
                    curveTo(408.59f, 24.57f, 407.72f, 25.5f, 406.61f, 26.04f)
                    curveTo(405.93f, 26.37f, 405.19f, 26.54f, 404.43f, 26.54f)
                    close()
                    moveTo(404.42f, 18.54f)
                    curveTo(403.77f, 18.54f, 403.14f, 18.75f, 402.61f, 19.14f)
                    curveTo(402.09f, 19.54f, 401.71f, 20.09f, 401.54f, 20.71f)
                    curveTo(401.36f, 21.34f, 401.39f, 22.01f, 401.62f, 22.62f)
                    curveTo(401.85f, 23.23f, 402.28f, 23.74f, 402.83f, 24.09f)
                    curveTo(403.38f, 24.43f, 404.03f, 24.59f, 404.68f, 24.53f)
                    curveTo(405.33f, 24.48f, 405.95f, 24.21f, 406.43f, 23.77f)
                    curveTo(406.91f, 23.34f, 407.24f, 22.76f, 407.37f, 22.12f)
                    curveTo(407.49f, 21.48f, 407.41f, 20.81f, 407.12f, 20.23f)
                    curveTo(406.87f, 19.72f, 406.49f, 19.29f, 406.01f, 19f)
                    curveTo(405.54f, 18.7f, 404.98f, 18.54f, 404.42f, 18.54f)
                    close()
                }

                // Badge pill (top left)
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
                    moveTo(97.59f, 55.47f)
                    curveTo(97.6f, 52.03f, 98.97f, 48.72f, 101.4f, 46.28f)
                    curveTo(103.84f, 43.85f, 107.15f, 42.48f, 110.59f, 42.47f)
                    horizontalLineTo(163.59f)
                    curveTo(167.04f, 42.47f, 170.35f, 43.84f, 172.79f, 46.28f)
                    curveTo(175.22f, 48.72f, 176.59f, 52.02f, 176.59f, 55.47f)
                    curveTo(176.59f, 58.92f, 175.22f, 62.23f, 172.79f, 64.67f)
                    curveTo(170.35f, 67.1f, 167.04f, 68.47f, 163.59f, 68.47f)
                    horizontalLineTo(110.59f)
                    curveTo(107.15f, 68.47f, 103.84f, 67.1f, 101.4f, 64.66f)
                    curveTo(98.97f, 62.22f, 97.6f, 58.92f, 97.59f, 55.47f)
                    close()
                }

                // Connector line (top left)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(291.68f, 50.12f)
                    lineTo(189.26f, 51.6f)
                    lineTo(189.29f, 53.6f)
                    lineTo(291.71f, 52.12f)
                    lineTo(291.68f, 50.12f)
                    close()
                }

                // Circle connector (top left)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(293.8f, 56.04f)
                    curveTo(292.7f, 55.5f, 291.84f, 54.58f, 291.38f, 53.45f)
                    curveTo(290.92f, 52.32f, 290.9f, 51.06f, 291.31f, 49.91f)
                    curveTo(291.71f, 48.76f, 292.53f, 47.8f, 293.6f, 47.22f)
                    curveTo(294.67f, 46.63f, 295.92f, 46.46f, 297.11f, 46.74f)
                    curveTo(298.3f, 47.01f, 299.34f, 47.72f, 300.04f, 48.72f)
                    curveTo(300.75f, 49.71f, 301.06f, 50.93f, 300.92f, 52.14f)
                    curveTo(300.78f, 53.36f, 300.2f, 54.47f, 299.29f, 55.28f)
                    curveTo(298.38f, 56.1f, 297.2f, 56.54f, 295.98f, 56.54f)
                    curveTo(295.22f, 56.54f, 294.48f, 56.37f, 293.8f, 56.04f)
                    close()
                    moveTo(295.01f, 48.7f)
                    curveTo(294.64f, 48.83f, 294.29f, 49.03f, 294f, 49.29f)
                    curveTo(293.7f, 49.55f, 293.46f, 49.87f, 293.29f, 50.23f)
                    curveTo(292.98f, 50.85f, 292.91f, 51.56f, 293.07f, 52.24f)
                    curveTo(293.23f, 52.92f, 293.62f, 53.52f, 294.17f, 53.94f)
                    curveTo(294.73f, 54.36f, 295.41f, 54.58f, 296.1f, 54.55f)
                    curveTo(296.8f, 54.53f, 297.46f, 54.26f, 297.99f, 53.8f)
                    curveTo(298.51f, 53.34f, 298.85f, 52.71f, 298.96f, 52.02f)
                    curveTo(299.07f, 51.33f, 298.94f, 50.63f, 298.59f, 50.03f)
                    curveTo(298.24f, 49.43f, 297.69f, 48.97f, 297.04f, 48.73f)
                    curveTo(296.38f, 48.49f, 295.67f, 48.48f, 295.01f, 48.7f)
                    close()
                }

                // Badge pill (middle left)
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
                    moveTo(93.59f, 448.47f)
                    curveTo(93.6f, 445.03f, 94.97f, 441.72f, 97.4f, 439.28f)
                    curveTo(99.84f, 436.85f, 103.15f, 435.48f, 106.59f, 435.47f)
                    horizontalLineTo(159.59f)
                    curveTo(163.04f, 435.47f, 166.35f, 436.84f, 168.79f, 439.28f)
                    curveTo(171.22f, 441.72f, 172.59f, 445.02f, 172.59f, 448.47f)
                    curveTo(172.59f, 451.92f, 171.22f, 455.23f, 168.79f, 457.67f)
                    curveTo(166.35f, 460.1f, 163.04f, 461.47f, 159.59f, 461.47f)
                    horizontalLineTo(106.59f)
                    curveTo(103.15f, 461.47f, 99.84f, 460.1f, 97.4f, 457.66f)
                    curveTo(94.97f, 455.22f, 93.6f, 451.92f, 93.59f, 448.47f)
                    close()
                }

                // Connector line (middle left)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(287.68f, 443.12f)
                    lineTo(185.26f, 444.6f)
                    lineTo(185.29f, 446.6f)
                    lineTo(287.71f, 445.12f)
                    lineTo(287.68f, 443.12f)
                    close()
                }

                // Circle connector (middle left)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(289.8f, 449.04f)
                    curveTo(288.7f, 448.5f, 287.84f, 447.58f, 287.38f, 446.45f)
                    curveTo(286.92f, 445.32f, 286.9f, 444.06f, 287.31f, 442.91f)
                    curveTo(287.71f, 441.76f, 288.53f, 440.8f, 289.6f, 440.22f)
                    curveTo(290.67f, 439.63f, 291.92f, 439.46f, 293.11f, 439.74f)
                    curveTo(294.3f, 440.02f, 295.34f, 440.72f, 296.04f, 441.71f)
                    curveTo(296.75f, 442.71f, 297.06f, 443.93f, 296.92f, 445.14f)
                    curveTo(296.78f, 446.36f, 296.2f, 447.47f, 295.29f, 448.29f)
                    curveTo(294.38f, 449.1f, 293.2f, 449.55f, 291.98f, 449.54f)
                    curveTo(291.22f, 449.54f, 290.48f, 449.37f, 289.8f, 449.04f)
                    close()
                    moveTo(291.01f, 441.7f)
                    curveTo(290.64f, 441.83f, 290.29f, 442.03f, 290f, 442.29f)
                    curveTo(289.7f, 442.55f, 289.46f, 442.87f, 289.29f, 443.23f)
                    curveTo(288.98f, 443.85f, 288.91f, 444.56f, 289.07f, 445.24f)
                    curveTo(289.23f, 445.92f, 289.62f, 446.52f, 290.17f, 446.94f)
                    curveTo(290.73f, 447.36f, 291.41f, 447.58f, 292.1f, 447.55f)
                    curveTo(292.8f, 447.53f, 293.46f, 447.26f, 293.99f, 446.8f)
                    curveTo(294.51f, 446.34f, 294.85f, 445.71f, 294.96f, 445.02f)
                    curveTo(295.07f, 444.33f, 294.94f, 443.63f, 294.59f, 443.03f)
                    curveTo(294.24f, 442.43f, 293.69f, 441.97f, 293.04f, 441.73f)
                    curveTo(292.38f, 441.48f, 291.67f, 441.48f, 291.01f, 441.7f)
                    close()
                }

                // Badge pill (center left)
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
                    moveTo(107.59f, 200.47f)
                    curveTo(107.6f, 197.03f, 108.97f, 193.72f, 111.4f, 191.28f)
                    curveTo(113.84f, 188.85f, 117.15f, 187.48f, 120.59f, 187.47f)
                    horizontalLineTo(173.59f)
                    curveTo(177.04f, 187.47f, 180.35f, 188.84f, 182.79f, 191.28f)
                    curveTo(185.22f, 193.72f, 186.59f, 197.02f, 186.59f, 200.47f)
                    curveTo(186.59f, 203.92f, 185.22f, 207.23f, 182.79f, 209.66f)
                    curveTo(180.35f, 212.1f, 177.04f, 213.47f, 173.59f, 213.47f)
                    horizontalLineTo(120.59f)
                    curveTo(117.15f, 213.47f, 113.84f, 212.1f, 111.4f, 209.66f)
                    curveTo(108.97f, 207.22f, 107.6f, 203.92f, 107.59f, 200.47f)
                    close()
                }

                // Connector line (center left)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(301.68f, 195.12f)
                    lineTo(199.26f, 196.6f)
                    lineTo(199.29f, 198.6f)
                    lineTo(301.71f, 197.12f)
                    lineTo(301.68f, 195.12f)
                    close()
                }

                // Circle connector (center left)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(303.8f, 201.04f)
                    curveTo(302.7f, 200.5f, 301.84f, 199.58f, 301.38f, 198.45f)
                    curveTo(300.92f, 197.32f, 300.9f, 196.06f, 301.31f, 194.91f)
                    curveTo(301.71f, 193.76f, 302.53f, 192.8f, 303.6f, 192.22f)
                    curveTo(304.67f, 191.63f, 305.92f, 191.46f, 307.11f, 191.74f)
                    curveTo(308.3f, 192.01f, 309.34f, 192.72f, 310.04f, 193.71f)
                    curveTo(310.75f, 194.71f, 311.06f, 195.93f, 310.92f, 197.14f)
                    curveTo(310.78f, 198.35f, 310.2f, 199.47f, 309.29f, 200.29f)
                    curveTo(308.38f, 201.1f, 307.2f, 201.54f, 305.98f, 201.54f)
                    curveTo(305.22f, 201.54f, 304.48f, 201.37f, 303.8f, 201.04f)
                    close()
                    moveTo(305.01f, 193.71f)
                    curveTo(304.64f, 193.83f, 304.29f, 194.03f, 304f, 194.29f)
                    curveTo(303.7f, 194.55f, 303.46f, 194.87f, 303.29f, 195.23f)
                    curveTo(302.98f, 195.85f, 302.91f, 196.56f, 303.07f, 197.24f)
                    curveTo(303.23f, 197.92f, 303.62f, 198.52f, 304.17f, 198.94f)
                    curveTo(304.73f, 199.36f, 305.41f, 199.58f, 306.1f, 199.55f)
                    curveTo(306.8f, 199.53f, 307.46f, 199.26f, 307.99f, 198.8f)
                    curveTo(308.51f, 198.34f, 308.85f, 197.71f, 308.96f, 197.02f)
                    curveTo(309.07f, 196.34f, 308.94f, 195.63f, 308.59f, 195.03f)
                    curveTo(308.24f, 194.43f, 307.69f, 193.97f, 307.04f, 193.73f)
                    curveTo(306.38f, 193.49f, 305.67f, 193.48f, 305.01f, 193.71f)
                    close()
                }

                // Badge pill (center right)
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
                    moveTo(575.82f, 121.47f)
                    horizontalLineTo(522.82f)
                    curveTo(519.37f, 121.47f, 516.06f, 120.1f, 513.63f, 117.67f)
                    curveTo(511.19f, 115.23f, 509.82f, 111.92f, 509.82f, 108.47f)
                    curveTo(509.82f, 105.03f, 511.19f, 101.72f, 513.63f, 99.28f)
                    curveTo(516.06f, 96.84f, 519.37f, 95.47f, 522.82f, 95.47f)
                    horizontalLineTo(575.82f)
                    curveTo(579.27f, 95.47f, 582.57f, 96.84f, 585.01f, 99.28f)
                    curveTo(587.45f, 101.72f, 588.82f, 105.03f, 588.82f, 108.47f)
                    curveTo(588.82f, 111.92f, 587.45f, 115.23f, 585.01f, 117.67f)
                    curveTo(582.57f, 120.1f, 579.27f, 121.47f, 575.82f, 121.47f)
                    close()
                }

                // Connector line (center right)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(394.73f, 103.12f)
                    lineTo(394.7f, 105.12f)
                    lineTo(497.12f, 106.6f)
                    lineTo(497.15f, 104.6f)
                    lineTo(394.73f, 103.12f)
                    close()
                }

                // Circle connector (center right)
                path(
                    fill = SolidColor(Color(0xFF41474D)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(390.43f, 109.54f)
                    curveTo(389.2f, 109.55f, 388.01f, 109.1f, 387.09f, 108.28f)
                    curveTo(386.17f, 107.46f, 385.58f, 106.33f, 385.44f, 105.11f)
                    curveTo(385.3f, 103.89f, 385.61f, 102.66f, 386.32f, 101.65f)
                    curveTo(387.03f, 100.64f, 388.08f, 99.93f, 389.28f, 99.66f)
                    curveTo(390.48f, 99.38f, 391.74f, 99.55f, 392.82f, 100.14f)
                    curveTo(393.9f, 100.73f, 394.72f, 101.7f, 395.14f, 102.86f)
                    curveTo(395.55f, 104.02f, 395.52f, 105.29f, 395.05f, 106.43f)
                    curveTo(394.59f, 107.57f, 393.72f, 108.5f, 392.61f, 109.04f)
                    curveTo(391.93f, 109.37f, 391.19f, 109.54f, 390.43f, 109.54f)
                    close()
                    moveTo(390.42f, 101.54f)
                    curveTo(389.77f, 101.54f, 389.14f, 101.75f, 388.61f, 102.14f)
                    curveTo(388.09f, 102.54f, 387.71f, 103.09f, 387.54f, 103.71f)
                    curveTo(387.36f, 104.34f, 387.39f, 105.01f, 387.62f, 105.62f)
                    curveTo(387.85f, 106.23f, 388.28f, 106.74f, 388.83f, 107.09f)
                    curveTo(389.38f, 107.43f, 390.03f, 107.59f, 390.68f, 107.53f)
                    curveTo(391.33f, 107.48f, 391.95f, 107.21f, 392.43f, 106.77f)
                    curveTo(392.91f, 106.34f, 393.24f, 105.75f, 393.37f, 105.12f)
                    curveTo(393.49f, 104.48f, 393.41f, 103.81f, 393.12f, 103.23f)
                    curveTo(392.87f, 102.72f, 392.49f, 102.29f, 392.01f, 102f)
                    curveTo(391.54f, 101.7f, 390.98f, 101.54f, 390.42f, 101.54f)
                    close()
                }

                // Person illustration - skin tone for arm
                path(
                    fill = SolidColor(OrataTheme.colors.errorContainer),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(604.16f, 269.55f)
                    lineTo(588.77f, 270.23f)
                    curveTo(585.3f, 279.66f, 587.76f, 302.57f, 587.76f, 302.57f)
                    lineTo(579.67f, 340.2f)
                    curveTo(578.82f, 341.04f, 578.21f, 342.09f, 577.9f, 343.25f)
                    curveTo(577.59f, 344.4f, 577.59f, 345.62f, 577.9f, 346.77f)
                    curveTo(578.2f, 347.93f, 578.81f, 348.98f, 579.66f, 349.83f)
                    curveTo(580.5f, 350.67f, 581.55f, 351.28f, 582.71f, 351.59f)
                    curveTo(583.86f, 351.9f, 585.08f, 351.9f, 586.23f, 351.59f)
                    curveTo(587.38f, 351.28f, 588.44f, 350.67f, 589.28f, 349.83f)
                    curveTo(590.13f, 348.98f, 590.73f, 347.93f, 591.04f, 346.78f)
                    curveTo(591.35f, 345.62f, 591.35f, 344.41f, 591.04f, 343.25f)
                    lineTo(607.46f, 298.13f)
                    lineTo(604.16f, 269.55f)
                    close()
                }

                // Person shirt/torso - dark color
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
                    moveTo(593.92f, 228.39f)
                    curveTo(596.31f, 228.31f, 598.68f, 228.76f, 600.88f, 229.7f)
                    curveTo(603.08f, 230.65f, 605.03f, 232.06f, 606.62f, 233.85f)
                    curveTo(608.21f, 235.63f, 609.38f, 237.75f, 610.05f, 240.04f)
                    curveTo(610.73f, 242.33f, 610.89f, 244.75f, 610.53f, 247.11f)
                    lineTo(609.05f, 256.72f)
                    curveTo(609.05f, 256.72f, 613.28f, 289.46f, 608.12f, 298.37f)
                    lineTo(598.28f, 325f)
                    lineTo(582.24f, 324.18f)
                    lineTo(586.67f, 295.1f)
                    curveTo(586.67f, 295.1f, 587.79f, 280.7f, 583.7f, 274.61f)
                    curveTo(581.19f, 270.88f, 578.64f, 256.85f, 578.21f, 245.12f)
                    curveTo(578.14f, 242.99f, 578.49f, 240.87f, 579.24f, 238.87f)
                    curveTo(579.99f, 236.88f, 581.13f, 235.05f, 582.59f, 233.49f)
                    curveTo(584.05f, 231.94f, 585.8f, 230.69f, 587.75f, 229.81f)
                    curveTo(589.69f, 228.94f, 591.79f, 228.45f, 593.92f, 228.39f)
                    close()
                }

                // Person feet/shoes - left
                path(
                    fill = SolidColor(OrataTheme.colors.errorContainer),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(582.8f, 514.59f)
                    lineTo(572.8f, 514.59f)
                    lineTo(568.05f, 476.04f)
                    horizontalLineTo(582.8f)
                    lineTo(582.8f, 514.59f)
                    close()
                }

                // Shoe left
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
                    moveTo(583.15f, 525.02f)
                    lineTo(552.41f, 525.02f)
                    verticalLineTo(524.63f)
                    curveTo(552.41f, 521.46f, 553.67f, 518.41f, 555.92f, 516.17f)
                    curveTo(558.16f, 513.93f, 561.2f, 512.67f, 564.38f, 512.67f)
                    lineTo(569.99f, 508.41f)
                    lineTo(580.47f, 512.67f)
                    lineTo(583.15f, 512.67f)
                    lineTo(583.15f, 525.02f)
                    close()
                }

                // Person feet/shoes - right
                path(
                    fill = SolidColor(OrataTheme.colors.errorContainer),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(546.68f, 514.59f)
                    lineTo(536.69f, 514.59f)
                    lineTo(531.93f, 476.04f)
                    horizontalLineTo(546.68f)
                    lineTo(546.68f, 514.59f)
                    close()
                }

                // Shoe right
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
                    moveTo(547.03f, 525.02f)
                    lineTo(516.29f, 525.02f)
                    verticalLineTo(524.63f)
                    curveTo(516.29f, 521.46f, 517.56f, 518.41f, 519.8f, 516.17f)
                    curveTo(522.04f, 513.93f, 525.09f, 512.67f, 528.26f, 512.67f)
                    lineTo(533.88f, 508.41f)
                    lineTo(544.35f, 512.67f)
                    lineTo(547.03f, 512.67f)
                    lineTo(547.03f, 525.02f)
                    close()
                }

                // Person pants - complex path
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
                    moveTo(510.39f, 409.52f)
                    curveTo(516.32f, 428.43f, 518.6f, 443.27f, 523.13f, 461.99f)
                    curveTo(524.91f, 465.28f, 532.6f, 492.6f, 532.6f, 492.6f)
                    curveTo(532.6f, 492.6f, 544.13f, 493.86f, 548.21f, 490.64f)
                    curveTo(552.28f, 487.41f, 548.08f, 471.45f, 548.08f, 471.45f)
                    curveTo(550.77f, 459.38f, 544.15f, 440.36f, 543.75f, 428.66f)
                    curveTo(544.57f, 423.75f, 540.24f, 419.53f, 539.85f, 414.85f)
                    curveTo(542.71f, 412.67f, 556.61f, 378.55f, 559.44f, 369.02f)
                    curveTo(557.99f, 398.07f, 570.77f, 464.4f, 564.03f, 486.44f)
                    curveTo(560.12f, 499.25f, 569.21f, 496.4f, 582.68f, 497.02f)
                    curveTo(588.68f, 495.23f, 586.24f, 484.96f, 586.24f, 484.96f)
                    curveTo(586.24f, 484.96f, 590.32f, 478.17f, 590.32f, 475.54f)
                    curveTo(593.24f, 463.22f, 596.75f, 436.42f, 595.79f, 430.4f)
                    curveTo(596.23f, 424.01f, 596.45f, 360.16f, 601.33f, 337.79f)
                    curveTo(604.58f, 319.97f, 564.71f, 316.05f, 553.24f, 311.8f)
                    curveTo(534.11f, 302.58f, 537.34f, 315.69f, 527.26f, 327.76f)
                    curveTo(517.54f, 348.57f, 511.82f, 385.74f, 510.39f, 409.52f)
                    close()
                }

                // Person upper body/torso complex
                path(
                    fill = SolidColor(OrataTheme.colors.onSurfaceVariant),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(555.05f, 222.23f)
                    lineTo(566.67f, 209.14f)
                    lineTo(585.04f, 211.18f)
                    lineTo(596.8f, 227.63f)
                    curveTo(609.8f, 230.63f, 612.2f, 241.25f, 609.91f, 254.39f)
                    curveTo(605.35f, 280.67f, 594.09f, 299.04f, 599.21f, 312f)
                    curveTo(606.98f, 331.68f, 603.21f, 346.83f, 584.6f, 344.07f)
                    curveTo(566f, 341.31f, 523.12f, 323.09f, 535.21f, 311f)
                    curveTo(547.29f, 298.91f, 536.49f, 292.58f, 536.49f, 292.58f)
                    lineTo(544.97f, 246.38f)
                    curveTo(542.8f, 234.59f, 543.13f, 223.46f, 555.05f, 222.23f)
                    close()
                }

                // Person left arm
                path(
                    fill = SolidColor(OrataTheme.colors.errorContainer),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(556.54f, 263.7f)
                    lineTo(541.9f, 258.93f)
                    curveTo(535.33f, 266.54f, 529.57f, 288.84f, 529.57f, 288.84f)
                    lineTo(508.75f, 321.22f)
                    curveTo(507.67f, 321.71f, 506.72f, 322.48f, 506.03f, 323.45f)
                    curveTo(505.33f, 324.42f, 504.9f, 325.55f, 504.78f, 326.74f)
                    curveTo(504.66f, 327.93f, 504.86f, 329.13f, 505.35f, 330.22f)
                    curveTo(505.84f, 331.31f, 506.61f, 332.25f, 507.59f, 332.95f)
                    curveTo(508.56f, 333.64f, 509.7f, 334.07f, 510.89f, 334.19f)
                    curveTo(512.07f, 334.3f, 513.27f, 334.11f, 514.36f, 333.61f)
                    curveTo(515.45f, 333.12f, 516.39f, 332.35f, 517.08f, 331.38f)
                    curveTo(517.78f, 330.4f, 518.21f, 329.27f, 518.32f, 328.08f)
                    lineTo(549.58f, 291.61f)
                    lineTo(556.54f, 263.7f)
                    close()
                }

                // Person sleeve
                path(
                    fill = SolidColor(OrataTheme.colors.onSurfaceVariant),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(561.44f, 221.57f)
                    curveTo(563.71f, 222.34f, 565.77f, 223.6f, 567.49f, 225.25f)
                    curveTo(569.22f, 226.91f, 570.55f, 228.92f, 571.41f, 231.15f)
                    curveTo(572.26f, 233.38f, 572.62f, 235.78f, 572.44f, 238.16f)
                    curveTo(572.27f, 240.54f, 571.57f, 242.86f, 570.4f, 244.94f)
                    lineTo(565.63f, 253.42f)
                    curveTo(565.63f, 253.42f, 558.07f, 285.55f, 550.11f, 292.07f)
                    lineTo(531.53f, 313.54f)
                    lineTo(516.8f, 307.12f)
                    lineTo(531.18f, 281.46f)
                    curveTo(531.18f, 281.46f, 537.3f, 268.38f, 535.61f, 261.24f)
                    curveTo(534.57f, 256.87f, 537.13f, 242.84f, 540.84f, 231.71f)
                    curveTo(541.53f, 229.69f, 542.61f, 227.82f, 544.01f, 226.22f)
                    curveTo(545.42f, 224.62f, 547.13f, 223.31f, 549.04f, 222.37f)
                    curveTo(550.96f, 221.43f, 553.04f, 220.87f, 555.16f, 220.74f)
                    curveTo(557.29f, 220.6f, 559.43f, 220.88f, 561.44f, 221.57f)
                    close()
                }

                // Person head
                path(
                    fill = SolidColor(OrataTheme.colors.errorContainer),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(580.32f, 206.35f)
                    curveTo(590.8f, 206.35f, 599.3f, 197.85f, 599.3f, 187.36f)
                    curveTo(599.3f, 176.87f, 590.8f, 168.37f, 580.32f, 168.37f)
                    curveTo(569.83f, 168.37f, 561.33f, 176.87f, 561.33f, 187.36f)
                    curveTo(561.33f, 197.85f, 569.83f, 206.35f, 580.32f, 206.35f)
                    close()
                }

                // Person hair
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
                    moveTo(563.79f, 170.28f)
                    curveTo(564.07f, 168.7f, 564.71f, 167.21f, 565.65f, 165.91f)
                    curveTo(566.12f, 165.35f, 566.71f, 164.89f, 567.37f, 164.57f)
                    curveTo(568.03f, 164.25f, 568.75f, 164.07f, 569.49f, 164.05f)
                    curveTo(570.22f, 164.03f, 570.95f, 164.16f, 571.63f, 164.44f)
                    curveTo(572.31f, 164.72f, 572.92f, 165.14f, 573.43f, 165.67f)
                    curveTo(573.13f, 164.81f, 573.05f, 163.89f, 573.18f, 162.98f)
                    curveTo(574.57f, 163.65f, 576.05f, 164.09f, 577.57f, 164.29f)
                    lineTo(574.21f, 160.77f)
                    curveTo(581.13f, 157.7f, 586.85f, 157.86f, 590.98f, 162.31f)
                    curveTo(592.16f, 163.59f, 594.58f, 162.7f, 595.85f, 164.01f)
                    curveTo(597.12f, 165.33f, 597.19f, 168.13f, 595.58f, 168.87f)
                    curveTo(598.75f, 167.68f, 602.39f, 169.41f, 604.47f, 172.3f)
                    curveTo(606.56f, 175.2f, 607.33f, 179.03f, 607.47f, 182.74f)
                    curveTo(607.66f, 187.55f, 606.76f, 192.67f, 603.82f, 196.21f)
                    curveTo(601.9f, 198.53f, 599.28f, 199.97f, 597.16f, 202.06f)
                    lineTo(597.09f, 202.12f)
                    curveTo(594.77f, 204.51f, 591.85f, 206.24f, 588.64f, 207.13f)
                    curveTo(585.43f, 208.02f, 582.04f, 208.05f, 578.81f, 207.21f)
                    curveTo(578.45f, 207.11f, 578.09f, 207f, 577.73f, 206.9f)
                    curveTo(575.92f, 207.72f, 573.67f, 206.6f, 572.53f, 204.78f)
                    curveTo(571.31f, 202.84f, 571.07f, 200.36f, 571.02f, 198f)
                    curveTo(570.95f, 194.91f, 571.14f, 191.82f, 571.59f, 188.77f)
                    curveTo(572.09f, 185.32f, 572.54f, 180.91f, 569.82f, 179.18f)
                    curveTo(567.69f, 177.84f, 565.06f, 179.17f, 562.92f, 180.49f)
                    curveTo(562.71f, 177.06f, 563.01f, 173.62f, 563.79f, 170.28f)
                    close()
                }

                // Ground line
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
                    moveTo(749.94f, 526.6f)
                    lineTo(1.19f, 526.91f)
                    curveTo(0.88f, 526.91f, 0.57f, 526.78f, 0.35f, 526.56f)
                    curveTo(0.13f, 526.34f, 0f, 526.04f, 0f, 525.72f)
                    curveTo(0f, 525.41f, 0.13f, 525.1f, 0.35f, 524.88f)
                    curveTo(0.57f, 524.66f, 0.88f, 524.53f, 1.19f, 524.53f)
                    lineTo(749.94f, 524.22f)
                    curveTo(750.26f, 524.22f, 750.56f, 524.35f, 750.78f, 524.57f)
                    curveTo(751.01f, 524.79f, 751.13f, 525.1f, 751.13f, 525.41f)
                    curveTo(751.13f, 525.73f, 751.01f, 526.03f, 750.78f, 526.26f)
                    curveTo(750.56f, 526.48f, 750.26f, 526.6f, 749.94f, 526.6f)
                    close()
                }
            }
        }.build()
    }
}