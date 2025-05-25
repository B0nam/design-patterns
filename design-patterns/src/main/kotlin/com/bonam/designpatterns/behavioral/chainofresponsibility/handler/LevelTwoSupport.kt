package com.bonam.designpatterns.behavioral.chainofresponsibility.handler

class LevelTwoSupport : SupportHandler() {
    override fun process(request: String): Boolean {
        return if (request.contains("network", ignoreCase = true)) {
            println("Level 2 support handled the request: \"$request\"")
            true
        } else {
            false
        }
    }
}
