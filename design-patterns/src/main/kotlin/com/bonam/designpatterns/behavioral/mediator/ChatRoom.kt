package com.bonam.designpatterns.behavioral.mediator

class ChatRoom : Mediator {
    private val users = mutableListOf<User>()

    override fun addUser(user: User) {
        users.add(user)
    }

    override fun sendMessage(sender: User, message: String) {
        for (user in users) {
            if (user != sender) {
                user.receive(message, sender)
            }
        }
    }
}
