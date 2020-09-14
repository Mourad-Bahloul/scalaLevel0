package classes

trait Speaker {
  def speak(): String
}

trait TailWagger {
  def startTail(): Unit
  def stopTail(): Unit
}

trait LocalRunner {
  def startRunning(): Unit
  def stopRunning(): Unit
}

class Dog extends Speaker with TailWagger with LocalRunner {

  // Speaker
  def speak(): String = "Woof!"

  // TailWagger
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")

  // Runner
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")
}

object Interfaces {

  def main(args: Array[String]): Unit = {

    val speaker: Speaker = new Dog()
    println(speaker.speak())
    // speaker.startRunning() // generates an error because Speaker doesn't have startRunning method

    println("--------------------------------------------")

    val dog : Dog = new Dog()
    println(dog.speak())
    dog.startRunning()
    dog.startTail()

  }

}
