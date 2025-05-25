package com.bonam.designpatterns.behavioral.command.command

import com.bonam.designpatterns.behavioral.command.receiver.Light

class TurnOffLightCommand(private val light: Light) : Command {

    override fun execute() {
        light.turnOff()
    }
}
