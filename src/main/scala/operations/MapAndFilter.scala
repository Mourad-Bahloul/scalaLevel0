package operations

object MapAndFilter {

  val myList = List(2, 3, 5, 7);
  val myMap = Map(1 -> "tom", 2 -> "max", 3 -> "joe")

  def main(args: Array[String]): Unit = {

    println("hello".map(_.toUpper))

    println("--------------------------------------------")
    println(myList.map(_ * 2))
    println(myList.map(x => x * 2)) // same as previous line

    println("--------------------------------------------")
    println(myList.map(x => "hi " + x))
    println(myList.map(x => "hi" * x)) // prints List(hihi, hihihi, hihihihihi, hihihihihihihi)

    println("--------------------------------------------")
    println(myMap.map(x => "hi" + x)) // prints List(hi(1,tom), hi(2,max), hi(3,joe))

    println("--------------------------------------------")
    println(myMap.view.mapValues(x => "hi " + x).toMap) // prints Map(1 -> hi tom, 2 -> hi max, 3 -> hi joe)

    println("--------------------------------------------")
    println(List(List(1, 2, 3), List(3, 4, 5)))
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten) // prints a unique list

    println("--------------------------------------------")
    println(myList.flatMap(x => List(x, x + 3))) // List(2,5,  3,6, 5, 8, 7, 10)
    println(myList.map(x => List(x, x + 3))) // List(List(2, 5), List(3, 6), List(5, 8), List(7, 10))

    println("--------------------------------------------")
    println(myList.filter(x => x % 2 != 0)) // odd elements only: List(3, 5, 7)

  }

}
