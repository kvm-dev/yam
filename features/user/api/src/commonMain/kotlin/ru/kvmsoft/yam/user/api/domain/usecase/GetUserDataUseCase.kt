package ru.kvmsoft.yam.user.api.domain.usecase

import ru.kvmsoft.yam.user.api.model.UserDataDomain

interface GetUserDataUseCase {

    suspend fun getUserData(): UserDataDomain
}