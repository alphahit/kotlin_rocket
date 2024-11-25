package com.example.kotlinrocket

fun main() {
    //Kotlin provides several scope functions to work with objects more concisely and elegantly.
    // These functions create a scope where the object is accessible as this and provide a convenient way to perform operations on it.
    // Scope functions are in Kotlin Standard Library in order to perform chain calls.

    //let
    //Purpose: Executes a block of code with the receiver as this and returns the result of the block.
    //We usually use let for null checks in kotlin
    //Syntax: object.let { ... }

    val nullString: String? = null
    nullString?.let {
        println(it)
        println(it.length)
    }

    val nullableString: String? = "Hello"
    nullableString?.let {
        println(it)
        println(it.length)
    }

    val list = listOf(3,2,1)
    val result = list.let {

        it.firstOrNull()
    }
    println(result)
    println(demoLet())
    println(demoLet2())

    //run
    // Purpose: Executes a block of code with the receiver as this and returns the result of the block or the receiver itself.
    // Syntax: object.run { ... }
    // run is a higher-order function that provides a concise way to execute a block of code within a specific context, often referred to as a scope.
    val resultRun = "Hello, World!".run {
        uppercase()
        trim()
    }
    println(resultRun)
}

fun obtainExternalList() = listOf(1,2,3,4,5)

fun demoLet(): List<Int>{ //let is a scope function
    return obtainExternalList().let {  numbers->
        numbers.map{it -> it*2}
    }
}

fun demoLet2(): Int{
    val result = obtainExternalList().filter {
        n -> n % 2 == 0
    }.map{
        n -> n*10
    }.let { list -> list.sum() / ( list.size + 1) }
    return result
}