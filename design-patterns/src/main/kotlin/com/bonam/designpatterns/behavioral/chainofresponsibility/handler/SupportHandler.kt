package com.bonam.designpatterns.behavioral.chainofresponsibility.handler

abstract class SupportHandler {
    private var nextHandler: SupportHandler? = null

    fun setNext(handler: SupportHandler): SupportHandler {
        nextHandler = handler
        return handler
    }

    fun handle(request: String) {
        if (!process(request)) {
            nextHandler?.handle(request)
                ?: println("Request \"$request\" could not be handled.")
        }
    }

    protected abstract fun process(request: String): Boolean
}
