package com.bonam.designpatterns.behavioral.visitor.element

import com.bonam.designpatterns.behavioral.visitor.visitor.TaxVisitor

class Service(val description: String, val hourlyRate: Double, val hours: Int) : Visitable {
    override fun accept(visitor: TaxVisitor) {
        visitor.visitService(this)
    }
}
