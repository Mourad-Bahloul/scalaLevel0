/** *
 * A Closure is a function that uses one or more
 * variables declared outside it => global variables
 */
object ClosureSamples {

  var number = 29;

  val addClosure = (x: Int) => {
    number = x + number;
    number;
  }

  def main(args: Array[String]): Unit = {
    println("Hello ")
    println(addClosure(30))
    println(addClosure(30))
  }
}
