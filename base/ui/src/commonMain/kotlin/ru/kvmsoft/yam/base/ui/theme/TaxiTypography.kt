package ru.kvmsoft.yam.base.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_Black
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_BlackItalic
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_Bold
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_BoldItalic
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_ExtraBold
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_ExtraBoldItalic
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_Italic
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_Medium
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_MediumItalic
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_Regular
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_SemiBold
import ru.kvmsoft.yam.base.ui.ComposeResources.PlayfairDisplay_SemiBoldItalic
import ru.kvmsoft.yam.base.ui.ComposeResources.Res

@Composable
fun getTaxiTypography(): Typography{

    val taxiFontFamily = FontFamily(
        Font(resource = Res.font.PlayfairDisplay_Black, FontWeight.Black),
                 Font(resource = Res.font.PlayfairDisplay_BlackItalic, FontWeight.Black, style = FontStyle.Italic),
                 Font(resource = Res.font.PlayfairDisplay_Bold, FontWeight.Bold),
                 Font(resource = Res.font.PlayfairDisplay_BoldItalic, FontWeight.Bold, style = FontStyle.Italic),
                 Font(resource = Res.font.PlayfairDisplay_ExtraBold, FontWeight.ExtraBold),
                 Font(resource = Res.font.PlayfairDisplay_ExtraBoldItalic, FontWeight.ExtraBold, style = FontStyle.Italic),
                 Font(resource = Res.font.PlayfairDisplay_Italic, FontWeight.Normal, style = FontStyle.Italic),
                 Font(resource = Res.font.PlayfairDisplay_Medium, FontWeight.Normal),
                 Font(resource = Res.font.PlayfairDisplay_MediumItalic, FontWeight.Normal, style = FontStyle.Italic),
                 Font(resource = Res.font.PlayfairDisplay_Regular, FontWeight.ExtraLight),
                 Font(resource = Res.font.PlayfairDisplay_SemiBold, FontWeight.SemiBold, style = FontStyle.Italic),
                 Font(resource = Res.font.PlayfairDisplay_SemiBoldItalic, FontWeight.SemiBold, style = FontStyle.Italic)
    )

    val taxiTypography = Typography(
        displayLarge = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp,
            brush = Brush.linearGradient(
                colors = listOf(MainOrangeLight, MainGreenLight)
            )
        ),
        displayMedium = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        ),

        displaySmall = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        ),

        headlineLarge = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.Black,
            fontSize = 32.sp,
            brush = Brush.linearGradient(
                colors = listOf(MainBlackLight, MainGreyLight)
            )
        ),
        headlineMedium = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        ),

        headlineSmall = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp
        ),
        titleLarge = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp
        ),
        titleSmall = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 32.sp
        ),
        bodyLarge = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp
        ),
        bodySmall = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        ),
        labelLarge = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp
        ),
        labelMedium = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        ),
        labelSmall = TextStyle(
            fontFamily = taxiFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp
        )
    )
    return taxiTypography
}
