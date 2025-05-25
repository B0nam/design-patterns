package com.bonam.designpatterns.behavioral.visitor

import com.bonam.designpatterns.behavioral.visitor.element.Product
import com.bonam.designpatterns.behavioral.visitor.element.Service
import com.bonam.designpatterns.behavioral.visitor.visitor.ConcreteTaxVisitor

fun main() {
    val items = listOf(
        Product("Laptop", 2000.0),
        Product("Smartphone", 1000.0),
        Service("Consulting", 150.0, 10)
    )

    val taxVisitor = ConcreteTaxVisitor()
    for (item in items) {
        item.accept(taxVisitor)
    }
}
