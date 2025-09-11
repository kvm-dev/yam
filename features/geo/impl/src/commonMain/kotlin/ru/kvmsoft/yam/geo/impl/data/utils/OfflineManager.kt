package ru.kvmsoft.yam.geo.impl.data.utils

import dev.sargunv.maplibrecompose.compose.offline.OfflineManager

expect class OfflineManager{

    fun getOfflineManager(): OfflineManager
}
