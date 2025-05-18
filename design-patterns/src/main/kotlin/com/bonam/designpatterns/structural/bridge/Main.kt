package com.bonam.designpatterns.structural.bridge

import com.bonam.designpatterns.structural.bridge.message.AlertMessage
import com.bonam.designpatterns.structural.bridge.message.NotificationMessage
import com.bonam.designpatterns.structural.bridge.sender.EmailSender
import com.bonam.designpatterns.structural.bridge.sender.SmsSender

fun main() {
    val emailSender = EmailSender()
    val smsSender = SmsSender()

    val alertByEmail = AlertMessage(emailSender)
    val notificationBySms = NotificationMessage(smsSender)

    alertByEmail.send("System is down.")
    notificationBySms.send("You have a new message.")
}
