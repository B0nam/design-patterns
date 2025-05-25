package com.bonam.designpatterns.behavioral.memento

class Editor {
    var content: String = ""
        private set

    fun type(words: String) {
        content += words
    }

    fun save(): Memento {
        return Memento(content)
    }

    fun restore(memento: Memento) {
        content = memento.state
    }
}
