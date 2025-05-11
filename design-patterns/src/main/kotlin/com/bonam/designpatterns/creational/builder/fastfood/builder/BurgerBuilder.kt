package com.bonam.designpatterns.creational.builder.fastfood.builder

import com.bonam.designpatterns.creational.builder.fastfood.burger.Burger

interface BurgerBuilder {
    fun setMeat(): BurgerBuilder
    fun setCheese(): BurgerBuilder
    fun setLettuce(): BurgerBuilder
    fun setTomato(): BurgerBuilder
    fun setSauce(): BurgerBuilder
    fun build(): Burger
}
