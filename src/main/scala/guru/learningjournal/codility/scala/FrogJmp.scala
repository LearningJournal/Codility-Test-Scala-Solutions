package guru.learningjournal.codility.scala

object FrogJmp extends App {

  def getJumpsRec(rd:Int,jd:Int, nj:Int):Int = {
    if(rd<=0) nj
    else
      getJumps(rd-jd,jd,nj+1)
  }

  def getJumps(x: Int, y: Int, d: Int): Int = {
    val nJumps = (y-x)/d
    if((y-x)%d>0) nJumps+1 else nJumps
  }

  def solution(x: Int, y: Int, d: Int): Int = {
    //This one is functionally correct but gets 20% on performance = 55% task score
    //The question description plays a mind game showing you an iterative algorithm as an example
    //getJumpsRec(y-x,d,0)

    //This one gets 100% score
    getJumps(x,y,d)
  }

  println("X=10, Y=85, D=30 => " + solution(10,85,30))

}
