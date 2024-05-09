Feature: feature to test login functionality

  Scenario: Validate login functionality with valid credentials
    Given browser is open
    And user is on login page
    When user enter username and password
    And user click login button
    Then user is navigated to homepage
