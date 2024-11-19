package com.example.kotlinrocket

//Variables can be declared outside the main() function at the beginning of your program.
//Variables declared in this way are said to be declared at top level.

//Read-only variables with val
val popcorn = 5    // There are 5 boxes of popcorn
val hotdog = 7     // There are 7 hotdogs

//Mutable variables with var
var customers = 10 // There are 10 customers in the queue
var icecream = 8

val greeting = "Kotlin"


var x: Int = 5
val y: Int = 5
var xy: String = "Test"


//AVOID VARS

fun main(){
    println("Hello World")

    // Some customers leave the queue
    customers = 8
    println(customers)
    println("There are $customers customers")
    println("There are ${customers + 1} customers")
    println("Hello Greeting ${greeting.uppercase()}")
    val name = "Mary"
    val age = 20
    println("$name is $age years old")

    icecream = 10
    icecream = icecream + 3

    icecream += 9
    println("There are $icecream icecreams")

    icecream -= 5
    println("There are $icecream icecreams")

    icecream *= 2
    println("There are $icecream icecreams")

    icecream /= 3
    println("There are $icecream icecreams")


}
