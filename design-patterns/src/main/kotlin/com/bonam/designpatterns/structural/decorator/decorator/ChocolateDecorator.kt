package com.bonam.designpatterns.structural.decorator.decorator

import com.bonam.designpatterns.structural.decorator.component.Beverage

class ChocolateDecorator(beverage: Beverage) : BeverageDecorator(beverage) {
    override fun getDescription(): String = beverage.getDescription() + " + Chocolate"
    override fun cost(): Double = beverage.cost() + 2.0
}
