package com.harry9656

class Person(
    val name: String,
    var isStudent: Boolean = false
)

fun main(){
    val person1 = Person("Harry")
    println("Person has a name: ${person1.name} and ${if (person1.isStudent) "is" else "isn't"} a student")
    val person2 = Person("John", true)
    println("Person has a name: ${person2.name} and ${if (person2.isStudent) "is" else "isn't"} a student")
}