package ru.kvmsoft.yam

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import org.koin.dsl.KoinAppDeclaration
import ru.kvmsoft.yam.base.navigation.NavigationApp
import ru.kvmsoft.yam.geo.impl.di.geoModule
import ru.kvmsoft.yam.geo.impl.di.geoModulePlatform
import ru.kvmsoft.yam.home.impl.di.homeModule
import ru.kvmsoft.yam.splash.impl.di.splashModule
import ru.kvmsoft.yam.user.impl.di.userModule

@Composable
@Preview
fun App(koinAppDeclaration: KoinAppDeclaration? = null) {
    KoinApplication(application = {
        koinAppDeclaration?.invoke(this)
        modules(geoModulePlatform, geoModule, userModule, homeModule, splashModule)
    }) {
        MaterialTheme{
            NavigationApp()
        }
    }
}


//fun App() {
//    MaterialTheme {
//
//    }
//}