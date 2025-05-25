package com.bonam.designpatterns.behavioral.iterator

class NameIterator(
    private val names: List<String>
) : Iterator<String> {

    private var position = 0

    override fun hasNext(): Boolean {
        return position < names.size
    }

    override fun next(): String {
        return if (hasNext()) names[position++] else throw NoSuchElementException()
    }
}
