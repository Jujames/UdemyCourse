class Family(name: String, peopleNames: Seq[String])

new Family("Salazar", Seq("Antonio", "Cleo"))
res0

class Family(val name: String, val peopleNames: Seq[String])

new Family("Salazar", Seq("Antonio", "Cleo"))

res2.name
res2.peopleNames

class Family(val name: String, private val peopleNames: Seq[String])

new Family("Salazar", Seq("Antonio", "Cleo"))

res5.name
// res5.peopleNames <------------ Can't do because variable are private.

class Family(name: String, peopleNames: Seq[String]) {
  def description: String = name + "[" + peopleNames.mkString(",") + "]"
}
new Family("Salazar", Seq("Antonio", "Cleo"))

//res9.description

class Family(name: String, peopleNames: Seq[String]) {
  private def description: String = name + "[" + peopleNames.mkString(",") + "]"
}
new Family("Salazar", Seq("Antonio", "Cleo"))

// res12.description

class Family(name: String, peopleNames: Seq[String]) {
    private var descriptionCalls: Int = 0
    def description: String = {
      descriptionCalls += 1
      s"$name[${peopleNames.mkString(",")}]: $descriptionCalls"
    }
}

new Family("Salazar", Seq("Antonio", "Cleo"))

res9.description
res9.description
res9.description

class Family(name: String, peopleNames: Seq[String]) {
  private var descriptionCalls: Int = 0
  val description: String = {
    descriptionCalls += 1
    s"$name[${peopleNames.mkString(",")}]: $descriptionCalls"
  }
}
new Family("Salazar", Seq("Antonio", "Cleo"))

//res14.description
//res14.description

class ModernFamily(name: String, peopleNames: Seq[String])  extends  Family(name, peopleNames) {
  def modernDescription = description.replaceAll("e", "3")
  private[this] val thing = "hello"
}

new ModernFamily("Salazar", Seq("Antonio", "Cleo"))
/*
res15.description
res15.description

res15.modernDescription
res15.modernDescription
*/
abstract class Family(name: String, peopleNames: Seq[String]) {
  private var descriptionCalls: Int = 0
  protected val description: String = {
    descriptionCalls += 1
    s"$name[${peopleNames.mkString(",")}]: $descriptionCalls"
  }
}

trait Nameable {
  def name: String
}

 class ModernFamily(val name: String, peopleNames: Seq[String])  extends  Family(name, peopleNames) with Nameable {
  def modernDescription = description.replaceAll("e", "3")
}
new ModernFamily("Salazar", Seq("Antonio", "Cleo"))
// res15.description
res15.modernDescription

class Person(val name: String, age: Int) extends Nameable

new Person("Antonio", 39)

res17.name
new ModernFamily("Salazar", Seq("Antonio", "Cleo"))
res19.name

val myNameable: Nameable = res19

myNameable.name

val myNameable = res19




















































