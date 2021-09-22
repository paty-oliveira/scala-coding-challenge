package challenge05

import org.scalatest.funsuite.AnyFunSuite

class StatementTest extends AnyFunSuite {

  test("Should return an empty result when the statement is empty"){
    val statement = ""
    val actualResult = Statement.getAlphabetPosition(statement)
    val expectedResult = ""

    assert(actualResult == expectedResult)
  }

  test("Should return the alphabet position of a statement with one word"){
    val statement = "the"
    val actualResult = Statement.getAlphabetPosition(statement)
    val expectedResult = "20 8 5"

    assert(actualResult == expectedResult)
  }

  test("Should return the alphabet position of a statement with two words"){
    val statement = "The Sunset"
    val actualResult = Statement.getAlphabetPosition(statement)
    val expectedResult = "20 8 5 19 21 14 19 5 20"

    assert(actualResult == expectedResult)
  }

  test("Should return the alphabet position of a statement with many words"){
    val statement = "The sunset sets at twelve o' clock."
    val actualResult = Statement.getAlphabetPosition(statement)
    val expectedResult = "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"

    assert(actualResult == expectedResult)
  }
}
