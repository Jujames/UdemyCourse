None
Some("friends")
val myClosestAlly: Option[String] = None
val myClosestAlly: Option[String] = Some("friends")
val myClosestAlly: String = null
val MyClosestAlly: String = "friend"


val myClosestAlly: Option[String] = Some("friend")

myClosestAlly match {
  case Some(person) => println("I love " + person)
  case None => println("No one came to see me.")
}
val myClosestAlly: Option[String] = None

myClosestAlly match {
  case Some(person) => println("I love " + person)
  case None => println("No one came to see me.")
}

val myClosestFamilyMember: Option[String] = None
val myClosestFriend: Option[String] = None
val myFavoritePet: Option[String] = None

val myDanceFriend: Option[String] = myClosestAlly orElse myClosestFamilyMember orElse myClosestFriend orElse myFavoritePet

val myClosestAlly: Option[String] = None
val myFavoritePet: Option[String] = Some("Santiago")

val myDanceFriend: Option[String] = myClosestAlly orElse myClosestFamilyMember orElse myClosestFriend orElse myFavoritePet


val myDanceFriend: String = myClosestAlly orElse myClosestFamilyMember orElse myClosestFriend orElse myFavoritePet getOrElse ""
