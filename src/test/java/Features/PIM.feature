Feature: Test the login functionality on HRPage and PIM tab

  @ChangeConfiguration
  Scenario: the user is already logged in into HRPage and has navigated to the PIM tab
    Given user is on pim tab
    When user changes configuration
    Then user gets confirmation for the configuration change