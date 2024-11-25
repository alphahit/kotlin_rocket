package com.example.kotlinrocket

fun main() {
    val p1 = Person("Prateek")
    println(p1)

    val p2 = PersonTwo("Prateek Priyadarshi")
    println(p2)

    val p3 = PersonThree("Lipu")
    println(p3.getName())
    println(p3.setName("Sage Hit"))
    println(p3.getName())

}

class Person(_name: String) {
    val name: String

    init {
        name = _name
    }

    //The override function in Kotlin is used to provide a custom implementation
    // of a function defined in a superclass or an interface.
    //By default, toString() returns the object's class name and hash code (e.g., Person@6d06d69c).
    override fun toString(): String {
        return "Person(name='$name)"
    }
}

class PersonTwo(val name: String) {
    override fun toString(): String {
        return "PersonTwo(name='$name)"
    }
}

//1. Encapsulation
//Encapsulation is the practice of bundling the data (properties) and methods that
//operate on that data into a single unit (a class). It often involves controlling access to
//the properties and methods of a class to enforce certain constraints (e.g., making fields private).
class PersonThree(private var name: String) {
    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName

        if (newName.isNotBlank()) {

            name = newName
        } else {
            println("Name Cannot Be Empty")
        }
    }
}