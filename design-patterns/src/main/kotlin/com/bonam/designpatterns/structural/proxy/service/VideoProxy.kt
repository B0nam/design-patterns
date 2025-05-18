package com.bonam.designpatterns.structural.proxy.service

class VideoProxy(private val username: String?, private val password: String?) : VideoService {

    private val realVideo = RealVideo()

    private fun isAuthenticated(): Boolean {
        return username == "admin" && password == "1234"
    }

    override fun playVideo(title: String) {
        if (isAuthenticated()) {
            println("Access granted for $username")
            realVideo.playVideo(title)
        } else {
            println("Access denied")
        }
    }
}
