package com.bonam.designpatterns.structural.facade.subsystem

class SoundSystem {
    fun on() = println("Sound System on")
    fun off() = println("Sound System off")
    fun setVolume(level: Int) = println("Sound System volume set to $level")
}
