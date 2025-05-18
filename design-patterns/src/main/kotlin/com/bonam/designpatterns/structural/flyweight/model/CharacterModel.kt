package com.bonam.designpatterns.structural.flyweight.model

import com.bonam.designpatterns.structural.flyweight.flyweight.CharacterStyle

class CharacterModel(
    private val symbol: Char,
    private val position: Int,
    private val style: CharacterStyle
) {
    fun render() {
        println("Caracter: $symbol, position: $position, style: $style")
    }
}
