package guru.learningjournal.codility.scala

object OddOccurrencesInArray extends App {

  def getUnpaired(a: Array[Int]): Int = {
    if (a.length == 1 || a.head != a.tail.head)
      a.head
    else
      getUnpaired(a.tail.tail)
  }

  def getXOR(h: Int, a: Array[Int]): Int = {
    if (a.isEmpty)
      h
    else
      getXOR(h ^ a.head, a.tail)
  }

  def mapCount(a: Array[Int]): Int = {
    var map = scala.collection.mutable.Map[Int, Int]().withDefaultValue(0)
    for (v <- a) map(v) = map(v) + 1
    map.filter(_._2 % 2 == 1).head._1
  }

  def solution(a: Array[Int]): Int = {
    //This one is functionally correct but gets 25% on performance = 66% task score
    //getUnpaired(a.sorted)

    //This one is functionally correct but gets 25% on performance = 66% task score
    //getXOR(0,a)

    //Finally, this one gave 100% score
    mapCount(a)
  }

  val A1 = Array(2, 1, 2, 4, 1, 4, 3)
  val A2 = Array(2, 1, 2, 4, 1, 4, 4)
  println(A1.mkString(",") + " =>" + solution(A1))
  println(A2.mkString(",") + " =>" + solution(A2))
}
