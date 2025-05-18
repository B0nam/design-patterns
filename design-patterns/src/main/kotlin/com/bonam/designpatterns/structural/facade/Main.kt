package com.bonam.designpatterns.structural.facade

import com.bonam.designpatterns.structural.facade.facade.HomeTheaterFacade
import com.bonam.designpatterns.structural.facade.subsystem.Lights
import com.bonam.designpatterns.structural.facade.subsystem.Projector
import com.bonam.designpatterns.structural.facade.subsystem.SoundSystem
import com.bonam.designpatterns.structural.facade.subsystem.VideoPlayer

fun main() {
    val projector = Projector()
    val soundSystem = SoundSystem()
    val lights = Lights()
    val player = VideoPlayer()

    val homeTheater = HomeTheaterFacade(projector, soundSystem, lights, player)

    homeTheater.watch("Vivarium")
    homeTheater.endMovie()
}
