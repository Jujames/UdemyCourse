/** - Why we use traits an what we are learning.
 * For multiple inheritance
 * Trait linearization
 * def versus val in traits
 */

trait Nameable {
  def name: String
}

trait Moveable {
  def moveTo(place: String): Unit
  def place: String
}

trait Placeable {
  def place: String
}

trait Moveable extends Placeable {
  def moveTo(place: String)
}

// class Person extends Nameable with Moveable
// class Person(val name: String, val place: String) extends Nameable with Moveable
class Person(val name: String, var place: String) extends Nameable with Moveable with Placeable {
  def moveTo(newPlace: String): Unit = {
    this.place = newPlace
  }
}
val aPerson = new Person("Antonio", "Canada")
aPerson.name
aPerson.place
aPerson.moveTo("Taiwan")
aPerson.place
aPerson.isInstanceOf[Placeable]

trait Movable {
  var placeCount = 0
  def incrementPlaceCount: Unit = placeCount += 1
  var place: String
  def moveTo(place: String) = this.place = place
}

class Person(val name: String, var place: String) extends Moveable {
 override def moveTo(newPlace: String): Unit = {
    this.place = newPlace
  }
}
val aPerson = new Person("Antonio", "Canada")
aPerson.name
aPerson.place
aPerson.moveTo("Taiwan")
aPerson.place
aPerson.isInstanceOf[Placeable]

trait Moveable {
  var placeCount = 0
  def incrementPlaceCount: Unit = placeCount += 1
  var place: String
  def moveTo(place: String)  = {
    this.place = place
    incrementPlaceCount
  }

  def latestPlace: String = s"$place @ $placeCount"
}
class Person(val name: String, var place: String) extends Moveable {
  override def moveTo(newPlace: String): Unit = {
    this.place = newPlace
  }
}
val aPerson = new Person("Antonio", "Canada")

aPerson.place
aPerson.latestPlace
aPerson.moveTo("Australia")
aPerson.latestPlace

class Person(val name: String, var place: String) extends Moveable {
  val aPerson = new Person("Antonio", "Canada")

  aPerson.moveTo("Australia")
  aPerson.latestPlace

  trait Placeable {
    def place: String
    var placeCount: Int
    def incrementPlaceCount: Unit = placeCount += 2
  }

  class Person(val name: String, var place: String) extends Moveable with Placeable {
    override def incrementPlaceCount: Unit = super.incrementPlaceCount
  }
}
val aPerson = new Person("Antonio", "Canada")

aPerson.moveTo("Australia")

aPerson.latestPlace










