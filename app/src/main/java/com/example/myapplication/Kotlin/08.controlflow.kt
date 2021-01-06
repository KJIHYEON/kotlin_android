package com.example.myapplication.Kotlin

//08. 제어흐름
//-if,else

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10
    println("1")
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }
    println("3")
    println()
    if (a > b) {
        println("a가 b보다 크다")
    }

    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else {
        println("a가 b와 같다")
    }

    //값을 리턴하는 if
    val max = if (a > b) {
        a
    } else {
        b
    }
    println()
    println(max)


}