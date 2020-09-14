package classes

class Parent(firstname: String, lastname: String) {
  var firstName: String = firstname
  var lastName: String = lastname

  def getName(): String = firstName + " " + lastName
}

class Son(fn: String, ln: String, var age: Int) extends Parent(fn, ln) {

  def showInfo(): Unit = {
    println(f"$firstName%s $lastName%s is $age%d")
  }
//var age: Int;
}

object Inheritance {

  def main(args: Array[String]): Unit = {
    val son = new Son("tom", "hanks", 30)
    println("son name is " + son.getName())
    son.showInfo()
  }

}
