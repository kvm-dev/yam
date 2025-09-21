package ru.kvmsoft.yam.user.impl.domain.usecase

import ru.kvmsoft.yam.base.storage.data.StorageRepository
import ru.kvmsoft.yam.user.api.domain.usecase.AddHistoryOrderUseCase
import ru.kvmsoft.yam.user.api.model.UserMapPointDomain
import ru.kvmsoft.yam.user.impl.mapper.Mapper

class AddHistoryOrderUseCaseImpl(private val storageRepository: StorageRepository): AddHistoryOrderUseCase {
    override suspend fun addHistoryOrder(order: Pair<UserMapPointDomain, UserMapPointDomain>) {
        storageRepository.addOrderHistory(Mapper.mapToUserOrderHistoryDomain(order))
    }
}