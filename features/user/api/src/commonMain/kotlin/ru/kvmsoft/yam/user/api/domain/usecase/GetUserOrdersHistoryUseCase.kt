package ru.kvmsoft.yam.user.api.domain.usecase

import ru.kvmsoft.yam.user.api.model.UserMapPointDomain

interface GetUserOrdersHistoryUseCase {

    suspend fun getUserOrdersHistory(): List<Pair<UserMapPointDomain, UserMapPointDomain>>
}