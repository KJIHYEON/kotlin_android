package com.example.myapplication.Kotlin

fun main(array: Array<String>) {

    val array = arrayOf<Int>(1, 2, 3)

    val number = array.get(0)
    println(number)
    val number1 = array.get(100) //인덱스 주의

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    array.set(100, 100)
    //array의 바운드는 처음 만들 때 결정된다.


    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 'b')
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true)


    var a5 = Array(10, { 0 } )//람다를 활용한 방법
    var a6 = Array(5,{1;2;3;4;5})


}