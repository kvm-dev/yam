package ru.kvmsoft.yam.splash.impl.presentation

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.compottie.Compottie
import io.github.alexzhirkevich.compottie.LottieCompositionSpec
import io.github.alexzhirkevich.compottie.rememberLottieComposition
import io.github.alexzhirkevich.compottie.rememberLottiePainter
import myiconpack.logoLittle
import ru.kvmsoft.yam.base.ui.theme.MainGreenLight
import ru.kvmsoft.yam.base.ui.theme.MainOrangeLight
import ru.kvmsoft.yam.base.ui.theme.MainYellowLight
import ru.kvmsoft.yam.base.ui.theme.getTaxiTypography
import ru.kvmsoft.yam.splash.impl.ComposeResources.Res

@Composable
fun SplashScreen(onNavigateToHome: () -> Unit) {
    val infiniteTransition = rememberInfiniteTransition()
    val animatedColor1 by infiniteTransition.animateColor(
        initialValue = MainOrangeLight,
        targetValue = MainGreenLight,
        animationSpec = infiniteRepeatable(tween(durationMillis = 2000), RepeatMode.Reverse)
    )
    val animatedColor2 by infiniteTransition.animateColor(
        initialValue = MainYellowLight,
        targetValue = MainOrangeLight,
        animationSpec = infiniteRepeatable(tween(durationMillis = 2000), RepeatMode.Reverse)
    )

    val gradientLogo = Brush.linearGradient(
        colors = listOf(MainOrangeLight, MainOrangeLight, MainYellowLight),
        start = Offset(0f, 0f),
        end = Offset(100f, 100f)
    )

    val composition by rememberLottieComposition {
        LottieCompositionSpec.JsonString(
            Res.readBytes("files/loading_taxi.json").decodeToString()
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(animatedColor1, animatedColor2),
                    start = Offset(0f, 0f),
                    end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = logoLittle,
            contentDescription = "Favorite Icon",
            tint = Color.Unspecified,
            modifier = Modifier
                .size(128.dp)
                .graphicsLayer(compositingStrategy = CompositingStrategy.Offscreen)
                .drawWithContent {
                    drawContent() // Draw the original icon
                    drawRect(
                        brush = gradientLogo,
                        blendMode = BlendMode.SrcIn
                    )
                }
        )

        Image(
            modifier = Modifier.padding(top = 40.dp),
            painter = rememberLottiePainter(
                composition = composition,
                iterations = Compottie.IterateForever
            ),
            contentDescription = "Taxi Loading Animation"
        )

        Text("Найдем такси даже без интернета", modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp).clickable{
                onNavigateToHome()
            },
            style = getTaxiTypography().headlineLarge,
            textAlign  = TextAlign.Center
        )

        Column {
//            Text("ЯМ Такси", modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 20.dp).clickable{
//                    onNavigateToHome()
//                },
//                style = getTaxiTypography().displayLarge,
//                textAlign  = TextAlign.Center
//            )

            Text("На главную // Потом удалим",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 60.dp).clickable{
                        onNavigateToHome()
                    })
        }
    }
}

