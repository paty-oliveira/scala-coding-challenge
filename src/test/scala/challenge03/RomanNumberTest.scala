package challenge03

import org.scalatest.funsuite.AnyFunSuite

class RomanNumberTest extends AnyFunSuite {

  test("Should return number 1 in roman way") {
    val arabicNumber: Int = 1
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "I";

    assert(actualResult == expectedResult)
  }

  test("Should return number 9 in roman way") {
    val arabicNumber: Int = 9
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "IX"

    assert(actualResult == expectedResult)
  }

  test("Should return number 10 in roman way") {
    val arabicNumber: Int = 10
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "X"

    assert(actualResult == expectedResult)
  }

  test("Should return number 90  in roman way") {
    val arabicNumber: Int = 90
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "XC"

    assert(actualResult == expectedResult)
  }

  test("Should return number 100 in roman way") {
    val arabicNumber: Int = 100
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "C"

    assert(actualResult == expectedResult)
  }

  test("Should return 12 in roman way") {
    val arabicNumber: Int = 12
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "XII"

    assert(actualResult == expectedResult)
  }

  test("Should return 112 in roman way") {
    val arabicNumber: Int = 112
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "CXII"

    assert(actualResult == expectedResult)
  }

  test("Should return 1000 in roman way") {
    val arabicNumber: Int = 1000
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "M"

    assert(actualResult == expectedResult)
  }

  test("Should return 1995 in roman way") {
    val arabicNumber: Int = 1995
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "MCMXCV"

    assert(actualResult == expectedResult)
  }

  test("Should return 2021 in roman way") {
    val arabicNumber: Int = 2021
    val actualResult: String = RomanNumber.encode(arabicNumber)
    val expectedResult: String = "MMXXI"

    assert(actualResult == expectedResult)
  }

}
