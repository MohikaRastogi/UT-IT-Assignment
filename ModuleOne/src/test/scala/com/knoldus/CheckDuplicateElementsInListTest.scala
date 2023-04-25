
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CheckDuplicateElementsInListTest extends AnyFlatSpec {
  val checkDuplicateElementsInList = new CheckDuplicateElementsInList

  "hasDuplicateElements" should "return false if list is empty" in {
    assert(!checkDuplicateElementsInList.hasDuplicateElements(List.empty))
  }

  "hasDuplicateElements" should "return false if integer list does not have any duplicates" in {
    assert(!checkDuplicateElementsInList.hasDuplicateElements(List(1, 2, 3, 4)))
  }

  "hasDuplicateElements" should "return false if string list does not have any duplicates" in {
    assert(!checkDuplicateElementsInList.hasDuplicateElements(List("hello", "scala", "interns")))
  }

  "hasDuplicateElements" should "return false if list has only one element" in {
    assert(!checkDuplicateElementsInList.hasDuplicateElements(List(20.0)))
  }

  "hasDuplicateElements" should "return true if integer list has duplicate elements element" in {
    assert(checkDuplicateElementsInList.hasDuplicateElements(List(1, 2, 3, 4, 2, 3)))
  }

  "hasDuplicateElements" should "return true if boolean list has duplicate element" in {
    assert(checkDuplicateElementsInList.hasDuplicateElements(List(true, false, false)))
  }

}
