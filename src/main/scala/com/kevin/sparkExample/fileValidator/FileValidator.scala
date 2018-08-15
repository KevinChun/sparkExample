package com.kevin.sparkExample.fileValidator

import org.apache.spark.sql.SparkSession

/**
  * Created by Kevin Chun (kechun@ebay.com)
  * Date: 09/08/2018
  */
abstract class FileValidator {
    def check(spark: SparkSession, sourceView: String): List[String]
}
