package com.example.mvvm19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mutableLiveDataString = MutableLiveData<String>()

        // Read
        mutableLiveDataString.observe(this@MainActivity) {
            Log.d("BBB", it)
        }

        // Write
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            mutableLiveDataString.value = "New data"
        }
    }
}