package com.knoldus

import com.typesafe.scalalogging.Logger


class Factorial {
  val logger = Logger(getClass)

  def factorial(number: Int, accumulator: BigInt = 1): Either[String, BigInt] = {
    if (number < 0)
      Left("Cannot compute factorial of negative numbers")
    else if (number == 1 || number == 0) {
      logger.info("computed Factorial Successfully")
      Right(accumulator)
    } else
      factorial(number - 1, number * accumulator)
  }
}
