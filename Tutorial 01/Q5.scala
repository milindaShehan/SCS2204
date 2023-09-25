object run{
    def main (args : Array [String]) : Unit = {


        val time = easyPace(2) + tempo(3) + easyPace(2)
        println(s"Time = $time")

    }

    def easyPace (distance : Double): Double = {
        val time = 8
        time * distance
    }

    def tempo (distance : Double): Double = {
        val time = 7
        time * distance
    }


}