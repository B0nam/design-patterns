package com.bonam.designpatterns.behavioral.state.state

import com.bonam.designpatterns.behavioral.state.context.VendingMachine

class HasCoinState(private val machine: VendingMachine) : State {
    override fun insertCoin() {
        println("Coin already inserted.")
    }

    override fun ejectCoin() {
        println("Coin returned.")
        machine.setState(machine.getNoCoinState())
    }

    override fun selectProduct() {
        println("Product selected.")
        machine.setState(machine.getSoldState())
        machine.dispenseProduct()
    }
}
