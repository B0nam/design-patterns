package com.bonam.designpatterns.structural.bridge.sender

class SmsSender : MessageSender {
    override fun sendMessage(content: String) {
        println("Sending SMS: $content")
    }
}
