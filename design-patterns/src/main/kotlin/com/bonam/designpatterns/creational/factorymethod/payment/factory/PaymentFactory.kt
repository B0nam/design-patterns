package com.bonam.designpatterns.creational.factorymethod.payment.factory

import com.bonam.designpatterns.creational.factorymethod.payment.product.Payment

interface PaymentFactory {
    fun createPayment(): Payment
}
