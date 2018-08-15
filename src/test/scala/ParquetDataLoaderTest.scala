package com.kevin.sparkExample

/**
  * Created by Kevin Chun (kechun@ebay.com)
  * Date: 07/08/2018
  */
class ParquetDataLoaderTest extends UnitSpec{

  "Generator" should "load parquet data and return as DataFrame" in {
    val filePath = "your file path"
    val df = ParquetDataLoader.load(filePath)

    df should not be (null)
    assert(df.count() > 0)
  }
}