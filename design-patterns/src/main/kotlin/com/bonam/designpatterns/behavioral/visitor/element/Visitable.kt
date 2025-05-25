package com.bonam.designpatterns.behavioral.visitor.element

import com.bonam.designpatterns.behavioral.visitor.visitor.TaxVisitor

interface Visitable {
    fun accept(visitor: TaxVisitor)
}
