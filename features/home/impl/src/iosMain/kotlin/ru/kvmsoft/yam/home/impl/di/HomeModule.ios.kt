package ru.kvmsoft.yam.home.impl.di

import org.koin.dsl.module
import ru.kvmsoft.yam.home.impl.data.local.LocalMapRepository
import ru.kvmsoft.yam.home.impl.data.utils.OfflineManager

actual val homeModule = module {
    single<OfflineManager> { OfflineManager() }
    single<LocalMapRepository> { LocalMapRepository(offlineManager = get()) }
}