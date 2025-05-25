package com.bonam.designpatterns.behavioral.strategy.context

import com.bonam.designpatterns.behavioral.strategy.strategy.PaymentStrategy

class PaymentProcessor(private var strategy: PaymentStrategy) {
    fun setStrategy(strategy: PaymentStrategy) {
        this.strategy = strategy
    }

    fun pay(amount: Double) {
        strategy.pay(amount)
    }
}
