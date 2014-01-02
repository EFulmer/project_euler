// this is ugly
object Problem2 extends Application {
  def fibsUpTo1(n: Int): List[Int] = {
    var fibLst = List(2, 1)
    while (fibLst(0) <= n) {
      fibLst = (fibLst(0) + fibLst(1)) :: fibLst
    }
    return fibLst
  }

  def main(): Unit = {
    println(fibsUpTo1(4000000).filter(_ % 2 == 0).sum)
  }
} 
