package com.knoldus

import com.knoldus.CheckPasswordStrength
import org.scalatest.flatspec.AnyFlatSpec

class CheckPasswordStrengthTest extends AnyFlatSpec {
  val checkPasswordStrength = new CheckPasswordStrength

  "isPasswordStrong" should "return false if password is empty" in {
    assert(!checkPasswordStrength.isPasswordStrong("", "John", "johndoe@gmail.com"))
  }

  "isPasswordStrong" should "return false if password does not contain lowercase letters" in {
    assert(!checkPasswordStrength.isPasswordStrong("HELLO12@", "John", "johndoe@gmail.com"))
  }

  "isPasswordStrong" should "return false if password does not contain any uppercase letters" in {
    assert(!checkPasswordStrength.isPasswordStrong("hello12@", "John", "johndoe@gmail.com"))
  }

  "isPasswordStrong" should "return false if password only contains Numbers and no letters" in {
    assert(!checkPasswordStrength.isPasswordStrong("23412@", "John", "johndoe@gmail.com"))
  }

  "isPasswordStrong" should "return false if password only contains letters and no numbers" in {
    assert(!checkPasswordStrength.isPasswordStrong("heLlow@", "John", "johndoe@gmail.com"))
  }

  "isPasswordStrong" should "return false if password has any other special character than {%, @, #.& ,$}" in {
    assert(!checkPasswordStrength.isPasswordStrong("he*Ll!ow@", "John", "johndoe@gmail.com"))
  }

  "isPasswordStrong" should "return false if password has user's name in it " in {
    assert(!checkPasswordStrength.isPasswordStrong("12A@jOhN", "John", "johndoe@gmail.com"))
  }

  "isPasswordStrong" should "return true if password passes all constraints " in {
    assert(checkPasswordStrength.isPasswordStrong("ScAla1@", "John", "johndoe@gmail.com"))
  }
}


