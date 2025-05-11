package com.bonam.designpatterns.creational.factorymethod.payment.factory

import com.bonam.designpatterns.creational.factorymethod.payment.product.CreditCardPayment
import com.bonam.designpatterns.creational.factorymethod.payment.product.Payment

class CreditCardPaymentFactory : PaymentFactory {
    override fun createPayment(): Payment = CreditCardPayment()
}
