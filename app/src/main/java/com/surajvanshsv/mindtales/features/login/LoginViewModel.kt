package com.surajvanshsv.mindtales.features.login

import androidx.lifecycle.ViewModel
import com.surajvanshsv.mindtales.data.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel(){

    private val _navigateToHome = MutableStateFlow(false)
    val navigateToHome : StateFlow<Boolean> = _navigateToHome


    fun onLoginClicked(){
        val success = authRepository.login()
        if(success){
            _navigateToHome.value = true
        }

    }


}