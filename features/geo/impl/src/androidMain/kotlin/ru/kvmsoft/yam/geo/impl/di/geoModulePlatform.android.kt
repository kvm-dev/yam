package ru.kvmsoft.yam.geo.impl.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import ru.kvmsoft.yam.geo.impl.data.utils.OfflineManager

actual val geoModulePlatform = module {
    single<OfflineManager> { OfflineManager(applicationContext = get()) }
}