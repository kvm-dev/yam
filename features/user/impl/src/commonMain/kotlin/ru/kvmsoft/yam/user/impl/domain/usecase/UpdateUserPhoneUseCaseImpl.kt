package ru.kvmsoft.yam.user.impl.domain.usecase

import ru.kvmsoft.yam.base.storage.data.StorageRepository
import ru.kvmsoft.yam.user.api.domain.usecase.UpdateUserPhoneUseCase

class UpdateUserPhoneUseCaseImpl(private val storageRepository: StorageRepository): UpdateUserPhoneUseCase {
    override suspend fun updateUserPhone(phone: String) {
        storageRepository.updateUserPhone(phone)
    }
}