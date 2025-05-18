package com.bonam.designpatterns.structural.composite.component

abstract class CatalogComponent {
    open fun add(component: CatalogComponent) {
        throw UnsupportedOperationException("Unsupported operation")
    }

    open fun remove(component: CatalogComponent) {
        throw UnsupportedOperationException("Unsupported operation")
    }

    abstract fun print(indent: String = "")
}
