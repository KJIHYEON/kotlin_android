package com.example.myapplication.Kotlin


//01.변수

// 변수 선언하는 방법
// var/val 변수명(상자) = 값(넣고 싶은 것)
// Variable/Value
//var  내 마음대로 원하는 것 넣을 수 있는 상자
//val  한번 넣으면 바꿀 수 없는 상자

var num = 10
var point = 3.4

val fix = 20

fun main(args:Array<String>){

    println(num)
    println(point)
    println(fix)

    num = 100
    point = 10.4

    println(num)
    println(point)
    println(fix)

}