package com.bonam.designpatterns.behavioral.iterator

fun main() {
    val collection = NameCollection(listOf("Alice", "Bob", "Charlie"))
    val iterator = collection.createIterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
