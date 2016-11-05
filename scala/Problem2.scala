object Problem2 extends Application {
  // mutable:
  def fibsUpTo1(n: Int): List[Int] = {
    var fibLst = List(2, 1)
    while (fibLst(0) <= n) {
      fibLst = (fibLst(0) + fibLst(1)) :: fibLst
    }
    return fibLst
  }

  // tail-recursive accumulator function
  def fibsUpTo2(n : Int) : List[Int] = {
    def aux(fibsSoFar : List[Int]): List[Int] = {
      if (fibsSoFar.head <= n)
        aux( (fibsSoFar(0) + fibsSoFar(1)) :: fibsSoFar)
      else
        return fibsSoFar
    }
    aux(List(2, 1))
  }
  def main(): Unit = {
    println(fibsUpTo1(4000000).filter(_ % 2 == 0).sum)
    println(fibsUpTo2(4000000).filter(_ % 2 == 0).sum)
  }
} 
