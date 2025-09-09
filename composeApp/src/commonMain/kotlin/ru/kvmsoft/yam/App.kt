package ru.kvmsoft.yam

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import ru.kvmsoft.yam.base.navigation.NavigationApp

@Composable
@Preview
fun App() {
    MaterialTheme {
        NavigationApp()
    }
}