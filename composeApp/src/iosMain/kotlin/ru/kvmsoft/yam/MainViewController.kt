package ru.kvmsoft.yam

import androidx.compose.ui.window.ComposeUIViewController
import ru.kvmsoft.yam.base.storage.AppDatabase
import ru.kvmsoft.yam.base.storage.drivers.DatabaseDriverFactory

fun MainViewController() = ComposeUIViewController {
    val database = AppDatabase(DatabaseDriverFactory().createDriver())
    App(database = database) }