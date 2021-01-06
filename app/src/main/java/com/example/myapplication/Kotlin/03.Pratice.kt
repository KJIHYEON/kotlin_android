package com.example.myapplication.Kotlin

var a = 1+2+3+4+5
var b = "1"//String
var c = b.toInt()//Int
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice meet you"

var abc1 : Int? = null //null을 가질 수 있는 타입이 된다
var abc2: Double? = null

var g = a+3

fun main(array:Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc2)
    println(g)
}