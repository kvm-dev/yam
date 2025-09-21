package ru.kvmsoft.yam.user.impl.domain.usecase

import ru.kvmsoft.yam.base.storage.data.StorageRepository
import ru.kvmsoft.yam.user.api.domain.usecase.UpdateUserEmailUseCase

class UpdateUserEmailUseCaseImp(private val storageRepository: StorageRepository): UpdateUserEmailUseCase {
    override suspend fun updateUserEmail(email: String) {
         storageRepository.updateUserEmail(email)
    }
}