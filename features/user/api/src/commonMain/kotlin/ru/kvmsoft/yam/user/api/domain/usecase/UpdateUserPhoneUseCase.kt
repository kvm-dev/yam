package ru.kvmsoft.yam.user.api.domain.usecase

interface UpdateUserPhoneUseCase {

    suspend fun updateUserPhone(phone: String)
}