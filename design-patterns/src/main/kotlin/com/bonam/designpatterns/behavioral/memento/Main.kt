package com.bonam.designpatterns.behavioral.memento

fun main() {
    val editor = Editor()
    val caretaker = Caretaker()

    editor.type("Hello, ")
    caretaker.saveState(editor.save())

    editor.type("world!")
    caretaker.saveState(editor.save())

    println("Content: ${editor.content}")

    val memento = caretaker.undo()
    if (memento != null) {
        editor.restore(memento)
        println("After undo: ${editor.content}")
    }
}

