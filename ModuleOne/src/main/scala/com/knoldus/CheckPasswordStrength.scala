package com.knoldus

import com.typesafe.scalalogging.Logger

import scala.io.StdIn.readLine

class CheckPasswordStrength {
  val logger = Logger(getClass)

  val allowedSpecialCharacters = Set('%', '@', '#', '&', '$')

  def isPasswordStrong(password: String, userName: String, email: String): Boolean = {
    val hasUpperCase = password.matches(".*[A-Z].*")
    val hasLowerCase = password.matches(".*[a-z].*")
    val hasAlphanumeric = password.matches(".*\\d.*")
    val hasOnlyAllowedSpecialCharacters = password.matches(".*[%@#&$].*")
    val doesNotContainUsername = !password.toLowerCase.contains(userName.toLowerCase)
    val result = hasUpperCase && hasLowerCase && hasAlphanumeric && hasOnlyAllowedSpecialCharacters && doesNotContainUsername
    result
  }
}
object Main {
  def main(args: Array[String]): Unit = {
    val checkPasswordStrength = new CheckPasswordStrength
    val userName = readLine("Enter your full name: ")
    val email = readLine("Enter your email: ")
    val password = readLine("Enter your password: ")

    if (checkPasswordStrength.isPasswordStrong(password, userName, email)) {
      checkPasswordStrength.logger.info("Strong Password")
    } else {
      checkPasswordStrength.logger.warn("Weak Password")
    }
  }
}



