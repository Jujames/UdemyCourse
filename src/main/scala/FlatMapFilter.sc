val fileSizes = Seq(1024, 2048, 50, 692, 6400)

fileSizes.foreach { fileSize => println(fileSize) }

var fileSizeSum = 0

fileSizes.foreach { fileSize => fileSizeSum += fileSize }

fileSizeSum

var doubleFileSizes = Seq[Int]()

fileSizes.foreach { fileSize => doubleFileSizes :+= (fileSize * 2) }

doubleFileSizes

fileSizes.map {fileSize => fileSize * 2}


fileSizes.map {fileSize => s"This file is ${fileSize} bytes."}

fileSizes.filter {fileSize => fileSize >= 1024}

fileSizes.map(_ * 2)

fileSizes.filter(_ >= 1024)

fileSizes.find(_ >= 1024)

fileSizes.find(_ >= 10024)

fileSizes.find(_ >= 10024) orElse fileSizes.find(_ >= 2048)

fileSizes.find(_ >= 3000) orElse fileSizes.find(_ >= 2048)

fileSizes.map {fileSize =>
  if (fileSize > 1024) {
    s"This file is ${fileSize / 1024.0}KB."
  } else if (fileSize < 1024) {
    s"This File is ${fileSize} bytes."
  } else {
    s"This file is ------- really big."
  }
}

fileSizes.map {
  case kiloBytes if kiloBytes >= 1024 =>
    s"This file is ${kiloBytes / 1024.0}KB."
  case bytes if bytes < 1024 =>
    s"This file is $bytes bytes."
}

fileSizes.map {
  case kiloBytes if kiloBytes >= 1024 || kiloBytes <= 10024 =>
    s"This file is ${kiloBytes / 1024.0}KB."
  case bytes if bytes < 1024 =>
    s"This file is $bytes bytes."
}

fileSizes.map {
  case kiloBytes if kiloBytes >= 1024 && kiloBytes <= 10024 =>
    s"This file is ${kiloBytes / 1024.0}KB."
  case bytes if bytes < 1024 =>
    s"This file is $bytes bytes."
}

