package lectures.part2oop

import scala.language.postfixOps
object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! :String = s"$name, what the heck?"

    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent to above method invocation
  // infix notation or operator notation

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)

  println(1 + 2)
  println(1.+(2)) // equivalent to above loc

  // ALL OPERATORS ARE METHODS

  // prefix notation
  val x = -1  // equivalent to 1.unary_-
  val y = 1.unary_-
  // unary_prefix only works with + - ~ !

  println(!mary)
  println(mary.unary_!)

  // postfix notation (only available to methods without parameters
  println(mary.isAlive)
  println(mary isAlive) // needs an import in recent scala versions, see above

  // apply  note that we need parenthesis on method apply definition
  println(mary.apply())
  println(mary()) // we can sort of call the object like a function, invokes apply() method

}
