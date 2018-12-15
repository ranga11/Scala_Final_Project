package services

import Util.Timeseries.spark
import org.apache.spark.sql.{DataFrame}

object SparkTsService {



    //Get the data of all companies in a dataframe
    def getData(): DataFrame = {
        //val spark = SparkSession.builder().appName("Stock-prediction").master("local[*]").getOrCreate();
        //Create dataframe for all company csv and convert to the required format with different date and close price columns
        import spark.implicits._
        val appleDf: DataFrame = createDataFrame("AAPL_data_train")
        val apple = appleDf.select(appleDf("date").as("appleDate"), appleDf("close").as("closeApple"))

        val amazonDf: DataFrame = createDataFrame("AMZN_data_train")
        val amazon = amazonDf.select(amazonDf("date").as("amazonDate"), amazonDf("close").as("closeAmazon"))

        val facebookDf: DataFrame = createDataFrame("FB_data_train")
        val facebook = facebookDf.select(facebookDf("date").as("facebookDate"), facebookDf("close").as("closefacebook"))

        val googleDf: DataFrame = createDataFrame("GOOGL_data_train")
        val google = googleDf.select(googleDf("date").as("googleDate"), googleDf("close").as("closegoogle"))

        val microsoftDf: DataFrame = createDataFrame("MSFT_data_train")
        val microsoft = microsoftDf.select(microsoftDf("date").as("microsoftDate"), microsoftDf("close").as("closemicrosoft"))

        //Join all the different dataframes and convert into a single frame
        val data = apple
            .join(amazon, $"appleDate" === $"amazonDate").select($"appleDate", $"closeApple", $"closeAmazon")
            .join(facebook, $"appleDate" === $"facebookDate").select($"appleDate", $"closeApple", $"closeAmazon", $"closefacebook")
            .join(google, $"appleDate" === $"googleDate").select($"appleDate", $"closeApple", $"closeAmazon", $"closefacebook", $"closegoogle")
            .join(microsoft, $"appleDate" === $"microsoftDate").select($"appleDate", $"closeApple", $"closeAmazon", $"closefacebook", $"closegoogle", $"closemicrosoft")

      data
    }


    //To create dataframe based on CSV
    def createDataFrame(name: String):DataFrame = {
        return spark.read.option("header", "true").csv(s"../Stock-Market-Prediction/public/$name.csv")
    }

}
