package com.bonam.designpatterns.creational.prototype

import com.bonam.designpatterns.creational.prototype.prototype.Spreadsheet
import com.bonam.designpatterns.creational.prototype.prototype.TextDocument

fun main() {
    val originalText = TextDocument("Contract", "This is the contract content.")
    val clonedText = originalText.clone() as TextDocument

    println("Original document: $originalText")
    println("Cloned document: $clonedText")

    val originalSpreadsheet = Spreadsheet(
        title = "Budget",
        cells = listOf(
            listOf("Item", "Price"),
            listOf("Mouse", "USD 100"),
            listOf("Keyboard", "USD 150")
        )
    )

    val clonedSpreadsheet = originalSpreadsheet.clone() as Spreadsheet

    println("\nOriginal spreadsheet: ${originalSpreadsheet.title}")
    originalSpreadsheet.cells.forEach { println(it) }

    println("\nCloned spreadsheet: ${clonedSpreadsheet.title}")
    clonedSpreadsheet.cells.forEach { println(it) }
}
