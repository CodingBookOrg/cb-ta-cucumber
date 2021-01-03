Feature: Login
  Scenario: Login with valid credentials
    Given User is on login screen
    When User enters username "valid" and password "psswd"
    And Clicks on log in button
    Then She lands to dashboard page

  Scenario: Login with invalid username
    Given User is on login screen
    When User enters username "invalid" and password "psswd"
    And Clicks on log in button
    Then warns

