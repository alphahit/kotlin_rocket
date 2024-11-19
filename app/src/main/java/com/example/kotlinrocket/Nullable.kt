package com.example.kotlinrocket
//A Null Pointer Exception occurs in many programming languages (like Java) when a program tries to:

//Access a property or call a method on a null object.
//Use null in operations that require a non-null value.
//Access or modify an element of a null collection or array.

fun main(){
//    var myName : String = null
    var myName : String? = null
// You explicitly declare a type as nullable using ?
    if(myName == null){
        print("Test $myName")
    }else{
        print("null")
    }
}