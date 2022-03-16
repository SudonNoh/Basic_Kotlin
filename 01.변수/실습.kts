// 주석 작성하는 방법
// 주석으 사람만 보기 위해서 작성한다

// 1. var 변수 선언하기
var changeYes = 100
// 선언과 동시에 초기화를 시켜줘야 한다
// 초기화 하지 않은 경우
// var changeYes
// changeYes = 100
// error: property must be initialized or be abstract (실습.kts: 6:1)
println(changeYes)

changeYes = 200
println(changeYes)

// 2. val 변수 선언하기
val CHANGE_NO = 100
println(CHANGE_NO)
// 변경이 불가능한 변수는 재할당 할 수 없다55
// CHANGE_NO = 200
// error: val cannot be reassigned

val SCHOOL_NAME = "대한민국 학교"
println(SCHOOL_NAME)
