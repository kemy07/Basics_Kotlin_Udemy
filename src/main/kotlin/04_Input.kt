fun main() {
    println("Enter your name : ")
    val name : String? = readLine()
    println("Your name is : $name")
    println("Enter your Age : ")
    val age  = readLine()!!.toInt()
    println("Your age is : $age")
}