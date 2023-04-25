
package com.knoldus

import com.typesafe.scalalogging.Logger

class CheckDuplicateElementsInList {

  val logger = Logger(getClass)

  def hasDuplicateElements[T](list: List[T]): Boolean = {
    list match {
      case Nil => {
        logger.info("Empty list found")
        false
      }
      case head :: Nil => {
        logger.info("No Duplicates found in list ")
        false
      }
      case head :: tail => {
        if (tail.contains(head)) {
          logger.info("list has duplicate elements")
          true
        }
        else {
          hasDuplicateElements(tail)
        }
      }
      case _ => {
        logger.warn("failed due to some error in _ case")
        false
      }
    }
  }
}


