
package com.knoldus.db

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyReadDtoTest extends AnyFlatSpec {
  val companyReadDto = new CompanyReadDto
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")


  "getCompanyByName" should "return Company for name of company" in {
    assert(companyReadDto.getCompanyByName("Knoldus").getOrElse(0) === Company("Knoldus", "knoldus@gmail.com", "Noida"))
  }

  "companies" should "contain the company name for existing company" in {
    assert(companyReadDto.companies.contains("Knoldus"))
  }

}
