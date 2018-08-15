package com.kevin.sparkExample

import org.apache.spark.sql.{DataFrame, SparkSession}

/**
  * Created by Kevin Chun (kechun@ebay.com)
  * Date: 09/08/2018
  */
object ParquetDataLoader {

  val spark = SparkSession
    .builder()
    .appName("Kevin Spark-Sql example")
    .config("spark.sql.inMemoryColumnarStorage.compressed", true)
    .config("spark.sql.inMemoryColumnarStorage.batchSize", 40000)
    .getOrCreate()

  def load(path: String): DataFrame = {
    spark.read.parquet(path).toDF()
  }

  def clearCache(table: String): Unit = {
    spark.catalog.uncacheTable(table)
  }

}
