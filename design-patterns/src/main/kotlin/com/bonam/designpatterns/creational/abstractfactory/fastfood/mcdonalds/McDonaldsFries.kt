package com.bonam.designpatterns.creational.abstractfactory.fastfood.mcdonalds

import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Fries

class McDonaldsFries : Fries {
    override fun prepare() = "Preparing McDonald's Fries\n"
}
