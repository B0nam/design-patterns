package com.bonam.designpatterns.structural.composite

import com.bonam.designpatterns.structural.composite.composite.Category
import com.bonam.designpatterns.structural.composite.leaf.Product

fun main() {
    val notebook = Product("Notebook", 6500.00)
    val smartphone = Product("Smartphone", 3000.00)
    val shirt = Product("shirt", 80.00)
    val calca = Product("Calça Jeans", 120.00)

    val eletronics = Category("eletronics")
    eletronics.add(notebook)
    eletronics.add(smartphone)

    val clothes = Category("clothes")
    clothes.add(shirt)
    clothes.add(calca)

    val catalog = Category("catalog")
    catalog.add(eletronics)
    catalog.add(clothes)

    catalog.print()
}
