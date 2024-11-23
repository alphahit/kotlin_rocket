package com.example.kotlinrocket


//Use arrays in Kotlin when you have specialized low-level requirements that you need to meet.
//For example, if you have performance requirements beyond what is needed for regular
//applications, or you need to build custom data structures. If you don't have these sorts of
//restrictions, use collections instead.

fun main(){
    var names = arrayOf("Prateek", "Ujash", "Gaurav")

    for(name in names){
        println(name)
    }

    names += "Jayant"

    println(names.joinToString())

    names.forEach {
        print(it.uppercase())
    }

    //Ranges
    for(i in 0..3){
        print(i)
        print(" ")
    }
    println(" ")
    for(i in 2..8 step 2){
        print(i)
        print(" ")
    }
    println(" ")
    for(i in 3 downTo 0){
        print(i)
        print(" ")
    }

    println(" ")
    for(i in 10 downTo 0 step 2){
        print(i)
        print(" ")
    }


    val x = 2
    if(x in 1..5){
        print("x is in range from 1 to 5")
    }
    println(" ")

    if(x !in 6..10){
        print("x is in range from 1 to 5")
    }

    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())

    val initArray = Array<Int>(3) { 0 }
    println(initArray.joinToString())


    val asc = Array(5) { i-> (i * i).toString()}
    asc.forEach { print("$it  ") }

    val threeDArray = Array(3) {Array(3) {Array<Int>(3) {0} }}
    println(threeDArray.contentDeepToString())


    var simpleArray = arrayOf(1,2,3)
    var twoDArray = Array(2){Array<Int>(2) {0} }

    simpleArray[0] = 10
    twoDArray[0][0] = 2

    println(simpleArray[0].toString())
    println(twoDArray[0][0].toString())
    println(twoDArray.contentDeepToString())


}