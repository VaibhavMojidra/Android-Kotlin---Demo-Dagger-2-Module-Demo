package com.vaibhavmojidra.dagger2moduledemokotlin

import dagger.Component

@Component(modules = [BatteryModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}