class SoccerPlayer constructor(uniform: String, ball: String) {
    val uniform: String
    val ball: String

    init {
        this.uniform = uniform
        this.ball = ball
    }

    fun kick() {
        println("공을 찼습니다.")
    }

    fun pass() {
        println("패스를 했다")
    }
}

val footballPlayer = SoccerPlayer("빨간색 유니폼", "축구공")
println(footballPlayer.uniform)
footballPlayer.kick()
footballPlayer.pass()