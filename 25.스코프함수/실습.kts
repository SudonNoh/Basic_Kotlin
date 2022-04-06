class Person(var name: String? = null, var age: Int? = null) {}

// apply
//  - 아직 객체가 생성되지 않은 상태
//  - 적용하다
//  - 객체를 초기화 할 때 사용하면 좋다
val gildong = Person().apply {
    name = "길동"
    age = 20
}
println(gildong.name)

// also
//  - 이미 객체가 만들어진 상태
//  - 유효성 검사 할 때 좋다
//  - 수신된 객체의 속성을 변경하지 않고 사용할 때
val chuelsu = Person("victor").also {
    it.age = 35
    // 유효성 검사 예시
    // nameIsGildong(it.name) > False 반환
    // 이렇듯 이미 만들어진 객체를 넘겨주기 때문에 it으로 받아서
    // name을 확인 할 수 있다.
}
println(chuelsu.name)
println(chuelsu.age)

// run
//  - 기본적으로 apply와 동일
//  - 스코프의 마지막 줄을 리턴한다. -> 특정 계산 결과가 필요한 경우
val ageAfter10years = Person("gildong", 10).run {
    age!! + 10
}
println(ageAfter10years)

// with
//  - with는 nullable 타입을 받지 못한다.
//    val darae: Person? = Person("darae", 10)
//    val ageAfter10years2 = with(darae) { age!! + 10 }
//  - 오류 발생

val ageAfter10years2 = with(Person("gildong", 10)) {
    age!! + 10
}
println(ageAfter10years2)

// let
//  - 기본적으로 also와 동일하다.
//  - 스코프의 마지막 줄을 반환한다.
//  - ? 를 붙여 Person이 null이 아닌 경우 let을 실행
val chuelsu2 = Person("victor")?.let {
    it.age = 35
}