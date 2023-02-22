import java.util.Calendar

fun main() {
    // input
    println("Enter Your BirthYear : ")
    val birthYear : Int = readln()!!.toInt()
    // processing
    val age = Calendar.getInstance().get(Calendar.YEAR) - birthYear
    // output
    println("Your Age Is : $age")
}