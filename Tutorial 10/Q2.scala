object Q2{

    def countLetterOccurrences(words: List[String]): Int = {
        val occurrences = words.map(word => word.length)
        val totalOccurrences = occurrences.reduce(_ + _)
        totalOccurrences
    }
    def main(args: Array[String]): Unit = {
        val words = List("apple", "banana", "cherry", "date")
        val totalOccurrences = countLetterOccurrences(words)
        println(s"Total occurrences: $totalOccurrences")
    }
}