package com.bonam.designpatterns.creational.abstractfactory.fastfood.burguerking

import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Fries

class BurguerKingFries : Fries {
    override fun prepare() = "Preparing Burguer King Fries\n"
}
