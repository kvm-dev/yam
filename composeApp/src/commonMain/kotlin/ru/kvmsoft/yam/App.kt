package ru.kvmsoft.yam

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import ru.kvmsoft.yam.base.navigation.NavigationApp
import ru.kvmsoft.yam.home.impl.di.homeModule

@Composable
@Preview
fun App() {
    KoinApplication(application = {
        modules(homeModule) // Include your defined modules
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