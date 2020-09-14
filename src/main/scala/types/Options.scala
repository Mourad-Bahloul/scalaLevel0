package types

/**
 * Options can have two values (Some or None)
 */
object Options {

  val myList = List(2, 4, 6)
  val myMap = Map(1 -> "hi", 2 -> "max", 3 -> "good")

  def main(args: Array[String]): Unit = {
    println("--------------------------------------------")
    println(myList.find(_ > 10)) // gives "None"
    println(myList.find(_ > 3)) // gives "Some(4)"

    println(myMap.get(2)) // gives "Some(max)"
    println(myMap.get(4)) // gives "None

    println("--------------------------------------------")
    // use "get" to get the value of "Some" Optional
    println(myMap.get(2).get) // gives max

    println("--------------------------------------------")
    // avoid exceptions:
    println(myMap.get(3).getOrElse("No name found")) // gives "good"
    println(myMap.get(5).getOrElse("No name found")) // gives "No name found"

    println("--------------------------------------------")
    // define a new option:
    val myOptional: Option[Int] = None;
    println(myOptional.isEmpty) // gives true
  }

}
