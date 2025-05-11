package com.bonam.designpatterns.creational.builder

import com.bonam.designpatterns.creational.builder.fastfood.builder.CheeseBurgerBuilder
import com.bonam.designpatterns.creational.builder.fastfood.builder.ChickenBurgerBuilder
import com.bonam.designpatterns.creational.builder.fastfood.builder.VeggieBurgerBuilder
import com.bonam.designpatterns.creational.builder.fastfood.director.BurgerDirector

fun main() {
    val cheeseburger = BurgerDirector(CheeseBurgerBuilder()).makeBurger()
    println("Cheeseburger:")
    cheeseburger.describe()

    val chickenBurger = BurgerDirector(ChickenBurgerBuilder()).makeBurger()
    println("\nChicken Burger:")
    chickenBurger.describe()

    val veggieBurger = BurgerDirector(VeggieBurgerBuilder()).makeBurger()
    println("\nVeggie Burger:")
    veggieBurger.describe()
}
