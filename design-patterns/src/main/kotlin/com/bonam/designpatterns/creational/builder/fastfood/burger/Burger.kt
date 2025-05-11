package com.bonam.designpatterns.creational.builder.fastfood.burger

data class Burger(
    val meat: String,
    val cheese: String,
    val lettuce: Boolean,
    val tomato: Boolean,
    val sauce: String
) {

    fun describe() {
        println("\nHamburguer ingredients:" +
                "$meat\n" +
                "$cheese\n" +
                "${if (lettuce) "alface, " else ""}\n" +
                "${if (lettuce) "alface, " else ""}\n" +
                "$sauce\n"
        )
    }
}