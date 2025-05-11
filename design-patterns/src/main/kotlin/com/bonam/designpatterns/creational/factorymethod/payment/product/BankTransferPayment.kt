package com.bonam.designpatterns.creational.factorymethod.payment.product

class BankTransferPayment : Payment {
    override fun processPayment(amount: Double) = println("Processing bank transfer payment of $$amount")
}
