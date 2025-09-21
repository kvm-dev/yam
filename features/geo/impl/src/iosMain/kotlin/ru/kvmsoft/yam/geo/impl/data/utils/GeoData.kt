package ru.kvmsoft.yam.geo.impl.data.utils

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.useContents
import platform.CoreLocation.CLLocation
@OptIn(ExperimentalForeignApi::class)

object GeoData {
    fun CLLocation.getLatitude(): Double = this.coordinate().useContents { latitude }
    fun CLLocation.getLongitude(): Double = this.coordinate().useContents { longitude }
}