Feature: Test the login functionality on HRPage and Leave tab

  @Leave
  Scenario: the user is already logged in into HRPage and has navigated to the Leave tab
    Given user is on leave tab
    When fills the form to assign leave
    Then user gets confirmation for the leave