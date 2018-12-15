package Util

import org.scalatest.{FlatSpec, Matchers}

class CalcAvgScoreTest extends  FlatSpec with Matchers {

  behavior of "calcSentimentFromSearchApi"

  it should "stock of amazon" in {
    CalcAvgScore.calcSentiment("Amazon.com Inc",1,false) shouldBe 1.0 +- 2.5
  }

  it should "stock of apple" in {
    CalcAvgScore.calcSentiment("Apple Inc",1,false) shouldBe 1.0 +- 2.5
  }

  it should "stock of google" in {
    CalcAvgScore.calcSentiment("Alphabet Inc",1,false) shouldBe 1.0 +- 2.5
  }

  it should "stock of microsoft" in {
    CalcAvgScore.calcSentiment("Microsoft Corporation",1,false) shouldBe 1.0 +- 2.5
  }

  it should "stock of facebook" in {
    CalcAvgScore.calcSentiment("Facebook Inc",1,false) shouldBe 1.0 +- 2.5
  }

}
