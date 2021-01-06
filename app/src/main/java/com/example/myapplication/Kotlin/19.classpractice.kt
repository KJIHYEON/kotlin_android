package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    println()
    val calculator3 : Calculator3 = Calculator3(6)
    println(calculator3.plus(3).multiply(2))
    println(calculator3.minus(3))
    println(calculator3.multiply(3))
    println(calculator3.divide(3))


}

class Calculator3(val initialValue:Int){
    fun plus(number:Int):Calculator3{
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number:Int):Calculator3{
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number:Int):Calculator3{
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number:Int):Calculator3{
        val result = this.initialValue / number
        return Calculator3(result)
    }

}


