package ru.kvmsoft.yam.base.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import ru.kvmsoft.yam.base.viewmodel.model.ProgressState

open class BaseViewModel : ViewModel() {
    private val _progressState = MutableStateFlow(ProgressState.IDLE)
    val progressState: StateFlow<ProgressState> = _progressState.asStateFlow()

    fun updateState(state: ProgressState){
        _progressState.value = state
    }

    val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        //something error
    }

    val supervisorJob = SupervisorJob()
}