object bookStore{
    def main (args : Array[String]) : Unit = {
        
        val copies = 60
        println("Total price = " + bookPrice(copies) )

    }

    def bookPrice(coppies : Int) : Double =
    {
        val price = 24.95
        val discount = price * coppies * 40/100
        val shippingc = shipping(coppies)
        price * coppies - discount + shippingc
    }

    def shipping(coppies : Int) : Double = {
        val costfor50 = 3
        val costfor50plus = 0.75
        val shippingCost = 0

        if (coppies <= 50) 
            {
                val shippingCost = costfor50
            }
        else 
            {
                val shippingCost = costfor50 + (coppies - 50) * costfor50plus
            }


        shippingCost
    }

}