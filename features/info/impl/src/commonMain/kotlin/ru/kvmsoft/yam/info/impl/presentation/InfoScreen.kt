package ru.kvmsoft.yam.info.impl.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun InfoScreen(onBack: () -> Unit) {
    Column {
        Text("Information")
    }
}