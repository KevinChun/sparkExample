package com.kevin.sparkExample.fileValidator
import org.apache.spark.sql.SparkSession

/**
  * Created by Kevin Chun (kechun@ebay.com)
  * Date: 09/08/2018
  */
class DuplicatedValueValidator extends FileValidator {

  override def check(spark: SparkSession, sourceView: String): List[String] = {
    import spark.implicits._
    val barcodeSql = spark.sql("SELECT BARCODE, COUNT(*) FROM "+sourceView+" GROUP BY BARCODE")
    val result = barcodeSql.groupBy("BARCODE").count().filter($"count" > 1)

    List.empty
  }

}
