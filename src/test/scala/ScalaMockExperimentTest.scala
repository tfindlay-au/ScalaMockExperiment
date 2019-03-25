import org.scalamock.scalatest.MockFactory
import org.scalatest.{FlatSpec, Matchers}

class ScalaMockExperimentTest extends FlatSpec with Matchers with MockFactory {

  "ScalaMockExperiment.doSomething(false)" should "return Goodbye World" in {
    val result = ScalaMockExperiment.doSomething(false)
    result shouldBe "Goodbye World"
  }

  "ScalaMockExperiment.doSomething(true)" should "return Foo Bar" in {
    val myMockTrait = mock[MyTrait]

    (myMockTrait.GetMessage _) expects() returns("Foo Bar")

    val result = ScalaMockExperiment.doSomething(true)
    result shouldBe "Foo Bar"
  }
}
