object Volume{
    def main (args : Array [String]) : Unit = {
        val r = 5;
        val V = volume(r)
        println(s"Volume = $V")
    }

    def volume (r : Double) : Double = {
        val pi = 3.14
        4/3 * pi * r * r * r
    }

}