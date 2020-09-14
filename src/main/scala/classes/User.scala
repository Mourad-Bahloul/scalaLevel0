package classes

class User(val name: String, var age: Int, private var interest: String){

  // auxiliary constructors
  def this ( name: String) {
    this(name, 30, "nothing")
  }

  def this ( name: String, interest: String) {
    this(name, 30, interest)
  }

  def showInterest() {
    println(interest)
  }

  def showUser(): Unit = {
    println(name + " is " + age + " and (s)he likes " + interest)
  }
};

object Runner {
  def main(args: Array[String]): Unit = {
    var user = new User("max", 33, "tennis")

    println(user.name + ": " + user.age) // we can read public var and val
    user.age = 50 // age is public var, we can modify it
    // user.name = "Tom" // cant't do this because name is val
    user.showUser()
    // println(user.interest) // can't do this because interest is private
    user.showInterest()

    // test auxiliary constructors
    val bob = new User("bob")
    bob.showUser()

    val max = new User("max", "running")
    max.showUser()

  }
}
