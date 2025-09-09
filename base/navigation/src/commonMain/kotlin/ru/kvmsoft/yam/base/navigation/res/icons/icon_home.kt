package ru.kvmsoft.yam.base.navigation.res.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val iconHome: ImageVector
    get() {
        if (_iconHome != null) return _iconHome!!
        
        _iconHome = ImageVector.Builder(
            name = "iconHome",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 294.841f,
            viewportHeight = 294.841f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(64.78f, 72.898f)
                    curveToRelative(13.162f, 0f, 23.831f, -10.662f, 23.831f, -23.831f)
                    curveToRelative(0f, -13.161f, -10.669f, -23.823f, -23.831f, -23.823f)
                    curveToRelative(-13.165f, 0f, -23.832f, 10.662f, -23.832f, 23.823f)
                    curveTo(40.948f, 62.236f, 51.615f, 72.898f, 64.78f, 72.898f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(93.667f, 98f)
                    horizontalLineToRelative(63.99f)
                    curveToRelative(5.629f, 0f, 10.191f, -4.563f, 10.191f, -10.191f)
                    reflectiveCurveToRelative(-4.563f, -10.191f, -10.191f, -10.191f)
                    curveToRelative(-54.999f, -0.031f, -111.486f, -0.041f, -112.848f, 0.027f)
                    curveToRelative(-4.092f, 0.205f, -8.1f, 1.982f, -9.903f, 5.932f)
                    lineTo(0.923f, 158.024f)
                    curveToRelative(-2.337f, 5.121f, -0.081f, 11.166f, 5.039f, 13.504f)
                    curveToRelative(5.128f, 2.34f, 11.169f, 0.075f, 13.504f, -5.039f)
                    lineToRelative(16.424f, -35.979f)
                    curveToRelative(0f, 40.338f, -0.03f, 126.857f, -0.03f, 126.857f)
                    curveToRelative(0f, 6.755f, 5.476f, 12.23f, 12.231f, 12.23f)
                    reflectiveCurveToRelative(12.23f, -5.476f, 12.23f, -12.23f)
                    verticalLineToRelative(-72.879f)
                    horizontalLineToRelative(8.917f)
                    verticalLineToRelative(72.879f)
                    curveToRelative(0f, 6.755f, 5.476f, 12.23f, 12.23f, 12.23f)
                    curveToRelative(6.755f, 0f, 12.23f, -5.476f, 12.23f, -12.23f)
                    curveTo(93.698f, 111.141f, 93.667f, 194.591f, 93.667f, 98f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(290.206f, 154.464f)
                    horizontalLineToRelative(-15.892f)
                    lineToRelative(-11.085f, -27.976f)
                    curveToRelative(-2.397f, -6.05f, -8.246f, -10.023f, -14.754f, -10.023f)
                    horizontalLineToRelative(-85.578f)
                    curveToRelative(-6.604f, 0f, -12.517f, 4.089f, -14.848f, 10.267f)
                    lineToRelative(-10.466f, 27.733f)
                    horizontalLineToRelative(-15.608f)
                    curveToRelative(-2.56f, 0f, -4.635f, 2.075f, -4.635f, 4.635f)
                    verticalLineToRelative(8.73f)
                    curveToRelative(0f, 2.559f, 2.075f, 4.635f, 4.635f, 4.635f)
                    horizontalLineToRelative(10.781f)
                    verticalLineToRelative(35.966f)
                    curveToRelative(0f, 5.817f, 4.716f, 10.534f, 10.534f, 10.534f)
                    horizontalLineToRelative(4.8f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 8.284f, 6.716f, 15f, 15f, 15f)
                    reflectiveCurveToRelative(15f, -6.716f, 15f, -15f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(56f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 8.284f, 6.716f, 15f, 15f, 15f)
                    curveToRelative(8.284f, 0f, 15f, -6.716f, 15f, -15f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(4.799f)
                    curveToRelative(5.818f, 0f, 10.534f, -4.717f, 10.534f, -10.534f)
                    verticalLineToRelative(-35.966f)
                    horizontalLineToRelative(10.782f)
                    curveToRelative(2.56f, 0f, 4.635f, -2.075f, 4.635f, -4.635f)
                    verticalLineToRelative(-8.73f)
                    curveTo(294.841f, 156.539f, 292.765f, 154.464f, 290.206f, 154.464f)
                    close()
                    moveTo(180.249f, 194.412f)
                    curveToRelative(0f, 2.609f, -2.162f, 4.636f, -4.635f, 4.636f)
                    horizontalLineToRelative(-25.047f)
                    curveToRelative(-2.475f, 0f, -4.635f, -2.027f, -4.635f, -4.636f)
                    verticalLineToRelative(-8.729f)
                    curveToRelative(0f, -2.609f, 2.162f, -4.636f, 4.635f, -4.636f)
                    horizontalLineToRelative(25.047f)
                    curveToRelative(2.475f, 0f, 4.635f, 2.027f, 4.635f, 4.636f)
                    verticalLineTo(194.412f)
                    close()
                    moveTo(266.249f, 194.412f)
                    curveToRelative(0f, 2.609f, -2.162f, 4.636f, -4.635f, 4.636f)
                    horizontalLineToRelative(-25.047f)
                    curveToRelative(-2.475f, 0f, -4.635f, -2.027f, -4.635f, -4.636f)
                    verticalLineToRelative(-8.729f)
                    curveToRelative(0f, -2.609f, 2.162f, -4.636f, 4.635f, -4.636f)
                    horizontalLineToRelative(25.047f)
                    curveToRelative(2.475f, 0f, 4.635f, 2.027f, 4.635f, 4.636f)
                    verticalLineTo(194.412f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(191.341f, 108.464f)
                    horizontalLineToRelative(29.5f)
                    curveToRelative(4.143f, 0f, 7.5f, -3.357f, 7.5f, -7.5f)
                    curveToRelative(0f, -4.143f, -3.357f, -7.5f, -7.5f, -7.5f)
                    horizontalLineToRelative(-29.5f)
                    curveToRelative(-4.143f, 0f, -7.5f, 3.357f, -7.5f, 7.5f)
                    curveTo(183.841f, 105.107f, 187.198f, 108.464f, 191.341f, 108.464f)
                    close()
                }
            }
        }.build()
        
        return _iconHome!!
    }

private var _iconHome: ImageVector? = null

