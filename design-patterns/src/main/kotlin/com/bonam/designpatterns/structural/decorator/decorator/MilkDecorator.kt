package com.bonam.designpatterns.structural.decorator.decorator

import com.bonam.designpatterns.structural.decorator.component.Beverage

class MilkDecorator(beverage: Beverage) : BeverageDecorator(beverage) {
    override fun getDescription(): String = beverage.getDescription() + " + Milk"
    override fun cost(): Double = beverage.cost() + 1.5
}
