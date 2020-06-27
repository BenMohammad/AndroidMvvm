package com.benmohammad.androidmvvm.login

import com.benmohammad.androidmvvm.postDelayed

class LoginInteractor {

    interface OnLoginFinishedListener{
        fun onUsernameError()
        fun onPasswordError()
        fun onSuccess()
    }

    fun login(username: String, password: String, listener: OnLoginFinishedListener) {
        postDelayed(2000) {
            when {
                username.isEmpty() -> listener.onUsernameError()
                password.isEmpty() -> listener.onPasswordError()
                else -> listener.onSuccess()
            }
        }
    }
}