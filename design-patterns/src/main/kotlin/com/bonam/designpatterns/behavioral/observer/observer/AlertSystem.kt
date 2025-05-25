package com.bonam.designpatterns.behavioral.observer.observer

class AlertSystem : Observer {
    override fun update(temperature: Float) {
        if (temperature > 35) {
            println("AlertSystem: WARNING! High temperature detected: $temperature°C")
        }
    }
}
