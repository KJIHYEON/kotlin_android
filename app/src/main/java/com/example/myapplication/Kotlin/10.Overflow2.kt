package com.example.myapplication.Kotlin

//10.제어흐름
//when
fun main(args: Array<String>) {

    val value: Int = 1

    when (value) {
        1 -> println("1")
        2 -> println(2)
        3 -> println(3)
        else -> "I do not know value"
    }

    val value2 = when (value) {

        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }

    println(value2)

}