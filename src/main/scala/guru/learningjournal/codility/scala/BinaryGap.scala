package guru.learningjournal.codility.scala

object BinaryGap extends App {

  def getBinaryGap(num: Int): Int = {
    /*
      1.Create RegEx for 0s surrounded by 1 on both ends
      2.Convert the number to Binary
      3.Apply Binary String to RegEx and make a list of all occurrences
      4.If list is empty return 0
      5.Else, filter whose length is maximum and return the length
     */

    val list = "(?<=1)0+(?=1)".r.findAllIn(num.toBinaryString).toList
    if (list.isEmpty) 0
    else
      list.maxBy(_.length).length
  }

  println("6=>" + 6.toBinaryString + "=>" + getBinaryGap(6))
  println("9=>" + 9.toBinaryString + "=>" + getBinaryGap(9))
  println("15=>" + 15.toBinaryString + "=>" + getBinaryGap(15))
  println("22=>" + 22.toBinaryString + "=>" + getBinaryGap(22))
  println("325=>" + 325.toBinaryString + "=>" + getBinaryGap(325))
  println("540=>" + 540.toBinaryString + "=>" + getBinaryGap(540))
  println("2789=>" + 2789.toBinaryString + "=>" + getBinaryGap(2789))
  println("3549=>" + 3549.toBinaryString + "=>" + getBinaryGap(3549))
  println("952379=>" + 952379.toBinaryString + "=>" + getBinaryGap(952379))

}
