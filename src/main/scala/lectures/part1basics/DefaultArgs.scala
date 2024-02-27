package lectures.part1basics

object DefaultArgs extends App {

  def tailFact(n: Int, accm: Int = 1): Int = {
    if (n <= 1) accm
    else tailFact(n - 1, n * accm)
  }

  println(tailFact(5))
}
