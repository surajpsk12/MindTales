package com.surajvanshsv.mindtales.features.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel : ViewModel(){

    private val _navigateToHome = MutableStateFlow(false)
    val navigateToHome : StateFlow<Boolean> = _navigateToHome


    fun onLoginClicked(){
        _navigateToHome.value = true

    }


}