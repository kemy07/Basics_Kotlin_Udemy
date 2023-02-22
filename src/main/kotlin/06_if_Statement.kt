fun main() {
    println("Enter Any number : ")
    val x : Int = readln()!!.toInt()
    if (x > 0 )
        println("x is Positive")
    else if (x < 0)
        println("x is Negative")
    else
        println("x is 0 ")

    //Nested if Statement
    println("Enter Your Degree : ")
    val degree : Int = readln()!!.toInt()
    if (degree >= 50)
    {
        println("Success")
    }
    else
    {
        if (degree >=45) { println  ("Excepted Sucess") }

        else { println("Fail") }
    }

}