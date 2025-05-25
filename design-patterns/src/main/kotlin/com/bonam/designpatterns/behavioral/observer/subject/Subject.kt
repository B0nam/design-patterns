package com.bonam.designpatterns.behavioral.observer.subject

import com.bonam.designpatterns.behavioral.observer.observer.Observer

interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}
