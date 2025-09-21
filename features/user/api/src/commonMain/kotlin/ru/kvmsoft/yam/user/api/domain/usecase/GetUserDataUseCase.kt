package ru.kvmsoft.yam.user.api.domain.usecase

import kotlinx.coroutines.flow.StateFlow
import ru.kvmsoft.yam.base.model.ResultState
import ru.kvmsoft.yam.user.api.model.UserDataDomain

interface GetUserDataUseCase {

    val userState: StateFlow<ResultState<UserDataDomain>>

    suspend fun getUserData(): UserDataDomain
}