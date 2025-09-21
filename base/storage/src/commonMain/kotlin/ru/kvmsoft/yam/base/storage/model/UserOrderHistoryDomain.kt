package ru.kvmsoft.yam.base.storage.model

data class UserOrderHistoryDomain (
    val orderId: Long? = null,
    val fromLat: Double,
    val fromLng: Double,
    val fromAddress: String,
    val toLat: Double,
    val toLng: Double,
    val toAddress: String
)