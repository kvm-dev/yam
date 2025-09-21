package ru.kvmsoft.yam.splash.impl.domain

import ru.kvmsoft.yam.base.model.ResultState
import ru.kvmsoft.yam.geo.api.domain.usecase.GetCurrentPositionUseCase
import ru.kvmsoft.yam.splash.impl.presentation.ui.SplashViewState
import ru.kvmsoft.yam.user.api.domain.usecase.GetUserDataUseCase
import ru.kvmsoft.yam.user.api.model.UserDataDomain
import ru.kvmsoft.yam.user.api.model.UserMapPointDomain

class SplashInteractor(
    private val getUserDataUseCase: GetUserDataUseCase,
    private val getCurrentPositionUseCase: GetCurrentPositionUseCase

){

    val userState = getUserDataUseCase.userState

    suspend fun getUserData() = getUserDataUseCase.getUserData()

    suspend fun getCurrentPosition() = getCurrentPositionUseCase.getPosition()

    suspend fun getCurrentState(state: ResultState<UserDataDomain>): SplashViewState {
        val currentPosition = getCurrentPositionUseCase.getPosition()
          return when(state){
            ResultState.Idle -> {
                getUserDataUseCase.getUserData()
               SplashViewState.LoadingState
            }
            ResultState.Loading -> {
              SplashViewState.LoadingState
            }
            is ResultState.Success -> {
                SplashViewState.SuccessState(
                    currentPosition = currentPosition,
                    userData = state.data?: UserDataDomain(
                        userPhone = "",
                        userName = "",
                        userEmail = "",
                        userHomeAddress = UserMapPointDomain(0.0, 0.0, ""),
                        userOrdersHistory = listOf()
                    ),
                )
                }
         }
    }
}