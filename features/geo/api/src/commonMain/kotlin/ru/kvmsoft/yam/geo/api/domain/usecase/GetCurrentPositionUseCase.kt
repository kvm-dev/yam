package ru.kvmsoft.yam.geo.api.domain.usecase

import ru.kvmsoft.yam.geo.api.model.GeoPointDomain

interface GetCurrentPositionUseCase {

    suspend fun getPosition(): GeoPointDomain
}