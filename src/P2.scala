import scala.annotation.tailrec

object P2 {

  @tailrec
  def fib(sum: Long, prevFib1: Long, prevFib2: Long): Long = {
    if (prevFib2 > 4000000) {
      sum
    } else {
      val newSum = if (prevFib2 % 2 == 0) sum + prevFib2 else sum
      val newFib1 = prevFib2
      val newFib2 = prevFib1 + prevFib2
      fib(newSum, newFib1, newFib2)
    }
  }


  def main(args: Array[String]): Unit = {
    println(fib(0, 0, 1))
  }

}
