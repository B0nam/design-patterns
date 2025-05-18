package com.bonam.designpatterns.structural.adapter.printer

class ModernPrinter : Printer {
    override fun print(document: String) {
        println("Modern printer printing: $document")
    }
}
