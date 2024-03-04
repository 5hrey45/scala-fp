package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract
  // classes which contain unimplemented/abstract fields or methods are called abstract classes

  abstract class Animal {
    // below is non abstract (implemented)
    val creatureType: String = "wild" // abstract class can have both abstract and non abstract types
    // below is abstract (not implemented)
    def eat(): Unit
  }

  // abstract classes cannot be instantiated (fields/methods are not implemented)
  class Dog extends Animal {
    override val creatureType: String = "canine"

    def eat(): Unit = println("dog is eating")  // override keyword is not mandatory, compiler will
    // figure it out (since no prior implementation to replace)
  }

  // traits
  trait Carnivore(val name: String) {
    def eat(animal: Animal): Unit // abstract member
    val preferredMeal = "meat"  // non abstract member
  }

  trait ColdBlooded // for example, we can mix in as many traits as we want
  class Crocodile extends Animal with Carnivore("coco") with ColdBlooded {
    override val creatureType: String = "croc"
    override def eat(): Unit = println("croc is eating")

    override def eat(animal: Animal): Unit = println(s"croc is eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile

  println(croc.creatureType)
  croc.eat()
  croc.eat(dog)
  println(croc.name)

  // traits vs abstract classes
  // both can have abstract and non abstract members
  // in Scala 3, traits can also have constructor parameters
  // 1 - multiple traits may be inherited by the same class
  // this means single class inheritance but multiple trait inheritence
  // 2 - traits = behavior, abstract class = thing


}
