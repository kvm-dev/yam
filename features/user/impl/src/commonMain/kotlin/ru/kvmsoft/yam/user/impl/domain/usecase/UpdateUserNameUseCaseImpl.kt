package ru.kvmsoft.yam.user.impl.domain.usecase

import ru.kvmsoft.yam.base.storage.data.StorageRepository
import ru.kvmsoft.yam.user.api.domain.usecase.UpdateUserNameUseCase

class UpdateUserNameUseCaseImpl(private val storageRepository: StorageRepository): UpdateUserNameUseCase {
    override suspend fun updateUserName(userName: String) {
        storageRepository.updateUserName(userName)
    }
}