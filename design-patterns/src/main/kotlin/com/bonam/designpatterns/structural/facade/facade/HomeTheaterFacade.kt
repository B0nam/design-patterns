package com.bonam.designpatterns.structural.facade.facade

import com.bonam.designpatterns.structural.facade.subsystem.Lights
import com.bonam.designpatterns.structural.facade.subsystem.Projector
import com.bonam.designpatterns.structural.facade.subsystem.SoundSystem
import com.bonam.designpatterns.structural.facade.subsystem.VideoPlayer

class HomeTheaterFacade(
    private val projector: Projector,
    private val soundSystem: SoundSystem,
    private val lights: Lights,
    private val videoPlayer: VideoPlayer
) {
    fun watch(movie: String) {
        projector.on()
        lights.dim()
        soundSystem.on()
        videoPlayer.on()
        videoPlayer.play(movie)
        soundSystem.setVolume(5)
    }

    fun endMovie() {
        videoPlayer.stop()
        videoPlayer.off()
        soundSystem.off()
        lights.on()
        projector.off()
    }
}
