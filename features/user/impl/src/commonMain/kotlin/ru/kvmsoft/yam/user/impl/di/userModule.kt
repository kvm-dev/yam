package ru.kvmsoft.yam.user.impl.di

import org.koin.dsl.module
import ru.kvmsoft.yam.user.api.domain.usecase.AddHistoryOrderUseCase
import ru.kvmsoft.yam.user.api.domain.usecase.GetUserDataUseCase
import ru.kvmsoft.yam.user.api.domain.usecase.GetUserOrdersHistoryUseCase
import ru.kvmsoft.yam.user.api.domain.usecase.UpdateUserEmailUseCase
import ru.kvmsoft.yam.user.api.domain.usecase.UpdateUserNameUseCase
import ru.kvmsoft.yam.user.api.domain.usecase.UpdateUserPhoneUseCase
import ru.kvmsoft.yam.user.impl.domain.usecase.AddHistoryOrderUseCaseImpl
import ru.kvmsoft.yam.user.impl.domain.usecase.GetUserDataUseCaseImpl
import ru.kvmsoft.yam.user.impl.domain.usecase.GetUserOrdersHistoryUseCaseImpl
import ru.kvmsoft.yam.user.impl.domain.usecase.UpdateUserEmailUseCaseImp
import ru.kvmsoft.yam.user.impl.domain.usecase.UpdateUserNameUseCaseImpl
import ru.kvmsoft.yam.user.impl.domain.usecase.UpdateUserPhoneUseCaseImpl

val userModule = module {
    single<AddHistoryOrderUseCase> { AddHistoryOrderUseCaseImpl(storageRepository = get()) }
    single<GetUserDataUseCase> { GetUserDataUseCaseImpl(storageRepository = get()) }
    single<GetUserOrdersHistoryUseCase> { GetUserOrdersHistoryUseCaseImpl(storageRepository = get()) }
    single<UpdateUserEmailUseCase> { UpdateUserEmailUseCaseImp(storageRepository = get()) }
    single<UpdateUserNameUseCase> { UpdateUserNameUseCaseImpl(storageRepository = get()) }
    single<UpdateUserPhoneUseCase> { UpdateUserPhoneUseCaseImpl(storageRepository = get()) }
}