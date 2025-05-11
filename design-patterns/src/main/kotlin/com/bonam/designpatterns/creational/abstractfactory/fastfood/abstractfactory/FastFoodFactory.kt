package com.bonam.designpatterns.creational.abstractfactory.fastfood.abstractfactory

import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Fries
import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Hamburguer
import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Soda

interface FastFoodFactory {
    fun createHamburguer(): Hamburguer
    fun createFries(): Fries
    fun createSoda(): Soda
}
