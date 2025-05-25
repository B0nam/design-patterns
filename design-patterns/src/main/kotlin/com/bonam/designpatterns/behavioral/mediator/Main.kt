package com.bonam.designpatterns.behavioral.mediator

fun main() {
    val chatRoom = ChatRoom()

    val alice = User("Alice", chatRoom)
    val bob = User("Bob", chatRoom)
    val charlie = User("Charlie", chatRoom)

    chatRoom.addUser(alice)
    chatRoom.addUser(bob)
    chatRoom.addUser(charlie)

    alice.send("Hello everyone!")
    bob.send("Hey Alice!")
}

