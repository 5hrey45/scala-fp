package lectures.part1basics

object CallByNameValue extends App {

  var x = 50

  def valFunc(n: Int): Unit = {
    println("by value " + n)
    x = 100
    println("by value " + n)
  }

  def nameFunc(n: => Int): Unit = {
    println("by name " + n)
    x = 1000
    println("by name " + n)
  }

  valFunc(x)
  nameFunc(x)

  def t1(t: Long): Unit = {
    println("val " + t)
    println("val " + t)
  }

  def t2(t: => Long): Unit = {
    println("name " + t)
    println("name " + t)
  }

  t1(System.nanoTime())
  t2(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(a: Int, b: => Int) = println(a)

  printFirst(34, infinite())
}
