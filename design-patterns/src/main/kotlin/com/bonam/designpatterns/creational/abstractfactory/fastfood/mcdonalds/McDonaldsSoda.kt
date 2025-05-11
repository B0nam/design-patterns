package com.bonam.designpatterns.creational.abstractfactory.fastfood.mcdonalds

import com.bonam.designpatterns.creational.abstractfactory.fastfood.product.Soda

class McDonaldsSoda : Soda {
    override fun serve() = "Serving CocaCola soda from McDonald's\n"
}
