package com.bonam.designpatterns.behavioral.templatemethod

import com.bonam.designpatterns.behavioral.templatemethod.concrete.DocProcessor
import com.bonam.designpatterns.behavioral.templatemethod.concrete.PdfProcessor

fun main() {
    val pdfProcessor = PdfProcessor()
    println("=== PDF ===")
    pdfProcessor.process()

    println("\n=== DOC ===")
    val docProcessor = DocProcessor()
    docProcessor.process()
}
