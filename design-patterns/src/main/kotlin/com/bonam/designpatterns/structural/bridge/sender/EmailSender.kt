package com.bonam.designpatterns.structural.bridge.sender

class EmailSender : MessageSender {
    override fun sendMessage(content: String) {
        println("Sending email: $content")
    }
}
