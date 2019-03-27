import org.scalamock.scalatest.MockFactory
import org.scalatest.{FlatSpec, Matchers}

class ScalaMockExperimentTest extends FlatSpec with Matchers with MockFactory {

  "ScalaMockExperiment.doSomething(false)" should "return Goodbye World" in {
    val defaultWrapper = new MessageWrapper
    val result = ScalaMockExperiment.doSomething(input = false, defaultWrapper)
    result shouldBe "Goodbye World"
  }

  "ScalaMockExperiment.doSomething(true)" should "return Foo Bar" in {
    val myMessageWrapper = stub[MessageWrapper]

    (myMessageWrapper.getMessage _).when().returns("Foo Bar")

    val result = ScalaMockExperiment.doSomething(input = true, myMessageWrapper)
    result shouldBe "Foo Bar"
  }
}
