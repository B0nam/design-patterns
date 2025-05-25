package com.bonam.designpatterns.behavioral.strategy.strategy

class CryptoPayment(private val walletAddress: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paying \$$amount using cryptocurrency wallet: $walletAddress")
    }
}
