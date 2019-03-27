/**
  * This trait defines things that a MessageWrapper should have
  */
trait MessageWrapper {
  // A MessageWrapper object should implement a getMessage method
  def getMessage: String
}

/**
  * This companion object provides and implementation of the Trait above
  */
object MessageWrapper extends MessageWrapper {
  def getMessage: String = {
    "Hello World"
  }
}
