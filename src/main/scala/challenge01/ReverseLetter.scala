package challenge01

/**
 * Given a string str, reverse it omitting all non-alphabetic characters.
 *
 * Example:
 * For str = "krishan", the output should be "nahsirk"
 * For str = "ultr53o?n", the output should be "nortlu"
 */

class ReverseLetter {

  def convertToReverse(word: String): String = {
    word.replaceAll("\\d+\\W+", "").reverse
  }
}
