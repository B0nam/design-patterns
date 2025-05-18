package com.bonam.designpatterns.structural.flyweight

import com.bonam.designpatterns.structural.flyweight.flyweight.CharacterStyleFactory
import com.bonam.designpatterns.structural.flyweight.model.CharacterModel

fun main() {
    val characters = mutableListOf<CharacterModel>()

    val style1 = CharacterStyleFactory.getStyle("Arial", 12, "Black")
    val style3 = CharacterStyleFactory.getStyle("Courier", 14, "Red")

    characters.add(CharacterModel('H', 0, style1))
    characters.add(CharacterModel('e', 1, style1))
    characters.add(CharacterModel('l', 2, style1))
    characters.add(CharacterModel('l', 3, style1))
    characters.add(CharacterModel('o', 4, style3))

    characters.forEach { it.render() }
}
