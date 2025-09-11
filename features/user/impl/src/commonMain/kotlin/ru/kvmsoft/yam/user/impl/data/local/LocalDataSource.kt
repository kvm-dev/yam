package ru.kvmsoft.yam.user.impl.data.local

import ru.kvmsoft.yam.user.impl.model.UserMapPoint

class LocalDataSource {

    suspend fun getUserPhone() = "+79787770927"
    suspend fun getUserName() = "Дмитрий"
    suspend fun getUserHomeAddress() = UserMapPoint(longitude = 44.976127, latitude = 34.134472, address = "Симферополь, ул. Бородина 4")
    suspend fun getUserOrdersHistory(): List<Pair<UserMapPoint, UserMapPoint>>{
        val historyList = ArrayList<Pair<UserMapPoint, UserMapPoint>>()
        historyList.add(
            Pair(UserMapPoint(longitude = 44.976127, latitude = 34.134472, address = "Симферополь, ул. Бородина 4"), UserMapPoint(longitude = 44.978524, latitude = 34.137670, address = "Симферополь, ул. Ягодная 34А"))
        )

        historyList.add(
            Pair(UserMapPoint(longitude = 44.969017, latitude = 34.126009, address = "Симферополь, ул. Надинского 16А"), UserMapPoint(longitude = 44.958941, latitude = 34.125381, address = "Симферополь, ул. Рубцова 42"))
        )
        return historyList
    }
}