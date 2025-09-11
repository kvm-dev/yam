package ru.kvmsoft.yam.home.impl.presentation.ui

import dev.sargunv.maplibrecompose.compose.offline.OfflinePack
import ru.kvmsoft.yam.home.impl.model.UserLocationPoints

//sealed class HomeViewState {
//
//    data object LoadingState: HomeViewState()
//
//    data class ErrorState(val errorMsg: String): HomeViewState()
//
//    data class SuccessState(
//        val localMap: Set<Set<OfflinePack>>,
//        val currentPosition: Pair<Double, Double>?,
//        val currentStreetName: String?
//    ): HomeViewState()
//}

data class HomeViewState(
    val localMap: Set<OfflinePack> = setOf(),
    val currentPosition: UserLocationPoints? = null,
    val currentStreetName: String? = null,
    val isLoading: Boolean = true
)