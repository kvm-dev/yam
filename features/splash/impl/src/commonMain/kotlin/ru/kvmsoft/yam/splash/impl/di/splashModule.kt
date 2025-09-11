package ru.kvmsoft.yam.splash.impl.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ru.kvmsoft.yam.splash.impl.domain.SplashInteractor
import ru.kvmsoft.yam.splash.impl.presentation.viewmodel.SplashScreenViewModel

val splashModule = module {
    single<SplashInteractor> { SplashInteractor(getUserDataUseCase = get(), getCurrentPositionUseCase = get()) }
    viewModelOf(::SplashScreenViewModel)
}