object RationalNumber {

    class Rational(n: Int, d: Int) {
        require(d != 0, "Denominator must be nonzero")

        private val gcdValue: Int = gcd(n.abs, d.abs)
        val numer: Int = n / gcdValue
        val denom: Int = d / gcdValue

        private def gcd(a: Int, b: Int): Int = {
        if (b == 0) 
            a 
        else 
            gcd(b, a % b)
        }

        def neg: Rational = new Rational(-numer, denom)

        override def toString: String = s"$numer / $denom"
    }

    def main (args: Array[String]): Unit = {
        println("Enter the numerator :")
        val numer = scala.io.StdIn.readInt()

        println("Enter the denominator :")
        val denom = scala.io.StdIn.readInt()

        val x = new Rational(numer, denom)
        val negX = x.neg

        println(s"x: $x")
        println(s"Negation of x: $negX")
    }
}