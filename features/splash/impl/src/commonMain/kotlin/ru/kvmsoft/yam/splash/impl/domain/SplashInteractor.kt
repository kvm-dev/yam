package ru.kvmsoft.yam.splash.impl.domain

import ru.kvmsoft.yam.geo.api.domain.usecase.GetCurrentPositionUseCase
import ru.kvmsoft.yam.splash.impl.presentation.ui.SplashViewState
import ru.kvmsoft.yam.user.api.domain.usecase.GetUserDataUseCase

class SplashInteractor(
    private val getUserDataUseCase: GetUserDataUseCase,
    private val getCurrentPositionUseCase: GetCurrentPositionUseCase

){

    suspend fun getUserData() = getUserDataUseCase.getUserData()

    suspend fun getCurrentPosition() = getCurrentPositionUseCase.getPosition()

    suspend fun getCurrentState(): SplashViewState{
        return SplashViewState.SuccessState(
            userData = getUserData(),
            currentPosition = getCurrentPosition()
        )
    }
}