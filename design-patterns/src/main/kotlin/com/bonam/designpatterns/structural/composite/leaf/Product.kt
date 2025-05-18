package com.bonam.designpatterns.structural.composite.leaf

import com.bonam.designpatterns.structural.composite.component.CatalogComponent

class Product(private val name: String, private val price: Double) : CatalogComponent() {
    override fun print(indent: String) {
        println("$indent Product: $name - R$ %.2f".format(price))
    }
}
