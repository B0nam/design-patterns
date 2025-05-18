package com.bonam.designpatterns.structural.bridge.message

import com.bonam.designpatterns.structural.bridge.sender.MessageSender

class NotificationMessage(sender: MessageSender) : Message(sender) {
    override fun send(content: String) {
        val notificationContent = "[NOTIFICATION] $content"
        sender.sendMessage(notificationContent)
    }
}
