package ru.kvmsoft.yam.home.impl.data.utils

import android.content.Context
import dev.sargunv.maplibrecompose.compose.offline.OfflineManager
import dev.sargunv.maplibrecompose.compose.offline.getOfflineManager

actual class OfflineManager(private val applicationContext: Context) {
    actual fun getOfflineManager(): OfflineManager = getOfflineManager(applicationContext)
}