Feature: Test the login functionality on HRPage and Time tab

  @ProjectReport
  Scenario: the user is already logged in into HRPage and has navigated to the Time tab
    Given User navigates to report module
    When User selects the project to report
    Then User gets the project report

  @Timesheet
  Scenario: the user is already logged in into HRPage and has navigated to the Time tab
    Given User navigates to timesheet module
    When Fills the timesheet
    Then User submits the timesheet