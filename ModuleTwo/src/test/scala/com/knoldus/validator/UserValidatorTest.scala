
package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec {
  val validator = new UserValidator

  "userIsValid" should "return true if company name does not exists and email is valid" in {
    val user = User("newUser", "google", "userOne@gmail.com")
    assert(validator.userIsValid(user))
  }

  "userIsValid" should "return false if company name already exists and email is invalid" in {
    val knoldus = User("newUser", "knoldus@gmail.com", "California")
    assert(!validator.userIsValid(knoldus))
  }

  "userIsValid" should "return false if company name does not exists but email is invalid" in {
    val idemia = User("idemiaUser", "idemiaUser123@.com", "Noida")
    assert(!validator.userIsValid(idemia))
  }
}
