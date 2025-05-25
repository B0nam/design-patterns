package com.bonam.designpatterns.behavioral.strategy.strategy

class PaypalPayment(private val email: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paying \$$amount using PayPal account: $email")
    }
}
