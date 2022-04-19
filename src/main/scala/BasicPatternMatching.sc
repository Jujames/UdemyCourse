val person: (String, Int) = ("John",25)

person match {
  case  (name, age) => s"$name is $age years old!"
}

person match {
  case  (name, age) => s"$name is ${age + 2} years old!"
}

def describeAge(maybeAge: Option[Int]): String = {
  maybeAge match {
    case None =>
      s"I don't know your age!"
    case Some(age) =>
      s"You are ${age} years old"
  }
}
describeAge(None)
describeAge(Some(5))

def describeAge(maybeAge: Option[Int]): String = {
  maybeAge match {
    case None =>
      s"I don't know your age!"
    case Some(age) =>
      if (age < 10) {
        s"You are a young ${age} years old!"
      } else if (age < 25) {
        s"You are still learning at $age years old!"
      } else {
        s"You are a mature $age years old!"
      }
   }
 }

describeAge(None)
describeAge(Some(8))
describeAge(Some(12))
describeAge(Some(25))


def describeAge(maybeAge: Option[Int]): String = {
  maybeAge match {
    case None =>
      s"I don't know your age!"
    case Some(age) if (age < 10) =>
        s"You are a young ${age} years old!"
    case Some(age) if age < 25 =>
        s"You are still learning at $age years old!"
    case Some(age) =>
        s"You are a mature $age years old!"
    }
 }

describeAge(None)
describeAge(Some(8))
describeAge(Some(12))
describeAge(Some(25))


def describeAge(maybeAge: Option[Int]): String = {
  maybeAge match {
    case None =>
      s"I don't know your age!"
    case Some(age) if age < 25 =>
      s"You are still learning at $age years old!"
    case Some(age) if (age < 10) =>
      s"You are a young ${age} years old!"
    case Some(age) =>
      s"You are a mature $age years old!"
  }
}

describeAge(Some(8))

def describePerson(person: (String, Option[Int])): String = {
  person match {
    case (name, age) =>
      s"$name: ${describeAge(age)}"
  }
}

describePerson("Layla", None)
describePerson("Layla", Some(25))

def describePerson(person: (String, Option[Int])): String = {
  person match {
    case (name, age) =>
      val ageDescription =
      age match {
        case None =>
          s"I don't know your age!"
        case Some(age) if age < 25 =>
          s"You are still learning at $age years old!"
        case Some(age) if (age < 10) =>
          s"You are a young ${age} years old!"
        case Some(age) =>
          s"You are a mature $age years old!"
      }
    s"$name: $ageDescription"
  }
}

describePerson("Layla", Some(25))
describePerson("Layla", None)



def describePerson(person: (String, Option[Int])): String = {
  person match {
    case (name, None) =>
      s"$name has no age."
    case (name, Some(age)) if age < 10 =>
      s"$name is a young $age years old!"
    case (name, Some(age)) if age < 25 =>
      s"$name is still learning at $age years old!"
    case (name, Some(age)) =>
      s"$name is a mature $age years old!"
  }
}

describePerson("Layla", None)
describePerson("Layla", Some(8))
describePerson("Layla", Some(13))
describePerson("Layla", Some(25))


def describePerson(person: (String, Option[Int])): String = {
  person match {
    case (name, None) =>
      s"$name has no age."
    case (name, Some(age)) if age == 5 || age  == 8 =>
      s"$name is particularly precocious age at $age."
    case (name, Some(age)) if age < 10 =>
      s"$name is a young $age years old!"
    case (name, Some(age)) if age < 25 =>
      s"$name is still learning at $age years old!"
    case (name, Some(age)) =>
      s"$name is a mature $age years old!"
  }
}

describePerson("Layla", Some(5))
describePerson("Layla", Some(6))

def describePerson(person: (String, Option[Int])): String = {
  person match {
    case (name, None) =>
      s"$name has no age."
    case (name, Some(5 | 8)) =>
      s"$name is particularly precocious age at 5."
    case (name, Some(age)) if age < 10 =>
      s"$name is a young $age years old!"
    case (name, Some(age)) if age < 25 =>
      s"$name is still learning at $age years old!"
    case (name, Some(age)) =>
      s"$name is a mature $age years old!"
  }
}

describePerson("Layla", Some(5))
describePerson("Layla", Some(6))
describePerson("Layla", Some(7))
describePerson("Layla", Some(8))


def describePerson(person: (String, Option[Int])): String = {
  person match {
    case (name, None) =>
      s"$name has no age."
    case (name, Some(age @ (5 | 8))) =>
      s"$name is particularly precocious age at $age."
    case (name, Some(age)) if age < 10 =>
      s"$name is a young $age years old!"
    case (name, Some(age)) if age < 25 =>
      s"$name is still learning at $age years old!"
    case (name, Some(age)) =>
      s"$name is a mature $age years old!"
  }
}

describePerson("Layla", Some(5))
describePerson("Layla", Some(6))
describePerson("Layla", Some(7))
describePerson("Layla", Some(8))
