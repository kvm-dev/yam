package ru.kvmsoft.yam.base.storage.di

import org.koin.core.module.Module
import org.koin.dsl.module
import ru.kvmsoft.yam.base.storage.drivers.DatabaseDriverFactory

actual val storageModulePlatform = module {
    single<DatabaseDriverFactory> { DatabaseDriverFactory(context = get()) }
}