package ru.kvmsoft.yam.geo.impl.domain.usecase

import ru.kvmsoft.yam.geo.api.domain.usecase.GetCurrentPositionUseCase
import ru.kvmsoft.yam.geo.api.model.GeoPointDomain
import ru.kvmsoft.yam.geo.impl.data.GeoRepository

class GetCurrentPositionUseCaseImpl(private val geoRepository: GeoRepository): GetCurrentPositionUseCase {
    override suspend fun getPosition(): GeoPointDomain {
        return geoRepository.getCurrentPosition()
    }
}