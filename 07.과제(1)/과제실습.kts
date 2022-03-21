// 1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 True, 다른 경우에는 False가 되는 변수 c를 선언한다.
// 단, 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다.

var A: String = "안녕하세요"
var B: String = "안녕요"

var C: Boolean = if (A == B) true else false
println(C)

// 2. 정수형 변수 A를 선언하고, 변수 B를 선언한다. 이때 변수 B는 A의 두 배가 되어야 한다.

var D: Int = 10
var E: Int = D * 2
println(E)

// 3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오.
// (90점 이상 A, 80-89점 B, 70-79점 C, 그렇지 않으면 F)

fun score(number: Int): String {
    when (number) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "F"
    }
}

println(score(89))

// 4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수점(정수)를 반환하는 함수를 만드시오.
// (시험 문제는 총 20문제이고 만점은 100점)

fun score2(number: Int): Int = number * 5

println(score2(7))

// 5. nullable 정수형 두 개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다.
// 이때 인수 중에 null 이 있으면 0으로 취급하여 합을 구한다.

fun sumInt(number1: Int?, number2: Int?): Int? {
    var num1 = number1 ?: 0
    var num2 = number2 ?: 0

    return num1 + num2
}

println(sumInt(null, 100))
// 함수에서 받은 인자는 val 이다.
// 함수 안에서 똑같은 이름을 갖고 있는 다른 두 변수가 있으면 안된다.