package com.example.myapplication.Kotlin

//상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입니다.
// - 부모 클래스는 자식 클래스의 타입이 아니다.
fun main(array: Array<String>) {
    val monster = SuperMonster(100, 10)
    val night = SuperNight(130, 8)
    monster.attack(night)
    monster.bite(night)
    night.defensePower
}

open class Character(var hp: Int, var power: Int) {
    open fun attack(charactor: Character, power: Int = this.power) {
        charactor.defense(power)
    }

   open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName}의 남은 체력은 $hp")
        else println("사망했습니다.")
    }
}

class SuperMonster(hp: Int, power: Int) : Character(hp, power) {

    fun bite(charactor: Character) {
        super.attack(charactor, power + 2)
    }

}

class SuperNight(hp: Int, power: Int) : Character(hp, power) {
    val defensePower = 2
    override fun defense(damage: Int){
        super.defense(damage-defensePower)
    }
}
