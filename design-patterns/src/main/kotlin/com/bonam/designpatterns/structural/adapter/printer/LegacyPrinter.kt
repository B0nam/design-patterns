package com.bonam.designpatterns.structural.adapter.printer

class LegacyPrinter {
    fun printText(text: String) {
        println("Legacy printer printing: $text")
    }
}
