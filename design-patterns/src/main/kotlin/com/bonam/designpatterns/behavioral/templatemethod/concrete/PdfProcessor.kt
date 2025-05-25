package com.bonam.designpatterns.behavioral.templatemethod.concrete

import com.bonam.designpatterns.behavioral.templatemethod.template.DocumentProcessor

class PdfProcessor : DocumentProcessor() {

    override fun processContent() {
        println("Processing PDF content...")
    }
}
