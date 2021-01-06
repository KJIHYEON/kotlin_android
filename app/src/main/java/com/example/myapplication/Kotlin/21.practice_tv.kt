package com.example.myapplication.Kotlin


//3. TV
//on, off, 채널 돌리는 기능, 초기 채널은(S사 M사 K사 3개)

fun main(args: Array<String>) {
    val tv = TV(listOf<String>("K", "M", "S"))
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.currentChnnelNumber


}

class TV(val channels: List<String>) {

    var onOroff: Boolean = false
    var currentChnnelNumber = 0
        set(value) {
            field = value
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }
    get(){ //변수가 불려나갈 때
        println("호출되었습니다.")
        return field
    }
    //값의 할당
    //a = b
    //set은 값을 할당할때 호출됨. 무한루프에 빠짐

    fun switch() {
        onOroff = !onOroff
    }

    fun checkCurrentChannel(): String {
        return channels[currentChnnelNumber]
    }

    fun channelUp() {

        currentChnnelNumber += 1

    }

    fun channelDown() {

        currentChnnelNumber -= 1
    }
}

