package ru.kvmsoft.yam.geo.impl.domain.usecase

import dev.sargunv.maplibrecompose.compose.offline.OfflinePack
import ru.kvmsoft.yam.geo.api.domain.usecase.LoadMapUseCase
import ru.kvmsoft.yam.geo.impl.data.GeoRepository

class LoadMapUseCaseImpl(private val geoRepository: GeoRepository): LoadMapUseCase {
    override suspend fun loadMap(): Set<OfflinePack> {
        return geoRepository.loadFromLocalCrimeaMaps()
    }
}