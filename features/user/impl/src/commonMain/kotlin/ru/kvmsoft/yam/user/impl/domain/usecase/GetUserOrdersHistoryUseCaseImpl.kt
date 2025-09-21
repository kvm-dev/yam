package ru.kvmsoft.yam.user.impl.domain.usecase

import ru.kvmsoft.yam.base.storage.data.StorageRepository
import ru.kvmsoft.yam.user.api.domain.usecase.GetUserOrdersHistoryUseCase
import ru.kvmsoft.yam.user.api.model.UserMapPointDomain
import ru.kvmsoft.yam.user.impl.mapper.Mapper

class GetUserOrdersHistoryUseCaseImpl(private val storageRepository: StorageRepository): GetUserOrdersHistoryUseCase {
    override suspend fun getUserOrdersHistory(): List<Pair<UserMapPointDomain, UserMapPointDomain>> {
        return Mapper.mapToListPairUserDomainMapPoint(storageRepository.getOrdersHistory())
    }
}