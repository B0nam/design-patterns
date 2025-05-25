package com.bonam.designpatterns.behavioral.state.context

import com.bonam.designpatterns.behavioral.state.state.HasCoinState
import com.bonam.designpatterns.behavioral.state.state.NoCoinState
import com.bonam.designpatterns.behavioral.state.state.SoldState
import com.bonam.designpatterns.behavioral.state.state.State

class VendingMachine {
    private var noCoinState: State = NoCoinState(this)
    private var hasCoinState: State = HasCoinState(this)
    private var soldState: State = SoldState(this)

    var currentState: State = noCoinState

    fun setState(state: State) {
        currentState = state
    }

    fun getNoCoinState() = noCoinState
    fun getHasCoinState() = hasCoinState
    fun getSoldState() = soldState

    fun insertCoin() = currentState.insertCoin()
    fun ejectCoin() = currentState.ejectCoin()
    fun selectProduct() = currentState.selectProduct()

    fun dispenseProduct() {
        println("Dispensing product...")
        setState(noCoinState)
    }
}
