Feature: Login
  Scenario: Login with valid credentials
    Given User is on login screen
    When User enters valid username
    And valid password
    And Clicks on log in button
    Then She lands to dashboard page

  Scenario: Login with invalid username
    Given User is on login screen
    When User enters invalid username
    And valid password
    And Clicks on log in button
    Then warns

