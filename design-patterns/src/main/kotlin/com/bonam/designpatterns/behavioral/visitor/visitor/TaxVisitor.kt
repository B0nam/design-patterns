package com.bonam.designpatterns.behavioral.visitor.visitor

import com.bonam.designpatterns.behavioral.visitor.element.Product
import com.bonam.designpatterns.behavioral.visitor.element.Service

interface TaxVisitor {
    fun visitProduct(product: Product)
    fun visitService(service: Service)
}
