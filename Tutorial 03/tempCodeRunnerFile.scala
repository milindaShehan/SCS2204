
import scala.io.StdIn // for readLine
object stringInput{


    def main(args: Array[String]): Unit = {
        var val1 = stringInput();
        var val2 = stringInput();
        println(mean(val1, val2));
    }

    def stringInput(): Int= {
        print("Enter a string: ");
        var input = StdIn.readInt();
        
        input;
    }

    def mean(num1 :Int , num2 :Int):Double = {
        (num1.toFloat + num2.toFloat)/2.00;
    }

}