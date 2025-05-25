package com.bonam.designpatterns.behavioral.chainofresponsibility.handler

class ExpertSupport : SupportHandler() {
    override fun process(request: String): Boolean {
        return if (request.contains("database", ignoreCase = true)) {
            println("Expert support handled the request: \"$request\"")
            true
        } else {
            false
        }
    }
}
