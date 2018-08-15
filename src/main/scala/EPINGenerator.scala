package com.kevin.sparkExample
/**
  * Created by Kevin Chun (kechun@ebay.com)
  * Date: 04/08/2018
  */
object EPINGenerator {

  val filePath = "/parquet/epin.parquet"
  val epinView = "EPIN_VIEW"
  def main(args: Array[String]): Unit = {

    var df = ParquetDataLoader.load(filePath)

    df.createOrReplaceTempView(epinView)
    df.cache()

    // clear cache
    ParquetDataLoader.clearCache(epinView)

  }

}
