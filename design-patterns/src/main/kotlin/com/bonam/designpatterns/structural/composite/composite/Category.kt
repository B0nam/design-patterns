package com.bonam.designpatterns.structural.composite.composite

import com.bonam.designpatterns.structural.composite.component.CatalogComponent

class Category(private val name: String) : CatalogComponent() {
    private val children = mutableListOf<CatalogComponent>()

    override fun add(component: CatalogComponent) {
        children.add(component)
    }

    override fun remove(component: CatalogComponent) {
        children.remove(component)
    }

    override fun print(indent: String) {
        println("$indent Category: $name")
        children.forEach { it.print("$indent    ") }
    }
}
