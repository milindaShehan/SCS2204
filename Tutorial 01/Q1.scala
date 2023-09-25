object diskArea {

    def main (args : Array[String]) : Unit = {
        val r = 5;
        val area = diskArea(r)
        println(s"Area = $area")
    }

    def diskArea(r : Double): Double = {
    val pi = 3.14
    pi * r * r
}
}

