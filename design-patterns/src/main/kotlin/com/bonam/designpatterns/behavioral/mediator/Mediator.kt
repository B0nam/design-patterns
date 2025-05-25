package com.bonam.designpatterns.behavioral.mediator

interface Mediator {
    fun sendMessage(sender: User, message: String)
    fun addUser(user: User)
}
