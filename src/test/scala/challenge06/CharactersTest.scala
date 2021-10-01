package challenge06

import org.scalatest.funsuite.AnyFunSuite

class CharactersTest extends AnyFunSuite {

  test("Should return zero occurrence when the word is empty"){
    val word = ""
    val actualResult: List[(Char, Int)] = Characters.countLetterOccurrences(word)
    val expectedResult = List.empty

    assert(expectedResult == actualResult)
  }

  test("Should return one occurrence when the word contains one letter"){
    val word = "a"
    val actualResult: List[(Char, Int)] = Characters.countLetterOccurrences(word)
    val expectedResult: List[(Char, Int)] = List(('a', 1))

    assert(expectedResult == actualResult)
  }

  test("Should return all letters occurrences from a word"){
    val word = "abacadaba"
    val actualResult: List[(Char, Int)] = Characters.countLetterOccurrences(word)
    val expectedResult: List[(Char, Int)] = List(('a', 5), ('b', 2), ('c', 1), ('d', 1))

    assert(expectedResult == actualResult)
  }
}
