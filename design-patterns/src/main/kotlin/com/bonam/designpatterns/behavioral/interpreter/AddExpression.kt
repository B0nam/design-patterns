package com.bonam.designpatterns.behavioral.interpreter

class AddExpression(
    private val left: Expression,
    private val right: Expression
) : Expression {
    override fun interpret(): Int = left.interpret() + right.interpret()
}
