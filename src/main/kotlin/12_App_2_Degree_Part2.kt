fun main() {

    while (true) {
        println("Enter Your Degree:")
        val degree: Int = readln()!!.toInt()
        if (degree !in 0 .. 100) break
        when {
            degree > 90 -> println("A")
            degree in 80..89 -> println("B")
            degree in 70..79 -> println("C")
            degree in 60..69 -> println("D")
            else -> println("F")
        }
    }
}