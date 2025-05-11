package com.bonam.designpatterns.creational.abstractfactory.fastfood.burguerking

import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Hamburguer

class BurguerKingHamburguer : Hamburguer {
    override fun prepare() = "Preparing Wooper Hamburguer from Burguer King\n"
}
