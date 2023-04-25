package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec

class UserImplTest extends AnyFlatSpec {
  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)

  "createUser" should "return Some(emailId) if user is new and company does not exist" in {
    val user = User("userOne","Knoldus","userOne@gmail.com")
    assert(userImpl.createUser(user) === Some("userOne@gmail.com"))
  }

}
