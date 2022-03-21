// Range
val range1 = 1..10 // 1..10
val range2 = 1 until 10 // 1..9
val range3 = 'A'..'Z' // A..Z
val range4 = 'ㄱ'..'ㅎ' // ㄱ..ㅎ

// Progression
val range5 = 1..10 step 2 // 1..9 step 2 == (1, 3, 5, 7, 9)
val range6 = 10 downTo 1 step 2 // 10 downTo 2 step 2
println(range6)

// Step
// - 특징: 시작은 무조건 0번째 Index부터이다.

val num: Int = 100
val range10 = 1..num/10
range10.forEach {
    println(it)
} // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

// Collection
val collection1 = listOf<Int>(1, 2, 3, 4, 5)
