package ru.kvmsoft.yam.home.impl.presentation.res.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val userPosition: ImageVector
    get() {
        if (_userPosition != null) {
            return _userPosition!!
        }
        _userPosition = Builder(name = "UserPosition", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 127.4f)
                curveToRelative(35.4f, 0.0f, 63.7f, -28.3f, 63.7f, -63.7f)
                reflectiveCurveTo(291.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-63.7f, 28.3f, -63.7f, 63.7f)
                reflectiveCurveTo(220.6f, 127.4f, 256.0f, 127.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.1f, 319.3f)
                horizontalLineToRelative(21.2f)
                verticalLineTo(405.0f)
                curveToRelative(0.0f, 11.8f, 9.4f, 21.2f, 21.2f, 21.2f)
                horizontalLineToRelative(84.9f)
                curveToRelative(11.8f, 0.0f, 21.2f, -9.4f, 21.2f, -21.2f)
                verticalLineToRelative(-85.7f)
                horizontalLineToRelative(21.2f)
                curveToRelative(11.8f, 0.0f, 21.2f, -9.4f, 21.2f, -21.2f)
                verticalLineToRelative(-42.5f)
                curveToRelative(0.0f, -59.0f, -48.0f, -106.2f, -106.2f, -106.2f)
                curveToRelative(-59.0f, 0.0f, -106.2f, 48.0f, -106.2f, 106.2f)
                verticalLineToRelative(42.5f)
                curveTo(149.8f, 309.9f, 159.3f, 319.3f, 171.1f, 319.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.3f, 358.6f)
                lineToRelative(-12.6f, 40.9f)
                curveToRelative(39.3f, 11.8f, 48.0f, 25.2f, 48.0f, 26.7f)
                curveToRelative(0.0f, 11.0f, -58.2f, 42.5f, -170.7f, 42.5f)
                reflectiveCurveTo(85.3f, 437.3f, 85.3f, 426.3f)
                curveToRelative(0.0f, -2.4f, 8.7f, -15.7f, 51.1f, -27.5f)
                lineToRelative(-11.8f, -40.9f)
                curveToRelative(-67.6f, 19.7f, -81.8f, 48.0f, -81.8f, 69.2f)
                curveTo(42.9f, 485.3f, 153.0f, 512.0f, 256.0f, 512.0f)
                curveToRelative(102.2f, 0.0f, 213.1f, -26.7f, 213.1f, -84.9f)
                curveTo(469.1f, 405.8f, 455.8f, 377.5f, 391.3f, 358.6f)
                close()
            }
        }
        .build()
        return _userPosition!!
    }

private var _userPosition: ImageVector? = null
