class Person(val name: String, val age: Int)
val aPerson = new Person("Antonio", 85)
aPerson.name
aPerson.age

/** A singleton is a special kind of class that only has one instance
 * and we never need to explicitly instantiate */
object People {
  var allPeople: Seq[Person] = Seq.empty
  def addPerson(person: Person) = {
    allPeople = allPeople :+ person
  }
}
People.allPeople
People.addPerson(aPerson)
People.allPeople

object Person {
  def apply(name: String): Person = new Person(name, 0)
  def withAge(person: Person, newAge: Int): Person = new Person(person.name, newAge)
}
Person
new Person("Person", 18)
res6.name
res6.age
Person("Baby")
res9.name
res9.age
Person.withAge(res6, 22)
res12
res6.name
res9.name
res6.age
res12.age

object Person {
  def apply(name: String): Person = {
    val person = new Person(name, 0)
    People.addPerson(person)
    person
  }
  def withAge(person: Person, newAge: Int): Person = {
    val updatePerson = new Person(person.name, newAge)
    People.addPerson(updatePerson)
    updatePerson
  }
}

Person("Antonio")
People.allPeople
People.allPeople.map(_.name)

object People {
  var allPeople: Seq[Person] = Seq.empty
  def addPerson(person: Person) = {
    allPeople = allPeople.filter(_.name != person.name) :+ person
  }
}
Person("Antonio")
People.allPeople.map(_.name)

object Person {
  def apply(name: String): Person = {
    val person = new Person(name, 0)
    People.addPerson(person)
    person
  }
  def withAge(person: Person, newAge: Int): Person = {
    val updatePerson = new Person(person.name, newAge)
    People.addPerson(updatePerson)
    updatePerson
  }
}
Person("Antonio")
People.allPeople.map(_.name)
Person("Antonio")
People.allPeople.map(_.name)
People.allPeople.map(_.age)
Person.withAge(res25, 5)
People.allPeople.map(_.name)
People.allPeople.map(_.age)















