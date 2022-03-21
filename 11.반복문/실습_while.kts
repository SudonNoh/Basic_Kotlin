// While 문 실습

// 아래와 같이 작성하면 무한 루프에 빠진다.
// 루프(loop) : 반복
//var i = 0
//while (i < 5) {
//    if (i % 2 == 0) {
//        println("짝수")
//    } else {
//        println("홀수")
//    }
//}

// i를 증가시켜 무한 루프에서 벗어나도록 한다.
var i = 0
while (i < 10) {
    if (i % 2 == 0) {
        println("짝수")
    } else {
        println("홀수")
    }

    i++
}

// while문의 조건을 만족하지 않더라도 무조건 do를 한번 시작하고
// 조건을 확인하고 멈춘다.
var z = 10
do {
    println("시작")
    z++
} while (z > 20)
