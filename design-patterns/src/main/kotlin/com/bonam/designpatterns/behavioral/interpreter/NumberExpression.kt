package com.bonam.designpatterns.behavioral.interpreter

class NumberExpression(private val number: Int) : Expression {
    override fun interpret(): Int = number
}
