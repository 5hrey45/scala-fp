package lectures.part1basics

object Functions extends App {
  def func(a: String, b: Int): String = {
    a + " " + b
  }

  println(func("hello", 99))

  def paramLessFunc(): Int = 42

  println(paramLessFunc())

  def aRepeatedFunc(s: String, n: Int): String = {
    if (n == 1) s
    else s + aRepeatedFunc(s, n - 1)
  }

  println(aRepeatedFunc("abc", 3))

  def sideEffectFunc(s: String): Unit = println(s)

  def bigFunc(n: Int): Int = {
    def smallFunc(a: Int, b: Int): Int = a + b

    smallFunc(n, n - 1)
  }

  println(bigFunc(5))

  def greet(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(greet("Shreyas", 22))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(10))

  def fibbonacci(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else fibbonacci(n - 1) + fibbonacci(n - 2)
  }

  println(fibbonacci(20))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
