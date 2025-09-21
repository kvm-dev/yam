package ru.kvmsoft.yam.base.storage.model

data class UserDomain(
    val userId: Int = 0,
    val userPhone: String,
    val userName: String,
    val userEmail: String,
    val userHomeAddress: String,
    val userHomeLat: Double,
    val userHomeLng: Double
)