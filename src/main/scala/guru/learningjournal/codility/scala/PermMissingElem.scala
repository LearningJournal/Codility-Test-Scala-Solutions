package guru.learningjournal.codility.scala

object PermMissingElem extends App {

  def getMissingInt(a: List[Int], n:Int): Int = {
    if(a.isEmpty || n!=a.head)
      return n
    else
      getMissingInt(a.tail,n+1)
  }

  def solution(a: Array[Int]): Int = {
    //Get 100% score
    getMissingInt(a.toList.sorted,1)
  }

  val A1 = Array(2, 3, 1, 5)
  println(solution(A1))

}
