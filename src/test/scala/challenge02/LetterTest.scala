package challenge02
import org.scalatest.funsuite.AnyFunSuite

class MissingLetterTest extends AnyFunSuite {

  test("Should return the missing letter when the input has two letters"){
    val inputLetters: List[Char] = List('a', 'c')
    val actualResult = new Letter().takeMissingLetter(inputLetters)
    val expectedResult = 'b'

    assert(expectedResult == actualResult)
  }

  test("Should return the missing letter when the input has four letters"){
    val inputLetters: List[Char] = List('O','Q','R','S')
    val actualResult = 

  }
}
