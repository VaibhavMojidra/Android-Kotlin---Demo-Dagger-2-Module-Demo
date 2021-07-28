package com.vaibhavmojidra.dagger2moduledemokotlin

import android.util.Log
import javax.inject.Inject

class Battery{
    init {
        Log.i("MyInfo","Battery Constructed")
    }

    fun getPower(){
        Log.i("MyInfo","Battery Power is available")
    }
}
