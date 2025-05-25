package com.bonam.designpatterns.behavioral.iterator

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}
