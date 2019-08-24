package guru.learningjournal.codility.scala

object MissingInteger extends App {

  def getMissingInteger(a: Array[Int], num: Int): Int = {
    if (a.isEmpty || num != a.head)
      return num
    else
      getMissingInteger(a.tail, num + 1)
  }

  def getMissingInteger(a: List[Int], num: Int): Int = {
    if (a.isEmpty || num != a.head)
      return num
    else
      getMissingInteger(a.tail, num + 1)
  }

  def solution(a: Array[Int]): Int = {
    //This one is functionally correct but gets 50% on performance = 77% task score
    //getMissingInteger(a.filter(_ > 0).distinct.sorted, 1)

    //Changing it to List gets 100%
    getMissingInteger(a.toList.filter(_ > 0).distinct.sorted, 1)
  }

  val A1 = Array(1, 3, 6, 4, 1, 2)
  val A2 = Array(-1, -3, 6, 4, 1, 2, 0)
  val A3 = Array(0)
  val A4 = Array(-4, -3, -2, -1)
  println(A1.mkString(",") + "=>" + solution(A1))
  println(A2.mkString(",") + "=>" + solution(A2))
  println(A3.mkString(",") + "=>" + solution(A3))
  println(A4.mkString(",") + "=>" + solution(A3))
}
