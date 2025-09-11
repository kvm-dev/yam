package ru.kvmsoft.yam.user.impl.model

data class UserMapPoint(
    val longitude: Double,
    val latitude: Double,
    val address: String = ""
)