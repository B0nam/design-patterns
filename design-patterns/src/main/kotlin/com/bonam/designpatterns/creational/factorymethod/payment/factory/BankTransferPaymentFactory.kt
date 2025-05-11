package com.bonam.designpatterns.creational.factorymethod.payment.factory

import com.bonam.designpatterns.creational.factorymethod.payment.product.BankTransferPayment
import com.bonam.designpatterns.creational.factorymethod.payment.product.Payment

class BankTransferPaymentFactory : PaymentFactory {
    override fun createPayment(): Payment = BankTransferPayment()
}
