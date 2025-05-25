package com.bonam.designpatterns.behavioral.state

import com.bonam.designpatterns.behavioral.state.context.VendingMachine

fun main() {
    val machine = VendingMachine()

    machine.selectProduct()
    machine.insertCoin()
    machine.insertCoin()
    machine.selectProduct()
    machine.ejectCoin()
}
