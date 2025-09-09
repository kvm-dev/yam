package ru.kvmsoft.yam.home.impl.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import ru.kvmsoft.yam.home.impl.data.local.LocalMapRepository
import ru.kvmsoft.yam.home.impl.data.utils.OfflineManager

actual val homeModule = module {
    single<Context> { androidContext() }
    single<OfflineManager> { OfflineManager(applicationContext = get()) }
    single<LocalMapRepository> { LocalMapRepository(offlineManager = get()) }
}