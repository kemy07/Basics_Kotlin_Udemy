fun main() {
    for (x in 1..10)
    {
        println("The Mmultiplication Table of $x :")
        for (y in 1 .. 10)
            println("$x*$y = " + (x*y))
    }
}