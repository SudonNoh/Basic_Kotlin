// 오버로딩
class Sum {
    fun sum(): Int {
        return 10
    }

    fun sum(number1: Int): Int {
        return number1 + 10
    }

    fun sum(number1: Int, number2: Int): Int {
        return number1 + number2 + 10
    }
}

val sum = Sum()
println(sum.sum())
println(sum.sum(1))
println(sum.sum(1, 2))


// 오버라이딩
open class Warrior1(var name: String, var power: Int, var type: String) {
    open fun attack() {
        println("복잡한 코드 + 공격")
    }

    open fun getDefensePower(): Int {
        return 10
    }
}

open class DefenseWarrior1(name: String, power: Int) : Warrior1(name, power, "고블린") {
    override fun attack() {
        println("간단한 코드 + 공격")
        super.attack()
    }

    fun defense() {
        println("방어")
    }

    override fun getDefensePower(): Int {
        return super.getDefensePower() + 5
    }
}

val defenseWarrior = DefenseWarrior1("홍길동", 100)
defenseWarrior.attack()
print(defenseWarrior.getDefensePower())
