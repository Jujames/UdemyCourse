case class Person(name: String, age: Int)

case class Family(people: Seq[Person])

val antonio = Person("Antonio", 40)

val mary = Person("Mary", 40)

val cleo = Person("Cleo", 16)

val santiago = Person("Santiago", 12)

val family1 = Family(Seq(antonio, mary, cleo, santiago))

val john = Person("John", 43)

val stacy = Person("Stacy", 42)

val brian = Person("Brian", 12)

val betty = Person("Betty", 21)

val louise = Person("Louise", 24)

val family2 = Family(Seq(john, stacy, brian, betty, louise))

val families = Seq(family1, family2)

family1.people.map(_.name)

family2.people.map(_.name)

families.map(_.people.map(_.name))

// flatten at the end to add two list together
families.map(_.people.map(_.name)).flatten

/** Or Use FlatMap */
families.flatMap(_.people.map(_.name))

families.flatMap(_.people.filter(_.age >= 18).map(_.name))

for {
  family <- families
  person <- family.people
  if person.age >= 25
} yield {
  person.name
}

for {
  family <- families
  person <- family.people.find(_.age >= 25)
} yield {
  person.name
}

for {
  oldFamily <- families.find(_.people.exists(_.age > 40))
  elder <- oldFamily.people.find(_.age > 40)
} yield {
  elder.name
}

// You have to add .toSeq or the complier is confused Found : Seq[String] and Option is required //
for {
  oldFamily <- families.find(_.people.exists(_.age > 40)).toSeq
  elder <- oldFamily.people
  if elder.age > 40
} yield {
  elder.name
}

for {
  family <- families
  person <- family.people
  canRentCar = person.age >= 25
  if canRentCar
} yield {
  person.name
}

for {
  family <- families
  person <- family.people
  isElder = person.age > 40
  if isElder
} yield {
  person.name
}

for {
  family <- families
  person <- family.people
  _ = println("Person is " + person)
  isElder = person.age > 40
  if isElder
} yield {
  person.name
}

for {
  family <- families
  _ = println("Family is " + family)
  person <- family.people
  _ = println("Person is " + person)
  isElder = person.age > 40
  if isElder
  _ = println("Elder is " + person)
} yield {
  person.name
}
