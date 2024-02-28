package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)

  person.greeting("Daniel")
  person.greeting()


  val writer = new Writer("shreyas", "ss", 22)
  println(writer.fullName())

  val novel = new Novel("Book1", 2020, writer)
  println(novel.authorAge())
  println(novel.isWrittenBy("shreyas ss"))
  println(novel.getYear())

  val newNovel = novel.copy(2024)
  println(newNovel.getYear())


  val counter = new Counter(10)
  println(counter.n)
  val ictr = counter.increment()
  println(ictr.n)
  val anotherIctr = counter.increment(5)
  println(anotherIctr.n)

  val dctr = counter.decrement()
  println(dctr.n)
  val anotherDctr = counter.decrement(5)
  println(anotherDctr.n)

}

// constructor
class Person(name: String, val age: Int) {  // use val or val to convert parameter to class field
  val x = 2
  println("hello from inside the class")

  def greeting(name: String): Unit = {
    println(s"${this.name} says: Hi, $name")
  }

  def greeting() = {
    println(s"Hi, I'm ${this.name}")
  }

  // another constructor
  def this(name: String) = this(name, 0)
}

class Writer(firstName: String, surName: String, year: Int) {

  val age = year
  def fullName(): String = {
    s"${this.firstName} ${this.surName}"
  }

}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge(): Int = {
    author.age
  }

  def isWrittenBy(name: String): Boolean = {
    if (author.fullName() == name) true
    else false
  }

  def copy(newYear: Int): Novel = {
    new Novel(this.name, newYear, this.author)
  }

  def getYear(): Int = yearOfRelease
}


class Counter(count: Int) {
  var n = count
  def getCount(): Int = n

//  def increment(i: Int = 1): Counter = {
//    n += i
//    new Counter(n)
//  }
//
//  def decrement(i: Int = 1): Counter = {
//    n -= i
//    new Counter(n)
//  }

  // instead of using default args, we can also overload the method (for practice)
  def increment(): Counter = {
    n += 1
    new Counter(n)
  }

  def decrement(): Counter = {
    n -= 1
    new Counter(n)
  }

  def increment(i: Int): Counter = {
    n += i
    new Counter(n)
  }

  def decrement(i: Int): Counter = {
    n -= i
    new Counter(n)
  }
}