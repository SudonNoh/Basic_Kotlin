// getter / setter

//class Book() {
//    var title: String = "모름"
//        // title 속성의 getter와 setter
//        get() {
//
//        }
//        set(value) {
//
//        }
//    var subtitle: String = "모름"
//        // subtitle 속성의 getter와 setter
//        get() {
//
//        }
//        set(value) {
//
//        }
//}

class Book() {
    var title: String = "모름"
        get() {
            return "책 제목은 ${field}입니다."
        }
        set(value: String) {
            // field로 써서 value의 값을 받아온다
            field = value
        }
}

val book = Book()
book.title = "어린 왕자"
println(book.title)


// lateinit
class Book2() {
    lateinit var title: String

    fun nextPage() {
        // ::으로 초기화 여부 확인
        if (::title.isInitialized) {
            println("페이지가 넘어갔습니다.")
        } else {
            println("초기화 필요")
        }
    }
}

val book2 = Book2()
book2.title = "어린왕자"
book2.nextPage()

val book2_1 = Book2()
book2_1.title = "빨간망토 차차"
book2_1.nextPage()

// Lazy
//  - 호출시점에 by lazy 정의에 의해서 초기화ㅏ 수행
//  - val 에서만 사용이 가능
class Book3 {
    // lazy를 쓸 때는 람다식으로 사용
    val title: String by lazy {
        // 본문 -> 다른 작업도 할 수 있지만 반드시 프로퍼티를 초기화 시켜주는 작업을 해야한다.
        println("lazy 초기화") // 다른 작업
        // title = "책 제목" // 틀린 방법
        // return "책 제목" // 틀린 방법
        "책 제목"
    }
}

val book3 = Book3()
println(book3.title)
