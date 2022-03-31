interface Tiger {
    fun bite()
    fun goToBox()
}

class BackDoSanTiger : Tiger {
    override fun bite() {
        println("앙")
    }

    override fun goToBox() {
        println("좀 좁군")
    }

}

val backDoSanTiger: BackDoSanTiger = BackDoSanTiger()
backDoSanTiger.bite()
backDoSanTiger.goToBox()

interface Person {
    // 멤버들의 구현부가 없음
    var dress: String

    // 바디 블록이 없음
    fun eat()
    fun sleep()
}

class Student : Person {
    override var dress: String = "잠옷"
        get() = field
        set(value) {
            field = value
        }

    override fun eat() {
        println("밥을 먹는다")
    }

    override fun sleep() {
        println("잠을 잔다")
    }
}

val student: Student = Student()
student.eat()
student.sleep()
println(student.dress)
student.dress = "교복"
println(student.dress)
println(student.dress.javaClass)
