package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class FactorialTest extends AnyFlatSpec{

  val factorial = new Factorial

  "factorial" should "compute not compute factorial of negative numbers" in {
    val expectedResult = Left("Cannot compute factorial of negative numbers")
    val actualResult = factorial.factorial(-10)
    assert(actualResult === expectedResult)
  }

  "factorial" should "compute factorial of 1 as 1" in {
    val expectedResult = Right(1)
    val actualResult = factorial.factorial(1)
    assert(actualResult === expectedResult)
  }

  "factorial" should "compute factorial of 0 as 1" in {
    val expectedResult = Right(1)
    val actualResult = factorial.factorial(0)
    assert(actualResult === expectedResult)
  }
}
