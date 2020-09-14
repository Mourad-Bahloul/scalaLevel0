package types

import Array._

object Arrays {
  val myArray1: Array[Int] = new Array[Int](4);
  val myArray2 = new Array[Boolean](5);
  val myArray3 = Array(1, 2, 3, 4, 5, 6, 8);

  def main(args: Array[String]): Unit = {
    myArray1(0) = 10;
    myArray1(1) = 20;
    myArray1(2) = 30;
    myArray1(3) = 40;

    // outputs the pointer adress :
    println(myArray1);

    println("--------------------------------------------")

    // loop
    for (x <- myArray1) {
      println(x)
    }

    println("--------------------------------------------")
    val bigArray = concat(myArray1, myArray3)
    for (i <- 0 to (bigArray.length - 1)) {
      println(i + " -> " + bigArray(i))
    }
  }

}
