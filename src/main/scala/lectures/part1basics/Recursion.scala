package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): BigInt = {
    if (n <= 1) 1
    else {
      println("To print the fact of " + n + " we need the fact of " + (n - 1))
      var result = n * factorial(n - 1)
      println("computed fact of n")
      result
    }
  }

//  println(factorial(50000))

  def tailFact(n: Int): BigInt = {
    @tailrec  // checks whether the function is tail recursive, if not returns error
    def helper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else helper(x-1, x * accumulator)
    }

    helper(n, 1)
  }

//  println(tailFact(50))

  def concatStr(s: String, n: Int): String = {
    @tailrec
    def helper(str: String, accm: String, x: Int): String = {
      if (x == 1) accm
      else helper(str, s + accm, x - 1)
    }

    helper(s, s, n)
  }
  println(concatStr("hello", 3))

  def fibonacci(n: Int): Int = {
    @tailrec
    def helper(x: Int, last: Int, nextToLast: Int): Int = {
      if (x >= n) last
      else helper(x + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else helper(2, 1, 1)

  }

  println(fibonacci(8))
}
