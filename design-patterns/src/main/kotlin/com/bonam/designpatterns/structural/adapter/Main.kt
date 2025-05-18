package com.bonam.designpatterns.structural.adapter

import com.bonam.designpatterns.structural.adapter.printer.ModernPrinter
import com.bonam.designpatterns.structural.adapter.printer.Printer
import com.bonam.designpatterns.structural.adapter.printer.LegacyPrinter
import com.bonam.designpatterns.structural.adapter.printer.LegacyPrinterAdapter

fun main() {
    val modernPrinter: Printer = ModernPrinter()
    modernPrinter.print("Relatório do mês de maio.")

    val legacyPrinter = LegacyPrinter()
    val legacyAdapter: Printer = LegacyPrinterAdapter(legacyPrinter)
    legacyAdapter.print("Documento legado.")
}
