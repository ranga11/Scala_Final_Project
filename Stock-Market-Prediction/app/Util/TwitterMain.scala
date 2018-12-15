package Util

import Util.Timeseries.conf
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer
import org.apache.commons.io.IOUtils
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import com.github.nscala_time.time.Imports._
import com.github.nscala_time.time._
import org.apache.spark.SparkContext
import org.apache.spark.sql.{Row, SQLContext, SaveMode}
import org.apache.spark.sql.types.{DoubleType, StringType, StructField, StructType}




object TwitterMain {

  val ConsumerKey = "7GcBhlzYWTDm3lOmJPEPuuErk"
  val ConsumerSecret = "iDowROs6FND7h1tczzSemiWCyT5MBHqnAiW2iXCFJKNQDehUOn"
  val AccessToken = "925390503838826497-ejkC3Y7i6dOPicpXNsIQ30EceYA8SeT"
  val AccessSecret = "kBsuzt4PhnbnkHkuC3kvmX5uRLRmy9IMOkIyZ9WAzDOYz"




  def main(args: Array[String]) {

    val aapleScore = CalcAvgScore.calcSentiment("Apple Inc stock")
    val amazonScore = CalcAvgScore.calcSentiment("Amazon.com Inc stock")
    val  googleScore = CalcAvgScore.calcSentiment("Alphabet Inc stock")
    val  facebookScore = CalcAvgScore.calcSentiment("Facebook Inc stock")
    val  microsoftScore = CalcAvgScore.calcSentiment("Microsoft Corporation stock")

    println("1"+ aapleScore)
    println("2"+ amazonScore)
    println("3"+ googleScore)
    println("4"+ facebookScore)
    println("5"+ microsoftScore)


    val list = List(aapleScore,amazonScore,googleScore,facebookScore,microsoftScore)
    val list1 = List("Apple","Amazon","Google","Facebook","Microsoft")
    val res = (list,list1).zipped.toArray.sortWith(_._1>_._1)
    for(i <- 0 until res.length){
      println(res(i)._2 + " " + res(i)._1)
    }
    val schema = StructType(
      StructField("name", StringType, false) ::
        StructField("value", DoubleType, false) :: Nil)

    //Create RDD
    val sc = SparkContext.getOrCreate(conf)
    val sqlContext = new SQLContext(sc)
    val rdd = sc.parallelize (res).map (x => Row(x._2, x._1.asInstanceOf[Number].doubleValue()))

    //Create the dataframe from RDD and convert the data to CSV
    val df1 = sqlContext.createDataFrame(rdd, schema).coalesce(1).write.format("com.databricks.spark.csv").mode(SaveMode.Overwrite).save("twitter")
  }

  def getFromKeywordSingleDay(i: DateTime,k: String, count: Int): String = {
    val consumer = new CommonsHttpOAuthConsumer(ConsumerKey, ConsumerSecret)
    consumer.setTokenWithSecret(AccessToken, AccessSecret)
    val url = "https://api.twitter.com/1.1/search/tweets.json?q=" + k + "&count=" + count + "&until=" + i.toString(StaticDateTimeFormat.forPattern("yyyy-MM-dd"))
    //println(url)
    val request = new HttpGet(url)
    consumer.sign(request)
    val client = HttpClientBuilder.create().build()
    val response = client.execute(request)
    IOUtils.toString(response.getEntity().getContent())
  }


  def getFromKeyword(k: String, count: Int = 90): String = {
    val today= DateTime.now
    //println(today.toString(StaticDateTimeFormat.forPattern("yyyy-MM-dd")))
    val ss = for (i <- 1 to 7) yield getFromKeywordSingleDay(today-i.days,k,count)
    ss.mkString("\n")
  }
}
