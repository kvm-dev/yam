package ru.kvmsoft.yam.user.impl.domain.usecase

import ru.kvmsoft.yam.user.api.domain.usecase.GetUserDataUseCase
import ru.kvmsoft.yam.user.api.model.UserDataDomain
import ru.kvmsoft.yam.user.impl.data.UserRepository

class GetUserDataUseCaseImpl(private val userRepository: UserRepository): GetUserDataUseCase {
    override suspend fun getUserData(): UserDataDomain {
        return userRepository.getUserData()
    }
}