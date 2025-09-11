package ru.kvmsoft.yam.geo.impl.mappers

import ru.kvmsoft.yam.geo.api.model.GeoPointDomain
import ru.kvmsoft.yam.geo.api.model.OfflineMapResultStatusDomain
import ru.kvmsoft.yam.geo.impl.model.GeoPoint
import ru.kvmsoft.yam.geo.impl.model.OfflineMapResultStatus

object Mapper {
        fun mapOfflineMapResultStatusToDomain(data: OfflineMapResultStatus): OfflineMapResultStatusDomain{
            return OfflineMapResultStatusDomain(data.status, data.errorMsg)
        }

    fun mapGeoPointToDomain(geoPoint: GeoPoint): GeoPointDomain{
        return GeoPointDomain(
            latitude = geoPoint.latitude,
            longitude = geoPoint.longitude,
            address = geoPoint.address
        )
    }
}