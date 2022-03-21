// range
for (value in 0..3) {
    println("반복")
}

// progression + step
for (value in 0..5 step (2)) {
    println("반복 1")
}

// progression + downTo
for (value in 5 downTo 0) {
    println("반복 2")
}

// collection
val numbers = listOf<Int>(5, 6, 7, 8)
for (number in numbers) {
    println(number)
}

for (i in 0..numbers.size) {
    println(i)
}

for (i in 0 until numbers.size) {
    println(i)
}

for ((index, number) in numbers.withIndex()) {
    println("" + index + " | " + number)
}

// forEach
numbers.forEach {
    println(it)
}

numbers.forEach { number ->
    println(number)
}

