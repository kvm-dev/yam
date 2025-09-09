package ru.kvmsoft.yam.orders.impl.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun OrdersScreen(onBack: () -> Unit) {
    Column {
        Text("Orders")
    }
}