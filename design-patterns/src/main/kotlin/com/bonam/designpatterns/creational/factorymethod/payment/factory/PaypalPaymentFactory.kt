package com.bonam.designpatterns.creational.factorymethod.payment.factory

import com.bonam.designpatterns.creational.factorymethod.payment.product.Payment
import com.bonam.designpatterns.creational.factorymethod.payment.product.PaypalPayment

class PaypalPaymentFactory : PaymentFactory {
    override fun createPayment(): Payment = PaypalPayment()
}
