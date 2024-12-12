package com.example.kotlinrocket

fun main(args: Array<String>){
    var hashMap : HashMap<String, Int> = HashMap<String, Int> ()

    printHashMap(hashMap)

    //adding elements to the hashMap using
    // put() function
    hashMap.put("OneOne", 11)
    hashMap.put("OneThree", 13)
    hashMap.put("TwoThree", 23)
    hashMap.put("TwoSeven", 27)

    printHashMap(hashMap)


    for(key in hashMap.keys){
        println("Element In Key $key : ${hashMap[key]}")
    }

    //the hashMap's elements can be accessed like this
    println("\nhashMap[\"OneOne\"] : "
            + hashMap["OneOne"])
    hashMap["TwoThree"] = 1123
    println("hashMap.get(\"TwoThree\") : "
            + hashMap.get("TwoThree") + "\n")


    //replacing some values
    hashMap.replace("OneThree" , 131399);
    hashMap.put("TwoSeven" , 2272700);

    printHashMap(hashMap)

    // check if a key is present in the HashMa
    println(hashMap.containsKey("OneThree"))
    println(hashMap.containsKey("OneFour"))

    // check if a value is present in the HashMap
    println(hashMap.containsValue(12))
    println(hashMap.containsValue(1123))

    //this will clear the whole map and make it empty
    println("hashMap.clear()")
    hashMap.clear()
    println("After Clearing : " + hashMap)
}


fun printHashMap(hashMap: HashMap<String, Int>){
    if(hashMap.isEmpty()){
        println("HashMap is Empty")
    }else{
        println("hashMap : " + hashMap)
    }
}
//Advantages of HashMap:
//Provides efficient O(1) time complexity for
// basic operations such as adding, removing, and retrieving elements.
//Can be used to store a wide variety of data
// types, including user-defined objects.


//Disadvantages of HashMap:
//Uses more memory than some other data structures because
//  it stores both keys and values.
// It is not thread-safe by default, so concurrent access
// to a HashMap can cause data corruption or unexpected behavior.
// If you need to access a HashMap from multiple threads,
// you should use a thread-safe implementation
//  or use synchronization to ensure thread safety.