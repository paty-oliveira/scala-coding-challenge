package challenge03

/**
  * Create a function taking a positive integer as its parameter
  * and returning a string containing the Roman Numeral representation of that integer.
  *
  * Modern Roman numerals are written by expressing each digit separately starting with the left most
  * digit and skipping any digit with a value of zero.
  * In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
  * 2008 is written as 2000=MM, 8=VIII; or MMVIII.
  * 1666 uses each Roman symbol in descending order: MDCLXVI.
  *
  * Roman.encode(1000) // should return "M"
  */

object RomanNumber {

  val romanOnes: Map[Int, String] = Map(
    1 -> "I",
    2 -> "II",
    3 -> "III",
    4 -> "IV",
    5 -> "V",
    7 -> "VII",
    6 -> "VI",
    8 -> "VIII",
    9 -> "IX"
  )

  val romanTens: Map[Int, String] = Map(
    10 -> "X",
    20 -> "XX",
    30 -> "XXX",
    40 -> "XL",
    50 -> "L",
    60 -> "LX",
    70 -> "LXX",
    80 -> "LXXX",
    90 -> "XC"
  )

  val romanHundreds: Map[Int, String] = Map(
    100 -> "C",
    200 -> "CC",
    300 -> "CCC",
    400 -> "CD",
    500 -> "D",
    600 -> "DC",
    700 -> "DCC",
    800 -> "DCCC",
    900 -> "CM"
  )

  val romanThousands: Map[Int, String] = Map(
    1000 -> "M",
    2000 -> "MM",
    3000 -> "MMM"
  )

  def partitionNumber(arabicNumber: Int): (Int, Int, Int, Int) = {
    val one = (arabicNumber / 1) % 10 * 1
    val tens = (arabicNumber / 10) % 10 * 10
    val hundred = (arabicNumber / 100) % 10 * 100
    val thousands = (arabicNumber / 1000) % 10 * 1000
    (thousands, hundred, tens, one)
  }

  def determineOnesInRoman(ones: Int): String = {
    romanOnes.getOrElse(ones, "")
  }

  def determineTensInRoman(tens: Int, ones: Int): String = {
    romanTens.getOrElse(tens, "") + romanOnes.getOrElse(ones, "")
  }

  def determineHundredsInRoman(hundreds: Int, tens: Int, ones: Int): String = {
    romanHundreds.getOrElse(hundreds, "") +
      romanTens.getOrElse(tens, "") +
      romanOnes.getOrElse(ones, "")
  }

  def determineThousandsInRoman(
      thousands: Int,
      hundreds: Int,
      tens: Int,
      ones: Int
  ): String = {
    romanThousands.getOrElse(thousands, "") +
      romanHundreds.getOrElse(hundreds, "") +
      romanTens.getOrElse(tens, "") +
      romanOnes.getOrElse(ones, "")
  }

  def encode(arabicNumber: Int): String = {
    val partitionedNumber = partitionNumber(arabicNumber)
    val ones = partitionedNumber._4
    val tens = partitionedNumber._3
    val hundreds = partitionedNumber._2
    val thousands = partitionedNumber._1

    partitionedNumber match {
      case (0, 0, 0, _) => determineOnesInRoman(ones)
      case (0, 0, _, _) => determineTensInRoman(tens, ones)
      case (0, _, _, _) => determineHundredsInRoman(hundreds, tens, ones)
      case (_, _, _, _) =>
        determineThousandsInRoman(thousands, hundreds, tens, ones)
    }
  }
}
