object Problem1 extends Application {
  // First with regular filter/reduce
  def firstSoln = {
    val below1K = List.range(1, 1000)
    val divisible = below1K.filter(x => x % 3 == 0 || x % 5 == 0)
    (0 /: divisible)(_ + _)
  }

  // Literal map-reduce?
  def secondSoln = {
    val divLT1K = 1.to(999).map(x => if (x % 3 == 0 || x % 5 == 0) x else 0)
    divLT1K.sum
  }

  // Now with for-comprehensions
  def thirdSoln = {
    val comprehended = for(x <- 1 to 999; if x % 3 == 0 || x % 5 == 0) yield x
    comprehended.sum
  }

  def main = Console.println(firstSoln)

}
