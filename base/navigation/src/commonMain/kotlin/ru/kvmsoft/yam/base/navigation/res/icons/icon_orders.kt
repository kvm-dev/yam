package ru.kvmsoft.yam.base.navigation.res.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val iconOrders: ImageVector
    get() {
        if (_iconOrders != null) {
            return _iconOrders!!
        }
        _iconOrders = Builder(name = "IconOrders", defaultWidth = 294.0.dp, defaultHeight =
                294.0.dp, viewportWidth = 294.0f, viewportHeight = 294.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(238.88f, 183.75f)
                    horizontalLineTo(183.75f)
                    curveTo(173.64f, 183.75f, 165.38f, 175.48f, 165.38f, 165.38f)
                    curveTo(165.38f, 155.27f, 173.64f, 147.0f, 183.75f, 147.0f)
                    horizontalLineTo(238.88f)
                    curveTo(238.88f, 147.0f, 294.0f, 85.56f, 294.0f, 55.13f)
                    curveTo(294.0f, 24.69f, 269.31f, 0.0f, 238.88f, 0.0f)
                    curveTo(208.44f, 0.0f, 183.75f, 24.69f, 183.75f, 55.13f)
                    curveTo(183.75f, 69.77f, 196.5f, 91.53f, 209.76f, 110.25f)
                    horizontalLineTo(183.75f)
                    curveTo(153.37f, 110.25f, 128.63f, 135.0f, 128.63f, 165.38f)
                    curveTo(128.63f, 195.75f, 153.37f, 220.5f, 183.75f, 220.5f)
                    horizontalLineTo(238.88f)
                    curveTo(248.98f, 220.5f, 257.25f, 228.77f, 257.25f, 238.88f)
                    curveTo(257.25f, 248.98f, 248.98f, 257.25f, 238.88f, 257.25f)
                    horizontalLineTo(106.52f)
                    curveTo(97.33f, 271.49f, 87.11f, 284.64f, 79.36f, 294.0f)
                    horizontalLineTo(238.88f)
                    curveTo(269.25f, 294.0f, 294.0f, 269.25f, 294.0f, 238.88f)
                    curveTo(294.0f, 208.5f, 269.25f, 183.75f, 238.88f, 183.75f)
                    close()
                    moveTo(238.88f, 36.75f)
                    curveTo(249.04f, 36.75f, 257.25f, 44.96f, 257.25f, 55.13f)
                    curveTo(257.25f, 65.29f, 249.04f, 73.5f, 238.88f, 73.5f)
                    curveTo(228.71f, 73.5f, 220.5f, 65.29f, 220.5f, 55.13f)
                    curveTo(220.5f, 44.96f, 228.71f, 36.75f, 238.88f, 36.75f)
                    close()
                    moveTo(55.13f, 147.0f)
                    curveTo(24.69f, 147.0f, 0.0f, 171.69f, 0.0f, 202.13f)
                    curveTo(0.0f, 232.56f, 55.13f, 294.0f, 55.13f, 294.0f)
                    curveTo(55.13f, 294.0f, 110.25f, 232.56f, 110.25f, 202.13f)
                    curveTo(110.25f, 171.69f, 85.56f, 147.0f, 55.13f, 147.0f)
                    close()
                    moveTo(55.13f, 220.5f)
                    curveTo(44.96f, 220.5f, 36.75f, 212.29f, 36.75f, 202.13f)
                    curveTo(36.75f, 191.96f, 44.96f, 183.75f, 55.13f, 183.75f)
                    curveTo(65.29f, 183.75f, 73.5f, 191.96f, 73.5f, 202.13f)
                    curveTo(73.5f, 212.29f, 65.29f, 220.5f, 55.13f, 220.5f)
                    close()
                }
            }
        }
        .build()
        return _iconOrders!!
    }

private var _iconOrders: ImageVector? = null
