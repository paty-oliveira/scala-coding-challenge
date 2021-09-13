package challenge04

import org.scalatest.funsuite.AnyFunSuite

class StringSplitterTest extends AnyFunSuite {

  test("Should return an empty result when input word is also empty"){
    val inputWord: String = ""
    val actualResult: List[String] = StringSplitter.splitByPairs(inputWord)
    val expectedResult: List[String] = List("")

    assert(actualResult == expectedResult)
  }

  test("Should return two pairs of letters when input word length is an even number"){
    val inputWord: String = "abcd"
    val actualResult: List[String] = StringSplitter.splitByPairs(inputWord)
    val expectedResult: List[String] = List("ab", "cd")

    assert(actualResult == expectedResult)
  }

  test("Should return two pairs of letters where the last pair has underscore at the end, " +
    "when input word length is an odd number"){
    val inputWord: String = "abcde"
    val actualResult: List[String] = StringSplitter.splitByPairs(inputWord)
    val expectedResult: List[String] = List("ab", "cd", "e_")

    assert(actualResult == expectedResult)
  }

}
