package types


object Sets {
  val mySet: Set[Int] = Set(10, 2, 3, 2, 5, 4, 4);
  val names: Set[String] = Set("max", "tom", "joe", "joe");

  def main(args: Array[String]): Unit = {
    println(mySet)
    println(mySet + 34)
    println(names)

    println("--------------------------------------------")
    // check if an element is in the set :
    println(mySet(8)); // should be false
    println(mySet(3)); // should be true
    println(names("max")); // should be true

    println("--------------------------------------------")
    println(mySet.head)
    println(mySet.tail)
    println(mySet.isEmpty)

    println("--------------------------------------------")
    // merge sets
    println(mySet ++ names)
    println(mySet.++(names))

    println("--------------------------------------------")
    // intersection between sets
    val myOddSet: Set[Int] = Set(2, 3, 5);
    println(mySet.&(myOddSet))
    println(mySet.intersect(myOddSet))

    println("--------------------------------------------")
    // min and max
    println(mySet.min)
    println(mySet.max)

    println("--------------------------------------------")
    // loop
    for (name <- names) {
      println(name)
    }

  }

}
