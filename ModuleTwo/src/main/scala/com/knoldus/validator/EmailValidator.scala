
package com.knoldus.validator

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean = {
    emailId.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$"/*"""[([\w\.!#$%&*+/=?^_`{|}~-]+)@([\w]+)([\.]{1}[\w]+)+]{10,30}"""*/)
  }
}
