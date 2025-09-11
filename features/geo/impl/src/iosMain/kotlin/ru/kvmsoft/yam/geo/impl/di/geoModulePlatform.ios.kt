package ru.kvmsoft.yam.geo.impl.di

import org.koin.dsl.module
import ru.kvmsoft.yam.geo.impl.data.utils.OfflineManager


actual val geoModulePlatform = module {
    single<OfflineManager> { OfflineManager() }
}