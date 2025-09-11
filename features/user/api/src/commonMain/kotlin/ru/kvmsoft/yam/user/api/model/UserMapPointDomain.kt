package ru.kvmsoft.yam.user.api.model

data class UserMapPointDomain(
    val longitude: Double,
    val latitude: Double,
    val address: String = ""
)