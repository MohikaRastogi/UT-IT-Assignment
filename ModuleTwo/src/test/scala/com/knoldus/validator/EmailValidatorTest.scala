
package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {
  val validator = new EmailValidator

  "emailIdIsValid" should "return true for valid emails" in {
    assert(validator.emailIdIsValid("john.doe@example.com"))
    assert(validator.emailIdIsValid("abc1.xyz@gmail.com"))
  }

  "emailIsValid" should "return false for invalid emails" in {
    assert(!validator.emailIdIsValid("example.com"))
    assert(!validator.emailIdIsValid("john.doe@.com"))
    assert(!validator.emailIdIsValid("john.doe@example."))
    assert(!validator.emailIdIsValid("john.doe@example"))
    assert(!validator.emailIdIsValid("john.doe@example-com"))
  }
}

