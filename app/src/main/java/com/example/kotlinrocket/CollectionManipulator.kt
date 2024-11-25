package com.example.kotlinrocket

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)
    //Count
    val count = numbers.count()
    println(count)

    //Filter
    val evenNumbers = numbers.filter { it -> it % 2 == 0 }
    println(evenNumbers)

    //Map
    val evenNumbersSquare = numbers.filter { it % 2 == 0 }.map { it * it }
    println(evenNumbersSquare)

    //reduce
    val evenNumbersSquareSum = numbers.filter { it % 2 == 0 }.map { it * it }.reduce { acc, it ->
        acc + it
    }
    println(evenNumbersSquareSum)
}