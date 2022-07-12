Feature: Test the login functionality on HRPage and Admin tab

  @Qualification
  Scenario: the user is already logged in into HRPage and has navigated to the Admin tab
    Given user is on admin tab
    When user does the necessary clicks
    Then user gets confirmation for the change

  @SearchEmployee
  Scenario: the user is able to look for an employee
    Given user is on admin tab again
    When user does the necessary clicks to look for the employee
    Then User gets the information for the employee

  @CheckStructure
  Scenario: the user is able to validate the structure of the company
    Given User goes to the admin tab
    When User collapses the structure
    Then User expands the structure