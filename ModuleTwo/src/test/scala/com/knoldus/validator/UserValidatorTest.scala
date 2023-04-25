package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec {
  val validator = new UserValidator

  "userIsValid" should "return true if company name does not exists and email is valid" in {
    val user = User("userOne","google","userOne@gmail.com")
    assert(validator.userIsValid(user))
  }

  "userIsValid" should "return false if company name does not exists and email is invalid" in {
    val google = User("newUser", "knoldus@gmail.com", "California")
    assert(!validator.userIsValid(google))
  }

  "userIsValid" should "return false if company name exists but email is invalid" in {
    val philipsCompany = User("Philips", "philips123@.com", "Noida")
    assert(!validator.userIsValid(philipsCompany))
  }
}
