package challenge01
import org.scalatest.funsuite.AnyFunSuite

class ReverseLetterTest extends AnyFunSuite {

  test("Should return an empty result when the word contains only non-alphabetic characters"){
    val inputWord = "530!&"
    val convertor = new ReverseLetter()
    val actualResult = convertor.convertToReverse(inputWord)
    val expectedResult = ""

    assert(actualResult == expectedResult)
  }

  test("Should return a result in reverse way"){
    val inputWord = "abcd"
    val convertor = new ReverseLetter()
    val actualResult = convertor.convertToReverse(inputWord)
    val expectedResult = "dcba"

    assert(actualResult == expectedResult)
  }

  test("Should return a result in reverse way and without non-alphabetic characters"){
    val inputWord = "abc53?"
    val convertor = new ReverseLetter()
    val actualResult = convertor.convertToReverse(inputWord)
    val expectedResult = "cba"

    assert(actualResult == expectedResult)
  }
}
