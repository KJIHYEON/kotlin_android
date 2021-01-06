package com.example.myapplication.Kotlin

// 18. class
// OOP -> Object Oriented Programing(객체 지향 프로그래밍)
// 객체란 뭘까?
// - 이름이 있는 모든 것
// 절차 지향 프로그래밍
// - 코드를 위에서 부터 아래로 실행을 하면 문제가 해결 된다!

// 객체 지향 프로그래밍 문제 해결 방식
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
// - 선수, 심판, 경기장 , 관중 -> 축구 게임

// 객체를 만드는 방법
// - 설명서가 있어야 합니다.
fun main(array: Array<String>) {
    //클래스(설명서)를 통해서 실체를 만드는 방법
    //-> 인스턴스화 -> 인스턴스

    Car("v8 engine", "big")
    val bigCar = Car("v8 engine", "big")
    //우리가 만든 클래스는 자료형이 된다.
    val bidCar: Car = Car("v8 engine", "big")

    val SuperCar: SuperCar = SuperCar("good engine", "big", "white")

    val runableCar: RunableCar = RunableCar("simple engine", "short")
    //RunableCar.ride() -> 불가능 RunableCar은 설명서일 뿐이다.
    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()

    //인스턴스의 멤버 변수에 접근 하는 방법
    val runableCar2: RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)

    println()
    val testClass = TestClass()
    testClass.test(1,1)

}

// 클래스(설명서) 만드는 방법(1) -> 축약 버전 느낌
class Car(var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법(2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine //this는 supercar 설명서를 의미한다
        this.body = body
        this.door = door
    }
}

// 클래스(설명서)만드는 방법(3) -> 1의 확장
class Car1(engine: String, body: String) {
    var door: String = ""

    //생성자
    //반드시 필요한 것 뿐 아니라 추가적으로 있으면 좋은 것
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(4) -> 2의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승 하였습니다")
    }

    fun drive() {
        println("달립니다 !")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init {
        //ex. 초기셋팅을 할 때 유용하다
        println("RunableCar2가 만들어 졌습니다.") // 가장 먼저 호출 된다
    }

    fun ride() {
        println("탑승 하였습니다")
    }

    fun drive() {
        println("달립니다 !")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

//오버로딩
// -> 이름이 같지만 받는 파라미터가 다른 함수

class TestClass() {

    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
    println("down")
    }

}





