package lectures.part1basics

object Expressions extends App {
  var condition = true
  println(if (condition) 5 else 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  var aVariable = 5
  val aWeirdValue = (aVariable = 3) // unit = void
  val apr = println(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (y > 2) "hello" else 99
  }

  println(aCodeBlock)
}
