package com.example.kotlinrocket

fun main(){
    val names = arrayOf("Prateek", "Ujash", "Gaurav")

    for(name in names){
        println(name)
    }

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
}