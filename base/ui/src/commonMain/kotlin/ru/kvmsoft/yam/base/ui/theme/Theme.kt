package ru.kvmsoft.yam.base.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

// Define your custom colors
private val LightColorScheme = lightColorScheme(
    primary = MainOrangeLight,
    background = MainBackgroundLight,
    // ... other colors
)

private val DarkColorScheme = darkColorScheme(
    primary = MainOrangeLight,
    background = MainBackgroundLight,
    // ... other colors
)

// Define your custom typography
//val AppTypography = Typography(
//    // ... your text styles
//)

// Define your custom shapes
val AppShapes = Shapes(
    small = RoundedCornerShape(4.dp),
    // ... other shapes
)

// Your custom theme composable
@Composable
fun TaxiTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // For Android/iOS
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme


    MaterialTheme(
        colorScheme = colors,
        typography = getTaxiTypography(),
        shapes = AppShapes,
        content = content
    )
}