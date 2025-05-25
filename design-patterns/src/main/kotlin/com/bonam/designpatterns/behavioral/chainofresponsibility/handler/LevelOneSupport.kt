package com.bonam.designpatterns.behavioral.chainofresponsibility.handler

class LevelOneSupport : SupportHandler() {
    override fun process(request: String): Boolean {
        return if (request.contains("password", ignoreCase = true)) {
            println("Level 1 support handled the request: \"$request\"")
            true
        } else {
            false
        }
    }
}
