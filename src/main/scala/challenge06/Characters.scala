package challenge06

/**
 * Count the number of occurrences of each character and return it as a list of tuples in order of appearance.
 * For empty output return an empty list.
 * Example:
 * Kata.orderedCount("abracadabra") == List(('a', 5), ('b', 2), ('r', 2), ('c', 1), ('d', 1))
 */

object Characters {
  def countLetterOccurrences(word: String): List[(Char, Int)] = {
    word.groupBy(letter => letter)
      .map(letter => (letter._1, letter._2.length))
      .toList
  }
}
