def add(first: Int, second: Int): Int = {
  first + second
}
add(5, 5)

def add(first: Int, second: Int, third: Int): Int = {
  first + second + third
}

def add(first: Int, second: Int, third: Int): Int = {
  println("Hello")
  first + second + third
}
add(1, 2, 3)

def addMany(numbers: Int*): Int = {
  numbers.reduce(_ + _)
}
addMany(1, 2, 3)
addMany(1, 2, 3, 4, 5)

def describeNumberOfBits(number: Int): String = {
  if (number < 4) {
    "bit"
  } else if (number < 8) {
    "nibble"
  } else if (number < 1023) {
    "byte"
  } else {
    "manybyte"
  }
}
describeNumberOfBits(3)
describeNumberOfBits(8)
describeNumberOfBits(7)
describeNumberOfBits(1024)

/** Using Match Statements */

def describedNumberOfBits(number: Int): String = {
  number match {
    case bit if bit < 4 => "bit"
    case nibble if nibble < 8 => "nibble"
    case byte if byte < 1023 => "byte"
    case _ => "manybyte"
  }
}

describeNumberOfBits(3)
describeNumberOfBits(8)
describeNumberOfBits(7)
describeNumberOfBits(1024)


