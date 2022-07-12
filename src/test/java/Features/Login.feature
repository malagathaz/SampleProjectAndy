Feature: Test the login functionality on HRPage

  @Login
  Scenario: the user should be be able to login with correct username and password
    Given user is on the login page
    When user enters correct username and password
    Then user gets confirmation