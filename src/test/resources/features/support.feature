Feature: Support Contact Form

  Background:
    Given user opens support page

  Scenario: Successful form submission

    When user enters name email and message
    And user clicks submit button
    Then form should be submitted
