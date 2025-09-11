package ru.kvmsoft.yam.geo.impl.data

import dev.sargunv.maplibrecompose.compose.offline.OfflinePack
import ru.kvmsoft.yam.geo.api.model.OfflineMapResultStatusDomain
import ru.kvmsoft.yam.geo.impl.data.local.LocalDataSource
import ru.kvmsoft.yam.geo.impl.data.network.NetworkDataSource
import ru.kvmsoft.yam.geo.impl.mappers.Mapper

class GeoRepository(private val localDataSource: LocalDataSource, private val networkDataSource: NetworkDataSource) {

    suspend fun loadFromNetworkCrimeaMaps(): OfflineMapResultStatusDomain {
        return Mapper.mapOfflineMapResultStatusToDomain(networkDataSource.downloadCrimeaMap())
    }

    suspend fun loadFromLocalCrimeaMaps():Set<OfflinePack>{
        return localDataSource.getOfflinePacks()
    }

    suspend fun getCurrentPosition() = Mapper.mapGeoPointToDomain(localDataSource.getGeoPoint())
}