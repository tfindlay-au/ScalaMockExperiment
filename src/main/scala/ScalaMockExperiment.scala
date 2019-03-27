
object ScalaMockExperiment {
  def main(args: Array[String]): Unit = {
    println(doSomething(input = true, new MessageWrapper))
  }

  def doSomething(input: Boolean, method: MessageWrapper): String = {
    if(input) {
      method.getMessage
    } else {
      "Goodbye World"
    }
  }
}