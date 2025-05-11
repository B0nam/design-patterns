package com.bonam.designpatterns.creational.builder.fastfood.director

import com.bonam.designpatterns.creational.builder.fastfood.builder.BurgerBuilder
import com.bonam.designpatterns.creational.builder.fastfood.burger.Burger

class BurgerDirector(private val builder: BurgerBuilder) {
    fun makeBurger(): Burger {
        return builder.setMeat()
            .setCheese()
            .setLettuce()
            .setTomato()
            .setSauce()
            .build()
    }
}
