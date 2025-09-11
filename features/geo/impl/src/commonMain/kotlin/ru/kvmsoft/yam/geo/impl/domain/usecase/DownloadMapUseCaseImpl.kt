package ru.kvmsoft.yam.geo.impl.domain.usecase

import ru.kvmsoft.yam.geo.api.model.OfflineMapResultStatusDomain
import ru.kvmsoft.yam.geo.api.domain.usecase.DownloadMapUseCase
import ru.kvmsoft.yam.geo.impl.data.GeoRepository

class DownloadMapUseCaseImpl(private val geoRepository: GeoRepository): DownloadMapUseCase {
    override suspend fun downloadMap(): OfflineMapResultStatusDomain {
       return geoRepository.loadFromNetworkCrimeaMaps()
    }
}