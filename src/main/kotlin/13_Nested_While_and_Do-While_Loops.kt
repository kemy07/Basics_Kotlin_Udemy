fun main() {
    var x = 1
    while (x <= 10 )
    {
        var y = 1
        while (y<=10)
        {
            println("$x*$y = " + (x*y))
            y++
        }
        x++
    }
}