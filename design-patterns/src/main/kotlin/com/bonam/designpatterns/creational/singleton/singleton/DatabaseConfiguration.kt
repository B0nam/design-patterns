package com.bonam.designpatterns.creational.singleton.singleton

class DatabaseConfiguration private constructor() {

    init {
        println("Loading database configuration...")
    }

    fun getConnectionString(): String {
        return "jdbc:mysql://localhost:3306/mydb"
    }

    companion object {
        private var instance: DatabaseConfiguration? = null

        fun getInstance(): DatabaseConfiguration {
            if (instance == null) {
                instance = DatabaseConfiguration()
            }
            return instance!!
        }
    }
}
