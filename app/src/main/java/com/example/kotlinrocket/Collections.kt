package com.example.kotlinrocket
//A collection usually contains a number of objects of the same type (and its subtypes).
//Objects in a collection are called elements or items.

//The following collection types are relevant for Kotlin:

//List is an ordered collection with access to elements by indices – integer numbers that reflect their position.
//Elements can occur more than once in a list.

//Set is a collection of unique elements.
// It reflects the mathematical abstraction of set: a group of objects without repetitions.
// Generally, the order of set elements has no significance.

//Map (or dictionary) is a set of key-value pairs.
// Keys are unique, and each of them maps to exactly one value.
// The values can be duplicates.

// A mutable collection doesn't have to be assigned to a var.
// Write operations with a mutable collection are still possible even if it is assigned to a val.
//The benefit of assigning mutable collections to val is that you protect the reference to the mutable collection from modification.
fun main(){

    val stringList = listOf("one", "two", "one")
    println(stringList[0])
    printAll(stringList)
    val stringListTwo = listOf("one", "two", "one", 3)
    for(n in stringListTwo){
        print("$n  ")
    }
    println(' ')

    val stringListMut = mutableListOf("one", "two", "one")
    stringListMut[2] = "three"
    for(n in stringListMut){
       print("$n  ")
   }
    println(' ')
    val stringListMutTwo = mutableListOf<String>("one", "two", "one")
    for(n in stringListMutTwo){
        print("$n  ")
    }
    println(' ')
    val stringSet = setOf("one", "two", "one")
    printAll(stringSet)

}


//Collection<T> is the root of the collection hierarchy.
// This interface represents the common behavior of a read-only collection: retrieving size, checking item membership, and so on.
// Collection inherits from the Iterable<T> interface that defines the operations for iterating elements.

fun printAll(strings: Collection<String>){
    for(s in strings) print("$s ")
    println()
}