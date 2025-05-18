package com.bonam.designpatterns.structural.decorator.concrete

import com.bonam.designpatterns.structural.decorator.component.Beverage

class Espresso : Beverage {
    override fun getDescription(): String = "Espresso"
    override fun cost(): Double = 4.0
}
