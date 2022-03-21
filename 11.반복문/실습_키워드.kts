// break
for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) break
        else println("j : " + j)
    }
}

// continue
for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) continue
        else println("j : " + j)
    }
}

// return
fun returnFuction(): Unit {
    for (i in 1..3) {
        println("i : " + i)
        for (j in 1..3) {
            if (j == 2) return
            else println("j : " + j)
        }
    }
}

returnFuction()

// label을 사용한 break
// 기본적으로 break는 가장 가까운 곳의 반복문을 탈출한다.
// 그렇기 때문에 가장 가까운 for문에는 label을 달아줄 필요가 없다.
// 따라서 i 반복문에 label을 달도록 한다.
println("----------label + break-----------")
labelName@ for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) break@labelName
        else println("j : " + j)
    }
}

// label을 사용한 continue
// 원래는 continue를 만나면 j 반복문으로 가서 루프를 돌려야하는데,
// label을 만나면 label이 달린 i 반복문에서 루프를 돌린다.
println("----------label + continue-----------")
labelName@ for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) continue@labelName
        else println("j : " + j)
    }
}

// label을 사용한 forEach
// forEach는 continue와 break 사용 불가
println("----------forEach--------------------")
listOf(1, 2, 3).forEach loop@{
    if (it == 2) return@loop
    else println(it)
}