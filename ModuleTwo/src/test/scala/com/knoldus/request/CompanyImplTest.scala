package com.knoldus.request

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec

class CompanyImplTest extends AnyFlatSpec {
  val companyValidator = new CompanyValidator
  val companyImpl = new CompanyImpl(companyValidator)

  "createCompany" should "return None if company already exists" in {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    assert(companyImpl.createCompany(knoldusCompany) === None)
  }

  "createCompany" should "return Some(comapnyName) if company is new and not in database" in {
    val google: Company = Company("Google", "google@gmail.com", "California")
    assert(companyImpl.createCompany(google) === Some("Google"))
  }

  "createCompany" should "return NOne if company is new but email is not validated" in {
    val google: Company = Company("Google", "google@.com", "California")
    assert(companyImpl.createCompany(google) === None)
  }
}
