package lectures.part2oop

object Inheritance extends App {

  sealed class Animal {
    val creatureType = "wild"
    def eat(): Unit = println("nomnomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat()
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    // we can also override a field directly in the constructor
    //    override val creatureType: String = "domestic"
    override def eat(): Unit = {
      super.eat()
      println("Dog is eating")
    }
  }
  val dog = new Dog("domestic")
  dog.eat()
  println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat() // even though the type of unknownAnimal is Animal, it uses the overridden
  // method of dog (always uses the most specific method available)

  // super
  // used to access fields and methods of superclass inside a subclass

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on the super class (prevents it from extending - illegal inheritance error)
  // 3 - seal the class (keyword sealed)
  // this allows to extend classes in THIS FILE, but extending on other files is illegal

}