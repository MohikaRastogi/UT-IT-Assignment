package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec

class UserImplTest extends AnyFlatSpec {
  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)

  "createUser" should "return emailId if user is new and company does not exist" in {
    val user = User("userOne", "Google", "userOne@google.com")
    assert(userImpl.createUser(user).getOrElse(0) === "userOne@google.com")
  }

  "createUser" should "return   None if company already exists" in {
    val user = User("userOne", "Knoldus", "userOne@knoldus.com")
    assert(userImpl.createUser(user) === None)
  }
}
