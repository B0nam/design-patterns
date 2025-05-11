package com.bonam.designpatterns.creational.abstractfactory.fastfood.order

import com.bonam.designpatterns.creational.abstractfactory.fastfood.abstractfactory.FastFoodFactory

class Order(private val factory: FastFoodFactory) {
    fun completeOrder() {
        val burguer = factory.createHamburguer()
        val fries = factory.createFries()
        val soda = factory.createSoda()

        print(burguer.prepare())
        print(fries.prepare())
        print(soda.serve())
    }
}
