package com.bonam.designpatterns.creational.prototype.prototype

import com.bonam.designpatterns.creational.prototype.model.DocumentPrototype

data class TextDocument(
    val title: String,
    val content: String
) : DocumentPrototype {
    override fun clone(): DocumentPrototype {
        return this.copy()
    }
}
