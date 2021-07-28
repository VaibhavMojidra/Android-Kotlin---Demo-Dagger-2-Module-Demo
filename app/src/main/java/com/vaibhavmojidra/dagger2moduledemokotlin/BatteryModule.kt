package com.vaibhavmojidra.dagger2moduledemokotlin

import com.vaibhavmojidra.dagger2moduledemokotlin.Battery
import dagger.Module
import dagger.Provides

@Module
class BatteryModule {
    @Provides
    fun provideBattery():Battery{
       return Battery()
    }
}