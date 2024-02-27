package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"
  println(str.charAt(4))
  println(str.substring(7))
  println(str.substring(7, 11)) // ending index is exclusive
  println(str.split(" ").toList) // split returns array, need to convert to list for readability
  println(str.startsWith("Hello"))
  println(str.endsWith("Scala"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumStr = "45"
  val aNum = aNumStr.toInt
  println("a" + aNumStr + "z")
  println('a' + aNumStr + 'z')
  println('a' +: aNumStr :+ 'z') // +: prepending :+ appending
  println(str.reverse)
  println(str.take(5))
  println(str.takeRight(5))

  // Scala specific: String interpolators

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name, and I'm $age years old"

  val anotherGreeting = s"Hello, my name is $name and next year, I will be ${age + 1} years old"

  println(greeting)
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"

  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")  // injected variables do get escaped

}
