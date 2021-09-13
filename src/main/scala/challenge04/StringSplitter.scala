package challenge04

/**
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the missing second
 * character of the final pair with an underscore ('_').

 * Examples:
 * solution('abc')    // should return List("ab", "c_")
 * solution('abcdef') // should return List("ab", "cd", "ef")
 *
 */


object StringSplitter {
  def splitByPairs(word: String): List[String] = {
    val allPairs = word.split("(?<=\\G.{2})")

    if (allPairs.length % 3 == 0) {
      val lastElement =  allPairs.last + "_"
      allPairs(allPairs.length - 1) = lastElement
      return allPairs.toList
    }
      allPairs.toList
    }
}
