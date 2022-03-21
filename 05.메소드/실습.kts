// 함수를 선언하는 방법
fun plusNumbers(firstNum: Int, secondNum: Int): Int {
    val result: Int = firstNum + secondNum
    return result
}

// 함수를 호출하는 방법
plusNumbers(firstNum = 10, secondNum = 20) // -> 30
plusNumbers(10, 20) // -> 30

val result: Int = plusNumbers(firstNum = 5, secondNum = 7)
println(result)

// 기본값이 있는 함수
fun plusNumbersWithDefault(firstNum: Int, secondNum: Int = 10): Int {
    return firstNum + secondNum
}

val result2: Int = plusNumbersWithDefault(firstNum = 10)
println(result2)
val result3: Int = plusNumbersWithDefault(firstNum = 10, secondNum = 30)
println(result3)

// 반환값이 없는 함수
fun plusNumbersWithNoReturn(firstNum: Int, secondNum: Int): Unit {
    println(firstNum + secondNum)
}
plusNumbersWithNoReturn(100, 200)

fun plusNumbersWithNoReturn2(firstNum: Int, secondNum: Int) {
    println(firstNum + secondNum)
}
plusNumbersWithNoReturn2(100, 200)

fun plusNumbersWithNoReturn3(firstNum: Int, secondNum: Int) {
    println(firstNum + secondNum)
    // 비추천하는 방식
    return
    // return Unit 도 가능
}
plusNumbersWithNoReturn3(100, 200)

// 함수 선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum: Int, secondNum: Int) = firstNum + secondNum
val result10 = shortPlusNumbers(10, 100)
println(result10)

// 가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int): Unit {
    println(numbers)
    for (number in numbers) {
        println(number)
    }
}

plusMultipleNumbers(1, 2, 3, 4, 5, 6)
