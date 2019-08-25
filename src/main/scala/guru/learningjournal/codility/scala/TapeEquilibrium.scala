package guru.learningjournal.codility.scala

object TapeEquilibrium extends App {

  def getMinDiff(a: Array[Int]): Int = {
    val sums = Array.ofDim[Int](a.length - 1)

    for (i <- 1 to a.length - 1) {
      sums(i - 1) = (a.take(i).sum - a.takeRight(a.length - i).sum).abs
    }
    sums.min
  }

  def getMinDiff2(a: Array[Int]): Int = {
    val totalSum = a.sum
    var leftSum = a(0)
    var rightSum = totalSum-a(0)
    var currentMin = (leftSum - rightSum).abs

    for (i <- 2 to a.length - 1) {
      leftSum = leftSum + a(i - 1)
      rightSum = totalSum - leftSum
      currentMin = scala.math.min((leftSum - rightSum).abs, currentMin)
    }
    currentMin
  }


  def solution(a: Array[Int]): Int = {
    //This one is functionally correct but gets 0% on performance = 53% task score
    //getMinDiff(a)

    //This one Gives 100%
    getMinDiff2(a)
  }

  println(solution(Array(3, 1, 2, 4, 3)))

}
