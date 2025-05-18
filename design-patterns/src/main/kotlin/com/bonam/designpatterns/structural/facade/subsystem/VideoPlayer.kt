package com.bonam.designpatterns.structural.facade.subsystem

class VideoPlayer {
    fun on() = println("Video player on")
    fun play(movie: String) = println("Playing movie: $movie")
    fun stop() = println("Movie stopped")
    fun off() = println("Video player off")
}
