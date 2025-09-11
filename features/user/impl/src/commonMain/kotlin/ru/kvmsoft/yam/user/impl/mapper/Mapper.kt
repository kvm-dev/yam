package ru.kvmsoft.yam.user.impl.mapper

import ru.kvmsoft.yam.user.api.model.UserDataDomain
import ru.kvmsoft.yam.user.api.model.UserMapPointDomain
import ru.kvmsoft.yam.user.impl.model.UserData
import ru.kvmsoft.yam.user.impl.model.UserMapPoint

object Mapper {
    fun mapUserMapPointToDomain(userMapPoint: UserMapPoint): UserMapPointDomain {
        return UserMapPointDomain(
            longitude = userMapPoint.longitude,
            latitude = userMapPoint.latitude
        )
    }

    fun mapUserDataToDomain(userData: UserData): UserDataDomain{
        val ordersHistory = ArrayList<Pair<UserMapPointDomain, UserMapPointDomain>>()
        userData.userOrdersHistory.forEach { history->
            ordersHistory.add(Pair(mapUserMapPointToDomain(history.first), mapUserMapPointToDomain(history.second)))
        }
        return UserDataDomain(
            userPhone = userData.userPhone,
            userName = userData.userName,
            userHomeAddress = mapUserMapPointToDomain(userData.userHomeAddress),
            userOrdersHistory = ordersHistory
        )
    }
}