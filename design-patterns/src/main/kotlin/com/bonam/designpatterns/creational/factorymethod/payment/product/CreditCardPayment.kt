package com.bonam.designpatterns.creational.factorymethod.payment.product

class CreditCardPayment : Payment {
    override fun processPayment(amount: Double) = println("Processing credit card payment of $$amount")
}
