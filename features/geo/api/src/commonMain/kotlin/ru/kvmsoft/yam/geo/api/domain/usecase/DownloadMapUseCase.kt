package ru.kvmsoft.yam.geo.api.domain.usecase

import ru.kvmsoft.yam.geo.api.model.OfflineMapResultStatusDomain

interface DownloadMapUseCase {
    suspend fun downloadMap(): OfflineMapResultStatusDomain
}