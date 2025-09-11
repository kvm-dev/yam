package ru.kvmsoft.yam.user.impl.data

import ru.kvmsoft.yam.user.api.model.UserDataDomain
import ru.kvmsoft.yam.user.impl.data.local.LocalDataSource
import ru.kvmsoft.yam.user.impl.mapper.Mapper
import ru.kvmsoft.yam.user.impl.model.UserData

class UserRepository(private val localDataSource: LocalDataSource) {
    suspend fun getUserPhone() = localDataSource.getUserPhone()
    suspend fun getUserName() = localDataSource.getUserName()
    suspend fun getUserOrdersHistory() = localDataSource.getUserOrdersHistory()
    suspend fun getUserHomeAddress() = localDataSource.getUserHomeAddress()

    suspend fun getUserData(): UserDataDomain {
        return Mapper.mapUserDataToDomain(
            UserData(
                userPhone = getUserPhone(),
                userName = getUserName(),
                userHomeAddress = getUserHomeAddress(),
                userOrdersHistory = getUserOrdersHistory()
                )
        )
    }
}