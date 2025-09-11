package ru.kvmsoft.yam.orders.api.domain.model

data class OrderHistoryPointDomain(
    val longitude: Double,
    val latitude: Double,
    val address: String = ""
)