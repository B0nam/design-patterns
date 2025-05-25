package com.bonam.designpatterns.behavioral.command

import com.bonam.designpatterns.behavioral.command.command.LockDoorCommand
import com.bonam.designpatterns.behavioral.command.command.TurnOffLightCommand
import com.bonam.designpatterns.behavioral.command.command.TurnOnLightCommand
import com.bonam.designpatterns.behavioral.command.command.UnlockDoorCommand
import com.bonam.designpatterns.behavioral.command.invoker.RemoteControl
import com.bonam.designpatterns.behavioral.command.receiver.Door
import com.bonam.designpatterns.behavioral.command.receiver.Light

fun main() {
    val light = Light()
    val door = Door()

    val lightOnCommand = TurnOnLightCommand(light)
    val lightOffCommand = TurnOffLightCommand(light)
    val lockDoorCommand = LockDoorCommand(door)
    val unlockDoorCommand = UnlockDoorCommand(door)

    val remote = RemoteControl()
    remote.setCommand("Light On", lightOnCommand)
    remote.setCommand("Light Off", lightOffCommand)
    remote.setCommand("Lock Door", lockDoorCommand)
    remote.setCommand("Unlock Door", unlockDoorCommand)

    remote.pressButton("Light On")
    remote.pressButton("Light Off")
    remote.pressButton("Lock Door")
    remote.pressButton("Unlock Door")
    remote.pressButton("Open Window")
}
