package com.benmohammad.androidmvvm.main

sealed class MainState {

    class ShowItems(val items: List<String>): MainState()
    class ShowMessage(val message: String): MainState()

}