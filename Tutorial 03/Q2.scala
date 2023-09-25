import scala.io.StdIn

object LengthGreaterThan5 {
  def main(args: Array[String]): Unit = {
    val stringList = stringInput()
    val listAfter = lengthGreaterThan5(stringList)
    println(listAfter)
  }

  def stringInput(): List[String] = {
    println("Enter string List (separated by commas ','): ")
    val input = StdIn.readLine();
    input.split(",").map(_.trim).toList;
  }

  def lengthGreaterThan5(strings: List[String]): List[String] = {
    strings.filter(_.length > 5);
  }
}
