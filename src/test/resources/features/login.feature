Feature: Login functionality

  Scenario: Valid login

    Given user opens login page
    When user enters valid email and password
    And user clicks login
    Then user should login successfully


  Scenario: Invalid email login

    Given user opens login page
    When user enters invalid email
    And user clicks login
    Then login should fail

    # Failed during the Manual testing.
    #         Bug Report: Title:    System accepts invalid email format without '@' symbol
    #                     Expected: System should display validation error message and prevent login
    #                     Actual:   System accepts invalid email format and allows login attempt
    #                     Result:   FAILED
    #                     Severity: High
    #                     Priority: High


  Scenario: Short password

    Given user opens login page
    When user enters short password
    And user clicks login
    Then login should fail



