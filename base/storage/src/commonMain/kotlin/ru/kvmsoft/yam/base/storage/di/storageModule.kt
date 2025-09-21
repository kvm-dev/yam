package ru.kvmsoft.yam.base.storage.di

import org.koin.dsl.module
import ru.kvmsoft.yam.base.storage.data.StorageRepository
import ru.kvmsoft.yam.base.storage.data.local.LocalDataSource

val storageModule = module {
    single<LocalDataSource> { LocalDataSource(databaseDriverFactory = get()) }
    single<StorageRepository> { StorageRepository(localDataSource = get()) }
}