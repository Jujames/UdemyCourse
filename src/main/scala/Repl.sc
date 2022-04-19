5
5 + 10
res0 + res1
println("hello")
()


def lambda = { x: Int => x + 1 }
def lambda2 = (x: Int) => x + 2
val lambda3 = (x: Int) => x + 3

val lambda4 = new Function1[Int, Int] {
  def apply(v1: Int): Int = v1 - 1
}

def lambda5(x: Int) = x + 1

val result = lambda(3)
val result1andhalf = lambda.apply(3)

val result2 = lambda2(3)
val result3 = lambda3(3)
val result4 = lambda4(3)
val result5 = lambda5(3)


def addWithSyntaxSugar(x: Int) = (y: Int) => x + y

addWithSyntaxSugar(1).isInstanceOf[Function1[Int, Int]]
addWithSyntaxSugar(2)(3)

def fiveAdder = addWithSyntaxSugar(5)
fiveAdder(5)



def makeUpper(xs: List[String]) =
  xs map {
    _.toUpperCase
  }

def makeWhatEverYouLike(xs: List[String], sideEffect: String => String) =
  xs map sideEffect

makeUpper(List("abc", "xyz", "123"))

makeWhatEverYouLike(List("ABC", "XYZ", "123"), x => x.toLowerCase)
//using it inline
val myName = (name: String) => s"My name is $name"
makeWhatEverYouLike(List("John", "Mark"), myName)

List("Scala", "Erlang", "Clojure") map (_.length)

def average(x: Int, xs: Int*): Double =
  (x :: xs.toList).sum.toDouble / (xs.size + 1)

average(1)
average(1, 2)
average(1, 2, 3)

type Result = Either[String, (Int, Int)]
def divide(dividend: Int, divisor: Int): Result =
  if (divisor == 0) Left("Division by zero")
  else Right((dividend / divisor, dividend % divisor))

divide(6, 4)
divide(2, 0)
divide(8, 4)

def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(x: Int, acc: Int): Int =
    if (x > b) acc
    else loop(x + 1, acc + f(x))
  loop(a, 9)
}
sum(x => x, 1, 9)


val number: Option[Int] = Some(3)
val noNumber: Option[Int] = None
val result1 = number.fold(1)(_ * 3)
val result2 = noNumber.fold(1)(_ * 3)