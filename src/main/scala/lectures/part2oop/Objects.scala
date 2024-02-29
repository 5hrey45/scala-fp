package lectures.part2oop

object Objects {

  // Scala does not have class level functionality ("static")
  object Person {
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
//    def from(mother: Person, father: Person): Person = new Person("Bob")
    def apply(mother: Person, father: Person): Person = new Person("Bob")
    // conventionally, the factory method is called apply so that we can directly use the object
    // like function call - Person()
  }
  class Person(val name: String) {
    // instance level functionality

  }
  // COMPANION design pattern
  // Scala object is a singleton instance

  def main(args: Array[String]): Unit = {
    val mary = Person
    println (mary.N_EYES) // 2
    println (mary.canFly) // false

    val tom = Person // notice not new keyword for creating objects
    println (mary == tom) // true (since both are instances of the same Scala singleton object)

    val person1 = new Person ("P1")
    val person2 = new Person ("P2")
    println (person1 == person2) // false (since both of different instance of same class - normal OOP)

    //  val bob = Person.from(person1, person1)
    val bob = Person (person1, person2)

    // main method in Scala
    // def main(args: Array[String]): Unit
  }
}
