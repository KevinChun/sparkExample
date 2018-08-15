package com.kevin.sparkExample.fileValidator
import org.apache.spark.sql.SparkSession

/**
  * Created by Kevin Chun (kechun@ebay.com)
  * Date: 09/08/2018
  */
class RequiredFileldsValidator extends FileValidator {

  override def check(spark: SparkSession, sourceView: String): List[String] = {
    val barcodeOrModelNoNullDf = spark.sql("SELECT * FROM "+sourceView+" WHERE BARCODE IS NULL or MODELNO IS NULL")
    val modelNameNullDf = spark.sql("SELECT * FROM "+sourceView+" WHERE MODELNAME IS NULL")
    val makerNullDf = spark.sql("SELECT * FROM "+sourceView+" WHERE MAKER IS NULL")
    val categoryNullDf = spark.sql("SELECT * FROM "+sourceView+" WHERE CATEGORY IS NULL")
    // TODO : 판매단위 존재시, 세부 단위 존재해야 함.

    List.empty
  }
}
