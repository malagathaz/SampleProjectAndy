Feature: Test the login functionality on HRPage and Recruitment tab

  @Candidate
  Scenario: the user is already logged in into HRPage and has navigated to the Recruitment tab
    Given user is on candidates tab
    When user looks for the candidate
    Then user downloads the resume for the candidate

  @Vacancy
  Scenario: the user is already logged in into HRPage and has navigated to the Recruitment tab
    Given user is on vacancies tab
    When user fills the information for the new vacancy
    Then user gets confirmation for the vacancy added