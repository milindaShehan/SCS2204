
import scala.io.StdIn // for readLine
object stringInput{


    def main(args: Array[String]): Unit = {
        var val1 = input();
        var val2 = input();
        var number = mean(val1, val2);
        println(f"$number%.2f");
    }

    def input(): Int= {
        print("Enter Number: ");
        var input = StdIn.readInt();
        
        input;
    }

    def mean(num1 :Int , num2 :Int):Double = {
        (num1.toFloat + num2.toFloat)/2.00;
    }

}