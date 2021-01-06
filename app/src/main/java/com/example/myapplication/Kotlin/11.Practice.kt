package com.example.myapplication.Kotlin

fun main(args: Array<String>) {

    val value: Int? = null
    when (value) {
        null -> println("null")
        else -> println("not null")
    }
    val value2: Boolean? = null
    when (value2) {
        true -> println("not null")
        false -> println("not null")
        null -> println("null")
    }

    //값을 리턴하는 when 구문인 경우 반드시 값을 리턴해야 한다.

    val value3 = when (value2) {
        true -> 1
        false -> 3
        null -> 4
    }
    val value4: Int = 10
    when (value4) {
        is Int -> {
            println("value4 is int")
        }
        else -> {
            println("value4 is not int")
        }
    }

    val value5: Int = 70
    when (value5) {
        in 60..70 -> {
            println("value is in 60-70")
        }
        in 70..80 -> {
            println("value is in 70-80")
        }
        in 80..90 -> {
            println("value is in 80-90")
        }
    }
}