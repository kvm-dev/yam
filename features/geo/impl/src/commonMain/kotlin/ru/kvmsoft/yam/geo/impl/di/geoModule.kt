package ru.kvmsoft.yam.geo.impl.di

import org.koin.dsl.module
import ru.kvmsoft.yam.geo.api.domain.usecase.DownloadMapUseCase
import ru.kvmsoft.yam.geo.api.domain.usecase.GetCurrentPositionUseCase
import ru.kvmsoft.yam.geo.api.domain.usecase.LoadMapUseCase
import ru.kvmsoft.yam.geo.impl.data.GeoRepository
import ru.kvmsoft.yam.geo.impl.data.local.LocalDataSource
import ru.kvmsoft.yam.geo.impl.data.network.NetworkDataSource
import ru.kvmsoft.yam.geo.impl.domain.usecase.DownloadMapUseCaseImpl
import ru.kvmsoft.yam.geo.impl.domain.usecase.GetCurrentPositionUseCaseImpl
import ru.kvmsoft.yam.geo.impl.domain.usecase.LoadMapUseCaseImpl

    val geoModule = module {
        single<LocalDataSource> { LocalDataSource(offlineManager = get()) }
        single<NetworkDataSource> { NetworkDataSource(offlineManager = get()) }
        single<GeoRepository> { GeoRepository(localDataSource = get(), networkDataSource = get()) }
        single<DownloadMapUseCase> { DownloadMapUseCaseImpl(geoRepository = get()) }
        single<LoadMapUseCase> { LoadMapUseCaseImpl(geoRepository = get()) }
        single<GetCurrentPositionUseCase> { GetCurrentPositionUseCaseImpl(geoRepository = get()) }
    }