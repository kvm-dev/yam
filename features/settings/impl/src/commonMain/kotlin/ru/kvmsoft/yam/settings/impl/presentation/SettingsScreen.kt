package ru.kvmsoft.yam.settings.impl.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SettingsScreen(onBack: () -> Unit) {
    Column {
        Text("Settings")
    }
}