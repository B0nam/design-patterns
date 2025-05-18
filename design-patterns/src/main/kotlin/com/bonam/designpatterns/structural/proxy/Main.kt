package com.bonam.designpatterns.structural.proxy

import com.bonam.designpatterns.structural.proxy.service.VideoProxy

fun main() {
    println("Try to access a restricted video:")
    val usuarioComum = VideoProxy("user", "password")
    usuarioComum.playVideo("Matrix")

    println("\nTry to access a restricted video with admin:")
    val admin = VideoProxy("admin", "1234")
    admin.playVideo("Matrix")
}
