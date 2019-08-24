package guru.learningjournal.codility.scala


object CyclicRotation extends App {

  def getRotatedArray(a: Array[Int], k: Int): Array[Int] = {
    if (a.isEmpty) a
    else {
      val rk = k % a.length
      a.takeRight(rk) ++ a.take(a.length - rk)
    }
  }

  def solution(a: Array[Int], k: Int): Array[Int] = {
    //Get 100% score
    getRotatedArray(a, k)
  }

  println(solution(Array(3, 8, 9, 7, 6), 0).mkString(",") + "=>After 0 rotations")
  println(solution(Array(3, 8, 9, 7, 6), 1).mkString(",") + "=>After 1 rotations")
  println(solution(Array(3, 8, 9, 7, 6), 2).mkString(",") + "=>After 2 rotations")
  println(solution(Array(3, 8, 9, 7, 6), 3).mkString(",") + "=>After 3 rotations")
  println(solution(Array(3, 8, 9, 7, 6), 4).mkString(",") + "=>After 4 rotations")
  println(solution(Array(3, 8, 9, 7, 6), 5).mkString(",") + "=>After 5 rotations")
  println(solution(Array(3, 8, 9, 7, 6), 6).mkString(",") + "=>After 6 rotations")
  println(solution(Array(3, 8, 9, 7, 6), 7).mkString(",") + "=>After 7 rotations")
}
