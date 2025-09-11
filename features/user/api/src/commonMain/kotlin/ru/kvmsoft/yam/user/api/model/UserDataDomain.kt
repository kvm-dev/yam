package ru.kvmsoft.yam.user.api.model

data class UserDataDomain(
    val userPhone: String,
    val userName: String,
    val userHomeAddress: UserMapPointDomain,
    val userOrdersHistory: List<Pair<UserMapPointDomain, UserMapPointDomain>>
)