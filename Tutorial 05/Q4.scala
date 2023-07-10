import scala.io.StdIn
object Q4{

    def main(args:Array[String]):Unit={
        print("Enter Number: ")
        val n = StdIn.readInt()
        println(detEvenOrOdd(n));
    }

    def detEvenOrOdd(num : Int):Boolean={
        if (num == 1)
            false;
        else if (num == 0)
            true;
        else 
            {
                detEvenOrOdd(num-2);
            }
    }
}