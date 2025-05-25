package com.bonam.designpatterns.behavioral.command.command

import com.bonam.designpatterns.behavioral.command.receiver.Door

class UnlockDoorCommand(private val door: Door) : Command {

    override fun execute() {
        door.unlock()
    }
}
