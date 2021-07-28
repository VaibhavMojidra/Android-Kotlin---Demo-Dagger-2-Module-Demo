package com.vaibhavmojidra.dagger2moduledemokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerSmartPhoneComponent
            .create()
            .getSmartPhone() //Injecting the class using Dagger
            .makeCallRecording()

    }
}