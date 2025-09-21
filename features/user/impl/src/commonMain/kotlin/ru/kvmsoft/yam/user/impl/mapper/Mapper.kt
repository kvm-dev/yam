package ru.kvmsoft.yam.user.impl.mapper

import ru.kvmsoft.yam.base.storage.model.UserDomain
import ru.kvmsoft.yam.base.storage.model.UserOrderHistoryDomain
import ru.kvmsoft.yam.user.api.model.UserDataDomain
import ru.kvmsoft.yam.user.api.model.UserMapPointDomain
import ru.kvmsoft.yam.user.impl.model.UserMapPoint

object Mapper {
    fun mapToUserDataDomain(userDomain: UserDomain, history: List<UserOrderHistoryDomain>): UserDataDomain{
        val userHomeAddress = UserMapPointDomain(
            longitude = userDomain.userHomeLng,
            latitude = userDomain.userHomeLat,
            address = userDomain.userHomeAddress
        )
        val userOrdersHistory = ArrayList<Pair<UserMapPointDomain, UserMapPointDomain>>()
        history.forEach { order->
        userOrdersHistory.add(Pair(
            first = UserMapPointDomain(
                longitude = order.fromLng,
                latitude = order.fromLat,
                address = order.fromAddress),
            second = UserMapPointDomain(
                longitude = order.toLng,
                latitude = order.toLat,
                address = order.toAddress
            )
        ))
        }
        return UserDataDomain(
            userName = userDomain.userName,
            userEmail = userDomain.userEmail,
            userPhone = userDomain.userPhone,
            userHomeAddress = userHomeAddress,
            userOrdersHistory = userOrdersHistory


        )
    }

    fun mapToUserOrderHistoryDomain(order: Pair<UserMapPointDomain, UserMapPointDomain>): UserOrderHistoryDomain{
         return UserOrderHistoryDomain(
             orderId = null,
             fromLat = order.first.latitude,
             fromLng = order.first.longitude,
             fromAddress = order.first.address,
             toLat = order.second.latitude,
             toLng = order.second.longitude,
             toAddress = order.second.address
         )
    }

    fun mapToListPairUserDomainMapPoint(orders: List<UserOrderHistoryDomain>): List<Pair<UserMapPointDomain, UserMapPointDomain>>{
        val list = ArrayList<Pair<UserMapPointDomain,  UserMapPointDomain>>()
        orders.forEach { order->
            list.add(Pair(
                    first = UserMapPointDomain(
                    longitude = order.fromLng,
                    latitude = order.fromLat,
                    address = order.fromAddress
            ),
                    second = UserMapPointDomain(
                    longitude = order.toLng,
                    latitude = order.toLat,
                    address = order.toAddress
                )
            )
            )
        }
        return list
    }
}