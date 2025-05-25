package com.bonam.designpatterns.behavioral.iterator

class NameCollection(private val names: List<String>) {
    fun createIterator(): Iterator<String> {
        return NameIterator(names)
    }
}
