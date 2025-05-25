package com.bonam.designpatterns.behavioral.state.state

import com.bonam.designpatterns.behavioral.state.context.VendingMachine

class NoCoinState(private val machine: VendingMachine) : State {
    override fun insertCoin() {
        println("Coin inserted.")
        machine.setState(machine.getHasCoinState())
    }

    override fun ejectCoin() {
        println("No coin to eject.")
    }

    override fun selectProduct() {
        println("Insert coin first.")
    }
}
