package ru.kvmsoft.yam.geo.impl.data.utils

import android.content.Context
import dev.sargunv.maplibrecompose.compose.offline.OfflineManager

actual class OfflineManager(private val applicationContext: Context) {
    actual fun getOfflineManager(): OfflineManager =
        dev.sargunv.maplibrecompose.compose.offline.getOfflineManager(applicationContext)
}