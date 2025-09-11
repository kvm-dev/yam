package ru.kvmsoft.yam.user.impl.di

import org.koin.dsl.module
import ru.kvmsoft.yam.user.api.domain.usecase.GetUserDataUseCase
import ru.kvmsoft.yam.user.impl.data.UserRepository
import ru.kvmsoft.yam.user.impl.data.local.LocalDataSource
import ru.kvmsoft.yam.user.impl.domain.usecase.GetUserDataUseCaseImpl

val userModule = module {
    single<LocalDataSource> { LocalDataSource() }
    single<UserRepository> { UserRepository(localDataSource = get()) }
    single<GetUserDataUseCase> { GetUserDataUseCaseImpl(userRepository = get()) }
}