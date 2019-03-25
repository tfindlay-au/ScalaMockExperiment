
object ScalaMockExperiment extends MyTrait {
  def main(args: Array[String]): Unit = {
    println(doSomething(true))
  }

  def doSomething(input: Boolean): String = {
    if(input) {
      GetMessage()
    } else {
      "Goodbye World"
    }
  }
}