package com.bonam.designpatterns.creational.abstractfactory.fastfood.burguerking

import com.bonam.designpatterns.creational.abstractfactory.fastfood.abstractfactory.FastFoodFactory
import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Fries
import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Hamburguer
import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Soda

class BurguerKingFactory : FastFoodFactory {
    override fun createHamburguer(): Hamburguer = BurguerKingHamburguer()
    override fun createFries(): Fries = BurguerKingFries()
    override fun createSoda(): Soda = BurguerKingSoda()
}