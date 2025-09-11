package ru.kvmsoft.yam.home.impl.domain

import ru.kvmsoft.yam.geo.api.domain.usecase.DownloadMapUseCase
import ru.kvmsoft.yam.geo.api.domain.usecase.LoadMapUseCase
import ru.kvmsoft.yam.home.impl.model.UserLocationPoints
import ru.kvmsoft.yam.home.impl.presentation.ui.HomeViewState

class HomeInteractor(
    private val downloadMapUseCase: DownloadMapUseCase,
    private val loadMapUseCase: LoadMapUseCase
) {

    suspend fun downloadMaps() = downloadMapUseCase.downloadMap()
    suspend fun loadMaps() = loadMapUseCase.loadMap()

    suspend fun getCurrentUserLocation(): UserLocationPoints? = UserLocationPoints(latitude = 34.134471, longitude = 44.976127)

    suspend fun getCurrentStreetName() = "ул. Бела-Куна 9"

    suspend fun getCurrentState(): HomeViewState{
        val localMaps = loadMaps()
        val currentLocation = getCurrentUserLocation()
        val currentStreetName = getCurrentStreetName()
        return HomeViewState(
            localMap = localMaps,
            currentPosition = currentLocation,
            currentStreetName = currentStreetName,
            isLoading = false
        )
    }
}