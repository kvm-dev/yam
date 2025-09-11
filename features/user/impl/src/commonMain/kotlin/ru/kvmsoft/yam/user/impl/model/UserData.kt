package ru.kvmsoft.yam.user.impl.model

data class UserData(
    val userPhone: String,
    val userName: String,
    val userHomeAddress: UserMapPoint,
    val userOrdersHistory: List<Pair<UserMapPoint, UserMapPoint>>
)