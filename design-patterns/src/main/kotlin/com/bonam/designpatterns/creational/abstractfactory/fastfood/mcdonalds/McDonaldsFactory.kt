package com.bonam.designpatterns.creational.abstractfactory.fastfood.mcdonalds

import com.bonam.designpatterns.creational.abstractfactory.fastfood.abstractfactory.FastFoodFactory
import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Fries
import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Hamburguer
import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Soda

class McDonaldsFactory : FastFoodFactory {
    override fun createHamburguer(): Hamburguer = McDonaldsHamburguer()
    override fun createFries(): Fries = McDonaldsFries()
    override fun createSoda(): Soda = McDonaldsSoda()
}