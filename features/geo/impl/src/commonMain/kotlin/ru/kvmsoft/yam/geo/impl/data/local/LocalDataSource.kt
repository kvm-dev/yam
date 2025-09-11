package ru.kvmsoft.yam.geo.impl.data.local

import ru.kvmsoft.yam.geo.impl.model.GeoPoint
import ru.kvmsoft.yam.geo.impl.data.utils.OfflineManager as YamOfflineManager

class LocalDataSource(private val offlineManager: YamOfflineManager) {

    fun getOfflinePacks() = offlineManager.getOfflineManager().packs

    fun getGeoPoint() = GeoPoint(longitude = 44.976127, latitude = 34.134472, address = "Симферополь, ул. Бела-Куна 9")
}