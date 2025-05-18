package com.bonam.designpatterns.structural.bridge.message

import com.bonam.designpatterns.structural.bridge.sender.MessageSender

class AlertMessage(sender: MessageSender) : Message(sender) {
    override fun send(content: String) {
        val alertContent = "[ALERT] $content"
        sender.sendMessage(alertContent)
    }
}
