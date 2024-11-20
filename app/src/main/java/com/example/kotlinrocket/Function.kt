package com.example.kotlinrocket

//In Kotlin, if a function doesn't explicitly return a value, it implicitly returns Unit.
//Unit is a type that represents "no meaningful value" (similar to void in Java).
//When used in string interpolation, Unit gets converted to its string representation, which is kotlin.Unit.

//fun test() {}
//println("${test()}") // Output: kotlin.Unit



fun main(){
    println("Hello World")
   var length = lengthOfString("Pinky")
    println("Length of the String is: $length")
    println("Test Square: ${square(5)}")
    println("Test Sum: $sum")
}

fun lengthOfString(input: String?):Int{
    return input?.length ?: 0
}
//1. First-Class Functions:
//Functions are treated as first-class citizens, meaning you can store them in variables,
// pass them as arguments, and return them from other functions.
val square: (Int) -> Int = { x -> x * x }


//2. Higher-Order Functions:
//  Functions can take other functions as parameters or return them.
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int) : Int {
    return operation(a,b)
}

var sum = operate(3,5 ) {x,y -> x + y}



//3. Immutability:
//Kotlin encourages the use of immutable data structures (val) and immutability,
//which are common in functional programming.
//val numbers = listOf()
//https://chatgpt.com/c/673b64b2-b920-8010-b370-099b8654cd00