package types

/**
 * Tuples is a collection that can contain data of heterogeneous data types
 * nb: every entry in a map is a tuple
 */
object Tuples {

  val myTuple = (1, 3, "hi", true)
  val typedTuple = new Tuple3(2, false, "you")

  def main(args: Array[String]): Unit = {
    println(myTuple)
    println(typedTuple)

    println("--------------------------------------------")
    // print third element (first index is 1) :
    println(myTuple._3)

    println("--------------------------------------------")
    // loop
    myTuple.productIterator.foreach {
      i => println(i)
    }

    println("--------------------------------------------")
    // composite tuples :
    val compositeTuple = new Tuple3(7, true, ("inner tuple", "elements", 5))
    println(compositeTuple)
    println(compositeTuple._3._2) // gives "elements"

  }
}
