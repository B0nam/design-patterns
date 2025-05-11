package com.bonam.designpatterns.creational.builder.fastfood.builder

import com.bonam.designpatterns.creational.builder.fastfood.burger.Burger

class VeggieBurgerBuilder : BurgerBuilder {

    private var meat = ""
    private var cheese = ""
    private var lettuce = false
    private var tomato = false
    private var sauce = ""

    override fun setMeat(): BurgerBuilder {
        meat = "veggie"
        return this
    }

    override fun setCheese(): BurgerBuilder {
        cheese = "vegan cheese"
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
        sauce = "vegan mayo"
        return this
    }

    override fun build(): Burger {
        return Burger(meat, cheese, lettuce, tomato, sauce)
    }
}
