package ru.kvmsoft.yam.base.storage.data.local

import ru.kvmsoft.yam.base.storage.AppDatabase
import ru.kvmsoft.yam.base.storage.drivers.DatabaseDriverFactory
import ru.kvmsoft.yam.base.storage.mapper.Mapper
import ru.kvmsoft.yam.base.storage.model.UserDomain
import ru.kvmsoft.yam.base.storage.model.UserOrderHistoryDomain

 class LocalDataSource(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = AppDatabase.Companion(databaseDriverFactory.createDriver())
    private val dbQueries = database.appDatabaseQueries

    fun addUser(data: UserDomain){
        dbQueries.insertUser(
            userId = 0,
            userName = data.userName,
            userPhone = data.userPhone,
            userEmail = data.userEmail,
            userHomeAddress = data.userHomeAddress,
            userHomeLat = data.userHomeLat,
            userHomeLng = data.userHomeLng)
    }

    fun getUser(): UserDomain {
        val data = dbQueries.selectUser(0).executeAsOne()
        return Mapper.userToDomain(data)
    }

    fun clearUser(){
        dbQueries.clearUser()
    }

     fun updateUserName(userName: String){
         dbQueries.updateUserName(
             userName = userName,
             userId = 0L
         )
     }

     fun updateUserPhone(userPhone: String){
         dbQueries.updateUserPhone(
             userPhone = userPhone,
             userId = 0L)
     }

     fun updateUserEmail(email: String){
         dbQueries.updateUserEmail(
             userEmail = email,
             userId = 0L
         )
     }

     fun updateUserHomeAddress(address: String, lat: Double, lng: Double){
         dbQueries.updateUserHomeAddress(
             userHomeAddress = address,
             userHomeLat = lat,
             userHomeLng = lng,
             userId = 0L
         )
     }

    fun addOrderHistory(order: UserOrderHistoryDomain, dateTime: Long){
        dbQueries.insertOrderHistory(
            orderId = null,
            fromLat = order.fromLat,
            fromLng = order.fromLng,
            fromAddress = order.fromAddress,
            toLat = order.toLat,
            toLng = order.toLng,
            toAddress = order.toAddress,
            dateTime = dateTime
        )
    }

    fun getOrdersHistory(): List<UserOrderHistoryDomain>{
        val resultList = ArrayList<UserOrderHistoryDomain>()
        val ordersHistoryList = dbQueries.selectOrdersHistory().executeAsList()
        ordersHistoryList.forEach { order->
            resultList.add(Mapper.userHistoryToDomain(order))
        }
        return resultList
    }

     fun clearOrdersHistory() = dbQueries.clearOrdersHistory()
}