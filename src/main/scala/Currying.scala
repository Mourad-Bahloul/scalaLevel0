/**
 * Currying is the process of transforming a single function with multiple arguments
 * into a sequence of functions with one argument each.
 */
object Currying {

  def add(x: Int, y: Int) = x + y;

  def curriedAdd(x: Int) = (y: Int) => x + y;

  def curriedEasily(x: Int)(y: Int) = x + y;

  def main(args: Array[String]): Unit = {
    println(add(10, 5));

    println("--------------------------------------------")

    println(curriedAdd(30)(40));
    val add40 = curriedAdd(40);
    println(add40(60));

    println("--------------------------------------------")

    println(curriedEasily(100)(50));
    val add50 = curriedEasily(50) _;
    println(add50(200))

  }
}
