package com.bonam.designpatterns.structural.decorator

import com.bonam.designpatterns.structural.decorator.concrete.Espresso
import com.bonam.designpatterns.structural.decorator.decorator.ChocolateDecorator
import com.bonam.designpatterns.structural.decorator.decorator.MilkDecorator

fun main() {
    val espresso = Espresso()
    val withMilk = MilkDecorator(espresso)
    val withMilkAndChocolate = ChocolateDecorator(withMilk)

    println("Order: ${withMilkAndChocolate.getDescription()}")
    println("Price: R$ %.2f".format(withMilkAndChocolate.cost()))
}
