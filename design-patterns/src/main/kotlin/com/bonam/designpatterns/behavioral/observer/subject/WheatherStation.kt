package com.bonam.designpatterns.behavioral.observer.subject

import com.bonam.designpatterns.behavioral.observer.observer.Observer

class WeatherStation : Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature: Float = 0.0f

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature)
        }
    }

    fun setTemperature(temp: Float) {
        println("WeatherStation: New temperature is $temp°C")
        temperature = temp
        notifyObservers()
    }
}
