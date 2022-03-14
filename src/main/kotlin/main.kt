fun main() {
    val likes = 21

    val message = "Понравилось $likes " + if(likes%10 == 1) "человеку" else "людям"
    println(message)
}