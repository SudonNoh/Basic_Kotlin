// 기본 자료형의 타입 캐스팅
val number: Int = 10
val numberToString: String = number.toString()
val stringToNumber: Int = numberToString.toInt()

println(stringToNumber)

val numberF: Double = 10.5
val numberFString: String = numberF.toString()
val numberFInt: Int = numberF.toInt()

println(numberFString)
println(numberFInt)

val charWord: Char = 'A'
val charToString: String = charWord.toString()

println(charToString)


// 상속한 클래스 간의 캐스팅
open class Warrior(var name: String, var power: Int, var type: String) {
    open fun attack() {
        println("복잡한 코드 + 공격")
    }
}

class DefenseWarrior(name: String, power: Int) : Warrior(name, power, "고블린") {
    fun defense() {
        println("방어")
    }
}

// is
// - type 확인
// - 결과값은 Boolean
// - 스마트 캐스팅을 해준다.
val warrior1: Warrior = DefenseWarrior("방어형 전사1", 100)
// DefenseWarrior 클래스를 사용해서 만들었지만 객체를 만들 때 타입이 부모 클래스인 Warrior였기 때문에
// defense 기능은 사용할 수가 없다.
warrior1.attack()
// warrior1.defense() // 오류
if (warrior1 is DefenseWarrior) {
    println("YES")
}
// 위의 if 문을 사용하면 YES가 출력된다. 그 이유는 warrior1을 선언할 때 DefenseWarrior를 사용했기 때문

val warrior2: Warrior = DefenseWarrior("방어형 전사2", 150)
// 이 값을 var로 하면 안되고 val로 할 때만 가능하다.
if (warrior2 is DefenseWarrior) {
    println("형을 변환합니다.")
    // 스마트 캐스팅
    // -> 내가 만든 워리어를 if 블럭 안에서는 DefenseWarrior로 사용하게 해준다.
    warrior2.defense() // 밖에서는 불가능
}

// as
// - 지정한 타입으로 캐스팅을 시도하고, 불가능한 경우에는 예외를 발생
val warrior3: DefenseWarrior = warrior1 as DefenseWarrior
warrior3.defense()
