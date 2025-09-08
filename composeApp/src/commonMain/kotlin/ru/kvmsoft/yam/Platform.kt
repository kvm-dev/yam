package ru.kvmsoft.yam

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform