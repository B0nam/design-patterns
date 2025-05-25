package com.bonam.designpatterns.behavioral.command.command

import com.bonam.designpatterns.behavioral.command.receiver.Light

class TurnOnLightCommand(private val light: Light) : Command {

    override fun execute() {
        light.turnOn()
    }
}
