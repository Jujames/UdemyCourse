val myList: List[Int] = List(1,2)

myList match {
  case List(a, b) =>
    a + b
}

val myList: List[Int] = 1 :: 2 :: Nil
val myList: List[Int] = 1 :: 2 :: 3 :: Nil
val myList: List[Int] = 1 :: 2 :: 3 :: 4 :: Nil

myList match {
  case a :: b :: rest =>
   println(rest); a + b
}

val myList: List[Int] = 1 :: 2 :: 3 :: Nil

myList match {
  case a :: _ :: b :: Nil =>
    a + b
}

myList match {
  case a :: _ :: b :: _ =>
    a + b
}

val mySeq: Seq[Int] = Seq(1,2)

mySeq match {
  case Seq(a, b) =>
    a + b
}

val mySeq: Seq[Int] = Seq(1, 2, 3, 4)

mySeq match {
  case Seq (a, b, c, d) =>
    println(c + ", " + d); a + b
}


mySeq match {
  case Seq(a, b, rest @ _*) =>
  a + b
}