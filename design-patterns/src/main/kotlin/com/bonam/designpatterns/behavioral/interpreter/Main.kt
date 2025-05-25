package com.bonam.designpatterns.behavioral.interpreter

fun main() {
    val expression = SubtractExpression(
        AddExpression(
            NumberExpression(5),
            NumberExpression(3)
        ),
        NumberExpression(2)
    )

    println("Result: ${expression.interpret()}")
}
