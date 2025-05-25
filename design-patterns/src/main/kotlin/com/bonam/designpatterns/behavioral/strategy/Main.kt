package com.bonam.designpatterns.behavioral.strategy

import com.bonam.designpatterns.behavioral.strategy.context.PaymentProcessor
import com.bonam.designpatterns.behavioral.strategy.strategy.CreditCardPayment
import com.bonam.designpatterns.behavioral.strategy.strategy.CryptoPayment
import com.bonam.designpatterns.behavioral.strategy.strategy.PaypalPayment

fun main() {
    val processor = PaymentProcessor(CreditCardPayment("1234-5678-9876-5432"))
    processor.pay(100.0)

    processor.setStrategy(PaypalPayment("user@example.com"))
    processor.pay(200.0)

    processor.setStrategy(CryptoPayment("wallet-abc-123"))
    processor.pay(300.0)
}
