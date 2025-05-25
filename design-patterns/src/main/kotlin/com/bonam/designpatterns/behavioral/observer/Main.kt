package com.bonam.designpatterns.behavioral.observer

import com.bonam.designpatterns.behavioral.observer.observer.AlertSystem
import com.bonam.designpatterns.behavioral.observer.observer.StatisticsDisplay
import com.bonam.designpatterns.behavioral.observer.observer.TemperatureDisplay
import com.bonam.designpatterns.behavioral.observer.subject.WeatherStation

fun main() {
    val station = WeatherStation()

    val display = TemperatureDisplay()
    val statistics = StatisticsDisplay()
    val alert = AlertSystem()

    station.registerObserver(display)
    station.registerObserver(statistics)
    station.registerObserver(alert)

    station.setTemperature(30f)
    station.setTemperature(36.5f)
    station.setTemperature(28f)
}
