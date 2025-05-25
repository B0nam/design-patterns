package com.bonam.designpatterns.behavioral.mediator

class User(
    val name: String,
    private val mediator: Mediator
) {
    fun send(message: String) {
        println("$name sends: $message")
        mediator.sendMessage(this, message)
    }

    fun receive(message: String, sender: User) {
        println("$name receives from ${sender.name}: $message")
    }
}
