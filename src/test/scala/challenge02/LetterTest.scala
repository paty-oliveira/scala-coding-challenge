package challenge02
import org.scalatest.funsuite.AnyFunSuite

class LetterTest extends AnyFunSuite {

  test("Should return the missing letter when the input has two letters") {
    val inputLetters: List[Char] = List('a', 'c')
    val actualResult: Char = new Letter().takeMissingLetter(inputLetters)
    val expectedResult: Char = 'b'

    assert(expectedResult == actualResult)
  }

  test("Should return the missing letter when the input has four letters") {
    val inputLetters: List[Char] = List('O', 'Q', 'R', 'S')
    val actualResult: Char = new Letter().takeMissingLetter(inputLetters)
    val expectedResult: Char = 'P'

    assert(expectedResult == actualResult)
  }

  test("Should return the missing letter when the input has six letters") {
    val inputLetters: List[Char] = List('j', 'k', 'l', 'n', 'o', 'p')
    val actualResult: Char = new Letter().takeMissingLetter(inputLetters)
    val expectedResult: Char = 'm'

    assert(expectedResult == actualResult)
  }
}
