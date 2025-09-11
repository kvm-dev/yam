package ru.kvmsoft.yam.geo.api.model

data class OfflineMapResultStatusDomain(
    val status: Boolean,
    val errorMsg: String = ""
)