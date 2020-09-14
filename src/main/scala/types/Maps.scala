package types

object Maps {

  val myMap: Map[Int, String] = Map(100 -> "max", 101 -> "tom", 102 -> "joe")

  def main(args: Array[String]): Unit = {

    println(myMap)
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)
    println(myMap.size)

    println("--------------------------------------------")
    // check for elements
    println(myMap.contains(101))
    println(myMap(101))
    // println(myMap(201)) // => gives an exception because 201 isn't a valid key

    println("--------------------------------------------")
    // loop
    myMap.keys.foreach { key =>
      print("key: " + key);
      println(", value: " + myMap(key));
    }

    println("--------------------------------------------")
    // concat maps
    val tmpMap: Map[Int, String] = Map(103 -> "julia")
    println(myMap ++ tmpMap)

  }
}
