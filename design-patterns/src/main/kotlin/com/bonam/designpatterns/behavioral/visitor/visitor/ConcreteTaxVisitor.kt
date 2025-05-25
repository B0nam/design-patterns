package com.bonam.designpatterns.behavioral.visitor.visitor

import com.bonam.designpatterns.behavioral.visitor.element.Product
import com.bonam.designpatterns.behavioral.visitor.element.Service

class ConcreteTaxVisitor : TaxVisitor {
    override fun visitProduct(product: Product) {
        val tax = product.price * 0.1
        println("Product '${product.name}': price = \$${product.price}, tax = \$${"%.2f".format(tax)}")
    }

    override fun visitService(service: Service) {
        val total = service.hourlyRate * service.hours
        val tax = total * 0.15
        println("Service '${service.description}': total = \$${total}, tax = \$${"%.2f".format(tax)}")
    }
}
