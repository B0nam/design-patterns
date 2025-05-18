package com.bonam.designpatterns.structural.bridge.message

import com.bonam.designpatterns.structural.bridge.sender.MessageSender

abstract class Message(protected val sender: MessageSender) {
    abstract fun send(content: String)
}
