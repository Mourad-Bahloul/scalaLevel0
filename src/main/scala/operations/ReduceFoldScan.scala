package operations

object ReduceFoldScan {

  val myList = List(1, 2, 3, 5, 7)
  val myLetters = List("A", "B", "C")

  def main(args: Array[String]): Unit = {

    println(myLetters.reduceLeft(_ + _))
    println(myLetters.reduceLeft((x, y) => x + y)) // same
    println(myList.reduceLeft(_ + _)) // sum elements

    println("--------------------------------------------")
    println(myLetters.reduceRight(_ + _))
    println(myList.reduceRight((x, y) => {
      println(x + " - " + y + " = " + (x - y));
      x - y
    }))
    println(myList.reduceRight(_ - _)) // same without printing

    println("--------------------------------------------")
    // fold
    println(myList.fold(100)((x, y) => {
      println(x + " + " + y + " = " + (x + y));
      x + y
    }))
    println(myList.foldLeft(100)(_ + _)) // same without printing

    println("--------------------------------------------")
    println(myLetters.foldRight("Z")(_ + _)) // ABCZ
    println(myLetters.fold("Z")(_ + _))      // ZABC
    println(myLetters.foldLeft("Z")(_ + _))  // ZABC

    println("--------------------------------------------")
    // scan is same as fold, but gives the "map"
    // (i.e. the details) of the operations in a list
    println(myList.scanLeft(100)(_ + _)) // List(100, 101, 103, 106, 111, 118)
    println(myLetters.scanLeft("Z")(_ + _)) // List(Z, ZA, ZAB, ZABC)

  }

}
