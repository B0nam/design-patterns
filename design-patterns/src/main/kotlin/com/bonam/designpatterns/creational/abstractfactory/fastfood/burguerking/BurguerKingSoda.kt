package com.bonam.designpatterns.creational.abstractfactory.fastfood.burguerking

import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Soda

class BurguerKingSoda : Soda {
    override fun serve() = "Serving Pepsi soda from Burguer King\n"
}
