package com.dicoding.picodiploma.loginwithanimation.view.signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.picodiploma.loginwithanimation.data.repository.AuthRepository
import com.dicoding.picodiploma.loginwithanimation.data.response.SignupResponse
import kotlinx.coroutines.launch

class SignupViewModel (private val repository: AuthRepository) : ViewModel() {
    val signUpResponse: LiveData<SignupResponse> = repository.signupResponse

    fun postRegister(name: String, email: String, pass: String) {
        viewModelScope.launch {
            repository.register(name, email, pass)
        }
    }
}