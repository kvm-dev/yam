package ru.kvmsoft.yam.user.api.model

data class UserDataDomain(
    val userPhone: String,
    val userName: String,
    val userEmail: String,
    val userHomeAddress: UserMapPointDomain,
    val userOrdersHistory: List<Pair<UserMapPointDomain, UserMapPointDomain>>
)