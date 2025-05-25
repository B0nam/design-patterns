package com.bonam.designpatterns.behavioral.visitor.element

import com.bonam.designpatterns.behavioral.visitor.visitor.TaxVisitor

class Product(val name: String, val price: Double) : Visitable {
    override fun accept(visitor: TaxVisitor) {
        visitor.visitProduct(this)
    }
}

