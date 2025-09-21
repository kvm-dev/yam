package ru.kvmsoft.yam.base.storage.mapper

import ru.kvmsoft.yam.base.storage.User
import ru.kvmsoft.yam.base.storage.UserOrdersHistory
import ru.kvmsoft.yam.base.storage.model.UserDomain
import ru.kvmsoft.yam.base.storage.model.UserOrderHistoryDomain

object Mapper {
    fun userToDomain(data: User): UserDomain{
        return UserDomain(
            userId = 0,
            userName = data.userName,
            userPhone = data.userPhone,
            userEmail = data.userEmail,
            userHomeAddress = data.userHomeAddress,
            userHomeLat = data.userHomeLat,
            userHomeLng = data.userHomeLng,
        )
    }

    fun userHistoryToDomain(data: UserOrdersHistory): UserOrderHistoryDomain{
        return UserOrderHistoryDomain(
            orderId = data.orderId,
            fromLat = data.fromLat,
            fromLng = data.fromLng,
            fromAddress = data.fromAddress,
            toLat = data.toLat,
            toLng = data.toLng,
            toAddress = data.toAddress
        )
    }
}