package ru.kvmsoft.yam.user.impl.domain.usecase

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import ru.kvmsoft.yam.base.model.ResultState
import ru.kvmsoft.yam.base.storage.data.StorageRepository
import ru.kvmsoft.yam.user.api.domain.usecase.GetUserDataUseCase
import ru.kvmsoft.yam.user.api.model.UserDataDomain
import ru.kvmsoft.yam.user.impl.mapper.Mapper

class GetUserDataUseCaseImpl(private val storageRepository: StorageRepository): GetUserDataUseCase {

    private val _user = MutableStateFlow<ResultState<UserDataDomain>>(
        ResultState.Idle)

    override val userState = _user.asStateFlow()

    override suspend fun getUserData(): UserDataDomain {
        _user.tryEmit(ResultState.Loading)
        val cachedResult = Mapper.mapToUserDataDomain(userDomain = storageRepository.getUser(), history = storageRepository.getOrdersHistory())
        _user.tryEmit(ResultState.Success(cachedResult))
        return cachedResult
    }
}