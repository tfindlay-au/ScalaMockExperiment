
object ScalaMockExperiment {

  /**
    * Main program
    * @param args Input arguments
    */
  def main(args: Array[String]): Unit = {
    println(doSomething(input = true, MessageWrapper))
  }

  /**
    * doSomething() applies some logic based on input and may invoke getMessage from a MessageWrapper
    * @param input value to be inspected/tested
    * @param method code to be conditionally executed
    * @return String value to be printed
    */
  def doSomething(input: Boolean, method: MessageWrapper): String = {
    if(input) {
      method.getMessage
    } else {
      "Goodbye World"
    }
  }
}