package ru.kvmsoft.yam.base.storage.data

import ru.kvmsoft.yam.base.storage.data.local.LocalDataSource
import ru.kvmsoft.yam.base.storage.model.UserDomain
import ru.kvmsoft.yam.base.storage.model.UserOrderHistoryDomain
import kotlin.time.Clock
import kotlin.time.ExperimentalTime

class StorageRepository(private val localDataSource: LocalDataSource) {

    fun addUser(data: UserDomain) =  localDataSource.addUser(data)
    fun getUser(): UserDomain = localDataSource.getUser()
    fun clearUser() = localDataSource.clearUser()
    fun updateUserName(userName: String) = localDataSource.updateUserName(userName)
    fun updateUserPhone(phone: String) = localDataSource.updateUserPhone(phone)
    fun updateUserEmail(email: String) = localDataSource.updateUserEmail(email)
    fun updateUserHomeAddress(address: String, lat: Double, lng: Double) = localDataSource.updateUserHomeAddress(address, lat, lng)
    @OptIn(ExperimentalTime::class)
    fun addOrderHistory(order: UserOrderHistoryDomain, ) = localDataSource.addOrderHistory(order, dateTime = Clock.System.now().toEpochMilliseconds())
    fun getOrdersHistory(): List<UserOrderHistoryDomain> = localDataSource.getOrdersHistory()
    fun clearOrdersHistory() = localDataSource.clearOrdersHistory()
}