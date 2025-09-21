package ru.kvmsoft.yam.user.api.domain.usecase

import ru.kvmsoft.yam.user.api.model.UserMapPointDomain

interface AddHistoryOrderUseCase {

    suspend fun addHistoryOrder(order: Pair<UserMapPointDomain, UserMapPointDomain>)
}