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


  Scenario: Short password

    Given user opens login page
    When user enters short password
    And user clicks login
    Then login should fail
