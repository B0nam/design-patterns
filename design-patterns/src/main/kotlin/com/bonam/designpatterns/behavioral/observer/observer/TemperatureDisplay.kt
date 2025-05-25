package com.bonam.designpatterns.behavioral.observer.observer

class TemperatureDisplay : Observer {
    override fun update(temperature: Float) {
        println("TemperatureDisplay: Current temperature is $temperature°C")
    }
}
