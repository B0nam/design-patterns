package com.bonam.designpatterns.behavioral.templatemethod.template

abstract class DocumentProcessor {
    fun process() {
        openFile()
        readContent()
        processContent()
        saveResult()
    }

    private fun openFile() {
        println("Opening file...")
    }

    private fun readContent() {
        println("Reading file content...")
    }

    protected abstract fun processContent()

    private fun saveResult() {
        println("Saving processed result...")
    }
}
