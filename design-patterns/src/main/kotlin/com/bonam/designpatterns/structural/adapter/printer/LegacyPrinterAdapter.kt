package com.bonam.designpatterns.structural.adapter.printer

class LegacyPrinterAdapter(private val legacyPrinter: LegacyPrinter) : Printer {
    override fun print(document: String) {
        legacyPrinter.printText(document)
    }
}
