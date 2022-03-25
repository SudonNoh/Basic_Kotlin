// 고차함수를 이해하기 위한 함수
fun addTwoNumbers(number1: Int, number2: Int): Int {
    return number1 + number2
}

// 고차함수
fun addTenNine(function: (Int, Int) -> Int) {
    val result: Int = function(10, 9)
    println("결과는 ${result}입니다.")
}

addTenNine(::addTwoNumbers)

// 람다
// 풀버전(생략이 없는 버전)
// 람다 함수 내에서는 return 을 쓸 수 없다.
// 람다 함수의 경우 맨 마지막 줄이 반환된다.
val addTenNine2: (Int, Int) -> Int = { number1: Int, number2: Int ->
    number1 + number2
}

addTenNine(addTenNine2) // 람다함수를 인자로 사용하는 경우에는 ::를 사용할 필요가 없다.

// 생략1
val addTenNine3: (Int, Int) -> Int = { number1, number2 ->
    number1 + number2
}
addTenNine(addTenNine3)

// 생략2
val addTenNine4 = { number1: Int, number2: Int ->
    number1 + number2
}
addTenNine(addTenNine4)

// 간단한 경우
addTenNine { number1, number2 -> number1 + number2 }

// 파라미터가 없는 람다 함수
val addTenNine5: () -> Int = {
    10 + 9
}

// 파라미터가 한 개인 경우에는 It을 사용한다
// it은 자동으로 잡힌다.
val addTenNine6: (Int) -> Int = {
    10 + 9
}
addTenNine6(10)


val lambda: (Int, Int) -> Int = { number1, number2 ->
    number1 + number2
}


fun add123(function: (Int, Int) -> Int, number1: Int, number2: Int, number3: Int): Int {
    return function(number1, number2) + number3
}

fun add456(function: (Int, Int) -> Int, number: Int): Int {
    return function(4, 5) + number
}

val total = add123(lambda, 1, 2, 3)
println(total)

val total2 = add456(lambda, 6)
println(total2)

// 오류
//fun add789(function: (Int, Int) -> Int, number): Int {
//    return function + number
}
// 함수가 와야 할 자리에 lambda(7, 8)의 결과값인 Int가 나오기 때문으로 보임
//val total3 = add789(lambda(7, 8), 9)
//println(total3)