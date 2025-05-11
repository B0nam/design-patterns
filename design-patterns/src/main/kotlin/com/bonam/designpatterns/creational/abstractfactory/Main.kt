package com.bonam.designpatterns.creational.abstractfactory

import com.bonam.designpatterns.creational.abstractfactory.fastfood.burguerking.BurguerKingFactory
import com.bonam.designpatterns.creational.abstractfactory.fastfood.mcdonalds.McDonaldsFactory
import com.bonam.designpatterns.creational.abstractfactory.fastfood.order.Order

fun main() {
    println("Order from McDonald's:")
    val orderMacDonalds = Order(McDonaldsFactory())
    orderMacDonalds.completeOrder()

    println()

    println("Order from Burguer King:")
    val orderBurguerKing = Order(BurguerKingFactory())
    orderBurguerKing.completeOrder()
}