package ru.kvmsoft.yam.home.impl.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import ru.kvmsoft.yam.base.viewmodel.BaseViewModel
import ru.kvmsoft.yam.base.viewmodel.model.ProgressState
import ru.kvmsoft.yam.home.impl.domain.HomeInteractor
import ru.kvmsoft.yam.home.impl.presentation.ui.HomeViewState

class HomeScreenViewModel(private val interactor: HomeInteractor) : BaseViewModel() {
    private val _uiState = MutableStateFlow<HomeViewState>(
        HomeViewState()
    )

    val uiState: StateFlow<HomeViewState> = _uiState.asStateFlow()

    fun initViewModel() = with(viewModelScope + coroutineExceptionHandler) {
        if(progressState.value == ProgressState.LOADING){
            launch(Dispatchers.IO) {
                val currentState = interactor.getCurrentState()
                _uiState.update { currentState }
            }
        }
    }

    fun updateUserPosition() = with(viewModelScope + coroutineExceptionHandler){
        launch(Dispatchers.IO) {
            val currentPosition = interactor.getCurrentUserLocation()
            _uiState.value.copy(currentStreetName = "Ул. Бела-Куна 9", currentPosition = currentPosition)
        }
    }

//    fun updateUserPosition() = with(viewModelScope + coroutineExceptionHandler){
//        val currentPosition = interactor.getCurrentUserLocation()
//        _uiState.update { NewsViewState.LoadingState(lang = lang) }
//        launch {
//            if(interactor.isConnectionAvailable()){
//                interactor.getNewsFromServer()
//            }
//            else{
//                interactor.getNewsFromLocal()
//            }
//            updateState(ProgressState.LOADING)
//            initViewModel()
//        }
//    }

//    fun navigateToSingleNews(navController: NavController, newsId: Int, newsDestination: String){
//        val route = "$newsDestination/{newsId}"
//        navController.navigate(
//            route.replace(
//                oldValue = "{newsId}",
//                newValue = newsId.toString()
//            )
//        )
//    }

//    fun isConnectionAvailable() = interactor.isConnectionAvailable()
}