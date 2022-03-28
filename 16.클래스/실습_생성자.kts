// 클래스를 선언하는 방법
class Person {}

// 생성자
// 주생성자 (Primary Constructor)
class User1 constructor(name: String) {
    // 변수를 선언할 때 초기화를 진행해야 하지만 class 안에서의 경우
    // init block을 따로 생성하기 때문에 변수 선언시 초기화를 따로 할
    // 필요가 없다.
    val userName: String // 클래스 속성(Property, 프로퍼티)

    init {
        userName = name
        println("내 이름은 ${name}입니다.")
    }
}
// 클래스를 호출하는 방법 -> 클래스를 통해서 객체를 만드는 방법
// 클래스를 호출 -> 인스턴스화 (Instance)
// 객체 -> Object, Instance
val user = User1("홍길동")

// 주생성자 -> init을 생략하는 방법
// 초기화 block을 생략
class User2 constructor(name: String) {
    val userName: String = name
}

val user2 = User2("박수진")

// 주생성자 -> constructor를 생략하는 방법
class User3(name: String) {
    val userName: String = name
}

val user3 = User3("김철수")

// 주생성자 -> 기본값
class User4(name: String = "김아무개") {
    val userName: String = name
}

val user4 = User4()
println("내 이름은 ${user4.userName}입니다.")

// 생성자에서 받는 속성이 여러 개인 경우
class User5(age: Int, name: String) {
    val age: Int
    val name: String

    init {
        this.age = age // this는 클래스 자체를 의미한다. (User5)
        this.name = name
    }
}

val user5 = User5(20, "이창민")
// . 은 객체의 속성이나 기능을 사용할 때 사용한다.
println(user5.age)

// 주생성자 -> 생략할 수 있는 걸 모든 것을 생략하는 방법
class User6(val userName: String) {
    fun printName() {
        println("내 이름 ${userName}")
        println("내 이름 ${this.userName}")
    }
}

val user6 = User6("파파파")
println(user6.userName)
user6.printName()

// 부생성자 (Secondary Constructor)
// 부생성자는 constructor 키워드를 생략할 수 없음

class User7 constructor(name: String) {
    var age: Int
    val name: String

    init {
        println("init")
        this.name = name
        this.age = 100
    }

    // 부생성자는 클래스명 우측에 올 수 없다. -> 클래스의 본문에 있어야 한다.
    // 부생성자가 필요한 이유:
    //     User를 만들 때 필수로 넣어야 하는 속성: 주생성자
    //     User를 만들 때 필요하면 넣는 속성: 부생성자
    // 우리는 주생성자나 부생성자 중 하나를 택해서 객체를 만들어야 한다.
    // 따라서 부생성자에는 주생성자에서 필수로 받는 요소가 들어있어야 한다.
    constructor(name: String, age: Int) : this(name) {
        // 부생성자는 주 생성자에게 생성을 위임해야 한다.
        println("second")
        this.age = age
    }
}
// 주생성자만 이용
val user7 = User7(name = "안녕안녕")
println(user7.name)
val user7_2 = User7("안녕안녕", 200)
println(user7_2.age)

// 실행순서
// 부생성자 호출 -> 부생성자 안에 있는 주생성자(this(name)) 호출
// -> init block 호출 -> 부생성자 본문 실행
// 클래스 속성에서 초기화를 시켜주지 않아도 되는 이유
//     - 초기화 블록에서 초기화를 보장해주기 때문 -> 클래스가 생성될 때 초기화 블록은 무조건 실행
//     - 초기화 블록에 없는 속성은 선언 할 때 초기화를 해줘야 한다.
// 부생성자는 여러 개 존재할 수 있다.

class User8 {
    val age: Int
    val name: String

    constructor(age: Int, name: String) {
        this.age = age
        this.name = name
    }
}

val user8 = User8(10, "가가가")
println(user8.age)
// 주생성자가 없는 것 같이 보이고 부생성자만 있을 때 부생성자가 주생성자처럼 보인다.
// 주생성자는 코틀린이 자동으로 생성한다.
// 주생성자가 없기 때문에 this() 생성자를 이용해 생성을 위임 할 필요가 없다.