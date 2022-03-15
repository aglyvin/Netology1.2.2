fun main() {
    val likes = 21

    val message = "Понравилось $likes " + if(likes%10 == 1 && likes%100 != 11) "человеку" else "людям"
    println(message)
}
