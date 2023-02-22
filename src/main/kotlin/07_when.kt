fun main() {
    println("Enter Any number : ")
    val x : Int = readln()!!.toInt()

    when (x)
    {
        0 -> println("x = 0")
        in 1 .. 5 -> println("The range value between 1:5")
        in 5 .. 7 -> println("The range value between 5:7")
        else -> println("Higher than 7 ")
    }
}