// 1. 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자
fun printString(str: String, num: Int): Unit {
    for (i in 1..num) {
        println(str)
    }
}

printString("안녕", 10)

// 2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자
// for 이용
fun sumNumbers(numbers: Int): Int {
    var sumNum: Int = 0
    for (i in 1..numbers) {
        sumNum += i
    }
    return sumNum
}

// while 이용
fun sumNumbers2(numbers: Int): Int {
    var i = 0
    while (i < numbers) {
        i++
    }
    return i
}

val sumNumber = sumNumbers(10)
println(sumNumber)

// 3. 1부터 100까지의 수 중에서 7의 배수의 합을 구하는 함수를 만드시오
fun sevenMultiSum(): Int {
    var sevenSum = 0
    for (i in 1..100) {
        if (i % 7 != 0) {
            continue
        } else {
            sevenSum += i
            println(i)
        }
    }
    return sevenSum
}
println(sevenMultiSum())

fun sevenMultiSum2(number: Int): Int {
    if (number < 1 || number > 100) {
        return 0
    } else {
        var sevenNum = 0
        for (i in 1..number) {
            if (i % 7 != 0) {
                continue
            } else {
                sevenNum += i
            }
        }
        return sevenNum
    }
}

fun sum7s(): Int {
    var sum: Int = 0
    for (i in 0..100) {
        if (i % 7 == 0) sum += i
    }
    return sum
}

println("-1 :" + sevenMultiSum2(-1))
println("100 :" + sevenMultiSum2(100))
println("101 :" + sevenMultiSum2(101))

// 4. 100 보다 작은 숫자를 넣어주면, 1씩 증가를 시키고 100 이 되면 종료되는 함수를 만드시오
fun to100(number: Int): Unit {
    var num = number
    while (num < 100) {
        num++
        println(num)
    }
    println("종료되었습니다.")
}

to100(20)

// 5. 시험 성적 리스트 [70,71,72,77,78,79,80,82,90,99] 와 동일한 크기의 배열을 만들고,
//    합격이면 true, 불합격이면 false를 담는 함수를 만드시오(80점 이상 부터 합격, 정답 예시
//    (False,False,...))
val examScores = arrayOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99)

fun passOrFail(array: Array<Int>): Array<Boolean> {
    var result = Array(array.size, { false })
    for ((index, score) in array.withIndex()) {
        if (score >= 80) {
            result.set(index, true)
        }
    }
    return result
}

var examList = passOrFail(examScores)
for (i in examList) {
    println(i)
}

fun checkPassOrNot(examScores: List<Int>): BooleanArray {
    val resultArray = BooleanArray(examScores.size, { false })
    examScores.forEachIndexed { index, score ->
        if (score >= 80) resultArray[index] = true
    }
    return resultArray
}

//val result = checkPassOrNot(listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99))
//result.forEach {
//    println(it)
//}

// 6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
// -> [[3,3],[1,5],...]
fun diceCombination(): Unit {
    var combis = mutableListOf<List<Int>>()
    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 6) {
                combis.add(listOf<Int>(i, j))
            }
        }
    }
    println(combis)
}

diceCombination()

// 7. 배부르기 위해서 먹어야하는 총 밥먹기 횟수, 현재 밥 먹은 횟수, 두 개를 받는 함수를 만드시오
//    함수는 "밥을 먹었다" 한번 출력을 할 때마다 밥을 1회 먹은 것으로 간주를 하고, 배가 부를
//    때까지 밥을 먹여야 한다. 배가 부를 경우에는 "배가 부르다" 를 출력한다. 배가 아무리 불러도
//    최소 한번은 무조건먹는다
//    fun eat(3,2):{}
//    ->"밥을 먹었다"
//    ->"배가 부르다"

fun eat(total: Int, current: Int): Unit {
    var i = current
    do {
        println("밥을 먹었다")
        i++
    } while (total > i)
    println("배가 부르다")
}

eat(10, 10)

// 8. 병사 그룹 두 개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두 개의 병사
//    그룹을 합쳐주는 함수를 만드시오
//    fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 2)
//    -> [["A", "B", "D", "E"], ["A", "B"]]
//    (합수 실행이 어려운 조건을 만나면 null을 리턴해야한다)
//    fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 100)
//    -> null

fun totalGroup(
    list1: MutableList<String>,
    list2: MutableList<String>,
    remove: Int
): MutableList<List<String>>? {
    if (list1.size < remove || list2.size < remove) {
        return null
    } else {
        list1.removeAt(remove)
        list2.removeAt(remove)

        var result = mutableListOf<List<String>>()
        result.add(list1)
        result.add(list2)

        return result
    }
}

var total = totalGroup(mutableListOf("A", "B", "C", "D", "E"), mutableListOf("A", "B", "C"), 2)
println(total)

var total2 = totalGroup(mutableListOf("A", "B", "C", "D", "E"), mutableListOf("A", "B", "C"), 100)
println(total2)

// 9. 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오
//    fun abc(3)
//    ->[3,6,9,12,15,18,21,24,27]
fun gugudan(num: Int): MutableList<Int> {
    var result = mutableListOf<Int>()
    for (i in 1..9) {
        result.add(num * i)
    }
    return result
}

var answer = gugudan(7)
println(answer)

// 10. 숫자 리스트 두 개를 넣어주면 짝수 홀수로 분리된 Map을 만드는 함수를 만드시오
//     (Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수" 한다)

fun makeMap(list1: List<Int>, list2: List<Int>): MutableMap<String, MutableList<Int>> {
    val odd = mutableListOf<Int>()
    val even = mutableListOf<Int>()
    val listOfList = listOf<List<Int>>(list1, list2)
    for (i in listOfList) {
        for (j in i) {
            if (j % 2 == 0) {
                even.add(j)
            } else {
                odd.add(j)
            }
        }
    }
    val result =
        mutableMapOf<String, MutableList<Int>>("짝수" to odd, "홀수" to even)
    return result
}

println(
    makeMap(
        listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
        listOf<Int>(100, 101, 102, 103, 104, 105)
    )
)