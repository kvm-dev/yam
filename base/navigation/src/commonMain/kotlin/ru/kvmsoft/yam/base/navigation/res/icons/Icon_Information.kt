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

val iconInformation: ImageVector
    get() {
        if (_iconInformation != null) {
            return _iconInformation!!
        }
        _iconInformation = Builder(name = "IconInformation", defaultWidth = 295.0.dp, defaultHeight
                = 353.0.dp, viewportWidth = 295.0f, viewportHeight = 353.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.82f, -0.0f)
                horizontalLineTo(59.42f)
                curveTo(27.0f, -0.0f, 0.63f, 26.37f, 0.63f, 58.8f)
                verticalLineTo(205.8f)
                curveTo(0.63f, 238.23f, 27.0f, 264.6f, 59.42f, 264.6f)
                horizontalLineTo(103.53f)
                lineTo(103.58f, 328.05f)
                curveTo(103.58f, 338.09f, 109.57f, 347.05f, 118.86f, 350.9f)
                curveTo(121.84f, 352.14f, 124.97f, 352.76f, 128.1f, 352.76f)
                curveTo(134.67f, 352.76f, 141.29f, 350.02f, 146.73f, 344.51f)
                lineTo(212.76f, 264.6f)
                horizontalLineTo(235.82f)
                curveTo(268.25f, 264.6f, 294.63f, 238.23f, 294.63f, 205.8f)
                verticalLineTo(58.8f)
                curveTo(294.63f, 26.37f, 268.25f, -0.0f, 235.82f, -0.0f)
                close()
                moveTo(147.63f, 58.8f)
                curveTo(155.74f, 58.8f, 162.32f, 65.39f, 162.32f, 73.5f)
                curveTo(162.32f, 81.61f, 155.74f, 88.2f, 147.63f, 88.2f)
                curveTo(139.51f, 88.2f, 132.93f, 81.61f, 132.93f, 73.5f)
                curveTo(132.93f, 65.39f, 139.51f, 58.8f, 147.63f, 58.8f)
                close()
                moveTo(177.02f, 205.8f)
                horizontalLineTo(118.22f)
                curveTo(110.1f, 205.8f, 103.53f, 199.21f, 103.53f, 191.1f)
                curveTo(103.53f, 182.99f, 110.1f, 176.4f, 118.22f, 176.4f)
                horizontalLineTo(132.93f)
                verticalLineTo(132.3f)
                curveTo(124.8f, 132.3f, 118.22f, 125.71f, 118.22f, 117.6f)
                curveTo(118.22f, 109.49f, 124.8f, 102.9f, 132.93f, 102.9f)
                horizontalLineTo(147.62f)
                curveTo(155.75f, 102.9f, 162.32f, 109.49f, 162.32f, 117.6f)
                verticalLineTo(176.4f)
                horizontalLineTo(177.02f)
                curveTo(185.15f, 176.4f, 191.72f, 182.99f, 191.72f, 191.1f)
                curveTo(191.72f, 199.21f, 185.15f, 205.8f, 177.02f, 205.8f)
                close()
            }
        }
        .build()
        return _iconInformation!!
    }

private var _iconInformation: ImageVector? = null