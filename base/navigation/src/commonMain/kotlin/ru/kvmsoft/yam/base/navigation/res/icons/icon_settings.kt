package ru.kvmsoft.yam.base.navigation.res.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val iconSettings: ImageVector
    get() {
        if (_iconSettings != null) {
            return _iconSettings!!
        }
        _iconSettings = Builder(name = "IconSettings", defaultWidth = 294.0.dp, defaultHeight =
                294.0.dp, viewportWidth = 294.0f, viewportHeight = 294.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.7f, 0.0f)
                horizontalLineTo(85.45f)
                curveTo(31.91f, 0.0f, 0.0f, 31.9f, 0.0f, 85.41f)
                verticalLineTo(208.45f)
                curveTo(0.0f, 262.1f, 31.91f, 294.0f, 85.45f, 294.0f)
                horizontalLineTo(208.55f)
                curveTo(262.08f, 294.0f, 294.0f, 262.1f, 294.0f, 208.59f)
                verticalLineTo(85.41f)
                curveTo(294.15f, 31.9f, 262.23f, 0.0f, 208.7f, 0.0f)
                close()
                moveTo(83.39f, 51.45f)
                curveTo(83.39f, 45.42f, 88.39f, 40.42f, 94.42f, 40.42f)
                curveTo(100.45f, 40.42f, 105.45f, 45.42f, 105.45f, 51.45f)
                verticalLineTo(108.78f)
                curveTo(105.45f, 114.81f, 100.45f, 119.81f, 94.42f, 119.81f)
                curveTo(88.39f, 119.81f, 83.39f, 114.81f, 83.39f, 108.78f)
                verticalLineTo(51.45f)
                close()
                moveTo(110.64f, 212.14f)
                curveTo(107.65f, 213.47f, 105.45f, 216.28f, 105.45f, 219.56f)
                verticalLineTo(242.55f)
                curveTo(105.45f, 248.58f, 100.45f, 253.57f, 94.42f, 253.57f)
                curveTo(88.39f, 253.57f, 83.39f, 248.58f, 83.39f, 242.55f)
                verticalLineTo(219.56f)
                curveTo(83.39f, 216.28f, 81.19f, 213.47f, 78.2f, 212.14f)
                curveTo(64.16f, 205.89f, 54.42f, 191.95f, 54.42f, 175.66f)
                curveTo(54.42f, 153.62f, 72.36f, 135.53f, 94.42f, 135.53f)
                curveTo(116.48f, 135.53f, 134.57f, 153.47f, 134.57f, 175.66f)
                curveTo(134.57f, 191.96f, 124.71f, 205.9f, 110.64f, 212.14f)
                close()
                moveTo(210.76f, 242.55f)
                curveTo(210.76f, 248.58f, 205.76f, 253.57f, 199.73f, 253.57f)
                curveTo(193.7f, 253.57f, 188.7f, 248.58f, 188.7f, 242.55f)
                verticalLineTo(185.22f)
                curveTo(188.7f, 179.19f, 193.7f, 174.2f, 199.73f, 174.2f)
                curveTo(205.76f, 174.2f, 210.76f, 179.19f, 210.76f, 185.22f)
                verticalLineTo(242.55f)
                close()
                moveTo(199.73f, 158.32f)
                curveTo(177.66f, 158.32f, 159.57f, 140.38f, 159.57f, 118.19f)
                curveTo(159.57f, 101.9f, 169.44f, 87.96f, 183.51f, 81.71f)
                curveTo(186.5f, 80.39f, 188.7f, 77.57f, 188.7f, 74.3f)
                verticalLineTo(51.45f)
                curveTo(188.7f, 45.42f, 193.7f, 40.42f, 199.73f, 40.42f)
                curveTo(205.76f, 40.42f, 210.76f, 45.42f, 210.76f, 51.45f)
                verticalLineTo(74.44f)
                curveTo(210.76f, 77.72f, 212.95f, 80.53f, 215.95f, 81.86f)
                curveTo(229.98f, 88.11f, 239.73f, 102.05f, 239.73f, 118.33f)
                curveTo(239.73f, 140.38f, 221.79f, 158.32f, 199.73f, 158.32f)
                close()
            }
        }
        .build()
        return _iconSettings!!
    }

private var _iconSettings: ImageVector? = null