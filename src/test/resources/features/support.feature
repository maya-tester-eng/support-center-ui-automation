Feature: Support Contact Form

  Background:
    Given user opens support page

  Scenario: Successful form submission

    When user enters name email and message
    And user clicks submit button
    Then form should be submitted


  Scenario: Name validation

    Given user opens support page
    When user enters invalid name
    And user clicks submit
    Then error message should appear

    # Failed during the Manual testing.
    #         Bug Report: Title:    System accepts numbers in name field
    #                     Expected: System should display validation error message and prevent submission
    #                     Actual:   System accepts numeric characters in the name field and submits the form successfully
    #                     Result:   FAILED
    #                     Severity: Medium
    #                     Priority: High

  Scenario: Fields clear after submission

    Given user opens support page
    When user submits the form
    Then name email and message fields should be empty


  Scenario: Responsive website link

    Given user opens support page
    When user clicks website link
    Then user should be redirected to "SheCodes" website
