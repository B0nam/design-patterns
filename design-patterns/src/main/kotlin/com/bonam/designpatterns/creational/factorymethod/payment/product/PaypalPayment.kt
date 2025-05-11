package com.bonam.designpatterns.creational.factorymethod.payment.product

class PaypalPayment : Payment {
    override fun processPayment(amount: Double) = println("Processing PayPal payment of $$amount")
}
