package com.bonam.designpatterns.behavioral.templatemethod.concrete

import com.bonam.designpatterns.behavioral.templatemethod.template.DocumentProcessor

class DocProcessor : DocumentProcessor() {

    override fun processContent() {
        println("Processing DOC content...")
    }
}
