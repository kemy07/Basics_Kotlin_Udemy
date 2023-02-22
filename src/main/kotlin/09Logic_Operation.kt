fun main() {
    println("Enter Any Two Number : ")
    val x : Int = readln()!!.toInt()
    val y : Int = readln()!!.toInt()
    print("x > y : ")
    println(x > y)

    print("x < y : ")
    println(x < y)

    print("x == y : ")
    println(x == y)

    print("x >= y : ")
    println(x >= y)

    print("x <= y : ")
    println(x <= y)

    print("x > 9 && y < 2 ")
    println(x > 9 && y < 2)

    print("x > 4 && y < 2 ")
    println(x > 4 && y < 2)

    print("x > 4 || y < 2 ")
    println(x > 4 || y < 2)

    print("x < 4 || y < 2 ")
    println(x < 4 || y < 2)

    print("x != y : ")
    println(x != y )
}