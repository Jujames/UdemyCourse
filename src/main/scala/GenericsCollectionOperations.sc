val numbers = Seq(1, 2, 3, 4, 5)

numbers.reduce { (a, b) => a + b}

numbers.reduce { (a, b) => println(a + ", " + b); a + b }

// numbers.reduce(_ + " , " + _)

numbers.foldLeft("") { (accumulator, number) => accumulator + " , " + number}

numbers.foldLeft("") { (accumulator, number) => println(accumulator); accumulator + " , " + number}

numbers.foldLeft("")(_ + " , " + _)

numbers.foldLeft(0)(_ + _)

numbers.foldLeft(Seq[Int] ())(_ :+ _)

numbers.foldLeft(Seq[Int] ()) { (sums: Seq[Int], number: Int) =>
  val latestSum = sums.lastOption getOrElse 0
  sums :+ (latestSum + number)
}

case class Person(name: String, age: Int)

case class Family(people: Seq[Person])

val antonio = Person("Antonio", 40)

val mary = Person("Mary", 40)

val cleo = Person("Cleo", 16)

val santiago = Person("Santiago", 12)

val family = Family(Seq(antonio, mary, cleo, santiago))

val familyVersions = family.people.foldLeft(Seq[Family] ()) { (versions, person) =>
  val latestVersion = versions.lastOption
  val latestPeople = latestVersion.map(_.people) getOrElse Seq[Person]()
  versions :+ Family(latestPeople :+ person)
}

numbers.foldRight(0)(_ + _)

// numbers.foldRight(Seq[Int]())(_ :+ _)
numbers.foldRight(Seq[Int]()) { (number: Int, accumulator: Seq[Int]) => accumulator :+ number}
numbers.foldRight(Seq[Int]())(_ +: _)
numbers.foldRight(Seq[Int]()) { (number: Int, accumulator: Seq[Int]) => println(accumulator); number +: accumulator}




