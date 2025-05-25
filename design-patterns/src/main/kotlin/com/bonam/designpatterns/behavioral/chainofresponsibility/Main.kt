package com.bonam.designpatterns.behavioral.chainofresponsibility

import com.bonam.designpatterns.behavioral.chainofresponsibility.handler.ExpertSupport
import com.bonam.designpatterns.behavioral.chainofresponsibility.handler.LevelOneSupport
import com.bonam.designpatterns.behavioral.chainofresponsibility.handler.LevelTwoSupport

fun main() {
    val level1 = LevelOneSupport()
    val level2 = LevelTwoSupport()
    val expert = ExpertSupport()

    level1.setNext(level2).setNext(expert)

    val requests = listOf(
        "I forgot my password",
        "The network is down",
        "Database connection failed",
        "The monitor is flickering"
    )

    for (request in requests) {
        println("Client request: \"$request\"")
        level1.handle(request)
        println()
    }
}
