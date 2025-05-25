package com.bonam.designpatterns.behavioral.command.invoker

import com.bonam.designpatterns.behavioral.command.command.Command

class RemoteControl {
    private val buttons = mutableMapOf<String, Command>()

    fun setCommand(buttonName: String, command: Command) {
        buttons[buttonName] = command
    }

    fun pressButton(buttonName: String) {
        val command = buttons[buttonName]
        if (command != null) {
            println("Executing \"$buttonName\" command:")
            command.execute()
        } else {
            println("No command assigned to \"$buttonName\"")
        }
    }
}
