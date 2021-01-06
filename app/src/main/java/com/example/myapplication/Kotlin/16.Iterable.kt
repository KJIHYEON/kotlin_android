package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복하는 방법(1)
    for (item in a) {
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }
    println()

    //방법(2)
    for ((index, item) in a.withIndex()) {
        println("index: " + index + " value: " + item)
        //문자열 + Int(정수) = 문자열
    }
    println()

    a.forEach {
        println(it)
    }
    // 반복하는 방법(4)
    println()
    a.forEach { item ->
        println(item)
    }
    // 반복하는 방법(5)
    a.forEachIndexed { index, item ->
        println("index : " + index + " value: " + item)
    }

    println(a.size)

    for (i in 0 until 9) {
        //until은 마지막을 포함하지 않는다.
        //0부터 8까지
        println(a.get(i))
    }
    println()
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    println()
    for (i in a.size - 1 downTo (0)) {
        //8부터 0까지 반복
        println(a.get(i))

    }
    println()
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }
    println()
    for (i in 0..10) {
        // .. 은 마지막 숫자도 포함
        println(i)
    }

    var c: Int = 0
    var b: Int = 4

    while (c < b) {
        c++
        println("b")
    }
    println()

    var d:Int = 0
    var e:Int =4
    do {
        println("hello")
    } while (d >e)


}