package com.example.myapplication.Kotlin

//변수의 접근 범위
//1. 전역 변수
//2. 지역 변수

fun main(array: Array<String>) {
    val testAccess: TestAccess = TestAccess("아무개")
    testAccess.test()
    println(testAccess.name)

    val reward:Reward=Reward()

}

class Reward() {
   private var rewardAmount: Int = 1000
}

class TestAccess {
    var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun test() {
        println("테스트")
    }
}