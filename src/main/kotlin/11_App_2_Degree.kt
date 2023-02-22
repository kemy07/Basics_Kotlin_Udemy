fun main() {
    println("Enter Your Degree:")
    val degree:Int = readln()!!.toInt()
    when {
        degree > 90 -> println("A")
        degree in 80..89 -> println("B")
        degree in 70..79 -> println("C")
        degree in 60..69 -> println("D")
        else -> println("F")
    }
}