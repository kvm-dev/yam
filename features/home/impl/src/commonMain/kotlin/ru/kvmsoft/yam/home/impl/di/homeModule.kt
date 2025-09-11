package ru.kvmsoft.yam.home.impl.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ru.kvmsoft.yam.home.impl.domain.HomeInteractor
import ru.kvmsoft.yam.home.impl.presentation.viewmodel.HomeScreenViewModel

val homeModule = module {
    single<HomeInteractor> { HomeInteractor(downloadMapUseCase = get(), loadMapUseCase = get()) }
    viewModelOf(::HomeScreenViewModel)
}


