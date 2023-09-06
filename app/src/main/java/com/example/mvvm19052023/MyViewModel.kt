package com.example.mvvm19052023

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private val mutableLiveDataString = MutableLiveData("")

    fun setText(text: String) {
        mutableLiveDataString.value = text
    }

    fun getLiveDataString(): LiveData<String> = mutableLiveDataString
}