package ru.kvmsoft.yam.user.api.domain.usecase

interface UpdateUserEmailUseCase {

    suspend fun updateUserEmail(email: String)
}