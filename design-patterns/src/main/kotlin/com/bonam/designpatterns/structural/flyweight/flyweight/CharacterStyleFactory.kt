package com.bonam.designpatterns.structural.flyweight.flyweight

object CharacterStyleFactory {
    private val styles = mutableMapOf<String, CharacterStyle>()

    fun getStyle(font: String, size: Int, color: String): CharacterStyle {
        val key = "$font-$size-$color"
        return styles.getOrPut(key) {
            println("Creating new CharacterStyle: $key")
            CharacterStyle(font, size, color)
        }
    }
}
