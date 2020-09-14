package types

object Lists {

  val myList: List[Int] = List(10, 2, 3, 4, 5, 6, 4);
  val names: List[String] = List("max", "tom", "joe");

  def main(args: Array[String]): Unit = {
    // print myList and names
    println(myList)
    println(names)

    println("--------------------------------------------")

    // print myList with a new beginning
    print("unshifted: ")
    println("nice" + 0 :: myList)

    println("--------------------------------------------")

    // print a custom list
    println(1 :: 3 :: Nil)
    println(List.fill(5)(2)) // 5 2s

    println("--------------------------------------------")

    // print the head, the tail of a list and other utilities
    println(myList.head)
    println(names.tail)
    println(names.isEmpty)
    println(names.reverse)

    println("--------------------------------------------")
    // loop over lists
    myList.foreach(println)

    var sum : Int = 0
    myList.foreach(sum += _)
    println("sum = " + sum)

    for(name <- names){
      println(name)
    }

  }
}
