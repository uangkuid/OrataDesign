package com.oratakashi.design.app.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.oratakashi.design.foundation.OrataTheme

internal object TextFieldIcon : DynamicIcons {
    @Composable
    override fun icons(): ImageVector {
        return ImageVector.Builder(
            name = "TextFieldIcon",
            defaultWidth = 281.dp,
            defaultHeight = 151.dp,
            viewportWidth = 281f,
            viewportHeight = 151f
        ).apply {
            // Background
            path(
                fill = SolidColor(OrataTheme.colors.surface),
                fillAlpha = 1f
            ) {
                moveTo(1f, 1f)
                horizontalLineToRelative(279.5f)
                verticalLineToRelative(149f)
                horizontalLineToRelative(-279.5f)
                close()
            }

            // Outer border
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(OrataTheme.colors.outlineVariant),
                strokeLineWidth = 1f
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

            // "Label" text
            path(
                fill = SolidColor(OrataTheme.colors.onSurface),
                fillAlpha = 1f
            ) {
                moveTo(31.65f, 48.71f)
                horizontalLineTo(34.94f)
                verticalLineTo(50f)
                horizontalLineTo(30.05f)
                verticalLineTo(40.27f)
                horizontalLineTo(31.65f)
                verticalLineTo(48.71f)
                close()
                moveTo(35.74f, 46.11f)
                curveTo(35.74f, 45.33f, 35.9f, 44.65f, 36.21f, 44.05f)
                curveTo(36.54f, 43.45f, 36.98f, 42.99f, 37.53f, 42.66f)
                curveTo(38.09f, 42.33f, 38.71f, 42.16f, 39.38f, 42.16f)
                curveTo(39.99f, 42.16f, 40.51f, 42.28f, 40.96f, 42.52f)
                curveTo(41.42f, 42.76f, 41.78f, 43.05f, 42.05f, 43.41f)
                verticalLineTo(42.29f)
                horizontalLineTo(43.66f)
                verticalLineTo(50f)
                horizontalLineTo(42.05f)
                verticalLineTo(48.85f)
                curveTo(41.78f, 49.22f, 41.41f, 49.52f, 40.95f, 49.76f)
                curveTo(40.48f, 50f, 39.95f, 50.13f, 39.35f, 50.13f)
                curveTo(38.69f, 50.13f, 38.08f, 49.96f, 37.53f, 49.62f)
                curveTo(36.98f, 49.28f, 36.54f, 48.8f, 36.21f, 48.19f)
                curveTo(35.9f, 47.58f, 35.74f, 46.88f, 35.74f, 46.11f)
                close()
                moveTo(42.05f, 46.14f)
                curveTo(42.05f, 45.6f, 41.94f, 45.14f, 41.72f, 44.75f)
                curveTo(41.5f, 44.36f, 41.22f, 44.06f, 40.86f, 43.85f)
                curveTo(40.51f, 43.65f, 40.13f, 43.55f, 39.71f, 43.55f)
                curveTo(39.3f, 43.55f, 38.92f, 43.65f, 38.57f, 43.85f)
                curveTo(38.21f, 44.05f, 37.92f, 44.34f, 37.7f, 44.74f)
                curveTo(37.48f, 45.12f, 37.38f, 45.58f, 37.38f, 46.11f)
                curveTo(37.38f, 46.64f, 37.48f, 47.11f, 37.7f, 47.51f)
                curveTo(37.92f, 47.91f, 38.21f, 48.22f, 38.57f, 48.43f)
                curveTo(38.93f, 48.64f, 39.31f, 48.74f, 39.71f, 48.74f)
                curveTo(40.13f, 48.74f, 40.51f, 48.64f, 40.86f, 48.43f)
                curveTo(41.22f, 48.23f, 41.5f, 47.93f, 41.72f, 47.54f)
                curveTo(41.94f, 47.13f, 42.05f, 46.67f, 42.05f, 46.14f)
                close()
                moveTo(47.35f, 43.43f)
                curveTo(47.63f, 43.06f, 47.99f, 42.76f, 48.46f, 42.52f)
                curveTo(48.94f, 42.28f, 49.46f, 42.16f, 50.04f, 42.16f)
                curveTo(50.72f, 42.16f, 51.34f, 42.32f, 51.89f, 42.65f)
                curveTo(52.44f, 42.98f, 52.88f, 43.44f, 53.19f, 44.05f)
                curveTo(53.51f, 44.65f, 53.67f, 45.33f, 53.67f, 46.11f)
                curveTo(53.67f, 46.88f, 53.51f, 47.58f, 53.19f, 48.19f)
                curveTo(52.88f, 48.8f, 52.44f, 49.28f, 51.88f, 49.62f)
                curveTo(51.33f, 49.96f, 50.72f, 50.13f, 50.04f, 50.13f)
                curveTo(49.45f, 50.13f, 48.91f, 50.01f, 48.45f, 49.78f)
                curveTo(47.99f, 49.54f, 47.63f, 49.24f, 47.35f, 48.88f)
                verticalLineTo(50f)
                horizontalLineTo(45.76f)
                verticalLineTo(39.64f)
                horizontalLineTo(47.35f)
                verticalLineTo(43.43f)
                close()
                moveTo(52.04f, 46.11f)
                curveTo(52.04f, 45.58f, 51.93f, 45.12f, 51.71f, 44.74f)
                curveTo(51.49f, 44.34f, 51.21f, 44.05f, 50.84f, 43.85f)
                curveTo(50.49f, 43.65f, 50.1f, 43.55f, 49.69f, 43.55f)
                curveTo(49.29f, 43.55f, 48.91f, 43.65f, 48.54f, 43.85f)
                curveTo(48.19f, 44.06f, 47.9f, 44.36f, 47.68f, 44.75f)
                curveTo(47.46f, 45.14f, 47.35f, 45.6f, 47.35f, 46.14f)
                curveTo(47.35f, 46.67f, 47.46f, 47.13f, 47.68f, 47.54f)
                curveTo(47.9f, 47.93f, 48.19f, 48.23f, 48.54f, 48.43f)
                curveTo(48.91f, 48.64f, 49.29f, 48.74f, 49.69f, 48.74f)
                curveTo(50.1f, 48.74f, 50.49f, 48.64f, 50.84f, 48.43f)
                curveTo(51.21f, 48.22f, 51.49f, 47.91f, 51.71f, 47.51f)
                curveTo(51.93f, 47.11f, 52.04f, 46.64f, 52.04f, 46.11f)
                close()
                moveTo(62.32f, 45.95f)
                curveTo(62.32f, 46.24f, 62.3f, 46.5f, 62.26f, 46.74f)
                horizontalLineTo(56.37f)
                curveTo(56.41f, 47.35f, 56.64f, 47.85f, 57.05f, 48.22f)
                curveTo(57.46f, 48.6f, 57.97f, 48.78f, 58.57f, 48.78f)
                curveTo(59.42f, 48.78f, 60.03f, 48.42f, 60.39f, 47.7f)
                horizontalLineTo(62.11f)
                curveTo(61.87f, 48.41f, 61.45f, 49f, 60.83f, 49.45f)
                curveTo(60.23f, 49.9f, 59.47f, 50.13f, 58.57f, 50.13f)
                curveTo(57.83f, 50.13f, 57.17f, 49.96f, 56.58f, 49.64f)
                curveTo(56f, 49.3f, 55.54f, 48.83f, 55.21f, 48.24f)
                curveTo(54.88f, 47.63f, 54.72f, 46.93f, 54.72f, 46.14f)
                curveTo(54.72f, 45.34f, 54.87f, 44.65f, 55.19f, 44.05f)
                curveTo(55.52f, 43.44f, 55.97f, 42.98f, 56.55f, 42.65f)
                curveTo(57.14f, 42.32f, 57.81f, 42.16f, 58.57f, 42.16f)
                curveTo(59.29f, 42.16f, 59.94f, 42.32f, 60.51f, 42.64f)
                curveTo(61.08f, 42.95f, 61.52f, 43.4f, 61.84f, 43.98f)
                curveTo(62.16f, 44.55f, 62.32f, 45.21f, 62.32f, 45.95f)
                close()
                moveTo(60.65f, 45.45f)
                curveTo(60.64f, 44.86f, 60.43f, 44.39f, 60.02f, 44.04f)
                curveTo(59.61f, 43.68f, 59.1f, 43.5f, 58.5f, 43.5f)
                curveTo(57.94f, 43.5f, 57.47f, 43.68f, 57.08f, 44.04f)
                curveTo(56.69f, 44.38f, 56.46f, 44.85f, 56.38f, 45.45f)
                horizontalLineTo(60.65f)
                close()
                moveTo(65.48f, 39.64f)
                verticalLineTo(50f)
                horizontalLineTo(63.89f)
                verticalLineTo(39.64f)
                horizontalLineTo(65.48f)
                close()
            }

            // Red asterisk
            path(
                fill = SolidColor(OrataTheme.colors.error),
                fillAlpha = 1f
            ) {
                moveTo(73.24f, 45.16f)
                lineTo(72.34f, 44.64f)
                lineTo(73.59f, 42.68f)
                lineTo(73.8f, 42.96f)
                lineTo(71.45f, 43.07f)
                verticalLineTo(42.05f)
                lineTo(73.8f, 42.16f)
                lineTo(73.6f, 42.44f)
                lineTo(72.36f, 40.48f)
                lineTo(73.24f, 39.96f)
                lineTo(74.25f, 41.96f)
                horizontalLineTo(74.08f)
                lineTo(75.07f, 39.96f)
                lineTo(75.97f, 40.49f)
                lineTo(74.71f, 42.44f)
                lineTo(74.53f, 42.16f)
                lineTo(76.87f, 42.05f)
                verticalLineTo(43.07f)
                lineTo(74.53f, 42.96f)
                lineTo(74.71f, 42.68f)
                lineTo(75.97f, 44.64f)
                lineTo(75.07f, 45.14f)
                lineTo(74.08f, 43.14f)
                horizontalLineTo(74.25f)
                lineTo(73.24f, 45.16f)
                close()
            }

            // White text field background
            path(
                fill = SolidColor(OrataTheme.colors.surfaceContainer),
                fillAlpha = 1f
            ) {
                moveTo(29f, 77f)
                curveTo(29f, 69.27f, 35.27f, 63f, 43f, 63f)
                horizontalLineTo(239f)
                curveTo(246.73f, 63f, 253f, 69.27f, 253f, 77f)
                verticalLineTo(101f)
                curveTo(253f, 108.73f, 246.73f, 115f, 239f, 115f)
                horizontalLineTo(43f)
                curveTo(35.27f, 115f, 29f, 108.73f, 29f, 101f)
                verticalLineTo(77f)
                close()
            }

            // Blue text field border
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(OrataTheme.colors.primary),
                strokeLineWidth = 1f
            ) {
                moveTo(43f, 63.5f)
                horizontalLineTo(239f)
                curveTo(246.46f, 63.5f, 252.5f, 69.54f, 252.5f, 77f)
                verticalLineTo(101f)
                curveTo(252.5f, 108.46f, 246.46f, 114.5f, 239f, 114.5f)
                horizontalLineTo(43f)
                curveTo(35.54f, 114.5f, 29.5f, 108.46f, 29.5f, 101f)
                verticalLineTo(77f)
                curveTo(29.5f, 69.54f, 35.54f, 63.5f, 43f, 63.5f)
                close()
            }

            // "Text" text inside field
            path(
                fill = SolidColor(OrataTheme.colors.onSurface),
                fillAlpha = 1f
            ) {
                moveTo(56.08f, 84.24f)
                verticalLineTo(85.28f)
                horizontalLineTo(53.42f)
                verticalLineTo(94f)
                horizontalLineTo(52.15f)
                verticalLineTo(85.28f)
                horizontalLineTo(49.48f)
                verticalLineTo(84.24f)
                horizontalLineTo(56.08f)
                close()
                moveTo(64.65f, 89.87f)
                curveTo(64.65f, 90.11f, 64.64f, 90.37f, 64.61f, 90.64f)
                horizontalLineTo(58.48f)
                curveTo(58.52f, 91.4f, 58.78f, 91.99f, 59.25f, 92.42f)
                curveTo(59.72f, 92.84f, 60.3f, 93.05f, 60.97f, 93.05f)
                curveTo(61.52f, 93.05f, 61.98f, 92.92f, 62.34f, 92.67f)
                curveTo(62.72f, 92.41f, 62.98f, 92.06f, 63.13f, 91.63f)
                horizontalLineTo(64.5f)
                curveTo(64.29f, 92.37f, 63.88f, 92.97f, 63.27f, 93.44f)
                curveTo(62.65f, 93.9f, 61.88f, 94.13f, 60.97f, 94.13f)
                curveTo(60.24f, 94.13f, 59.59f, 93.96f, 59.01f, 93.64f)
                curveTo(58.44f, 93.31f, 57.99f, 92.85f, 57.67f, 92.25f)
                curveTo(57.34f, 91.64f, 57.18f, 90.94f, 57.18f, 90.15f)
                curveTo(57.18f, 89.36f, 57.33f, 88.66f, 57.65f, 88.06f)
                curveTo(57.97f, 87.47f, 58.41f, 87.01f, 58.98f, 86.69f)
                curveTo(59.56f, 86.37f, 60.22f, 86.2f, 60.97f, 86.2f)
                curveTo(61.7f, 86.2f, 62.34f, 86.36f, 62.9f, 86.68f)
                curveTo(63.46f, 87f, 63.89f, 87.43f, 64.19f, 87.99f)
                curveTo(64.5f, 88.54f, 64.65f, 89.17f, 64.65f, 89.87f)
                close()
                moveTo(63.34f, 89.6f)
                curveTo(63.34f, 89.12f, 63.23f, 88.7f, 63.01f, 88.36f)
                curveTo(62.8f, 88f, 62.51f, 87.74f, 62.13f, 87.56f)
                curveTo(61.77f, 87.37f, 61.36f, 87.28f, 60.91f, 87.28f)
                curveTo(60.27f, 87.28f, 59.72f, 87.49f, 59.26f, 87.9f)
                curveTo(58.81f, 88.31f, 58.56f, 88.88f, 58.49f, 89.6f)
                horizontalLineTo(63.34f)
                close()
                moveTo(70.34f, 94f)
                lineTo(68.52f, 91.14f)
                lineTo(66.77f, 94f)
                horizontalLineTo(65.44f)
                lineTo(67.92f, 90.19f)
                lineTo(65.44f, 86.33f)
                horizontalLineTo(66.88f)
                lineTo(68.7f, 89.17f)
                lineTo(70.44f, 86.33f)
                horizontalLineTo(71.77f)
                lineTo(69.3f, 90.12f)
                lineTo(71.78f, 94f)
                horizontalLineTo(70.34f)
                close()
                moveTo(74.59f, 87.38f)
                verticalLineTo(91.9f)
                curveTo(74.59f, 92.27f, 74.67f, 92.54f, 74.83f, 92.7f)
                curveTo(74.98f, 92.85f, 75.26f, 92.92f, 75.65f, 92.92f)
                horizontalLineTo(76.59f)
                verticalLineTo(94f)
                horizontalLineTo(75.44f)
                curveTo(74.73f, 94f, 74.2f, 93.84f, 73.85f, 93.51f)
                curveTo(73.49f, 93.18f, 73.31f, 92.65f, 73.31f, 91.9f)
                verticalLineTo(87.38f)
                horizontalLineTo(72.32f)
                verticalLineTo(86.33f)
                horizontalLineTo(73.31f)
                verticalLineTo(84.4f)
                horizontalLineTo(74.59f)
                verticalLineTo(86.33f)
                horizontalLineTo(76.59f)
                verticalLineTo(87.38f)
                horizontalLineTo(74.59f)
                close()
            }

            // Blue cursor line
            path(
                fill = SolidColor(OrataTheme.colors.primary),
                fillAlpha = 1f
            ) {
                moveTo(79.47f, 96.88f)
                verticalLineTo(82.72f)
                horizontalLineTo(80.77f)
                verticalLineTo(96.88f)
                horizontalLineTo(79.47f)
                close()
            }

            // Clear icon (X in circle)
            path(
                fill = SolidColor(OrataTheme.colors.onSurfaceVariant),
                fillAlpha = 1f
            ) {
                moveTo(221f, 79f)
                curveTo(215.47f, 79f, 211f, 83.47f, 211f, 89f)
                curveTo(211f, 94.53f, 215.47f, 99f, 221f, 99f)
                curveTo(226.53f, 99f, 231f, 94.53f, 231f, 89f)
                curveTo(231f, 83.47f, 226.53f, 79f, 221f, 79f)
                close()
                moveTo(226f, 92.59f)
                lineTo(224.59f, 94f)
                lineTo(221f, 90.41f)
                lineTo(217.41f, 94f)
                lineTo(216f, 92.59f)
                lineTo(219.59f, 89f)
                lineTo(216f, 85.41f)
                lineTo(217.41f, 84f)
                lineTo(221f, 87.59f)
                lineTo(224.59f, 84f)
                lineTo(226f, 85.41f)
                lineTo(222.41f, 89f)
                lineTo(226f, 92.59f)
                close()
            }
        }.build()
    }
}
