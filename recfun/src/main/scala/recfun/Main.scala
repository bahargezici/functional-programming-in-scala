package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if(c == 0 || c == r) 1
      else factorial(r) / ( factorial(c) * factorial(r-c))

    def factorial(n: Int):Int =
      if(n == 0) 1 else n * factorial(n - 1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def a = 0
      def loop(chars: List[Char]): Int = {
        if (!chars.isEmpty) {
          if (a < 0) return -1
          if (chars.tail == '(') a + 1
          if (chars.tail == ')') a - 1
          else return loop(chars.tail)
        }
        loop(chars)
      }
      if (a == 0) true else false
    }
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      def loop(x: Int, y: List[Int]): Int = {
        if (y.isEmpty) {
          0
        }
        else if (x - y.head< 0) {
          0
        }
        else if (x - y.head == 0) {
          1
        }
        else {
          countChange(x-y.head,y)+countChange(x,y.tail)
        }
      }
      loop(money, coins.sorted)
    }
}