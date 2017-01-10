/**
  * Created by twong on 1/6/17.
  */
object P1 {

  def isMultipleOf3Or5(n: Int): Boolean = {
    n%3 == 0 || n%5 == 0
  }

  def sumOfMultiples(n: Int): Int = {
    @annotation.tailrec
    def sum(n: Int, currentSum: Int): Int = {
      if (n == 0) currentSum
      else if (isMultipleOf3Or5(n)) sum(n-1, currentSum+n)
      else sum(n-1, currentSum)
    }
    sum(n-1, 0)
  }

  def main(args: Array[String]): Unit = {
    println(sumOfMultiples(1000))
  }
}
