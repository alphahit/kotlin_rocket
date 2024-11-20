package com.example.kotlinrocket

val age = 23

//In Kotlin, if-else is an expression, meaning it can return a value.
//The value returned is the
//result of the last statement in the corresponding branch of the if or else block.

val number = 5

val result: String = if (number % 2 == 0){
    "Even"
} else {
    "Odd"
}


fun main() {
    if(age == 24){
        println("You Can't vote")
    }else{
        println("play at home")
    }

    println("The number is $result")

    println("Number Type is ${checkNumber(5)}")

    println("Number Type with 0 ${checkNumberWith0(0)}")

    val name = "Prateek"

    println("Name Checker ${whenChecker(name)}")
}

fun checkNumber(number: Int): String{
   return if(number >0){
        "Positive"
    }else{
        "Negative or Zero"
    }
}

fun checkNumberWith0(number: Int): String{
    return if(number > 0){
        "Posiive"
    }else if(number < 0){
        "Negative"
    }else{
        "Zero"
    }
}

//Type Compatibility

//val result = if (true) {
//    42  // Int
//} else {
//    "Hello"  // String
//}
// Error: Type mismatch. The `if` and `else` branches must have compatible types.


fun whenChecker(name: String): String {
   return when(name){
        "Prateek" -> {
            print("Test P")
            "P"
        }
        "Ujash" -> {
            print("Test U")
            "U"
        }
       "Adesh" -> {
           print("Test A")
           "A"
       }
       else -> {
           print("Native")
           "N"
       }
    }
}