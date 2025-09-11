package ru.kvmsoft.yam.geo.impl.data.utils

import dev.sargunv.maplibrecompose.compose.offline.OfflineManager

actual class OfflineManager {
    actual fun getOfflineManager(): OfflineManager = dev.sargunv.maplibrecompose.compose.offline.getOfflineManager()
}