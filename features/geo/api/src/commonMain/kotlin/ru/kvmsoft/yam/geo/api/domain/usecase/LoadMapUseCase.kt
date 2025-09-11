package ru.kvmsoft.yam.geo.api.domain.usecase

import dev.sargunv.maplibrecompose.compose.offline.OfflinePack

interface LoadMapUseCase {
    suspend fun loadMap(): Set<OfflinePack>
}