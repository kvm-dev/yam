package ru.kvmsoft.yam.user.api.domain.usecase

interface UpdateUserNameUseCase {

    suspend fun updateUserName(userName: String)
}