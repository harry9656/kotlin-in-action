package com.harry9656

fun main(){
    val userInput = readln()
    val user = if (userInput.isNotBlank()) userInput else "Stranger"
    println("Hello $user, Welcome to the world of Kotlin")
}