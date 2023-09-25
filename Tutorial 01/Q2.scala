object TempConverter {
    def main (args : Array[String]): Unit = {
        val c = 35
        val f = faranhite(c)
        println(s"$c c = $f f")
    }

    def faranhite(c : Double): Double = {
        c * 1.8 + 32
    }
}