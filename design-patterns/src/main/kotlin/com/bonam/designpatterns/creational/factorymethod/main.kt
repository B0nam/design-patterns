package com.bonam.designpatterns.creational.factorymethod

import com.bonam.designpatterns.creational.factorymethod.payment.factory.BankTransferPaymentFactory
import com.bonam.designpatterns.creational.factorymethod.payment.factory.CreditCardPaymentFactory
import com.bonam.designpatterns.creational.factorymethod.payment.factory.PaypalPaymentFactory

fun main() {
    val amount = 150.0

    val creditCardFactory = CreditCardPaymentFactory()
    val creditCardPayment = creditCardFactory.createPayment()
    creditCardPayment.processPayment(amount)

    val paypalFactory = PaypalPaymentFactory()
    val paypalPayment = paypalFactory.createPayment()
    paypalPayment.processPayment(amount)

    val bankTransferFactory = BankTransferPaymentFactory()
    val bankTransferPayment = bankTransferFactory.createPayment()
    bankTransferPayment.processPayment(amount)
}
