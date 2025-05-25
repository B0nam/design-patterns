package com.bonam.designpatterns.behavioral.memento

class Caretaker {
    private val history = mutableListOf<Memento>()

    fun saveState(memento: Memento) {
        history.add(memento)
    }

    fun undo(): Memento? {
        if (history.isNotEmpty()) {
            return history.removeAt(history.size - 1)
        }
        return null
    }
}
