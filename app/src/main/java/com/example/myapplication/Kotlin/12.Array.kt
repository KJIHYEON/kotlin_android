package com.example.myapplication.Kotlin

//12. 배열
//-그룹이 필요할 때 사용

fun main(array: Array<String>) {

//배열 생성하는 방법(1)

    var number: Int = 10
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

    //베열 생성하는 방법(2)
    var number1 = 10
    var group2 = arrayOf(1, 2, 3.5, "Hello")

    //배열의 값을 꺼내는 방법(1)
    //인덱스는 0부터 시작한다. 순서라고 이해하자
    val test1 = group1.get(0)
    val test2 = group1.get(4)
    println(test1)
    println(test2)

    val test3 = group1[0]
    println(test3)

    //배열의 값을 바꾸는 방법(1)
    group1.set(0, 100)
    println(group1[0])
   //배열의 값을 바꾸는 방법(2)

    group1[0] = 200
    println(group1[0])


}