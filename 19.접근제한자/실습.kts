// Scope

var number: Int = 1

fun changeNumber() {
    var internalNumber: Int = 2
    number = 20 // 하위 스코프에서 상위 멤버에 접근할 수 있다.
    var number: String = "재정의" // 하위 스코프에서 상위 멤버를 재정의 할 수 있다.
    println("changeNumber 내부: ${internalNumber}")
    println("changeNumber 내부: ${number}")
}

changeNumber()
println(number)

// internalNumber = 30 // 오류 (상위 스코프에서 하위 스코프 멤버에 접근할 수 없다)


// 접근제한자
class Numbers(private var number: Int = 10) {
    fun changeNumber() {
        this.number = 100
    }

    fun getNumber(): Int {
        return this.number
    }
}

val numbers = Numbers()
println(numbers.getNumber())
//numbers.number = 100
//println(numbers.number)
numbers.changeNumber()
println(numbers.getNumber())