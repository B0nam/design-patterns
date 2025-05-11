package com.bonam.designpatterns.creational.abstractfactory.fastfood.mcdonalds

import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Hamburguer

class McDonaldsHamburguer : Hamburguer {
    override fun prepare() = "Preparing BigMac Hamburguer from McDonald's\n"
}
