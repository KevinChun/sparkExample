package com.kevin.sparkExample

import org.scalatest._
/**
  * Created by Kevin Chun (kechun@ebay.com)
  * Date: 07/08/2018
  */
abstract class UnitSpec extends
  FlatSpec with
  Matchers with
  OptionValues with
  Inside with
  Inspectors
