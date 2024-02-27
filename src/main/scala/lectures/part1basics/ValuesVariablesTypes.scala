package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  // vals are immutable
//  x = 2 - does not compile

  val y = 25  // type inference
  println(y)

  var num = 10  // variables
  println(num)
  num = 20
  println(num)
}
