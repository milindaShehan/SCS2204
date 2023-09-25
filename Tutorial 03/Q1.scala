
import scala.io.StdIn // for readLine
object stringInput{


    def main(args: Array[String]): Unit = {
        var string = stringInput();
        println(reverseString(string));
    }

    def stringInput(): String = {
        println("Enter a string: ");
        var input = StdIn.readLine();
        
        input;
    }

    def reverseString(string : String): String ={
        if (string.length() ==1){
            string;
        }
        else{
            reverseString(string.tail) + string.head;
        }
    }

}