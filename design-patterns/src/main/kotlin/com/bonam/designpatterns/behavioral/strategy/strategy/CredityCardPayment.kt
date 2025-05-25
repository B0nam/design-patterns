package com.bonam.designpatterns.behavioral.strategy.strategy

class CreditCardPayment(private val cardNumber: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paying \$$amount with credit card: $cardNumber")
    }
}
