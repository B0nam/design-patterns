package com.bonam.designpatterns.creational.prototype.prototype

import com.bonam.designpatterns.creational.prototype.model.DocumentPrototype

data class Spreadsheet(
    val title: String,
    val cells: List<List<String>>
) : DocumentPrototype {
    override fun clone(): DocumentPrototype {
        return this.copy(cells = cells.map { it.toList() }) // cópia profunda
    }
}
