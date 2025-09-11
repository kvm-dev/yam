package ru.kvmsoft.yam.splash.impl.presentation.ui

import ru.kvmsoft.yam.geo.api.model.GeoPointDomain
import ru.kvmsoft.yam.user.api.model.UserDataDomain

sealed class SplashViewState {

    data object LoadingState: SplashViewState()

    data class ErrorState(val errorMsg: String): SplashViewState()

    data class SuccessState(
        val userData: UserDataDomain,
        val currentPosition: GeoPointDomain
    ): SplashViewState()
}