package com.bonam.designpatterns.behavioral.state.state

import com.bonam.designpatterns.behavioral.state.context.VendingMachine

class SoldState(private val machine: VendingMachine) : State {
    override fun insertCoin() {
        println("Please wait, dispensing product.")
    }

    override fun ejectCoin() {
        println("Too late, product already being dispensed.")
    }

    override fun selectProduct() {
        println("Already processing a purchase.")
    }
}
