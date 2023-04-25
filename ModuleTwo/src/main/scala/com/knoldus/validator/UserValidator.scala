package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.{Company, User}

class UserValidator {
  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator

  def userIsValid(user: User): Boolean = companyReadDto.getCompanyByName(user.companyName).isEmpty && emailValidator.emailIdIsValid(user.emailId)
}
