package com.bonam.designpatterns.creational.singleton

import com.bonam.designpatterns.creational.singleton.singleton.DatabaseConfiguration

fun main() {
    val conn1 = DatabaseConfiguration.getInstance().getConnectionString()
    println("Connection String 1: $conn1")

    val conn2 = DatabaseConfiguration.getInstance().getConnectionString()
    println("Connection String 2: $conn2")
}