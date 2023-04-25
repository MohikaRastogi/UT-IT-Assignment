
package com.knoldus.validator

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends AnyFlatSpec {
  val validator = new CompanyValidator

  "companyIsValid" should "return false if the company already exists in data base and email is valid" in {
    val philipsCompany: Company = Company("Philips", "philips123@gmail.com", "Noida")
    assert(!validator.companyIsValid(philipsCompany))
  }

  "companyIsValid" should "return true if the company does not exists in data base and email is valid" in {
    val google: Company = Company("Google", "google123@gmail.com", "California")
    assert(validator.companyIsValid(google))
  }
}
