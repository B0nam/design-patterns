package com.bonam.designpatterns.structural.proxy.service

class RealVideo : VideoService {
    override fun playVideo(title: String) {
        println("Playing video: $title")
    }
}
