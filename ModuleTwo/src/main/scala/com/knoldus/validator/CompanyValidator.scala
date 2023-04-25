
package com.knoldus.validator

import com.knoldus.models.Company
import com.knoldus.db.CompanyReadDto

class CompanyValidator {
  val companyDatabase = new CompanyReadDto
  val emailValidator = new EmailValidator

  def companyIsValid(company: Company): Boolean = companyDatabase.getCompanyByName(company.name).isEmpty && emailValidator.emailIdIsValid(company.emailId)
}

