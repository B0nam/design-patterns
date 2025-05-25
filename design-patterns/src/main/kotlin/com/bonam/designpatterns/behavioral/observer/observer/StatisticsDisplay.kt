package com.bonam.designpatterns.behavioral.observer.observer

class StatisticsDisplay : Observer {
    private val history = mutableListOf<Float>()

    override fun update(temperature: Float) {
        history.add(temperature)
        val average = history.average()
        println("StatisticsDisplay: Average temperature is ${"%.2f".format(average)}°C")
    }
}
