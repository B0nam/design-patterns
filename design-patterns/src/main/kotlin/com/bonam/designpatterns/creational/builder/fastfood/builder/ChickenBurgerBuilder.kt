package com.bonam.designpatterns.creational.builder.fastfood.builder

import com.bonam.designpatterns.creational.builder.fastfood.burger.Burger

class ChickenBurgerBuilder : BurgerBuilder {

    private var meat = ""
    private var cheese = ""
    private var lettuce = false
    private var tomato = false
    private var sauce = ""

    override fun setMeat(): BurgerBuilder {
        meat = "chicken"
        return this
    }

    override fun setCheese(): BurgerBuilder {
        cheese = "cheddar"
        return this
    }

    override fun setLettuce(): BurgerBuilder {
        lettuce = true
        return this
    }

    override fun setTomato(): BurgerBuilder {
        tomato = true
        return this
    }

    override fun setSauce(): BurgerBuilder {
        sauce = "ketchup"
        return this
    }

    override fun build(): Burger {
        return Burger(meat, cheese, lettuce, tomato, sauce)
    }
}
